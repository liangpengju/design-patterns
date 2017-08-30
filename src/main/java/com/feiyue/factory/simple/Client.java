package com.feiyue.factory.simple;

/**
 * 测试客户端
 */
public class Client {

    public static void main(String[] args) throws Exception {
        Operation operation = OperationFactory.createOperate('+');
        operation.setNumberA(1);
        operation.setNumberB(2);
        double result = operation.computeResult();
        System.out.println(result);
    }
}
