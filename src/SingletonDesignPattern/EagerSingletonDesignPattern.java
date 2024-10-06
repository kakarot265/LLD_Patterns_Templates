package SingletonDesignPattern;

public class EagerSingletonDesignPattern {

    private static final EagerSingletonDesignPattern instance = new EagerSingletonDesignPattern();

    private EagerSingletonDesignPattern() {}

    public static EagerSingletonDesignPattern getInstance() {
        return instance;
    }
}
