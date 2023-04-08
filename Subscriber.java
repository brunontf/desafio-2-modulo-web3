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

    private boolean containsMessageType(){
        int[] messageType = publisher.getMessageType();
        for (int i : messageType) {
            if(i== this.messageType){
                return true;
            }
        }
        return false;
    }

    @Override
    public void update() {

        if (containsMessageType()) {
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
