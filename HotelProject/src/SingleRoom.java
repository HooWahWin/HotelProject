public class SingleRoom extends Room {
    private String bedType;
    private boolean smoking;

    public SingleRoom(int number, double price, String bedType, boolean smoking) {
        super(number, price);
        this.bedType = bedType;
        this.smoking = smoking;
    }

    @Override
    public void getRoomInfo() {
        if (smoking) {
            System.out.printf("Room %d \t $%.2f \t%s \t\t Smoking\n", number, price, bedType);
        } else {
            System.out.printf("Room %d \t $%.2f \t%s \t\t Non-Smoking\n", number, price, bedType);
        }

    }
}
