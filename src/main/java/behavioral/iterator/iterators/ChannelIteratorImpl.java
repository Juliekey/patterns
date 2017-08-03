package behavioral.iterator.iterators;

import behavioral.iterator.ChannelTypeEnum;
import behavioral.iterator.entities.Channel;

import java.util.List;

/**
 * This class represents concrete class for iterating through {@link List} of {@link Channel} objects.
 */
public class ChannelIteratorImpl implements ChannelIterator {
    private ChannelTypeEnum type;
    private List<Channel> channels;
    private int position;

    public ChannelIteratorImpl(ChannelTypeEnum ty,
                               List<Channel> channelsList) {
        this.type = ty;
        this.channels = channelsList;
    }

    @Override
    public boolean hasNext() {
        while (position < channels.size()) {
            Channel channel = channels.get(position);
            if (channel.getType() == type || type == ChannelTypeEnum.All) {
                return true;
            }
            position++;
        }
        return false;
    }

    @Override
    public Channel next() {
        Channel channel = channels.get(position);
        position++;
        return channel;
    }
}
