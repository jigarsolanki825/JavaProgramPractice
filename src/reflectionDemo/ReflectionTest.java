package reflectionDemo;

import GeneralExamples.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;

public class ReflectionTest {

    //private Employee emp;

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c = Class.forName("GeneralExamples.Employee");
        Field f = c.getDeclaredField("salary");
        //System.out.println(f.);
        Constructor[] cons = c.getDeclaredConstructors();
        for(Constructor c1: cons){
            c1.setAccessible(true);
            Parameter[] p = c1.getParameters();
            for(Parameter p1: p){
                System.out.println(p1);
            }
            System.out.println("********");
        }
    }
}
