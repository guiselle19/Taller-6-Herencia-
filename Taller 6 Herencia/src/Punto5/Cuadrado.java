
package Punto5;


public class Cuadrado extends Cuadrilatero{
    
    public Cuadrado(int coxA, int coyA, int coxB, int coyB, int coxC, int coyC, int coxD, int coyD) {
        super(coxA, coyA, coxB, coyB, coxC, coyC, coxD, coyD);
    }
    
    @Override
    public String Area(){
        return super.calcularArea()+" (Cuadrado)";
    }
}
