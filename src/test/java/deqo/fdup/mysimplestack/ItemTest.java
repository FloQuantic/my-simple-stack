package deqo.fdup.mysimplestack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    private int testInt;
    private Item monItem;

    @Before
    public void before(){
        testInt=1;
    }

    @Test
    public void getMonInt() {
        assertEquals("MonInt!=1",1,monItem.getMonInt());
    }

    @Test
    public void setMonInt() {
        assertEquals("set(5) mais monInt!=5",5,monItem.setMonInt(5));
    }

}