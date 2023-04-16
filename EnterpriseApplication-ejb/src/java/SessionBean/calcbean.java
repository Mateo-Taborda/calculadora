/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author mateo
 */
@Stateless
public class calcbean implements calcbeanLocal {

    @Override
    public Integer addition(int a, int b) {
        return (a+b);
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Integer rest(int c, int d) {
        return (c-d);
    }

    @Override
    public Integer multiplicar(int e, int f) {
        return (e*f);
    }

    @Override
    public Integer division(int g, int h) {
        return (g/h);
    }

    @Override
    public Integer modulo(int i, int j) {
        return (i%j);
    }
    
    
}
