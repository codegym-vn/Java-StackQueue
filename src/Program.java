import Entities.Student;
public class Program {
    public static void main(String[] args) {
        // Demo Stack - START
        StackDemo sd = new StackDemo();
        Student s = new Student(1,"sonmc");
        Student s2 = new Student(2,"Chiến");
        Student s3 = new Student(3,"K.Anh");
        sd.add(s);
        sd.add(s2);
        sd.add(s3);
        System.out.println("Trước khi xóa");
        sd.showInfo();
        sd.delete();
        System.out.println("Sau khi Xóa");
        sd.showInfo();
        // Demo Stack - END
        // Demo Queue - START
        QueueDemo qd = new QueueDemo();
        qd.enqueue("A");
        qd.enqueue("B");
        qd.enqueue("C");
        qd.enqueue("D");
        System.out.println("Trước khi xóa");
        qd.showInfo();
        qd.dequeue();
        System.out.println("Sau khi xóa");
        qd.showInfo();
        // Demo Queue - END
    }
}
