package HW3;

import java.util.Iterator;



public class GroupIterator<Student> implements Iterator<Students>{

    private int index = -1;
    private Group group;
    
    public GroupIterator(Group group) {
        this.group = group;
    }

    @Override
    public boolean hasNext() {
        return index < group.getSize()-1;
         
    }

    @Override
    public Students next() {
        return group.get(++index);
        

    }
    
}
