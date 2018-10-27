package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import inputmask.App;
public class Test1 {

	App app ;
	
    public Test1() {
	}

	@Before
    public void setUp()
    {
        app = new App() ;
    }  
    
	/*public void Test_1() {
        String []lines ;   
        app.display();
        app.key("1");
        app.key("2");
        app.key("3");
        app.key("4");
        app.key("5");
        app.key("6");
        app.key("7");
        app.key("1");
        app.key("2");
        app.key("3");
        app.key("4");
        app.key("5");
        app.key("6");
        app.key("7");
        app.key("5");
        app.key("6");
        lines= app.display().split("\n"); 
        assertEquals("[1234567123456756]  [MM/YY]  [123]", lines[7].trim());   
        app.delete();
        lines= app.display().split("\n"); 
        assertEquals("[123456712345675]  [MM/YY]  [123]", lines[7].trim());  
        app.key("1");
        app.key("2");
        app.key("3");
        app.key("4");
        lines= app.display().split("\n"); 
        assertEquals("[123456712345675]  [1234]  [123]", lines[7].trim());  
	}*/
	@Test
	public void Test_1() {
        String []lines ;   
        app.display();
        app.key("1");
        app.key("2");
        app.key("3");
        app.key("4");
        app.key("5");
        app.key("6");
        app.key("7");
        app.key("1");
        app.key("2");
        app.key("3");
        app.key("4");
        app.key("5");
        app.key("6");
        app.key("7");
        app.key("5");
        app.key("6");
        app.key("delete");
        app.key("delete");
        app.key("5");
        app.key("6");
        app.key("5");
        app.key("6");
        app.key("5");
        app.key("6");
        lines= app.display().split("\n"); 
        assertEquals("[1234 5671 2345 6756]  [56/56]  [123]", lines[7].trim());   
	}

}
