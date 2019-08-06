package com.michael.pay.controller;

import com.alibaba.fastjson.JSON;
import com.michael.pay.utils.PaymentUtil;

public class SignTest {

	public static void main(String[] args) {

	    String key = "1234";

        User user = new User();
        user.setUsername("username");
        user.setAge(23);
        user.setSex(2);



        String userJson = JSON.toJSONString(user);

        System.out.println("userJson: " + userJson);

        String param = PaymentUtil.hmacSign(userJson, key);

        System.out.println("params : " + param);

        System.out.println("isEquals? -> " + PaymentUtil.verifyCallback(param, userJson, "32121"));

    }

	

}
