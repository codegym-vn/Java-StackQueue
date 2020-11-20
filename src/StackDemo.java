import Entities.Student;

import java.util.Stack;

public class StackDemo {
    Stack<Student> students = new Stack<>();
    public void add(Student s){
        students.push(s);
    }
    public void delete(){
        students.pop();
    }
    public void showInfo(){
        for (Student s: students ) {
            System.out.println(s.toString());;
        }
    }
}
