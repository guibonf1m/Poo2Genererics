// src/CupomDesconto.java
public class CupomDesconto<T extends Number> {
    public double aplicarDesconto(T desconto, double precoOriginal) {
        if (desconto instanceof Integer) {
            return precoOriginal - desconto.intValue();
        } else if (desconto instanceof Double) {
            return precoOriginal - (precoOriginal * desconto.doubleValue() / 100);
        } else {
            throw new IllegalArgumentException("Tipo de desconto não suportado");
        }
    }
}