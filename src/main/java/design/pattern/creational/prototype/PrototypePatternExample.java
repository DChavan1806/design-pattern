package design.pattern.creational.prototype;

public class PrototypePatternExample {

    public static class Shape implements Cloneable {
        private String id;
        private String type;

        public Shape(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        @Override
        public Object clone() {
            Object clone = null;
            try {
                clone = super.clone();
            } catch (CloneNotSupportedException e) {
                //logging logic or error handling
            }
            return clone;
        }

        public void draw() {
            System.out.println("Drawing a " + type);
        }
    }

    // Main method simulating the prototype pattern
    public static void main(String[] args) {
        Shape originalCircle = new Shape("Circle");
        originalCircle.setId("1");
        originalCircle.draw();

        Shape clonedCircle = (Shape) originalCircle.clone();
        clonedCircle.setId("2");
        clonedCircle.draw();

        Shape originalRectangle = new Shape("Rectangle");
        originalRectangle.setId("3");
        originalRectangle.draw();

        Shape clonedRectangle = (Shape) originalRectangle.clone();
        clonedRectangle.setId("4");
        clonedRectangle.draw();
    }
}

