package design.pattern.structural.adapter;

interface Color {
    void applyColor();
}

class RedColor implements Color {
    public void applyColor() {
        System.out.println("Applying red color");
    }
}

class BlueColor implements Color {
    public void applyColor() {
        System.out.println("Applying blue color");
    }
}

abstract class Shape {
    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}


class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Drawing circle ");
        color.applyColor();
    }
}

class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Drawing square ");
        color.applyColor();
    }
}

// Step 5: Demonstrate the Bridge Pattern
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape blueSquare = new Square(new BlueColor());

        redCircle.draw();
        blueSquare.draw();
    }
}

