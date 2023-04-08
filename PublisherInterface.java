public interface PublisherInterface {
    public void subscribe(Subscriber subscriber);
    public void unsubscribe(Subscriber subscriber);
    public void toPublish(String message, int[] messageType);
    public void notifySubscribers();
    public String getMessage();
    
}
