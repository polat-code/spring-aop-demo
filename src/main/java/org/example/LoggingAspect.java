package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* org.example.ShoppingCart.checkout(..))") // return type and method name.
    public void beforeLogger(JoinPoint jp) {
        //System.out.println(jp.getSignature());
        String arg = jp.getArgs()[0].toString();
        System.out.println("Before Loggers with argument : " + arg);
    }
    @After("execution(* org.example.ShoppingCart.checkout(..))")
    public void afterLogger() {
        System.out.println("After Loggers");
    }
    @Pointcut("execution(* org.example.ShoppingCart.quantity())")
    public void afterReturningPointCut() {

    }
    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal) {
        System.out.println("After returning : " + retVal);
    }

}
