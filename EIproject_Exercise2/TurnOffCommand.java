package EIproject_Exercise2;

public class TurnOffCommand implements Command {
    private SmartDevice device;

    public TurnOffCommand(SmartDevice device) {
        this.device = device;
    }

    public void execute() {
        device.turnOff();
    }
}
