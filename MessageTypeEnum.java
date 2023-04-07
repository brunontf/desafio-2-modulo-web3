public enum MessageTypeEnum {
    CEU(0),
    AGUA(1),
    TERRA(2);

    public final int value;

    private MessageTypeEnum(int value) {
        this.value = value;
    }

    public static int getSize() {
        return MessageTypeEnum.values().length;
    }

}
