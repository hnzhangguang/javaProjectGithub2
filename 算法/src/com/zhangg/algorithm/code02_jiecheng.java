package com.zhangg.algorithm;


/**
 * 求n的阶乘之和
 */
public class code02_jiecheng {


    /**
     * 求 1!+2!+3!...N!=?
     *
     * @param N
     * @return
     */
    public static long f(int N) {
        long ans = 0;
        long cur = 1;
        for (int i = 1; i <= N; i++) {
            cur = cur * i;
            ans += cur;
        }
        return ans;
    }


    public static void main(String[] args) {

    }
}
