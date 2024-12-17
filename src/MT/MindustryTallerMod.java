package MindustryTaller;

import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import MindustryTaller.content.*;
import MindustryTaller.content.blocks.*;
import arc.*;
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
