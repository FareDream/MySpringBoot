package com.xzy.springboot.handler;

import com.xzy.springboot.MyException;
import com.xzy.springboot.json.ErrorInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author XuZiyu
 * @date 2018-3-113:50
 * @description @ControllerAdvice定义统一异常处理类
 */
@ControllerAdvice
public class GlobaControllerHandler {

    public static final String DEFAULT_ERROR_VIEW = "error";

    /**
     * @ExceptionHandler用来定义函数正对的异常类型
     * @param req
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception{
        ModelAndView mav = new ModelAndView();
        mav.addObject("execption",e);
        mav.addObject("url",req.getRequestURI());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }

    @ExceptionHandler(MyException.class)
    @ResponseBody
    public ErrorInfo<String> defualtMyExceptionHandler(HttpServletRequest request, MyException me){
        ErrorInfo<String> r = new ErrorInfo<String>();
        r.setMessage(me.getMessage());
        r.setCode(ErrorInfo.ERROR);
        r.setData("some Data");
        r.setUrl(request.getRequestURI().toString());
        return r;
    }
}
