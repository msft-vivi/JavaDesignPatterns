package FactoryMethod.after;

public class MainForm {
    SplitterFactory factory;

    public MainForm(SplitterFactory factory) {
        this.factory = factory;
    }

    public void buttonClick(String splitterType){
        ISplitter iSplitter = factory.createSplitter(splitterType);
    }
}
