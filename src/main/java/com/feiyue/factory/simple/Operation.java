package com.feiyue.factory.simple;

/**
 * 抽象运算类
 */
public abstract class Operation {

    //操作数A
    private double numberA;
    //操作数B
    private double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    /**
     * 计算结果
     * @return
     */
    public abstract double computeResult() throws Exception;



}
