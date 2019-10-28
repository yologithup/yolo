package 运算符使用;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yolo
 * @date 2019/10/27-19:43
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * 保证base和exponent不同时为0
 * 注意：在题目没有明确指数非负数的情况下，正负数一定都要考虑
 */
public class Solution02 {
    public double Power(double base, int exponent) {
        if(base==0){
            return 0.0;
        }if(exponent==0){
            return 1.0;
        }
        double result=1.0;
        //获取指数绝对值
        for(int i=1;i<=Math.abs(exponent);i++){
            result=result*base;
        }
        return exponent>0?result:1.0/result;// // 根据指数正负，返回结果
    }
}