package behavioral.iterator.entities;

import behavioral.iterator.ChannelTypeEnum;

/**
 * This class defines channel entity. This class is immutable.
 */
public final class Channel {

    private final double frequency;
    private final ChannelTypeEnum type;

    public Channel(double freq, ChannelTypeEnum type) {
        this.frequency = freq;
        this.type = type;
    }

    public double getFrequency() {
        return frequency;
    }

    public ChannelTypeEnum getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Frequency=" + this.frequency + ", type=" + this.type;
    }

}