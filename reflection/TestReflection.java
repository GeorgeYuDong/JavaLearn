package reflection;

import charactor.Hero;

public class TestReflection {

    public static void main(String[] args) {
        String className = "charactor.Hero";
        try {
            //Class.forName(类名)
            //类名.class
            //对象.getClass()方法
            Class pClass1=Class.forName(className);
            Class pClass2= Hero.class;
            Class pClass3=new Hero().getClass();
            System.out.println(pClass1 == pClass2);
            System.out.println(pClass2 == pClass3);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}