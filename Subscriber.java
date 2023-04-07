public class Subscriber implements SubscriberInterface {
    private Publisher publisher;
    private String name;
    private String message;
    private int messageType;
    
    public Subscriber(Publisher publisher, String name, int messageType) {
        this.publisher = publisher;
        this.name = name;
        this.messageType = messageType;
        publisher.subscribe(this);
    }

    private void print() {
        System.out.println(name.toUpperCase() + " "+ this.message);
    }

    @Override
    public void update() {
        if (publisher.getMessageType() == this.messageType) {
            this.message = publisher.getMessage();

        } else
            this.message = "Nada a revelar";

        print();
    }

    @Override
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }


    
}
