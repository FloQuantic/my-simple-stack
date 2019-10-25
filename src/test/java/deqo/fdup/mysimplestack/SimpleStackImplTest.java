package deqo.fdup.mysimplestack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class SimpleStackImplTest {
    private SimpleStackImpl maStack = new SimpleStackImpl();
    private SimpleStackImpl maStackI1 = new SimpleStackImpl();
    private SimpleStackImpl maStackI2 = new SimpleStackImpl();
    private Item i1 = new Item();
    private Item i2 = new Item();
    private Item test = new Item();

    @Before
    public void setUp() {
        i2.setMonInt(2);
        maStackI1.push(i1);
        maStackI2.push(i1);
        maStackI2.push(i2);
        test.setMonInt(0);
    }

    @After
    public void tearDown() {
        while (!maStack.isEmpty()){
            maStack.pop();
        }
        while (!maStackI1.isEmpty()){
            maStackI1.pop();
        }
        while (!maStackI2.isEmpty()){
            maStackI2.pop();
        }
    }

    @Test
    public void isEmpty() {
        assertTrue("isEmpty(EmptyStack)==False",maStack.isEmpty());
        assertFalse("isEmpty(Stack[1])==True",maStackI1.isEmpty());
    }

    @Test
    public void getSize() {
        assertEquals("getSize(EmptyStack)!=0",0, maStack.getSize());
        assertEquals("getSize(Stack[1])!=1",1, maStackI1.getSize());
        assertEquals("getSize(Stack[1,2])!=2",2, maStackI2.getSize());
    }

    @Test
    public void peek() {
        try{
            test = maStack.peek();
            test.setMonInt(1);
        }catch(EmptyStackException emptyExc){}
        assertEquals("peek(EmptyStack) doesn't throw Exception",0,test.getMonInt());
        assertEquals("peek(Stack[1])!=i1",i1,maStackI1.peek());
        assertEquals("peek(Stack[1,2])!=i2",i2,maStackI2.peek());
    }

    @Test
    public void pop() {
        try{
            test = maStack.pop();
            test.setMonInt(1);
        }catch(EmptyStackException emptyExc){}
        assertEquals("pop(EmptyStack) doesn't throw Exception !",0,test.getMonInt());
        assertEquals("pop(Stack[1])!=emptyStack",i1,maStackI1.pop());
        assertEquals("pop(Stack[1,2])!=Stack[1]",i2,maStackI2.pop());
    }
}