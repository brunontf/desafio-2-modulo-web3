import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Publisher implements PublisherInterface{
    private List<Subscriber> subsList;
    private String message;
    private int messageType;

    Publisher(){
        subsList= new ArrayList<>();
    }


    @Override
    public void subscribe(Subscriber subscriber) {
        Optional<Subscriber> subscriberOp = Optional.ofNullable(subscriber);
        if(subscriberOp.isPresent()){
            subsList.add(subscriberOp.get());
            return;
        }
        throw new RuntimeException("Subcriber cant be null");
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        Optional<Subscriber> subscriberOp = Optional.ofNullable(subscriber);
        if(subscriberOp.isPresent()){
            subsList.remove(subscriberOp.get());
            return;
        }
        throw new RuntimeException("Subcriber cant be null");
    }

    @Override
    public void toPublish(String message, int messageType) {
        this.message=message;
        this.messageType=messageType;
        notifySubscribers();
    }

    @Override
    public void notifySubscribers() {
        subsList.stream().forEach(sub->sub.update());
    }

    @Override
    public String getMessage() {
        return message;
    }
    
    public int getMessageType() {
        return messageType;
    }
    
}
