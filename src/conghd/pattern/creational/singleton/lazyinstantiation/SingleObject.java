package conghd.pattern.creational.singleton.lazyinstantiation;

/**
 * Created by Loe on 4/27/2017.
 */
public class SingleObject {
    //create an object of SingleObject
    private static SingleObject instance;

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject() {
    }

    //Get the only object available
    public static SingleObject getInstance() {
        if (instance == null) {
            synchronized (SingleObject.class) {
                if (instance == null) {
                    instance = new SingleObject();//instance will be created at request time
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
