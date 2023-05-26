package org.kol.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaRestApplication.class, args);
	}


 //Mandatory Before run application you have to execute below commands

 // C:\kafka_2.13-3.4.0>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
	// C:\kafka_2.13-3.4.0>kafka-server-start.bat config\server.properties

	//optional
 //  C:\kafka_2.13-3.4.0>.\bin\windows\zookeeper-server-start.bat .\config\server.properties




}
