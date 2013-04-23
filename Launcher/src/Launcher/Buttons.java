package Launcher;

public class Buttons {
    private GUI GUIExt;
    
    public Buttons(GUI GUIExt) {
        this.GUIExt = GUIExt;
    }
    
    public void Init(boolean state){
        GUIExt.update1. setEnabled(state);
        GUIExt.update2. setEnabled(state);
        GUIExt.update3. setEnabled(state);
        
        GUIExt.custom1. setEnabled(state);
        GUIExt.custom2. setEnabled(state);
        GUIExt.custom3. setEnabled(state);
        
        GUIExt.vanilla. setEnabled(state);
        GUIExt.technic. setEnabled(state);
        GUIExt.ftb.     setEnabled(state);
    }
}
