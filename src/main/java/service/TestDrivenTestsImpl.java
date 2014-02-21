/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author Zaakir
 */
public class TestDrivenTestsImpl implements TestDrivenTests{
    @Override
    public int add(int a, int b) {
        return (a+b);
    }

    @Override
    public String rString() {
        return "hello"; //To change body of generated methods, choose Tools | Templates.
    }
 @Override
    public boolean rbooll() {
        return false; //To change body of generated methods, choose Tools | Templates.
    }
@Override
    public boolean asserttrue() {
          return true;
    }
    
}
