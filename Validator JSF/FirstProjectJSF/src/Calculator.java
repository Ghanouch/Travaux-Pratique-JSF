import javax.faces.bean.ManagedBean;

/**
 * Created by zguindouos on 27/02/17.
 */


@ManagedBean
public class Calculator {

    private int a;
    private int b;
    private int sum;
    private int prod;
    private int div;
    private int sub;

    public void setSum(int sum) {
        this.sum = a + b;
    }

    public void setProd(int prod) {
        this.prod = a * b;
    }

    public void setDiv(int div) {
        this.div = a / b;
    }

    public void setSub(int sub) {
        this.sub = a - b;
    }

    public int getSum() {
        return sum;
    }

    public int getProd() {
        return prod;
    }

    public int getDiv() {
        return div;
    }

    public int getSub() {
        return sub;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

}
