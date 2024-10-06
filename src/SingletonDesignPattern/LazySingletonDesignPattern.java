package SingletonDesignPattern;

public class LazySingletonDesignPattern {

        private static LazySingletonDesignPattern instance;

        private LazySingletonDesignPattern() {}

        public static synchronized LazySingletonDesignPattern getInstance() {
            if (instance == null) {
                instance = new LazySingletonDesignPattern();
            }
            return instance;
        }
    }


