package deqo.fdup.mysimplestack;

import java.util.EmptyStackException;
import java.util.Stack;

public class SimpleStackImpl implements SimpleStack {
    private Stack<Item> maStack= new Stack<>();

    @Override
    public boolean isEmpty() {
        return maStack.isEmpty();
    }

    //Modif to test

    @Override
    public int getSize() {
        return maStack.size();
    }

    @Override
    public void push(Item item) {
        maStack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return maStack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return maStack.pop();
    }
}
