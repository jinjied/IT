import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ScheduleSortStrategy{
    public List<Schedule> sortName(List<Schedule> lst) {
        Collections.sort(lst, new NameComparator());
        return lst;
    }

    public class NameComparator implements Comparator<Schedule> {
        public int compare(Schedule m1, Schedule m2) {
            return m1.getName().compareTo(m2.getName());
        }
    }

}

