package com.tech.w01crypt;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class CryptoUtil {

		/**
		 * �μ����� ���ڿ��� SHA-512������� ��ȣȭ�ϴ� �޼���
		 * (�ܹ��� ��ȣȭ)
		 * @param str ��ȣȭ�� ���ڿ� ������
		 * @return ��ȣȭ�� ���ڿ� ������
		 * @throws NoSuchAlgorithmException 
		 * @throws UnsupportedEncodingException 
		 */
		public static String sha512(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
			// ��ȣȭ�� ����� �˰����� �����Ͽ� MessageDigest��ü ����. ���ܹ߻��ؼ� ����ó��
			// �˰����� ���ڿ��� �����ϴµ� ������ ���� ������ �ִ�.
			// "MD5", "SHA-256" ��
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			
			// ��ȣȭ�� �����͸� byte�� �迭�� �־��ش�. ���ܹ߻��ؼ� ����ó��
			md.update(str.getBytes("utf-8")); 
			
			// md.digest() : ��ȣȭ�� �����͸� byte�迭�� ��ȯ�Ѵ�.
			 return Base64.getEncoder().encodeToString(md.digest());
		}
		
		/**
		 * ����� ��ȣȭ �� AES-256 �˰������� ��ȣȭ�ϴ� �޼���
		 * 
		 * @param str ��ȣȭ�� ���ڿ�
		 * @param key ��ȣȭ�� ����� ��ȣŰ ���ڿ�(16�� �̻�)
		 * @return ��ȣȭ�� ���ڿ�
		 * @throws UnsupportedEncodingException 
		 * @throws NoSuchPaddingException 
		 * @throws NoSuchAlgorithmException 
		 * @throws InvalidAlgorithmParameterException 
		 * @throws InvalidKeyException 
		 * @throws BadPaddingException 
		 * @throws IllegalBlockSizeException 
		 */
		public static String encryptAES256(String str, String key) throws UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
			if(key.length()<16) {
				System.out.println("��ȣŰ�� 16�� �̻����� �����ϼ���");
				System.out.println("�۾��� ��Ĩ�ϴ�");
				return null;
			}
			byte[] keyBytes = new byte[16];
			System.arraycopy(key.getBytes("utf-8"), 0, keyBytes, 0, keyBytes.length);
			//���Ű ���� (Ű�� ����� byte�� �迭�� �˰��� �̸��� �����Ѵ�.)
			SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
			// Cipher ��ü ���� �� �ʱ�ȭ (����ó��)
			/*
			 	�˰���/���/�е� (AES/CBC/PKCS5Padding)
			 	- CBC(Cipher Block Chaining Mode) : ������ �� ��ϰ� ��ȣ�� ����� ���� �߻����� �ʵ��� �����ܰ��� �Ϻ�ȣȭ�� ����� 
			 	�� �ܰ迡 ����ϴ� ��带 ���Ѵ�.
			 	- Padding : CBC���� �۾����� �� ������ ����� ����� ���̰� ������ �� ������ �κ��� ä���ִ� ����� ���Ѵ�.
			 */
			Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
			// �ʱ�ȭ ���Ͱ� �ۼ�
			// �ʱ�ȭ ����(Initial Vector, IV) - ��ȣ���� ����ȭ���� �ʵ��� ����ϴ� �����͸� ���Ѵ�.
			// 								  ��ȣȭ ó���� ù��° ����� ��ȣȭ�� �� ���Ǵ� ���̴�.
			String iv = key.substring(0, 16);
			byte[] ivBytes = new byte[16];
			System.arraycopy(iv.getBytes("utf-8"), 0, ivBytes, 0, ivBytes.length);
			// ��ȣ�� �ɼ� ������ �°� �ʱ�ȭ�Ѵ�.
			// �ɼ� ����: ENCRYPT_MODE(��ȣȭ���), DECRYP_MODE(��ȣȭ���)
			c.init(Cipher.ENCRYPT_MODE, keySpec, new IvParameterSpec(ivBytes));
			// ��ȣ���� �����͸� byte�� �迭�� �����Ͽ� ��ȣȭ �۾��� �����Ѵ�.
			byte[] encryptBytes = c.doFinal(str.getBytes("utf-8"));
			String enStr = Base64.getEncoder().encodeToString(encryptBytes);
			return enStr;
		}
		/**
		 * ��ȣȭ�� �����͸� �μ������� �޾Ƽ� ������ �������� ��ȣȭ�ϴ� �޼���
		 * @param str ������ ��ȣȭ�� ���ڿ�
		 * @param key ��ȣŰ ���ڿ�
		 * @return ������ ������ ���ڿ�
		 * @throws UnsupportedEncodingException 
		 * @throws NoSuchPaddingException 
		 * @throws NoSuchAlgorithmException 
		 * @throws InvalidAlgorithmParameterException 
		 * @throws InvalidKeyException 
		 * @throws BadPaddingException 
		 * @throws IllegalBlockSizeException 
		 */
		public static String decryptAES256(String str, String key) throws UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
			if(key.length()<16) {
				System.out.println("��ȣŰ�� 16�� �̻����� �����ϼ���");
				System.out.println("�۾��� ��Ĩ�ϴ�");
				return null;
			}
			
			byte[] keyBytes = new byte[16];
			System.arraycopy(key.getBytes("utf-8"), 0, keyBytes, 0, keyBytes.length);
			SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
			Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
			String iv = key.substring(0, 16);
			byte[] ivBytes = new byte[16];
			System.arraycopy(iv.getBytes("utf-8"), 0, ivBytes, 0, ivBytes.length);
			c.init(Cipher.DECRYPT_MODE, keySpec, new IvParameterSpec(ivBytes));
			// ������ ��ȣȭ�� ���ڿ��� decoding�� byte�� �迭�� ���Ѵ�.
			byte[] byteStr = Base64.getDecoder().decode(str);
			// ��ȣȭ�� byte �迭�� ������ �����ͷ� ������ �� ���ڿ��� ��ȯ�Ͽ� ��ȯ�Ѵ�.
			return new String(c.doFinal(byteStr), "utf-8");
		}
		
}