/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JUint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author admin
 */
class constObject {
    
    
    public void constObjectWriteLayout(String layout) {
        writeln.layout();
    }
    
    public void constObjtWriteCodeText(String text) {
        writeln.text();
    }
    
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FastTest {
    // document write level logical series tables
    public  @interface Test {
        // TODO fast test documentation write level measure
    }
}
}
