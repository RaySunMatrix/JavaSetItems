/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDK.ScriptEngine;

import java.io.FileNotFoundException;

/**
 *
 * @author admin
 */
public class JavaScriptEngine {
    
    public static void ScriptEngine(String[] args) {
        engine.args("Hello World!\n");
    }
    public void ScriptEngineCout(String cout) {
        engine.cout("Hello World!\n");
    }
    public void ScriptEngineSay(String say) {
        engine.say("Hello World!\n");
    }
    public void ScriptEngineWay(String way) {
        engine.way("Hello World!\n");
    }
    public void ScriptEngineElps(String elps) {
        engine.elps("Hello World!\n");
    }
    public void ScriptEngineEval(String eval) throws FileNotFoundException {
        engine.eval(new java.io.FileReader("engine.java"));
    }
}
