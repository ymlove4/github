package com.ymym.yo02;

/**
 * @author ymyoo
 * @date 2020-08-06 20:04
 */

//目标类
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name,Integer age) {
        //给doSome方法增加一个功能，在doSome执行前，输出方法的执行时间
        System.out.println("======目标方法doSome==========");
    }

    @Override
    public String doOther(String name, Integer age) {

        System.out.println("======目标方法doOther==========");
        return "abc";
    }
}
