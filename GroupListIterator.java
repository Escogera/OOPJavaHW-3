package HW3;

import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Students> {

    private int index;
    private Group group;
    
    
    public GroupListIterator(Group group) {
        this.group = group;
        index = group.getSize() - 1;
    }

    @Override
    public boolean hasNext() {
        return index < group.getSize()-1;        
    }

    @Override
    public Students next() {
        return group.get(++index);
    }

    @Override
    public boolean hasPrevious() {
        return index >= 0;
    }

    @Override
    public Students previous() {
        return group.get(index--);
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {}

    @Override
    public void set(Students e) {}

    @Override
    public void add(Students e) {}
    
}
