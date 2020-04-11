

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ListeP_TabTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ListeP_TabTest {
    /**
     * Default constructor for test class ListeP_TabTest
     */
    public ListeP_TabTest()
    {
  
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

   

    @Test
    public void test()
    {
        ListeP_Tab l = new ListeP_Tab();
        ListeP_Tab l2 = new ListeP_Tab();
        Hero h=new Hero("drow",12,30);
        Hero h1=new Hero("phantom assasin",15,10);
        Hero h2=new Hero("dazzle",15,15);
        Hero h4=new Hero("tiny",12,30);
        Hero h5=new Hero("tinker",15,10);
        Hero h6=new Hero("ursa",15,15);
        String h7=new String("tinker");
        Hero h3=new Hero();
       
         try{
         h3=(Hero)l.car();
        }
        catch(ListeVideException e){
            
        }
        try{
        l.cdr();
        }
        catch(ListeVideException e){
            
        }
        l.cons(h1);
        l.cons(h);
        l.cons(h2);
        l.cons(h);
    
        
        System.out.println(h3.getName());
        System.out.println(l.longueur());
        System.out.println(l.listeVide());
       
        System.out.println(l);
        try{
        System.out.println(l.car());
    }
    catch(ListeVideException e){
        
    }
        l.renverse();
        System.out.println(l);
        try{
        l.cdr();
        }
        catch(ListeVideException e){
            
        }
        System.out.println(l);
        l2.cons(h4);
        l2.cons(h5);
        l2.cons(h6);
        l.conc(l2);
        System.out.println(l);
       try{
        l.cdr();
        }
        catch(ListeVideException e){
            
        }
        System.out.println(l);
        System.out.println(l.membre(h7));
        
    }
}


