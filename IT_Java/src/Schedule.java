import java.util.Date;

public class Schedule {
    private String name = "NULL";
    private String time = "NULL";
    private String address = "NULL";
    private String context = "NULL";

    public Schedule(String name) {
        this.name = name;
    }

    public Schedule(String name, String time, String address, String context) {
        this.name = name;
        this.time = time;
        this.address = address;
        this.context = context;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", address='" + address + '\'' +
                ", context='" + context + '\'' +
                '}';
    }
}
