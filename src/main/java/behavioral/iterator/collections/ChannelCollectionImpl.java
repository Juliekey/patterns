package behavioral.iterator.collections;

import behavioral.iterator.ChannelTypeEnum;
import behavioral.iterator.entities.Channel;
import behavioral.iterator.iterators.ChannelIterator;
import behavioral.iterator.iterators.ChannelIteratorImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents implementation of aggregate interface
 */
public class ChannelCollectionImpl implements ChannelCollection {
    private List<Channel> channels;

    public ChannelCollectionImpl() {
        channels = new ArrayList<>();
    }

    public void addChannel(Channel c) {
        this.channels.add(c);
    }

    public void removeChannel(Channel c) {
        this.channels.remove(c);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, this.channels);
    }
}
