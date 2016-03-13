package Collections.schoolsList.schoolListImpl;

import Collections.schoolsList.SchoolsList;

/**
 * Created by student on 2016/03/10.
 */
public class SchoolListImpl implements SchoolsList {
    public void add(String schoolName)
    {
        schoolList.add(schoolName);
        System.out.println(schoolName + ": Added successfully" );
    }

    public void remove(String schoolName) {

            if (schoolList.contains(schoolName))
            {
                schoolList.remove(schoolName);
                System.out.println(schoolName + ": Removed successfully" );
            }

    }
    public String view()
    {
        return schoolList.toString();
    }
}
