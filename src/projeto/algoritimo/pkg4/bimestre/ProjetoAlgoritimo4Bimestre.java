
package projeto.algoritimo.pkg4.bimestre;


public class ProjetoAlgoritimo4Bimestre {
public static void quadrado(double n){
    double r = n*n;
    System.out.println("");
    
}
public static double metade(double v){
    double r = v/2;
    return r;
    
}

    public static void main(String[] args) {
       double raiz;
       
       raiz = Math.sqrt(15);
       
        System.out.println("A raiz é" + raiz); 
        
        quadrado (15);
        
        System.out.println("A metade é:"+ metade(15));
    }
    
}
