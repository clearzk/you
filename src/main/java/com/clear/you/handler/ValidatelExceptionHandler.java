package com.clear.you.handler;

import com.clear.you.common.Result;
import com.clear.you.common.ResultEnum;
import com.clear.you.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.Set;

@RestControllerAdvice
public class ValidatelExceptionHandler {

   private final static Logger logger = LoggerFactory.getLogger(ValidatelExceptionHandler.class);

   @ExceptionHandler(ConstraintViolationException.class)
   public Result resolveConstraintViolationException(ConstraintViolationException ex){
//      WebResult errorWebResult = new WebResult(WebResult.FAILED);
      Set<ConstraintViolation<?>> constraintViolations = ex.getConstraintViolations();
      if(!CollectionUtils.isEmpty(constraintViolations)){
         StringBuilder msgBuilder = new StringBuilder();
         for(ConstraintViolation constraintViolation :constraintViolations){
            msgBuilder.append(constraintViolation.getMessage()).append(",");
         }
         String errorMessage = msgBuilder.toString();
         if(errorMessage.length()>1){
            errorMessage = errorMessage.substring(0,errorMessage.length()-1);
         }
         return ResultUtil.error(ResultEnum.PARAMETER_VALID_ERROR.getCode(),ResultEnum.PARAMETER_VALID_ERROR.getMsg()+"{"+errorMessage+"}");
      }
      return ResultUtil.success();
   }

   @ExceptionHandler(MethodArgumentNotValidException.class)
   public Result resolveMethodArgumentNotValidException(MethodArgumentNotValidException ex){
      //WebResult errorWebResult = new WebResult(WebResult.FAILED);
      List<ObjectError> objectErrors = ex.getBindingResult().getAllErrors();
      if(!CollectionUtils.isEmpty(objectErrors)) {
         StringBuilder msgBuilder = new StringBuilder();
         for (ObjectError objectError : objectErrors) {
            msgBuilder.append(objectError.getDefaultMessage()).append(",");
         }
         String errorMessage = msgBuilder.toString();
         if (errorMessage.length() > 1) {
            errorMessage = errorMessage.substring(0, errorMessage.length() - 1);
         }
         return ResultUtil.error(ResultEnum.PARAMETER_VALID_ERROR.getCode(),ResultEnum.PARAMETER_VALID_ERROR.getMsg()+"{"+errorMessage+"}");
      }
      return ResultUtil.success();
   }

   @ExceptionHandler(Exception.class)
   public Result handler(Exception e) {
      logger.error("【系统异常】{}", e);
      return ResultUtil.error(ResultEnum.UNKONW_ERROR);
   }


}
