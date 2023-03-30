package ro.itschool.practice.session13;

public class Polygon {
    public void render() {
        System.out.println("Rendering polygon.");
    }

    public static void main(String[] args) {
        Polygon polygon;
        polygon = new Square();
        polygon.render();

        polygon = new Circle();
        polygon.render();
    }
}

class Square extends Polygon {
    @Override
    public void render() {
        System.out.println("Rendering square.");
    }

    public void getArea() {

    }
}

class Circle extends Polygon {
    @Override
    public void render() {
        System.out.println("Rendering circle.");
    }

    public void getRadius() {

    }
}