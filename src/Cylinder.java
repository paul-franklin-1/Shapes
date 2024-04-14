public class Cylinder extends Shape{
    private double radius;
    private double height;
    public Cylinder (double radius, double height){
        this.radius = radius;
        this.height = height;}

        double surface_area(){
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }

    public String toString(){
        String str = "";
        str = "Cylinder surface area: " +  surface_area() +
                "\nCylinder volume: " + volume();
        return str;
    }
}
