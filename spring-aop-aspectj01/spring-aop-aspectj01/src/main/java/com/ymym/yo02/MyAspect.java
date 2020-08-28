package com.ymym.yo02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * @author ymyoo
 * @date 2020-08-06 20:08
 */

@Aspect //当前类是切面类
public class MyAspect {

    // @Before(value = "execution(void doSome(String ,Integer ))")
    // public void myBefore(JoinPoint ajp){
    //     System.out.println(ajp.getSignature());
    //     System.out.println(ajp.getSignature().getName());
    //     Object[] args = ajp.getArgs();
    //     for (Object arg : args) {
    //         System.out.println(arg);
    //
    //     }
    //
    //     //切面要执行的功能代码
    //     System.out.println("通知，切面功能：目标方法的执行时间是:"+new Date());
    //
    // }
    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))",returning = "res" )
    public  void  myAfterReturn(Object res){

    }

}
