package com.hand.api.after;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class IAopMethodAfter implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object value, Method method, Object[] args, Object obj) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Method:"+method.getName()+"Return value:"+value);
		System.out.println("After Insert Film Data");
	}

}
