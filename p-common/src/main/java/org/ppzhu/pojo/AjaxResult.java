package org.ppzhu.pojo;

import lombok.Data;

/**
 * @Author: ppzhu
 * @Date: 2024/9/27
 * @Description: Describe the purpose or functionality of the class here.
 * You can provide detailed explanations, usage examples, etc.
 * @Modification History:
 * Date         Author          Description
 * -----------  --------------  -----------------------------------
 * 2024/9/27      ppzhu         Initial version
 * @Copyright: Copyright 2024, ppzhu.
 * All rights reserved.
 */
@Data
public class AjaxResult<T> {
    private Integer code;
    private String msg;
    private T data;

    public static <T>  AjaxResult success(T data){
        AjaxResult result = new AjaxResult();
        result.setCode(200);
        result.setMsg("success");
        result.setData(data);
        return result;
    }

    public static <T>  AjaxResult error(Integer code,String msg){
        AjaxResult result = new AjaxResult();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
