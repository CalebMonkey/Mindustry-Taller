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
		Mindustry-TallerBlocksPower.load();
		Mindustry-TallerBlocksDefense.load();
		Mindustry-TallerBlocksLogistic.load();
		Mindustry-TallerBlocksProduction.load();
		Mindustry-TallerBlocksUnits.load();
	}

	@Override
	public void loadContent() {
		Mindustry-TallerStatusEffects.load();
		UAWUnitTypes.load();
		Mindustry-TallerItems.load();
		Mindustry-TallerLiquids.load();
		Mindustry-TallerBlockContent();

	}
}
