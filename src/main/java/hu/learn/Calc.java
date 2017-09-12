package hu.learn;

/**
 * Created by java on 2017.09.12..
 */
public class Calc {

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    private Integer number = 0;

    public Calc addOne() {
        this.setNumber(this.getNumber() + 1);
        this.number++;
        return this;
    }

}
