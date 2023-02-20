package eventpublishdemo.event;

public class EmailEvent {
	private String message;
	


	public EmailEvent(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println("Your message:" + message);
	}
	
	

}
