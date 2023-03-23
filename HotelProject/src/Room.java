public class Room implements Comparable<Room> {
    protected int number;
    protected double price;

    public Room(int number, double price) {

        this.number = number;
        this.price = price;
    }

    public void setPrice(double RoomPrice) {

        price = RoomPrice;
    }

    public void getRoomInfo() {
        System.out.println();
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Room other) {
        return Double.compare(price, other.price);
    }
}
