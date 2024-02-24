/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasetitems;

import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;

/**
 *
 * @author admin
 */
@SupportedSourceVersion(SourceVersion.RELEASE_11)
public class JavaSetClick extends Item {
    

    public JavaSetClick() {
          
    }

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }

    public SourceVersion getSupportedSourceClickEvent() {
        return SourceVersion.RELEASE_11;
    }
    
    public boolean getSupportedSourceClickDraw2d() {
        CharSequence click = null;
        return SourceVersion.isIdentifier(click);
    }
    
    public boolean getSupportSourceClickDrawFruit() {
        CharSequence fruit = null;        
        return SourceVersion.isName(fruit);
        
    }
    
    public SourceVersion getSupportSourceClickCheck() {
        String check = null;
        return SourceVersion.valueOf(check);
    }
    
    public SourceVersion[] getSupportSourceClickItems() {
        return SourceVersion.values();
    }
    
}

