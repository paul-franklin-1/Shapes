public class Cone extends Shape{
    private double radius;
    private double height;
    public Cone (double radius, double height){
        this.radius = radius;
        this.height = height;}

    double surface_area(){
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    @Override
    double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    public String toString(){
        String str = "";
        str = "Cone surface area: " +  surface_area() +
                "\nCone volume: " + volume();
        return str;
    }
}