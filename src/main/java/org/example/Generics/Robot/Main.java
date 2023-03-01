package org.example.Generics.Robot;

public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        Body body = new Body();

        Head1 head1 = new Head1();
        Head2 head2 = new Head2();
        Head3 head3 = new Head3();

        Robot<Head1> robot1 = new Robot<Head1>(body, head1);
        Robot<Head3> robot3 = new Robot<Head3>(body, head3);

        robot1.getHead().methodHead1();
        robot3.getHead().methodHead3();
    }
}