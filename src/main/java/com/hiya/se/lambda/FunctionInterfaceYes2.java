package com.hiya.se.lambda;

public interface FunctionInterfaceYes2
{
    // 抽象方法
    public String msg(String info,String info2);
 
    // java.lang.Object中的方法不是抽象方法
    public boolean equals(Object var1);
 
    // default不是抽象方法
    public default void defaultMethod(){}
 
    // static不是抽象方法
    public static void staticMethod(){}
}
