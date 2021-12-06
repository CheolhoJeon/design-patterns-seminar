package com.charlie.week3.Payment;

public class PayByPayPal implements PayStrategy {
    @Override
    public void pay(int paymentAmount) {
        System.out.println(paymentAmount + "원을 페이팔로 결제합니다!");
    }
}
