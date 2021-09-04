
public class Main {
	public static void main(String[] args) {  
        Calculadora oprt = new Calculadora(new AddOperator());  
        System.out.println("Resultado suma: "+oprt.operacion(1, 1));  
  
        oprt = new Calculadora(new SubstractOperator());  
        System.out.println("Resultado resta: "+oprt.operacion(7, 2));  
  
        oprt = new Calculadora(new MultiplyOperator());  
        System.out.println("Resultado multiplicacion: "+oprt.operacion(5, 5));  
  
        oprt = new Calculadora(new DivisionOperator());  
        System.out.println("Resultado division: "+oprt.operacion(20, 5));  
    }  

}
