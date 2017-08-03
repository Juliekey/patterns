package behavioral.iterator;

import behavioral.iterator.collections.ChannelCollection;
import behavioral.iterator.collections.ChannelCollectionImpl;
import behavioral.iterator.entities.Channel;
import behavioral.iterator.iterators.ChannelIterator;

public class App {
    public static void main(String[] args) {
        ChannelCollection channelCollection = populateChannels();
        ChannelIterator allIterator = channelCollection.iterator(ChannelTypeEnum.All);
        while (allIterator.hasNext()) {
            Channel channel = allIterator.next();
            System.out.println(channel);
        }
        System.out.println("**********");
        ChannelIterator englishIterator = channelCollection.iterator(ChannelTypeEnum.English);
        while (englishIterator.hasNext()) {
            Channel channel = englishIterator.next();
            System.out.println(channel);
        }
    }

    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.Ukrainian));
        channels.addChannel(new Channel(99.5, ChannelTypeEnum.English));
        channels.addChannel(new Channel(100.5, ChannelTypeEnum.Ukrainian));
        channels.addChannel(new Channel(101.5, ChannelTypeEnum.Ukrainian));
        channels.addChannel(new Channel(102.5, ChannelTypeEnum.Ukrainian));
        channels.addChannel(new Channel(103.5, ChannelTypeEnum.English));
        channels.addChannel(new Channel(104.5, ChannelTypeEnum.English));
        channels.addChannel(new Channel(105.5, ChannelTypeEnum.Hindi));
        channels.addChannel(new Channel(106.5, ChannelTypeEnum.All));
        return channels;
    }

}

