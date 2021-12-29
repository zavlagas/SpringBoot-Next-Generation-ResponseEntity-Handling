package com.app.scheduler.manager.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public interface HttpResponse {

   static ResponseEntity<HttpResponse> create(HttpStatus httpStatus, String message){
        return new ResponseEntity(
                new Response(
                        httpStatus.value(),
                        httpStatus,
                        httpStatus.getReasonPhrase().toUpperCase(),
                        message.toUpperCase()),
                        httpStatus);
   }
}
