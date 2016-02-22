package edu.brainacad2_5_1;

/**
 * Created by Nastya on 22.02.2016.
 */
public class MylnitTest {

       static {
            System.out.println("Static initialization block 1");
           }
       static {
            System.out.println("Static initialization block 2");
        }
    {
        System.out.println("non-static initialization block 1");
    }
    {
        System.out.println("non-static initialization block 2");
    }
    public MylnitTest(){
        this(0);
        System.out.println("Constructor 2");
    }
    public MylnitTest(int i){
        System.out.println("Constructor 1");
    }


}
