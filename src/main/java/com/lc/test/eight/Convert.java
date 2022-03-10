package com.lc.test.eight;

import java.util.function.*;

/**
 * @author fj
 * @description
 * @date 2019/3/5
 * @time 下午10:01
 **/
@FunctionalInterface
public interface Convert<F,T> {

    T convert(F from);

    //可以包含静态方法
    public static void hasStaticMethod(){
        System.out.println("包含静态方法");
    }

    default void hasDefaultMethod(){
        System.out.println("包含默认方法");
    }
}

 class ConvertMain {
    public static void main(String[] args) {

        Convert<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);
        converter.hasDefaultMethod();
        Convert.hasStaticMethod();


        // Function<T, R> -T作为输入，返回的R作为输出
        Function<String,String> function = (x) -> {System.out.print(x+": ");return "Function";};
        System.out.println(function.apply("hello world"));

        //Predicate<T> -T作为输入，返回的boolean值作为输出
        Predicate<String> pre = (x) ->{System.out.print(x);return false;};
        System.out.println(": "+pre.test("hello World"));

        //Consumer<T> - T作为输入，执行某种动作但没有返回值
        Consumer<String> con = (x) -> {System.out.println(x);};
        con.accept("hello world");

        //Supplier<T> - 没有任何输入，返回T
        Supplier<String> supp = () -> {return "Supplier";};
        System.out.println(supp.get());


        //BinaryOperator<T> -两个T作为输入，返回一个T作为输出，对于“reduce”操作很有用
        BinaryOperator<String> bina = (x, y) ->{System.out.print(x+" "+y);return "BinaryOperator";};
        System.out.println("  "+bina.apply("hello ","world"));

    }
}