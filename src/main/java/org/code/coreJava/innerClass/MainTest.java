package org.code.coreJava.innerClass;

public class MainTest {

    public static void main(String[] args) {
            MemberInnerClass mc=new MemberInnerClass();

            MemberInnerClass.InnerMember mim=mc.new InnerMember();
            mim.printName();


            //Static inner class
        StaticInnerClass.InnerClass innerClass=new StaticInnerClass.InnerClass();
        innerClass.print();


        //Local inner class
        LocalInnerClass localInnerClass=new LocalInnerClass();
        localInnerClass.display();


        //Anonymous Inner class
        AnonymousInner anonymousInner= new AnonymousInner() {
            @Override
            public void lamdaMethod(String name) {
                System.out.println("Just Print...."+name);
            }
        };


        anonymousInner.lamdaMethod("Little India..");
    }

}
