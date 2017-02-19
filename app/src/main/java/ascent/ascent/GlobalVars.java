package ascent.ascent;

import android.app.Application;

// class to store global variables

public class GlobalVars extends Application{

    private String exampleVariable;

    public String getExampleVariable(){
                return exampleVariable;
    }

    public void setExampleVariable(String s){
        exampleVariable = s;
    }

    /* use the following code to then call these variables
     * GlobalVars gv = (GlobalVars)getApplicationContext();
     * eV = gv.getExampleVariable(); */
}
