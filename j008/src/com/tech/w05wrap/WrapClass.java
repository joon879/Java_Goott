package com.tech.w05wrap;

public class WrapClass {
	public static void main(String[] args) {
		
		String str = "10";
		String str2 = "10.5";
		String str3 = "true";
		
		byte b = Byte.parseByte(str);
		System.out.println("���ڿ� byte�� ��ȯ: "+b);
		int i = Integer.parseInt(str);//
		System.out.println("���ڿ� Integer�� ��ȯ: "+i);
		short s = Short.parseShort(str);
		System.out.println("���ڿ� short�� ��ȯ: "+s);
		
		long l = Long.parseLong(str);
		System.out.println("���ڿ� Long�� ��ȯ: "+l);
		
		float f = Float.parseFloat(str2);//
		System.out.println("���ڿ� float�� ��ȯ: "+f);
		
		boolean bool = Boolean.parseBoolean(str3);
		System.out.println("���ڿ� boolean�� ��ȯ: "+bool);
		
	}
}
