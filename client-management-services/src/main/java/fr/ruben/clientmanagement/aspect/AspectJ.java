package fr.ruben.clientmanagement.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * Created by RubenEdery on 17/10/2017.
 */
@Aspect
@Component
public class AspectJ {
    private static final Logger logger = Logger.getLogger(String.valueOf(AspectJ.class));

    @Before("execution(* fr.ruben.clientmanagement.controller.*.*(..))")

    public void logAfter(JoinPoint joinPoint) {

        logger.info("TESTMESSAGE");

    }
}
