/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Local;

/**
 *
 * @author mateo
 */
@Local
public interface calcbeanLocal {

    Integer addition(int a, int b);

    Integer rest(int c, int d);

    Integer multiplicar(int e, int f);

    Integer division(int g, int h);

    Integer modulo(int i, int j);
    
}
