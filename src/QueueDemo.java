import Entities.Student;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueDemo<T> {
    LinkedList<T> list;
    public QueueDemo(){
        list = new LinkedList<T>();
    }
    public void enqueue(T t){
        list.addLast(t);
    }
    public T dequeue(){
        return list.removeFirst();
    }
    public void showInfo(){
        for (Object obj :list ) {
            System.out.println(obj.toString());
        }
    }
}
