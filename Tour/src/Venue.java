public class Venue {
    private String name;
    private String city;
    private int maxCapacity;
    private static final int MINIMUM_CAPACITY;

    //Constructor

    public Venue(String name, String city, int maxCapacity) {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name must not be null");
        }
        if (city == null || city.isEmpty()){
            throw new IllegalArgumentException("City must not be null");
        }
        this.name = name;
        this.city = city;
        this.maxCapacity = maxCapacity;
    }

    //Getter

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
}
