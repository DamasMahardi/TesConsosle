package com.company;

public class InnerClass {



    //method local inner class
    void InnerClassMethod(){
        final String site = "Data Trening";
        System.out.println("Ini adalah Inneclass Method");
        class InnerclassLinier{
            void InnerclasslinierMethod(){
                System.out.println("belajar iine class di "+site);
            }
        }
        InnerclassLinier inlinierclass = new InnerclassLinier(); inlinierclass.InnerclasslinierMethod();
    }


    public class InnerClassNested{
        public void printNestedClass(){
            System.out.println("Ini Adalah Nested Class");
        }

    }
    public static class InnerclassStatic{
        public void printStatic(){
            System.out.println("Ini adalah inner class static");
        }
    }


    public static void main(String[] args) {
        //nestedInner classs
        InnerClass.InnerClassNested innested = new InnerClass().new InnerClassNested();
        innested.printNestedClass();

        //iiner class static
        InnerClass.InnerclassStatic instatic = new InnerClass.InnerclassStatic();
        instatic.printStatic();

        //local iiner class
        InnerClass out = new InnerClass();
        out.InnerClassMethod();


    }
}




