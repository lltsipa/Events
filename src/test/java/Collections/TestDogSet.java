package Collections;

import Collections.dogSet.DogSet;
import Collections.dogSet.dogSetImpl.DogSetImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/13.
 */
public class TestDogSet {
    private DogSet dogSet;

    @Before
    public void setUp() throws Exception {
        dogSet = new DogSetImpl();
        dogSet.add("Spot");
        dogSet.add("Danger");
        dogSet.remove("Spot");

    }

    @Test
    public void testDogSet() throws Exception {
        Assert.assertEquals("[Danger]", dogSet.view());

    }
}
