package HW3;

import java.time.LocalDate;

public class Students {

    private String name;
    private LocalDate date;
    private float grade;
    
    @Override
    public String toString() {
        return "Students [name=" + name + ", date=" + date + ", grade=" + grade + "]";
    }

    public Students(String name, LocalDate date, float grade) {
        this.name = name;
        this.date = date;
        this.grade = grade;
    }
   
    
}
