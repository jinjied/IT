import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContactSortStrategy {
    public List<Contact> sortName(List<Contact> lst) {
        Collections.sort(lst, new NameComparator());
        return lst;
    }

    public List<Contact> sortPhone(List<Contact> lst) {
        Collections.sort(lst, new PhoneComparator());
        return lst;
    }

    public List<Contact> sortEmail(List<Contact> lst) {
        Collections.sort(lst, new EmailComparator());
        return lst;
    }

    public List<Contact> sortTeam(List<Contact> lst) {
        Collections.sort(lst, new TeamComparator());
        return lst;
    }

    public List<Contact> sortRemark(List<Contact> lst) {
        Collections.sort(lst, new RemarkComparator());
        return lst;
    }

    public class NameComparator implements Comparator<Contact> {
        public int compare(Contact m1, Contact m2) {
            return m1.getName().compareTo(m2.getName());
        }
    }

    public class PhoneComparator implements Comparator<Contact> {
        public int compare(Contact m1, Contact m2) {
            return m1.getPhone().compareTo(m2.getPhone());
        }
    }

    public class EmailComparator implements Comparator<Contact> {
        public int compare(Contact m1, Contact m2) {
            return m1.getEmail().compareTo(m2.getEmail());
        }
    }

    public class TeamComparator implements Comparator<Contact> {
        public int compare(Contact m1, Contact m2) {
            return m1.getTeamName().compareTo(m2.getTeamName());
        }
    }

    public class RemarkComparator implements Comparator<Contact> {
        public int compare(Contact m1, Contact m2) {
            return m1.getRemark().compareTo(m2.getRemark());
        }
    }
}
