package com.tech.w01crypt;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class CryptoTest {
	public static void main(String[] args) throws Exception{
		String password = "123456";
		System.out.println("�ܹ��� ��ȣȭ");
		String key = CryptoUtil.sha512(password);
		System.out.println("sha512�� ��ȯ�� ��: "+key);
		
		System.out.println("����� ��ȣȭ");
		String key2 = "1kjkjkjk$%!@#@#@#%ohhkkhkhk9999";
//		String encryStr = CryptoUtil.encryptAES256(password, key2);
		String encryStr = CryptoUtil.encryptAES256(password, key);
		System.out.println("��й�ȣ: "+password);
		System.out.println("��й�ȣ 2�� ��ȣȭ: "+encryStr);
		
		//��ȣȭ
		System.out.println("��ȣȭó��");
//		String decryptStr = CryptoUtil.decryptAES256(encryStr, key2);
		String decryptStr = CryptoUtil.decryptAES256(encryStr, key);
		System.out.println("��ȣȭ�� ������: "+decryptStr);
		
	}
}
