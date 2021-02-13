package com.example.kotlinbasic.LambdaJava;

public class MainRun {

    public static void main(String a[]){
        LamdaClass lamdaClass = new LamdaClass();
        lamdaClass.show();

      /*  AnonymousInterface anonymousInterface = new AnonymousInterface() {
            @Override
            public void show() {

            }
        };
        */
        AnonymousInterface anonymousInterface =  () -> System.out.println("Hello");
     anonymousInterface.show();


    }
}
