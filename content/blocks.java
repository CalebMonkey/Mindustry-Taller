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
            outputItem = new ItemStack(Items.metaglass, 10)
            
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
            
            
            
        
