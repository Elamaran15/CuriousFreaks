package org.code.coreJava.serialization;

import java.io.*;

public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private String company;
    private transient String password;
    private static String gender;


   @Serial
   private void writeObject(ObjectOutputStream oos) throws IOException {
       oos.defaultWriteObject(); // serialize non-transient fields
       oos.writeObject(new StringBuilder(password).reverse().toString()); // encrypt password
   }

    // Custom deserialization
    @Serial
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject(); // deserialize non-transient fields
        password = new StringBuilder((String) ois.readObject()).reverse().toString(); // decrypt
    }
}
