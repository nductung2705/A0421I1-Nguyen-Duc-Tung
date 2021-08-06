package b5_accessmodifier.baitap.only_write_class;

public class OnlyWriteClass {
    private String name="John";
    private String classes="Co2";

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public String setName(String name){
        this.name=name;
        return this.name;
    }
    public String setClass(String classes){
        this.classes=classes;
        return this.classes;
    }
}

