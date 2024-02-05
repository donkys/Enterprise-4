/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;

/**
 *
 * @author donky
 */
@Stateless
public class FtoCSessionBean implements FtoCSessionBeanRemote {

    @Override
    public double fToC(double fahrenheit) {
        double celsius = (5.0 / 9.0) * (fahrenheit - 32.0);
        return celsius;
    }

}
