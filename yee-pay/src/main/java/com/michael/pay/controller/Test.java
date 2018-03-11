package com.michael.pay.controller;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String text = "";
		 
        long beginTime = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++)
            text = text + i;
        long endTime = System.currentTimeMillis();
        System.out.println("ִ��ʱ�䣺" + (endTime - beginTime));
 
        StringBuilder builder = new StringBuilder("");
        beginTime = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++)
            builder.append(String.valueOf(i));
        endTime = System.currentTimeMillis();
        System.out.println("ִ��ʱ�䣺" + (endTime - beginTime));
    }

	

}
