package Collections.schoolsList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2016/03/10.
 */
public interface SchoolsList {
    List schoolList = new ArrayList();
    public void add(String schoolName);
    public void remove(String SchoolName);
    public String view();
}
