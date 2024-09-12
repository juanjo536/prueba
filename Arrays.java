
package arrays;

public class Arrays {
    public static void main(String[] args) {
        int numero =0;
      
        int number[]= {50, 70, 75,12, 45};
        for (int i=0; i<=number.length -1  ; i++ ){
            if (number[i] > numero){
                numero = number[i];
                
            }
        }   
        System.out.println("el numero mayor es: " + numero);
         
        for (int i=0; i<=number.length -1  ; i++ ){
            if (number[i] < numero){
             numero = number[i];
               //git patacon 21
            }
        }
        System.out.println("el numero menor es: " + numero);
    }
}  
    



