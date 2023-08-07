package com.educacionit.desafio1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import interfaces.IChofer;

@SpringBootApplication
public class Desafio1Application {

	public static void main(String[] args) {
		// SpringApplication.run(Desafio1Application.class, args);
		// Ejercicio 1 Desafío Módulo 1
//		Taxi t1 = new Taxi();
//		System.out.println(t1.getCapacidad());
//		Colectivo c1 = new Colectivo();
//		System.out.println(c1.getCapacidad());
//		// Ejercicio 2 Desafío Módulo 1
//		crear un contexto para que cargue el xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		// Probando DI
//		IVehiculos t2 = contexto.getBean("miTaxi", IVehiculos.class);
//		System.out.println(t2.getCapacidad());
//		IVehiculos c2 = contexto.getBean("miColectivo", IVehiculos.class);
//		System.out.println(c2.getCapacidad());
		
		// Ejercicio 1 Desafío Módulo 2
//		IVehiculos v1 = contexto.getBean("miVehiculo",IVehiculos.class);
//		System.out.println(v1.getCapacidad()); 
//		System.out.println(v1.getLicencia());
//		
//		IVehiculos v2 = contexto.getBean("miVehiculo2",IVehiculos.class);
//		System.out.println(v2.getCapacidad()); 
//		System.out.println(v2.getLicencia());
		// Ejercicio 2 Desafío Módulo 2
		IChofer ch1 = contexto.getBean("TaxiChofer", IChofer.class);
		System.out.println(ch1.getTareas());
		IChofer ch2 = contexto.getBean("ColectivoChofer", IChofer.class);
		System.out.println(ch2.getTareas());
		contexto.close();
	}

}
