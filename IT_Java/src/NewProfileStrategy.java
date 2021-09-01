public class NewProfileStrategy implements INewStrategy {
    private Profile profile = null;

    public Profile newObject(String name){
        profile = new Profile(name);
        //System.out.println(profile);
        return profile;
    }

    public Profile newObject(String name, String phone, String email, String teamName, String remark) {
        profile = new Profile(name,phone,email,teamName,remark);
        //System.out.println(profile);
        return profile;
    }

    public NewProfileStrategy() {
    }
}
