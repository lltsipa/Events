package Collections.dogSet;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lodz on 2016/03/13.
 */
public interface DogSet {

    Set dogSet = new HashSet();
    public void add(String dogName);
    public void remove(String dogName);
    public String view();
}
