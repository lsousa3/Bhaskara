package bhaskaral;
public class Calcular extends BhasKaraL {
    public int A;
    public int B;
    public int C;
    public int Delta;
    public int X1, X2;
    //Metodos Construtor

    public Calcular() {
    }

    public Calcular(int A, int B, int C, int Delta, int X1, int X2) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.Delta = Delta;
        this.X1 = X1;
        this.X2 = X2;
    }
    //Getter & Setter

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }

    public int getDelta() {
        return Delta;
    }

    public void setDelta(int Delta) {
        this.Delta = Delta;
    }

    public int getX1() {
        return X1;
    }

    public void setX1(int X1) {
        this.X1 = X1;
    }

    public int getX2() {
        return X2;
    }

    public void setX2(int X2) {
        this.X2 = X2;
    }
    public void valorDelta(){
        Delta= B*B - 4*A*C;
    }
    public void ValorX1(){
        X1 = (int) ((-B + Math.sqrt(Delta)) / (2* A));
    }
    public void ValorX2(){
        X2 = (int) ((-B + Math.sqrt(Delta)) / (2* A));
    }
    public void Status(){
        System.out.println("O valor do delta e: " + this.Delta);
        System.out.println("o valor de x1: " + this.X1);
        System.out.println("o valor de x2: " + this.X2);
    }
    
}
