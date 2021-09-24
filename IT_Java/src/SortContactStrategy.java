import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortContactStrategy implements ISortStrategy {

    public List<Contact> sort(List<Contact> lst) {
        Collections.sort(lst, new NameComparator());
        return lst;
    }


    public class NameComparator implements Comparator<Contact> {
        public int compare(Contact m1, Contact m2) {
            return m1.getName().compareTo(m2.getName());
        }
    }
}