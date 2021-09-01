public class INewProfileStrategy implements INewStrategy{
    public Profile newObject(String name){
        Profile profile = ProfileFactory.getInstance().newObject(name);
        System.out.println(profile);
        return profile;
    }

    public Profile newObject(String name, String phone, String email, String teamName, String remark) {
        Profile profile = ProfileFactory.getInstance().newObject(name,phone,email,teamName,remark);
        System.out.println(profile);
        return profile;
    }

    public INewProfileStrategy() {
    }
}
