package moduuli5.task1;

public class Television {
    private boolean isOn;
    private int channel;

    public Television() {
        isOn = false;
        channel = 1;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setChannel(int channel) {
        if (isOn && channel > 0) {
            this.channel = channel;
        }
    }

    public int getChannel() {
        return channel;
    }
}
