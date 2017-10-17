package fr.ruben.clientmanagement.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by RubenEdery on 17/10/2017.
 */
@Aspect
@Component
public class AspectPerso {

    private static Logger logger = Logger.getLogger(AspectPerso.class);

    @Before("execution(* fr.ruben.clientmanagement.controller.services.ControlerUserDto.getAllUser()) ")
    public void logAfter(JoinPoint joinPoint) {


        /**
         * http://www.makeinjava.com/logging-aspect-restful-web-service-using-spring-aop-log-requests-responses/
         */
        HttpServletRequest theRequest = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();

        String httpMethod = theRequest.getMethod();
        String specifRoad = theRequest.getRequestURI();
        String className  = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        String specifArgs = Arrays.toString(joinPoint.getArgs());



        logger.info("[" + className + "] [" + httpMethod + "] [" + specifRoad + "] [" + methodName + "] " + specifArgs );
    }



}
