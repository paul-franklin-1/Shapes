public class Cylinder extends Shape{
    private double radius;
    private double height;
    public Cylinder (double radius, double height){
        this.radius = radius;
        this.height = height;}

    @Override
    double surface_area(){
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString(){
        String str = "";
        str = "Cylinder surface area:  " +  String.format("%.2f square inches",surface_area()) +
        "\nCylinder volume:        " + String.format("%.2f cubic inches",volume());
        return str;
    }
}
