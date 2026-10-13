package com.astronity.app;

abstract class Gateway {
    void init()
    {
        System.out.println("Gateway init");
    }

    abstract void payment();
}

class KBZGateway extends Gateway {
    void payment()
    {
        super.init();
        System.out.println("KBZGateway payment");
    }
}

class CBCGateway extends Gateway {
    void payment()
    {
        super.init();
        System.out.println("CBCGateway payment");
    }
}

class Ecommerce {
    Gateway gateway;

    public Ecommerce(Gateway gateway) {
        this.gateway = gateway;
    }

    void processOrder()
    {
        System.out.println("Ecommerce Order Process");
        gateway.payment();
    }
}
public class PaymentDemo {
    public static void main(String[] args) {
        Gateway gateway = new KBZGateway();
        gateway = new CBCGateway();
        Ecommerce ecommerce = new Ecommerce(gateway);
        ecommerce.processOrder();
    }
}
