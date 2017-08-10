package structural.flyweight;

import structural.flyweight.sliders.Slider;

public class App {
    public static void main(String[] args) {
        SliderFactory sliderFactory = new SliderFactory();
        int orderTotal = 0;

        Slider baconSlider = sliderFactory.getSlider(SliderType.BaconMaster);
        orderTotal++;
        baconSlider.display(orderTotal);

        Slider veggieSlider = sliderFactory.getSlider(SliderType.VeggieSlider);
        orderTotal++;
        veggieSlider.display(orderTotal);

        Slider bbqSlider = sliderFactory.getSlider(SliderType.BBQKing);
        orderTotal++;
        bbqSlider.display(orderTotal);


    }
}
