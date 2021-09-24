import java.util.List;

public interface ISortStrategy extends IStrategy{
    public List<Contact> sort(List<Contact> lst);
}
