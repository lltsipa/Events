package Collections.personMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lodz on 2016/03/13.
 */
public interface PersonMap {
    Map personMap = new HashMap();
    public void add(int number, String person);
    public void remove(int num);
    public String view();

}
