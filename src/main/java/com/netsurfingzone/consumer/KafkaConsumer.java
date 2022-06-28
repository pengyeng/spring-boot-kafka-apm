package com.netsurfingzone.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.netsurfingzone.constant.ApplicationConstant;

@Component
public class KafkaConsumer {

	private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

	@KafkaListener(groupId = ApplicationConstant.GROUP_ID_STRING, topics = ApplicationConstant.TOPIC_NAME, 
			containerFactory = ApplicationConstant.KAFKA_LISTENER_CONTAINER_FACTORY)
	public void receivedMessage(String message) {
		//try{
			//Thread.sleep(200);	
		//}catch(InterruptedException e){
		//}
		logger.info("Message Received using Kafka listener " + message);
	}

/*
	@KafkaListener(groupId = ApplicationConstant.GROUP_ID_STRING, topics = ApplicationConstant.TOPIC_NAME, 
			containerFactory = ApplicationConstant.KAFKA_LISTENER_CONTAINER_FACTORY)
	public void listen(String message) throws InterruptedException{
		Thread.sleep(200);	
		
	}
*/

}