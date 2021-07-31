package b4_class_and_object.baitap.quadratic_education;

public class Quadratic {
    double a;
    double b;
    double c;
    public Quadratic(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDelta(){
        double delta= Math.pow(this.getB(),2)-(4*this.getA()*this.getC());
        return delta;
    }
    public double[] getRoot(){
        double[] rootList= new double[2];
        rootList[0]=(-this.getB()+Math.sqrt(this.getDelta()))/(2*this.getA());
        rootList[1]=(-this.getB()-Math.sqrt(this.getDelta()))/(2*this.getA());
        return rootList;
    }
    public double getOneRoot(){
        double root=(-1*this.getB()/(2*this.getA()));
        return root;
    }

}
