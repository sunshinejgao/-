package com.gzjg.calculator.ui;

import com.gzjg.calculator.bll.IOperation;
import com.gzjg.calculator.bll.Operation;

import java.util.Scanner;//或者*

public class Test {
    public static void main(String[] args) throws Exception {
        int numberA,numberB,result;
        String oprType;
        Scanner scanner = new Scanner(System. in);
        numberA = scanner.nextInt();
        numberB = scanner.nextInt();
        oprType = scanner.next();
        IOperation opr = new Operation();
        opr.setValue(numberA,numberB);
        switch (oprType){
            case "+":
                result =opr.add();
                break;
            case "-":
                result = opr.sub();
            break;
            default:
            throw new Exception("输入的运算符错误！");

        }
        result = numberA + numberB;
        System.out.println(result);

    }
}
