package com.ohgiraffers.section01.exception;

public class Application01 {

    public static void main(String[] args) throws Exception {

        /* 수업목표 - 예외에 대해 이해하고 이를 처리하기 위한 문법을 이용할 수 있다. */
        /* 필기
        *   예외처리
        *   자바 프록르매 작성 시 자바 문법에 맞지 않는 경우, 코드를 컴파일하려고 할 때 에러를 발생시킨다.
        *   Technically 문법상의 오류(Syntax Error)이다.
        *   컴퓨터 프로그램이 동작하는 도중 예상치 못한 사태가 발생해
        *   실행중인 프로그램이 영향을 받는 것을 오류(Error)와 예외(Exception)으로 구분할 수 있다.
        *
        *   필기
        *    오류(Error) : 시스템 상에서 프로그램에 심각한 문제가 발생해 실행중인 프로그램이 종료
        *                 오류는 개발자가 미리 예측해 처리하는 것이 불가능하며, 오류에 대한 처리는 불가능
        *    예외 (Exception) : 실행중인 프로그램을 비정상적으로 종료시키지만,
        *                       발생할 수 있는 상황을 미리 예측하고 처리할 수 있는 미약한 오류
        *                       예외에 대해 예외처리를 통해 예외 상황을 적절히 처리해 코드의 흐름을 컨트롤 가능
        *   필기
        *    강제로 예외를 발생시키는 경우
        *       - throw new 예외클래스명();
        *    예외 처리 방법
        *       1. throws로 위임 (나를 호출한 곳으로 예외를 던진다.)
        *       2. try-catch로 처리
        *       */

        /* 목차 1. throws 로 위임 */
        ExceptionTest et = new ExceptionTest();

        /* 상품 가격은 10000원이고, 가진 돈은 50000원인 경우 */
//        et.checkEnoughMoney(10000,50000);


        /* 상품 가격은 50000원, 가진 돈은 10000원인 경우 */
        et.checkEnoughMoney(50000,10000);   // 예외 발생 구문 이하 구문은 동작하지 않고 종료

        System.out.println("프로그램을 종료합니다. ");

    }
}
