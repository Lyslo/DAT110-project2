package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text

    // message sent from client to subscribe on a topic

    // TODO:
    // Implement object variables - a topic is required

    // Constructor, get/set-methods, and toString method
    // as described in the project text
    private String topic;

    public UnsubscribeMsg(String user, String topic) {
        super(MessageType.UNSUBSCRIBE, user);
        this.topic = topic;

    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "Message [type=" + this.getType() + ", user=" + this.getUser() + ", topic=" + topic + "]";
    }
	
}