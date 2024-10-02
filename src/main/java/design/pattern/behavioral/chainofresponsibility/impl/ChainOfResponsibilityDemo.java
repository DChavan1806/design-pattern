package design.pattern.behavioral.chainofresponsibility.impl;

interface Handler {
    void setNextHandler(Handler handler);
    void handleRequest(String request);
}

class ConcreteHandler1 implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("Handler1")) {
            System.out.println("Handled by Handler 1");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

class ConcreteHandler2 implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("Handler2")) {
            System.out.println("Handled by Handler 2");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        handler1.setNextHandler(handler2);

        handler1.handleRequest("Handler1");
        handler1.handleRequest("Handler2");
        handler1.handleRequest("Unknown");
    }
}
