package Collections.personMap.personMapImpl;

import Collections.personMap.PersonMap;

/**
 * Created by lodz on 2016/03/13.
 */
public class PersonMapImpl implements PersonMap {

    public void add(int number, String person) {

        personMap.put(number, person);
        System.out.println(number +" Added successfully");
    }

    public void remove(int number)
    {
        if(personMap.containsKey(number))
        {
            personMap.remove(number);
        }
    }

    public String view() {
        return personMap.toString();
    }
}
