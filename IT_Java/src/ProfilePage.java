import java.util.ArrayList;
import java.util.List;

public class ProfilePage {
    private NewProfileStrategy NewProfileStrategy = new NewProfileStrategy();
    private List<Profile> profileList = new ArrayList<>();
    //private List<Schedule> scheduleList = new ArrayList<>();

    public void newProfile(String name){
        profileList.add(NewProfileStrategy.newObject(name));
    }

    public void newProfile(String name, String phone, String email, String teamName, String remark) {
        profileList.add(NewProfileStrategy.newObject(name,phone,email,teamName,remark));
    }

    public ProfilePage() {
    }

    @Override
    public String toString() {
        return "ProfilePage{" +
                "profileList=" + profileList +
                '}';
    }
}
