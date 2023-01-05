package mindustrytaller.content;

import mindustry.type.item;
import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class MTItems{
 	public static Item
 	ceramicComposite, quartz, rawStygium, oscillium, magnetite, Stygium, fractalMatter, nanoCore
  
	public static void load(){
		ceramicComposite = new Item("ceramic-composite", Color.valueOf("b8705c")){{
			cost = 1.0f;
			flammability = 0.1f;
            		explosiveness = 0.1f;
		}};
		
		quartz = new Item("quartz", Color.valueOf("b8705c")){{
			cost = 1.0f;
			charge = 0.1f;
			
		}};

	}
}
