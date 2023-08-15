package com.example.shoppingPlatform;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
  private boolean isOK;
  private int code; // 200, 400, 500
  private String message;
  private Object data;

  public Response(){}

  public static Response success(Object obj, String msg){
    return Response.builder().isOK(true)
            .code(200)
            .message(msg)
            .data(obj)
            .build();
  }

  public static Response failed(Object obj, String msg){
    return Response.builder().isOK(false)
            .code(400)
            .message(msg)
            .data(obj)
            .build();
  }

  public static Response error(Object obj, String msg){
    return Response.builder().isOK(false)
            .code(500)
            .message(msg)
            .data(obj)
            .build();
  }
}
