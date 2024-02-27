package com.ohgiraffers.section01.exception;

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표 : try-catch 블럭을 이용한 예외처리 */
        /* 목차 2. try-catch 를 이용한 방법 (예외 발생하지 않음) */

        ExceptionTest et = new ExceptionTest();

        /* 상품 가격 10000원, 가지고 있는 돈 50000원 */
        try {
            et.checkEnoughMoney(10000,50000);

            System.out.println("==========상품 구입 가능==========");

        } catch (Exception e) {

            System.out.println("상품 구입 불가능");

        }

        System.out.println("프로그램 종료 ! ");

    }
}
