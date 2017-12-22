package implementation;

/**
 * Created by Anton Mikhaylov on 22.12.2017.
 */
public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int percent);
    int getChannel();
    void setChannel(int channel);
}
