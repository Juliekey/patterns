package behavioral.iterator.collections;

import behavioral.iterator.ChannelTypeEnum;
import behavioral.iterator.entities.Channel;
import behavioral.iterator.iterators.ChannelIterator;

/**
 * The aggregate interface
 */
public interface ChannelCollection {
    void addChannel(Channel c);

    void removeChannel(Channel c);

    ChannelIterator iterator(ChannelTypeEnum type);
}
