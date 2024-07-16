package com.heng.comprehensive.exception;

import com.heng.comprehensive.enumerate.ReturnCodeEnum;
import com.heng.comprehensive.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @FileName GlobalExceptionHandler
 * @Description
 * @Author zhaoheng
 * @date 2024-07-11 21:17
 **/
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result<String> exceptionHandler(Exception e) {
        System.out.println("********** come in global exception handler **********");
        log.error("全局异常信息：{}",e.getMessage());
        return Result.fail(ReturnCodeEnum.RC500.getCode(),e.getMessage());
    }
}