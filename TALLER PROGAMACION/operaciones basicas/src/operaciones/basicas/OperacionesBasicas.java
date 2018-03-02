
package operaciones.basicas;


public class OperacionesBasicas {

    
    public static void main(String[] args) {
        String Variable;
        Variable = "Hola Mundo";
        System.out.println(Variable);
        
        
        int num,num1,num2 ;
        num1 = 8;
        num2 = 1;
        num=num1+num2;
        
        System.out.println(num);
        
        int nu3,nu4 ;
        nu3 = 86;
        nu4 = 14;
        num=nu4-nu3;
        
        System.out.println(num);
        
        
        int num5,num6 ;
        num5 = 68;
        num6 = 5;
        num=num5*num6;
        
        System.out.println(num);
        
        
        int num7,num8 ;
        num7 = 22;
        num8 = 8;
        num=num7+num8;
        
        System.out.println(num);
        
        
        suma(5,19);
        
               
    }
    
    public static void suma(int numero, int numero2){
        numero=numero + numero2;
        System.out.println(numero);
    }
}
