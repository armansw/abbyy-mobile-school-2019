package tasks;

/**
 * Реализовать трехмерный вектор.
 * Условие: https://habr.com/ru/post/440436/#20
 * Там есть решение. Сначала попробуйте самостоятельно.
 */
class Vector {
    Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double getZ(){
        return this.z;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setZ(double z){
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public double cos(Vector vector){
        double scalarProduct = x * vector.getX() + y*vector.getY() + z*vector.getZ();
        return scalarProduct / (this.length() * vector.length());
    }

    public double sin(Vector vector){
        return Math.sqrt(Math.abs(1 - cos(vector) * cos(vector)));
    }

    private double x;
    private double y;
    private double z;
}

public class Task04 {

}
