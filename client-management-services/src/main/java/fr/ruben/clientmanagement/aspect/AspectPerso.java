
package fr.ruben.clientmanagement.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @Author EDERY RUBEN on 17/10/2017.
 */
@Aspect
@Component
public class AspectPerso {

    private static Logger logger = Logger.getLogger(AspectPerso.class);

    @Before("execution(* fr.ruben.clientmanagement.controller.services.*.*(..)) ")
    
    public void logAfter(JoinPoint joinPoint) {
        /**
         *This method need to separate technical code and work code
         */

        /** Link where i find solution
         * http://www.makeinjava.com/logging-aspect-restful-web-service-using-spring-aop-log-requests-responses/
         */
        HttpServletRequest theRequest = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();

        String httpMethod = theRequest.getMethod();
        String specifRoad = theRequest.getRequestURI();
        String className  = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        String specifArgs = Arrays.toString(joinPoint.getArgs());
	
		/**
		 *This sentence is used to log httpMethod use, specific road, classname, methode name, spcific args in a methode
		 */
        logger.info("[" + className + "] [" + httpMethod + "] [" + specifRoad + "] [" + methodName + "] " + specifArgs );
    }



}
