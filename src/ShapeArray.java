public class ShapeArray {
    public static void main(String[] args) {
        Sphere s = new Sphere(12.35);
        Cylinder c = new Cylinder(115.45,7.7);
        Cone co = new Cone(4.4,10.7);
        Object[] shapeArray = new Object[]{s, c, co};
        for (int i = 0; i < shapeArray.length; i++) {
            System.out.println(shapeArray[i]);}}}