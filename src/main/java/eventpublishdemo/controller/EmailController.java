package eventpublishdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import eventpublishdemo.event.EmailEvent;
import eventpublishdemo.publisher.EmailPublisher;

public class EmailController {
	
	@Autowired
	EmailPublisher emailPublisher;
	
	
	@GetMapping("/event")
	public void publishEvent() {
		emailPublisher.publishEmailEvent(new EmailEvent("Email Successfully"));
	}

}
