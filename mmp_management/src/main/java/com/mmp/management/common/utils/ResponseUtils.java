package com.mmp.management.common.utils;

import com.mmp.management.common.dto.Response;
import lombok.Generated;

@Generated
public class ResponseUtils {
    private ResponseUtils(){}
    private static final String SUCCESS = "Success";
    private static final String ERROR = "Error";

    public static Response success(Object object) {
        return new Response(200, SUCCESS, object);
    }

    public static Response notFound(String message) {
        return new Response(404, message, null);
    }
}
