package Collections;

import Collections.personMap.PersonMap;
import Collections.personMap.personMapImpl.PersonMapImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/13.
 */
public class TestPersonMap {
    PersonMap personMap;
   //PersonMap john;
    @Before
    public void setUp() throws Exception {
     personMap = new PersonMapImpl();
        personMap.add(123, "John");
    }

    @Test
    public void testPersonMap() throws Exception {

        Assert.assertEquals("{123=John}", personMap.view());

    }
}
