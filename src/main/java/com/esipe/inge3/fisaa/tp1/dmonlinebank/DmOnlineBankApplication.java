package com.esipe.inge3.fisaa.tp1.dmonlinebank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;
@RestController
@SpringBootApplication
public class DmOnlineBankApplication {
    static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(DmOnlineBankApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DmOnlineBankApplication.class, args);
        logger.info("OKOK");
	}

	@GetMapping("/")
	public String home() {
		return "Hello";
	}

	@GetMapping("/bonjour")
	public String bonjour() {
		return "bonjour";
	}

    @RequestMapping(value = "/client", method = RequestMethod.GET)
    public String bonjour2() {
        return "bonjour";
    }

}
