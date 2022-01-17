package lection01.online;

import java.io.Closeable;
import java.io.Serializable;

public interface ExampleInterface extends lection01.online.Flying, Cloneable, Closeable, Serializable {
//    public interface ExInt {
//        public static interface ExExInt {
//
//        }
//    }
   public static final String SOME_INTERFACE_FIELD = "SOME";

   //Java 8+
    default void doDefault() {
        System.out.println("Default");
    }

    //Java 9+
    static void doStatic() {
        System.out.println("STATIC");
    }

    //Java 9+
    default void doPrivate() {
        System.out.println("PRIVATE");
    }

}
