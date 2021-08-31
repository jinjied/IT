public class ProfileFactory {
    private static ProfileFactory ProfileFactory = new ProfileFactory();
    private Profile profile = null;

    private ProfileFactory(){
    }

    public static ProfileFactory getInstance() {
        return ProfileFactory;
    }

    public Profile getProfile(String name){
        profile = new Profile(name);
        return profile;
    }
    public Profile getProfile(String name, String phone, String email, String teamName, String remark) {
        profile = new Profile(name,phone,email,teamName,remark);
        return profile;
    }
}