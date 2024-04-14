public class Sphere extends Shape {
    private double radius;
    public Sphere (double radius){
        this.radius = radius;}
    @Override
    double surface_area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public String toString(){
        String str = "";
        str = "Sphere surface area: " +  String.format("%.2f square inches",surface_area()) +
        "\nSphere volume: " + String.format("%.2f cubic inches",volume());
        return str;
    }
}
