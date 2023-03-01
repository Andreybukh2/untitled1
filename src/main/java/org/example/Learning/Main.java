package org.example.Learning;

class Ball{
    double radius;
    String color;
}
class Box{
    String size;
    Ball ball;
    double height;
    double rBall (){
        return ball.radius;
    }
    double vBox (){
        return height * height * height;
    }
    public Box(double height) {
        this.height = height;
    }
}
public class Main {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        ball1.color = "Red";
        ball1.radius = 2;

        Ball ball2 = new Ball();
        ball2.color = "Blue";
        ball2.radius = 1;

        Box box1 = new Box(4);
        box1.ball = ball1;

        Box box2 = new Box(3);
        box2.ball = ball2;

        System.out.println(box1.ball.color);
        
        System.out.println(box1.rBall());
        System.out.println(box2.rBall());

        System.out.println(box1.vBox());
        System.out.println(box2.vBox());
    }
}