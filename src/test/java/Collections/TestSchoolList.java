package Collections;

import Collections.schoolsList.SchoolsList;
import Collections.schoolsList.schoolListImpl.SchoolListImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by student on 2016/03/10.
 */
public class TestSchoolList
{
    SchoolsList schoolsList;
    @Before
    public void setUp() throws Exception {
        schoolsList = new SchoolListImpl();
        schoolsList.add("Cape College");
        schoolsList.add("New high");
        schoolsList.remove("New high");

    }

    @Test
    public void testSchoolList() throws Exception {

        Assert.assertEquals("[Cape College]", schoolsList.view());
    }

}
