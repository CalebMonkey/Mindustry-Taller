package mindustrytaller.content;

import mindustry.type.item

public class MTItems{
  public static Item
  graphene, nanohex, microcore, cryocube;
  
  public static void load() {
		graphene = new Item("graphene", Color.valueOf("b2c6d2")) {{
      cost = 1.0f;
		}};
