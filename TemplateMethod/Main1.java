package TemplateMethod;

/**
 *
 */
public class Main1 {
    public static void main(String[] args) {
        Lib1 lib1 = new Lib1();
        Application1 application1 = new Application1();
        lib1.step1();

        if(application1.step2()){
            lib1.step3();
        }

        for(int i = 0; i < 4; ++i){
            application1.step4();
        }
        lib1.step5();
    }
}
