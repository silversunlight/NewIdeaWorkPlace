package interfaces.autoWiring;

public class AutoWiringService {
    private AutoWiringDAO autoWiringDAO;

    public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
        this.autoWiringDAO = autoWiringDAO;
    }

    public void say(String s) {
        this.autoWiringDAO.say("AutoWiringServiceµÄsay·½·¨: "+s);
    }
}
