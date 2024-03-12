package Week5;

public class Ball {
    private float x, y, r, xD, yD;

    public Ball(float x, float y, float radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.r = radius;
        this.xD = xDelta;
        this.yD = yDelta;
    }

    public float getX() { return x;}
    public float getY() {return y;}
    public float getRadius() {return r;}
    public float getXDelta() {return xD;}
    public float getYDelta() {return yD;}
    public void move() {
        x += xD;
        y += yD;
    }

    public void reflectHorizontal() {
        xD = -xD;
    }

    @Override
    public String toString() {
        return String.format("Ball[(%.1f,%.1f),speed=(%.1f,%.1f)]", x, y, xD, yD);
    }

    public static void main(String[] args) {

        Ball b2 = new Ball(80.0f, 35.0f, 5.0f, 4.0f, 6.0f);
        System.out.println(b2);

        System.out.println("x is: " + b2.getX());
        System.out.println("y is: " + b2.getY());
        System.out.println("radius is: " + b2.getRadius());
        System.out.println("xDelta is: " + b2.getXDelta());
        System.out.println("yDelta is: " + b2.getYDelta());

        for (int i = 0; i < 15; i++) {
            b2.move();
            System.out.println(b2);
        }

        // Reflecting horizontally
//        b2.reflectHorizontal();
//        for (int i = 0; i < 5; i++) {
//            b2.move();
//            System.out.println(b2);
//        }
    }
}
