package Mindustry-Taller;

import Mindustry-Taller.content.*;
import Mindustry-Taller.content.blocks.*;
import arc.Events;
import mindustry.game.EventType.FileTreeInitEvent;
import mindustry.mod.Mod;

public class mindustryTallerModLoader extends Mod {
	public mindustryTallerModLoader() {
		Events.on(FileTreeInitEvent.class, e -> Sfx.load());
	}

	public void mindustryTallerBlockContent() {
		Blocks.load
	}

	@Override
	public void loadContent() {
		Items.load();
		Liquids.load();

	}
}
