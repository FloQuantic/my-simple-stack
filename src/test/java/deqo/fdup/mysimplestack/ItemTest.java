package deqo.fdup.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    private Item monItemSet = new Item();
    private Item monItemGet = new Item();

    @Before
    public void before(){
        monItemSet.setMonInt(5);
    }

    @Test
    public void getMonInt() {
        assertEquals("MonInt!=1",1,monItemGet.getMonInt());
    }

    @Test
    public void setMonInt() {
        assertEquals("set(5) mais monInt!=5",5,monItemSet.getMonInt());
    }


}