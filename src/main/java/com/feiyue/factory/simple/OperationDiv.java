package com.feiyue.factory.simple;

/**
 * 加法运算实现类
 */
public class OperationDiv extends Operation{

    public double computeResult() throws Exception {
        double result = 0;
        if(getNumberB() == 0) throw new Exception("除数不能为0");
        return getNumberA() + getNumberB();
    }
}
