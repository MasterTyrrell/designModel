package command;

public class LightOnCommand implements Command {

    private Light light;

    private LightOnCommand(){

    }

    private LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.onLight();
    }
}
