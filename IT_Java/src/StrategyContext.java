import java.util.ArrayList;
import java.util.List;

public class StrategyContext{
    private INewProfileStrategy iNewProfileStrategy = new INewProfileStrategy();
    private List<Profile> profileList = new ArrayList<>();
    private List<Schedule> scheduleList = new ArrayList<>();

    public void newProfile(String name){
        profileList.add(iNewProfileStrategy.newObject(name));
    }

    public void newProfile(String name, String phone, String email, String teamName, String remark) {
        profileList.add(iNewProfileStrategy.newObject(name,phone,email,teamName,remark));
    }
    public StrategyContext() {
    }
}
