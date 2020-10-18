package TemplateMethod.before;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Lib lib = new Lib();
        Application application1 = new Application();
        lib.step1();

        if(application1.step2()){
            lib.step3();
        }

        for(int i = 0; i < 4; ++i){
            application1.step4();
        }
        lib.step5();
    }
}
