package behavioral.iterator.iterators;

import behavioral.iterator.entities.Channel;

/**
 * Iterator interface
 */
public interface ChannelIterator {

    boolean hasNext();

    Channel next();
}
