package com.michael.pay.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//显示支付结果的页面
@Controller
public class BackController {

	@RequestMapping("/back")
	public void back(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String r1_Code=request.getParameter("r1_Code");
		PrintWriter pw=response.getWriter();
		if("1".equals(r1_Code))
		{
			String p1_MerId=request.getParameter("p1_MerId");
			String r3_Amt=request.getParameter("r3_Amt");
			String r6_Order=request.getParameter("r6_Order");
			String rp_PayDate=request.getParameter("rp_PayDate");
			pw.println("支付成功！<br/>"
					+ "商户编号："+p1_MerId+"<br/>"
					+ "支付金额："+r3_Amt+"<br/>"
					+"商户订单号："+r6_Order+"<br/>"
					+"支付成功时间："+rp_PayDate);
		}
		else
		{
			pw.println("支付失败！");
		}
	}
	
}
