package com.feiyue.factory.simple;

/**
 * 设计模式1:简单工厂类
 */
public class OperationFactory {

    public static Operation createOperate(char operate){
        Operation operation = null;
        switch (operate){
            case '+':
                operation = new OperationAdd();
                break;
            case '-':
                operation = new OperationSub();
                break;
            case '*':
                operation = new OperationMul();
                break;
            case '/':
                operation = new OperationDiv();
                break;
            default:
                break;
        }
        return operation;
    }
}
