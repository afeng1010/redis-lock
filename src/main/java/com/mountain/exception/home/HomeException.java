package com.mountain.exception.home;

/**
 * @author chzz
 * @version V1.0
 * @Title:
 * @Package com.central.common.exception
 * @Description: TODO 系统－首页类异常
 * @date 2019/2/23
 */
public class HomeException extends Exception {

    private Object data;

    private int code;

    private String msg;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public HomeException() {
    }

    public HomeException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public HomeException(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public HomeException(String message, int code, String msg) {
        super(message);
        this.code = code;
        this.msg = msg;
    }

    public HomeException(String message, Throwable cause, int code, String msg) {
        super(message, cause);
        this.code = code;
        this.msg = msg;
    }

    public HomeException(Throwable cause, int code, String msg) {
        super(cause);
        this.code = code;
        this.msg = msg;
    }

    public HomeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int code, String msg) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}

