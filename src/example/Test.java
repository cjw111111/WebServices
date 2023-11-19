package example;

import example.client.HelloWorldServiceLocator;
import example.client.HelloWorld_PortType;
import java.util.Scanner;

public class Test {
    public static void main(String[] argv) {
        try {
            HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
            HelloWorld_PortType service = locator.getHelloWorld();
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的工资");
            double income = sc.nextDouble();
            double result = service.calcTax(income);
            System.out.println("需要缴税" + result);
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }

    }

}