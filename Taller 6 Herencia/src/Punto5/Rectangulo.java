
package Punto5;


public class Rectangulo extends Cuadrilatero {
    
    public Rectangulo(int coxA, int coyA, int coxB, int coyB, int coxC, int coyC, int coxD, int coyD) {
        super(coxA, coyA, coxB, coyB, coxC, coyC, coxD, coyD);
    }
    
    @Override
    public String Area(){
       return super.calcularArea()+" (Rectángulo)";
    }
}
   
