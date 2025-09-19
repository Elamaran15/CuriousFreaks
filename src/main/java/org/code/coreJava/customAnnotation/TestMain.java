package org.code.coreJava.customAnnotation;

public class TestMain {


    public static void main(String[] args) throws IllegalAccessException {
        UserDTO userDTO=new UserDTO();
        userDTO.setAge(60);
        userDTO.setName("ela");
        Validator.isValid(userDTO);
        System.out.println(userDTO);
    }
}
