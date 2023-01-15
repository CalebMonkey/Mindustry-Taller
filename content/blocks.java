package mindustrytaller.content;

import arc.graphics.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.entities.effect.*;
import mindustry.graphics.Pal;
import mindustry.type.*;
import mindustry.world.Block;
import mindustry.world.blocks.production.*;
import mindustry.world.draw.*;
import mindustry.world.meta.Attribute;
import mindustry.world.blocks.*;
    

public class Blocks{
    public static Block
    metaglassCrucible, phaseExtrapolator, surgeForge, pyratiteMill, blastMill, oilPowerPlant, nanohexAssembler, microcoreConstructor;
    
    
    public static void load(){
        //Better Factories
        metaglassCrucible = new GenericCrafter("metaglass-crucible"){{
            requirements(Category.crafting, with(Items.graphite, 120, Items.metaglass, 80, Items.plastanium, 40, Items.silicon, 100));
            size = 3;
            hasPower = true;
            hasItems = true;
            hasLiquids = false;
            craftEffect = Fx.smeltsmoke;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame(Color.valueOf("ffc099")));
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.07f;
            craftTime = 90f;
            itemCapacity = 30;
            consumePower(4.5f);
            consumeItems(with(Items.graphite, 4, Items.sand, 6, Items.pyratite, 1));
            outputItem = new ItemStack(Items.metaglass, 10);
        }};
            
        plastaniumCoagulator = new GenericCrafter("plastaniumCoagulator"){{
            requirements(Category.crafting, with(Items.titanium, 200, Items.silicon, 160, Items.graphene, 40, Items.plastanium, 65));
            size = 3;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            craftEffect = Fx.smeltsmoke;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame(Color.valueOf("ffc099")));
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.07f;
            craftTime = 30f;
            itemCapacity = 30;
            consumePower(6f);
            consumeItems(with(Items.titanium, 3, Items.lead,3));
            consumeLiquid(Liquids.oil, 0.75f);
            outputItem = new ItemStack(Items.plastanium, 3);
        }};
        
        phaseFabricator = new GenericCrafter("phase-fabricator"){{
            requirements(Category.crafting, with(Items.phaseFabric, 50, Items.silicon, 125, Items.thorium, 100, Items.lead, 250));

            size = 3;

            itemCapacity = 40;
            craftTime = 60f * 2f;
            liquidCapacity = 10f * 4;

            ambientSound = Sounds.techloop;
            ambientSoundVolume = 0.04f;

            outputItem = new ItemStack(Items.phaseFabric, 3);

            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawSpikes(){{
                color = Color.valueOf("ffd59e");
                stroke = 1.5f;
                layers = 2;
                amount = 12;
                rotateSpeed = 0.5f;
                layerSpeed = -0.9f;
            }}, new DrawMultiWeave(){{
                glowColor = new Color(1f, 0.4f, 0.4f, 0.8f);
            }});

            consumeItems(with(Items.thorium, 8, Items.sand, 18, Items.graphite, 1));
            consumeLiquid(Liquids.water, 12f / 60f);
            consumePower(8f);
        }};
        
        surgeIntergrater = new GenericCrafter("surge-intergrater"){{
            requirements(Category.crafting, with(Items.surgeAlloy, 60, Items.lead, 150, Items.thorium, 120), Items.silicon,100);
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(Items.surgeAlloy, 2);
            craftTime = 75f;
            size = 3;
            hasPower = true;
            itemCapacity = 15;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame());

            consumePower(2f);
            consumeItems(with(Items.copper, 2, Items.lead, 3, Items.titanium, 1, Items.silicon, 2, Items.pyratite, 1));
        }};
            
            
        
