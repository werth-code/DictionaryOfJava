package com.werth;

public class StaticVariablesMethods {
    private static Integer objCount = 0;
    private String name;

    public StaticVariablesMethods(String name) {
        this.name = name;
        StaticVariablesMethods.objCount++;
    }

    public static Integer getObjCount() {
        return objCount;
    }


    public static void addToObjCount(int num) {
        objCount += num;
    }

    private static class InnerStaticClass {

        public static String passPhrase = "HeyArnold"; // You can access the outer class from within the inner class scope.

        public static void incrementCount() {
            StaticVariablesMethods.objCount = StaticVariablesMethods.objCount + 1;
        }

    }


    public static void main(String[] args) {

        StaticVariablesMethods st = new StaticVariablesMethods("Marty");
        System.out.println(StaticVariablesMethods.getObjCount());

        StaticVariablesMethods.InnerStaticClass.incrementCount();  //Static inner-class variables/methods are accessible through the main class.
        System.out.println(StaticVariablesMethods.getObjCount());

        StaticVariablesMethods.InnerStaticClass.incrementCount();
        System.out.println(StaticVariablesMethods.getObjCount());

        String passPhrase = InnerStaticClass.passPhrase;
        System.out.println(passPhrase);

    }

}


