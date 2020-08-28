package com.ymym.yo05.impl;

import com.ymym.yo05.SomeService;

/**
 * @author ymyoo
 * @date 2020-08-04 22:45
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("执行doSome");
    }

    @Override
    public void doOther() {
        System.out.println("执行doSome");

    }
}
