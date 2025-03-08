package com.pe.incabridge.services.application.hlthcontracthealth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Main class for running Spring Boot framework.<br/>
 * <b>Class</b>: incabApplicationApplication<br/>
 * <b>Copyright</b>: &copy; 2020 Lima IncaBridge.<br/>
 * <b>Company</b>: Lima IncaBridge.<br/>
 *
 * @author Lima IncaBridge (ibn) <br/>
 * <u>Service Provider</u>: Everis <br/>
 * <u>Developed by</u>: <br/>
 * <ul>
 * <li>Israel Romero</li>
 * </ul>
 * <u>Changes</u>:<br/>
 * <ul>
 * <li>Aug 3, 2020 Creaci&oacute;n de Clase.</li>
 * </ul>
 * @version 1.0
 */
//
//@Import({SpringDocConfiguration.class})
//@ComponentScan(lazyInit = true)
//@SpringBootApplication(scanBasePackages =
//		{"com.pe.incabridge.services.application.hlthcontracthealth"})
//public class IncabridgeApplicationApplication  {
//	private static ApplicationContext applicationContext;
//
//	/**
//	 * Main method.
//	 */
//	public static void main(String[] args) {
//
//		applicationContext = new SpringApplication(IncabridgeApplicationApplication.class).run(args);
//	}
//
//	public static ApplicationContext getApplicationContext() {
//		return applicationContext;
//	}
//}

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IncabridgeApplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(IncabridgeApplicationApplication.class, args);
	}

}