package lab24;

// Конкретная фабрика 1
public class ConcreteFactory1 implements ComplexAbstractFactory {
    @Override
    public Complex createComplex(int real, int image) {
        return new ConcreteComplex1(real, image);
    }
}
