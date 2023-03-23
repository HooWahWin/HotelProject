public class Suite extends Room {
    private int numRooms;
    private boolean kitchen;

    public Suite(int number, double price, int numRooms, boolean kitchen) {
        super(number, price);
        this.numRooms = numRooms;
        this.kitchen = kitchen;
    }

    @Override
    public void getRoomInfo() {
        if (kitchen) {
            System.out.printf("Suite %d \t $%.2f \t%d rooms \t Kitchen\n", number, price, numRooms);
        } else {
            System.out.printf("Suite %d \t $%.2f \t%d rooms \t No Kitchen\n", number, price, numRooms);

        }

    }
}
