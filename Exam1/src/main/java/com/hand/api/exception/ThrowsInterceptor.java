package com.hand.api.exception;

import java.lang.reflect.Method;

import javax.security.auth.login.AccountException;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsInterceptor implements ThrowsAdvice{	//异常捕获器
	//方法一
	public void afterThrowing(Method method,Object[] args,Object obj,AccountException ex) throws Throwable{
		System.out.println("Method"+method+"An exception is thrown:"+ex);
	}
	//方法二
	public void afterThrowing(NullPointerException ex) throws Throwable{
		System.out.println("Null pointer exception: an exception is thrown:"+ex);
	}
}

