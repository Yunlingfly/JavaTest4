package com.hand.api.before;

import java.lang.reflect.Method;

import com.alibaba.fastjson.JSON;
import com.hand.api.service.IFilmService;
import com.hand.api.service.impl.FilmService;
import com.hand.domain.entity.Film;
import org.springframework.aop.MethodBeforeAdvice;

public class IAopMethodBefore implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object obj) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Preoperation check...");				//输出信息
		System.out.println("forthcoming Method:"+method.getName());	//输出方法名
		Film film=(Film) args[0];
		System.out.println("Film Title:");
		System.out.println(film.getTitle());
		System.out.println("Film Description:");
		System.out.println(film.getDescription());
		System.out.println("Film LanguageId:");
		System.out.println(film.getLanguage_id());

//		System.out.println("Film :"+JSON.toJSONString(args[0]));		//输出参数

		System.out.println("Object:"+obj);				//输出对象
	}
}
