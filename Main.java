package HW3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.List;

public class Main{
// //Класс Группа содержит в себе коллекцию Студентов. По группе можно перемещаться с помощью итератора.

// Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях. 
// Он реализует интерфейс ListIterator<Student>.
// Добавьте в Группу метод listIterator (), который позволяет начать итерацию с помощью GroupListIterator.

// Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
// • Он отслеживает текущую позицию в переборе
// • Он изначально выставлен на конечную позицию
// • Он движется справа налево
// Проверьте, как он работает.
    public static void main(String[] args) {
        Group studentList = new Group(Arrays.asList(
        new Students("Ivan",LocalDate.of(1993,2,16), 4.8f),
        new Students("Anna",LocalDate.of(1995,6,3), 3.9f),
        new Students("Micle",LocalDate.of(1994,12,22), 4.4f)
        ));

        Iterator<Students> it =  studentList.descending();
        ListIterator<Students> secondIt =  studentList.listIterator();


        for(Students stud:studentList){
            System.out.println(stud);
        }
        System.out.println();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        while(secondIt.hasPrevious()){
            System.out.println(secondIt.previous());
        }
        System.out.println();
        while(secondIt.hasNext()){
            System.out.println(secondIt.next());
        }
        
}
}