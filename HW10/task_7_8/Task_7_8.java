package HW10.task_7_8;


public class Task_7_8 {
    public static void main(String[] args) {
        CargoShip ColomboExpress = new CargoShip("Colombo Express", 335, 104400);
        Tanker Pegasus = new Tanker("Pegasus", 274, 158267, "LR2", "crude oil");
        Tanker SiriusStar = new Tanker("Sirius Star", 332, 318000);
        SiriusStar.setDWTClass("VLCC");
        SiriusStar.setCargo("crude oil");

        System.out.println(ColomboExpress);
        System.out.println(Pegasus);
        System.out.println(SiriusStar);
    }
}