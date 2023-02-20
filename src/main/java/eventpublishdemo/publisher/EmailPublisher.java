package eventpublishdemo.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import eventpublishdemo.event.EmailEvent;

@Component
public class EmailPublisher {

	private final ApplicationEventPublisher eventPublisher;

	public EmailPublisher(ApplicationEventPublisher eventPublisher) {
		super();
		this.eventPublisher = eventPublisher;
	}

	public void publishEmailEvent(EmailEvent event) {
		eventPublisher.publishEvent(event);

	}

}
