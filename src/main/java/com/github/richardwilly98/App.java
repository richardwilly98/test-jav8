package com.github.richardwilly98;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import lu.flier.script.V8ScriptEngineFactory;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("jav8");
		System.out.println("EngineVersion: " + new V8ScriptEngineFactory().getEngineVersion());
		System.out.println("OutputStatement: " + new V8ScriptEngineFactory().getOutputStatement("This is a test"));
		try {
			Jav8Printer jav8 = new Jav8Printer();
			engine.put("jav8", jav8);
			engine.eval("var print = function (arg) {jav8.print(arg);};");
			engine.eval("1 + 2");
			engine.eval("jav8.print('Hello, world!')");
		} catch (ScriptException ex) {
			ex.printStackTrace();
		}
		System.out.println("Test completed!");
	}
}
