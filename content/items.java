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
		
		quartz = new Item("quartz", Color.valueOf("ffffff")){{
			cost = 1.0f;
			charge = 0.1f;
		}};
		
		rawStygium = new Item("raw-stygium", Color.valueOf("4a4b53")){{
			buildable = false;
		}};
		
		stygium = new Item("stygium", Color.valueOf("985bb0")){{
			cost = 1.5f;
			charge = 0.35f;
		}};
		
		oscillium = new Item("oscillium", Color.valueOf("f4f4f4")){{
			cost = 1.2f;
			charge = 0.15f;
		}};
		
		magnetite = new Item("magnetite", Color.valueOf("f15454")){{
			cost = 1.2f;
			charge = 0.6f;
		}};

		fractalMatter = new Item("fractal-matter", Color.valueOf("00deff")){{
			cost = 1.5f;
			charge = 2.0f;
			explosiveness = 10.0f;
			radioactivity = 5.0;
		}};
		nanocore = new Item("nanocore", Color.valueOf("989aa4")){{
			cost = 2.0f;
			charge = 10.0f;
			explosiveness = 10.0f;
		
	}
}
