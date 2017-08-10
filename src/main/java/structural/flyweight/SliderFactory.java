package structural.flyweight;

import structural.flyweight.sliders.Slider;
import structural.flyweight.sliders.impl.BBQKing;
import structural.flyweight.sliders.impl.BaconMaster;
import structural.flyweight.sliders.impl.VeggieSlider;

import java.util.HashMap;
import java.util.Map;

/**
 * The FlyweightFactory classThis class is responsible for getting new sliders and returning it to the client.
 */
public class SliderFactory {
    private Map<SliderType, Slider> sliders;

    public SliderFactory() {
        sliders = getSlidersCacheMap();
    }

    /**
     * This method returns slider depending on its type.
     *
     * @param type type of slider
     * @return {@link Slider} or {@code null} if this slider is it is not able to get slider of this type.
     */
    public Slider getSlider(SliderType type) {
        return sliders.get(type);
    }

    private Map<SliderType, Slider> getSlidersCacheMap() {
        Map<SliderType, Slider> sliderMap = new HashMap<>();
        sliderMap.put(SliderType.BaconMaster, new BaconMaster());
        sliderMap.put(SliderType.BBQKing, new BBQKing());
        sliderMap.put(SliderType.VeggieSlider, new VeggieSlider());
        return sliderMap;
    }
}
