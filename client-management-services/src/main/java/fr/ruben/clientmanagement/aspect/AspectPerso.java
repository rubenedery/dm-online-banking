package fr.ruben.clientmanagement.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by RubenEdery on 17/10/2017.
 */
@Aspect
@Component
public class AspectPerso {

    private static Logger logger = Logger.getLogger(AspectPerso.class);

    @Before("execution(* fr.ruben.clientmanagement.controller.services.ControlerUserDto.getAllUser()) ")
    public void logAfter(JoinPoint joinPoint) {
        logger.info("OK");
    }


}
