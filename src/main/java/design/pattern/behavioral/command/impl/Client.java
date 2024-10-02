package design.pattern.behavioral.command.impl;

// Command Interface
interface Command {
    void execute();
}

// Concrete Command
class TurnOnCommand implements Command {
    private Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}

class TurnOffCommand implements Command {
    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}

// Receiver
class Light {
    public void turnOn() {
        System.out.println("The light is on.");
    }

    public void turnOff() {
        System.out.println("The light is off.");
    }
}

// Invoker
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

// Client
public class Client {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Command lightOnCommand = new TurnOnCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOnCommand);
        remote.pressButton();

        Command lightOffCommand = new TurnOffCommand(livingRoomLight);
        remote.setCommand(lightOffCommand);
        remote.pressButton();
    }
}
