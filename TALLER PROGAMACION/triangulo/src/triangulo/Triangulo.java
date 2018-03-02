
package triangulo;

public class Triangulo {

    public static void main(String[] args) {
      int base_del_triangulo =3, altura_del_triangulo =2;
      double area ;
      area = area_del_triangulo(base_del_triangulo,altura_del_triangulo);
      System.out.println("el area del triangulo es:               "+area);
    }
    public static double area_del_triangulo(int a, int b){
        double t;
        t = (a*b)/2;
        return t;
        
    }
    
}
