import Exceptions.CalculadoraException;

public class Calculadora {

    public int divirdir(int dividendo, int divisor) throws CalculadoraException {
        if (divisor == 0)
            throw new CalculadoraException("Imposible bro, no se puede dividir por 0");
        return dividendo / divisor;
    }
}
