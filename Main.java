public class Main {
    public static void main(String[] args) {
        Integer[] list ={3,7,1,4,9};

        Lab2 task = new Lab2();
        Integer task1=task.difference(list);
        System.out.println(("Valor resultado de la tarea 1 es: " + task1.toString()));

        String task2 =task.smallest(list);
        System.out.println(("El resultado de la tarea 2 es:" + task2));

       task.mathematical();
        double task3=task.getZ();
        System.out.println(("El resultado de la tarea 3 es: " + task3));
    }
}
