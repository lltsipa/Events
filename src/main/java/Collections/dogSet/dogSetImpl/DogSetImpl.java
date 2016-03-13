package Collections.dogSet.dogSetImpl;

import Collections.dogSet.DogSet;

/**
 * Created by lodz on 2016/03/13.
 */
public class DogSetImpl implements DogSet {
    public void add(String dogName) {
        dogSet.add(dogName);
        System.out.println(dogName +"Added successfully");

    }

    public void remove(String dogName)
    {
        for(int i = 0; i < dogSet.size(); i++)
        {
            if(dogSet.contains(dogName))
                dogSet.remove(dogName);
            System.out.println(dogName +"Removed successfully");
        }
    }

    public String view() {
        return dogSet.toString();
    }
}
