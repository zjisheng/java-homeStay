package com.cuc.controller;

import com.cuc.exception.CommonResponseCode;
import com.cuc.vo.JsonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author:ywf
 */
public class BaseController {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    protected <T> JsonResponse<T> renderError(CommonResponseCode responseCode) {
        JsonResponse<T> result = new JsonResponse();
        result.setCode(responseCode.getCode());
        result.setMessage(responseCode.getName());
        return result;
    }

    protected <T> JsonResponse<T> renderError(Integer code, String message) {
        JsonResponse<T> result = new JsonResponse();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    protected <T> JsonResponse<T> renderSuccess() {
        JsonResponse<T> result = new JsonResponse(CommonResponseCode.success);
        result.setResult((T) Boolean.TRUE);
        return result;
    }

    protected <T> JsonResponse<T> renderSuccess(T content) {
        JsonResponse<T> result = new JsonResponse(CommonResponseCode.success);
        result.setResult(content);
        return result;
    }

    protected <T> JsonResponse<T> renderDetail(T content) {
        if (null != content) {
            return this.renderSuccess(content);
        } else {
            JsonResponse<T> result = new JsonResponse(CommonResponseCode.dataNotExist);
            result.setResult(content);
            return result;
        }
    }
}
