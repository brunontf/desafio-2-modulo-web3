public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Subscriber sub1 = new Subscriber(publisher, "OBS-CEU  ",MessageTypeEnum.CEU.value);
        Subscriber sub2 = new Subscriber(publisher, "OBS-AGUA ",MessageTypeEnum.AGUA.value);
        Subscriber sub3 = new Subscriber(publisher, "OBS-TERRA",MessageTypeEnum.TERRA.value);

        publisher.toPublish("Poluição Aérea",MessageTypeEnum.CEU.value);
        System.out.println();
        publisher.toPublish("Poluição Aquática",MessageTypeEnum.AGUA.value);
        System.out.println();
        publisher.toPublish("Poluição Terreste",MessageTypeEnum.TERRA.value);
        System.out.println();
        publisher.toPublish("Atividade Vulcânica",Util.getRandomInt(), Util.getRandomInt());
        System.out.println();
        publisher.toPublish("Explosão Nuclear",Util.getRandomInt(),Util.getRandomInt());
    }
}
