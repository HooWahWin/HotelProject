import java.util.ArrayList;
import java.util.Collections;

public class Hotel implements Comparable<Hotel> {
    private String name;
    private int stars;
    private double rating;
    private double averageRoomPrice;
    private ArrayList<Room> Rooms = new ArrayList<>();

    public Hotel(String name, int stars) {
        this.name = name;
        this.stars = stars;
    }

    /*
     * setRating() setter for rating
     * 
     * @param the rating of the hotel
     */
    public void setRating(double rating) {

        this.rating = rating;
    }

    /*
     * setRoomPrice() setter for averageRoomPrice
     * 
     * @param the average room price
     */
    public void setRoomPrice(double averageRoomPrice) {

        this.averageRoomPrice = averageRoomPrice;
    }

    public int compareTo(Hotel other) {

        if (Double.compare(averageRoomPrice, other.averageRoomPrice) != 0) {

            return Double.compare(averageRoomPrice, other.averageRoomPrice);

        } else if (Integer.compare(stars, other.stars) != 0) {

            return -Integer.compare(stars, other.stars);

        } else {
            return -Double.compare(rating, other.rating);
        }
    }

    public double getAverageRoomPrice() {
        double sum = 0;
        for (Room r : Rooms)
            sum += r.getPrice();
        return sum / Rooms.size();
    }

    public void addRoom(Room r) {

        Rooms.add(r);
        averageRoomPrice = getAverageRoomPrice();
    }

    public void listRooms() {

        Collections.sort(Rooms);
        for (Room r : Rooms)
            r.getRoomInfo();
    }

    public void printInfo() {

        System.out.printf("%s  \t avg: $%.2f \t%d stars \t %.2f rating\n", name, averageRoomPrice, stars, rating);
    }
}
