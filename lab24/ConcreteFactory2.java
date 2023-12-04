package lab24;

// Конкретная фабрика 2
public class ConcreteFactory2 implements ComplexAbstractFactory {
    @Override
    public Complex createComplex(int real, int image) {
        return new ConcreteComplex2(real, image);
    }
}
