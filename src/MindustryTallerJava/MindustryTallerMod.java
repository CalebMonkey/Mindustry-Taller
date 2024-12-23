
package MindustryTallerJava;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;




public class MindustryTallerMod extends Mod {

	@Override
	public void loadContent() {
		Items.load();
		Liquids.load();

	}
}
