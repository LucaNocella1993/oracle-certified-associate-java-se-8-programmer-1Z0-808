package oca.examples;

import java.util.ArrayList;
import java.util.List;

public class Types{
	public static void main(String[] args){
		StringBuilder ciao = new StringBuilder("ciao");
		String string = "ciao";
		ciao.append(ciao, 1, 2);
		string.equals(ciao);
		int [][][] array = new int [2][2][2];
		int [][][] array2 = new int [][][] {{{1,2},{3,4}},{{5,6},{7,8}}};
		System.out.println(array2 [0][1][0]);
		
		List<String> list = new ArrayList<>();
		list.add("ciao");
		list.removeIf((String s) -> s.length()==0);
		
		List<Integer> listInt = new ArrayList<>();
		listInt.add(null);
//		int h = listInt.get(0);
		System.out.println(listInt.get(0));
		
		byte b = 10;
		short s = 10;
		int i = 10;
		long l = 10;
		char c = 10;
		float f = 1.0f;
		double d = 1.0;
		b = (byte) d;
		boolean bool = b == d;
		System.out.println(bool);
		
		Byte B = 10;
		Character C = 10;
		Integer I = new Integer(10);
		Long L = new Long(10);
		Double D = new Double(10);
		Boolean Bool = Boolean.TRUE;
		boolean bo = I.equals(L);
		System.out.println(bo);
		
		boolean boo = I.equals(i);
		System.out.println(boo);
		boolean boole = l == I;
		System.out.println(boole);
		
		Integer I2 = new Integer(10);
		boolean boolInt = I.equals(I2);
		System.out.println(boolInt);
		boolean boolInt2 = I == I2;
		System.out.println(boolInt2);
		
		int w = b+s+c;
		
		Integer IvalueOf = Integer.valueOf(11);
		int iValueOf = Integer.parseInt("11");
		
			
	}
}