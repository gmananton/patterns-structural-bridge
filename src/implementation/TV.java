package implementation;

/**
 * Created by Anton Mikhaylov on 22.12.2017.
 */
public class TV implements Device {

    private int volume;
    private int channel;
    private boolean enabled = false;

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }

    @Override
    public void enable() {
        System.out.println("Switching TV ON");
        this.enabled = true;
    }

    @Override
    public void disable() {
        System.out.println("Switching TV OFF");
        this.enabled = false;
    }

    @Override
    public int getVolume() {
        System.out.println("TV volume = " + this.volume);
        return this.volume;
    }

    @Override
    public void setVolume(int percent) {
        System.out.println("Setting TV volume to " + percent + "%");
        this.volume = percent;
    }

    @Override
    public int getChannel() {
        System.out.println("Now TV is on " + this.channel + " channel");
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Setting TV channel to " + channel);
        this.channel = channel;
    }
}
