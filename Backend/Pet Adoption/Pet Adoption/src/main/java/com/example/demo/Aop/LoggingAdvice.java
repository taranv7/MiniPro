package com.example.demo.Aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggingAdvice {
	Logger log = LoggerFactory.getLogger(getClass());
	
	@Before(value = "execution(* com.htheprogrammer.springdatajpaquery.controller.*.*(..))")
	public void logBefore(JoinPoint joinPoint) {
		
		log.info("Executing method: "+joinPoint.getSignature().getName());
	}

@After(value = "execution(* com.htheprogrammer.springdatajpaquery.controller.*.*(..))")
public void logAfter(JoinPoint joinPoint) {
	
	log.info("Executing method: "+joinPoint.getSignature().getName());
}
}
//@Before(value = "execution(* com.htheprogrammer.springdatajpaquery.controller.*.*(..))")
//public void logBefore(JoinPoint joinPoint) {
//	
//	log.info("Executing method: "+joinPoint.getSignature().getName());
//}
//@Before(value = "execution(* com.htheprogrammer.springdatajpaquery.controller.*.*(..))")
//public void logBefore(JoinPoint joinPoint) {
//	
//	log.info("Executing method: "+joinPoint.getSignature().getName());
//}
