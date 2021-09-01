public class ObjectFactory {
    private static ObjectFactory objectFactory = new ObjectFactory();

    private ObjectFactory(){
    }

    public static ObjectFactory getInstance() {
        return objectFactory;
    }
}
