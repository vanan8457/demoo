package Assignment1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static jdk.nashorn.internal.objects.Global.print;

public class Main {
    public static void main(String[] args) {
        List<Student> std=new ArrayList<>();
        Student student1=new Student(1,"tran van a",10);
        Student student2=new Student(2,"nguyen van b",15);
        Student student3=new Student(3,"tran van ab",9);
        Student student4=new Student(4,"nguyen van abc",20);
        Student student5=new Student(5,"tran van abcde",30);
        std.add(student1);
        std.add(student2);
        std.add(student3);
        std.add(student4);
        std.add(student5);

        StudentAgeCompare studentAgeCompare=new StudentAgeCompare();
        System.out.println("max :"+ Collections.max(std, studentAgeCompare));
        System.out.println("min :"+ Collections.min(std, studentAgeCompare));
        Collections.sort(std,studentAgeCompare);
        System.out.println("sorted ASC"+std);
        Collections.reverse(std);
        System.out.println("sorted DESC"+std);



    }
}
