package isp1.pay.impl;

import isp1.pay.PayCreditCard;
import isp1.pay.PayPhoneNumber;
import isp1.pay.PayWebMoney;

public class InternetPaymentService implements PayCreditCard, PayPhoneNumber, PayWebMoney {
    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Internet pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Internet pay by credit card %d\n", amount);
    }

    @Override
    public void payPhoneNumber(int amount) {
        System.out.printf("Internet pay by phone number %d\n", amount);
    }
}
