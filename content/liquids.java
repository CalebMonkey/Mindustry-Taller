package mindustrytaller.content

import arc.graphics.*;
import mindustry.type.*;

public class Liquids{
    public static Liquid ;

    public static void load(){

        electrolyte = new Liquid("electrolyte", Color.valueOf("f3e979")){{
            heatCapacity = 0.3f;
            viscosity = 0.3f;
            explosiveness = 1.0f;
            temperature = 0.6f;
            effect = StatusEffects.shocked;
            boilPoint = 0.5f;
        }};
    }
}
