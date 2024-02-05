/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftocclient;

import beans.FtoCSessionBeanRemote;
import java.util.Scanner;
import javax.ejb.EJB;

/**
 *
 * @author donky
 */
public class Main {

    @EJB
    private static FtoCSessionBeanRemote ftoCSessionBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fToCClient();
    }

    public static void fToCClient() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter degree in Fahrenheit:");
        double fahrenheit = sc.nextDouble();
        double cesius = ftoCSessionBean.fToC(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit = " + cesius + " Celsius ");
    }
}
