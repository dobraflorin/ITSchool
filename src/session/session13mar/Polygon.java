package session.session13mar;

public class Polygon {
    private void render(){
        System.out.println("Rendering polygon");
    }
}

class Square extends Polygon{
    public void render(){
        System.out.println("rendering square");
    }
}
