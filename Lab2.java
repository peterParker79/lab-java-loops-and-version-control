import java.util.Objects;

public class Lab2 {
    /*
    Task 1: Method difference
    Write a Java method that returns the difference between the
    largest and smallest values in an array of integers. The length of the
    array must be at least 1.*/

    /*
    Task 2: method smallest
    Write a Java method that finds the smallest and second smallest
    elements of a given array and prints them to the console.
    */


    /*
    Task 3: method mathematical
    Write a Java method that calculates the result of the following
    mathematical expression, where x and y are two variables that
    have been pre-set in your code:
    */

    private double x=2; // variables preestablecidas para la tarea 3
    private double y =3;
    private double z; //variable que modifica la Task3

    public Integer difference (Integer[] integerList){
        Integer smallest;
        Integer largest;

        if (integerList.length==0) {
            System.out.println("La lista está vacia");
            return (-1);

        }else if (integerList.length==1) {
            return integerList[0];

        }  else {// al menos tiene dos elementos


            smallest=integerList[0];
            largest=integerList[1];

            for (int i=2; i<integerList.length;i++) {

                if (integerList[i]<smallest){
                    smallest=integerList[i];
                }

                if (integerList[i]>largest){
                    largest=integerList[i];
                }

            }// end for

        } //end else-if

        return largest-smallest;
    } //end method difference

    public String smallest (Integer[] integerList){
       // Inicializados con el mayor valor posible
        Integer min1 = Integer.MAX_VALUE;  // El menor número
        Integer min2 = Integer.MAX_VALUE;  // El segundo menor número

        for (Integer num : integerList){
            if (num < min1) {
                min2 = min1;  // El antiguo mínimo pasa a ser el segundo menor
                min1 = num;   // Se actualiza el menor
            } else if (num < min2) {
                min2 = num;   // Se actualiza el segundo menor
            }
        }
        return "Los dos números menores de la lista son "  +min1.toString() + " y " + min2.toString();
    } //end method smallest


    //method Task3
    public void mathematical(){
       z= Math.pow(x,2) + Math.pow(  ((4*y/5)-x),2 );

    }




        public double getZ(){return z;}

}
