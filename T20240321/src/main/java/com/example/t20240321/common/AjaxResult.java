package com.example.t20240321.common;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-03-21
 * Time: 10:16
 */
@Data
public class AjaxResult {
    // 状态码
    private Integer code;
    // 状态码描述信息
    private String msg;
    // 返回的数据
    private Object data;

    /**
     * 返回成功结果
     * @param data 返回结果
     * @return 返回结果
     */
    public static AjaxResult success(Object data) {
        AjaxResult result = new AjaxResult();
        result.setCode(200);
        result.setMsg("");
        result.setData(data);
        return result;
    }

    /**
     * 返回成功结果
     * @param code 状态码
     * @param data 返回结果
     * @return 返回结果
     */
    public static AjaxResult success(int code, Object data) {
        AjaxResult result = new AjaxResult();
        result.setCode(code);
        result.setMsg("");
        result.setData(data);
        return result;
    }

    /**
     * 返回失败结果
     * @param code 状态码
     * @param msg 状态码描述信息
     * @return 返回的数据
     */
    public static AjaxResult fail(int code, String msg) {
        AjaxResult result = new AjaxResult();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }
}
