package Nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashornTest {

    //jjs command lets u drop to a repl where u can try out some javascript coding.


    public static void main(String[] args) throws Exception {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("nashorn");
        scriptEngine.eval("var x = 100;print(x)");

    }
}
