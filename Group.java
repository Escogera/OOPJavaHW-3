package HW3;


import java.util.*;
import java.util.List;
import java.util.ListIterator;

public class Group implements Iterable<Students>{

   private List<Students> studentsGroup;

    public Group(List<Students> studentsGroup) {
        this.studentsGroup = studentsGroup;
    }

    public int getSize(){
        return studentsGroup.size();
    }

    public Students get(int index){
        return studentsGroup.get(index); 
    }

    @Override
    public Iterator<Students> iterator() {
        return new GroupIterator<>(this);
    }

    
    public ListIterator<Students> listIterator(){
        return new GroupListIterator(this);
    }
        
    public Iterator<Students> descending(){
        return new ReverseIterator(this);
    }
}