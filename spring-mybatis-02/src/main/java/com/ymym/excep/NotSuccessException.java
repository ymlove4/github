package com.ymym.excep;

/**
 * @author ymyoo
 * @date 2020-08-30 15:46
 */

//自定义运行时异常类
public class NotSuccessException extends RuntimeException {
    public NotSuccessException() {
        super();
    }

    public NotSuccessException(String message) {
        super(message);
    }
}
