package CW7;
import CW7.Classes.Class_task11;
import CW7.Classes.Class_task13;


// 1.1
class task11 {
    public static void main(String[] args) {
        Class_task11 a = new Class_task11();
        System.out.println(a);
    }
}


// 1.3
class task13 {
    public static void main(String[] args) {
        Class_task13 cl = new Class_task13();
        System.out.println(cl.a);
    //    System.out.println(cl.b);
    //    System.out.println(cl.c);
    }
}


// 1.4
class Class_task14 {
    protected int a = 5;
}

class Class2 extends Class_task14 {
    void change_a(){
        System.out.println(a);
        a = 15;
        System.out.println(a);
    }
}

class task14{
    public static void main(String[] args) {
        Class2 cl = new Class2();
        cl.change_a();
    }
}