package mindustrytaller.content;

import mindustry.type.item

public class MTItems{
 	public static Item
 	graphene, nanohex, microcore, cryocube;
  
	public static void load(){
		graphene = new Item("graphene", Color.valueOf("b2c6d2")){{
			cost = 1.0f;
		}};

		nanohex = new Item("nanohex", Colour.valueOf("5c5e9f")){{
			cost = 1.0f;
		}};

		microcore = new Item("graphene", Color.valueOf("ffd27e")){{
			cost = 1.0f;
		}};

		cryocube = new Item("nanohex", Colour.valueOf("7a8cdc")){{
			cost = 1.0f;
		}};
	}
}
