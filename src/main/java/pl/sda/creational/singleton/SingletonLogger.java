package pl.sda.creational.singleton;

public class SingletonLogger {

    public void log(String string) {
        System.out.println(string);
    }

    private static SingletonLogger instance = new SingletonLogger();

    private SingletonLogger() {
    }

    public static SingletonLogger getInstance() {
        if (instance == null){
            instance = new SingletonLogger();
        }
        return instance;
    }
}

