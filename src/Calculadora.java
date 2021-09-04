
public class Calculadora {
	private IOperator io;
	public Calculadora(IOperator io) {
		this.io=io;
	}
	public float operacion(float a, float b) {
		return io.HacerOperacion(a, b);
	}
}
