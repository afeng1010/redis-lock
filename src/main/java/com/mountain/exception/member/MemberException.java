package com.mountain.exception.member;

/**
 * @author chzz
 * @version V1.0
 * @Title:
 * @Package com.central.common.exception
 * @Description: TODO 系统－会员类异常
 * @date 2019/2/23
 */
public class MemberException extends Exception {

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

    public MemberException() {
    }

    public MemberException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public MemberException(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public MemberException(String message, int code, String msg) {
        super(message);
        this.code = code;
        this.msg = msg;
    }

    public MemberException(String message, Throwable cause, int code, String msg) {
        super(message, cause);
        this.code = code;
        this.msg = msg;
    }

    public MemberException(Throwable cause, int code, String msg) {
        super(cause);
        this.code = code;
        this.msg = msg;
    }

    public MemberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int code, String msg) {
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

