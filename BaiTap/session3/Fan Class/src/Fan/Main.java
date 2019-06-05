/**
 * vesion 1.1.0
 * Author: Ho Dang San - C0419H1
 * Description: Fan Class
 * CopyRight by @2019 SanArima
 */
package Fan;

public class Main {
    public static void main(String[] args){
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setOn(true);
        fan1.setColor("Yellow");
        fan1.setRadius(10);
        fan1.setSpeed(3);

        fan2.setSpeed(2);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
