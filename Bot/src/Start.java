
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.interactive.NPCs;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.script.Category;
import org.dreambot.api.Client;
import org.dreambot.api.wrappers.interactive.*;
import java.util.List;
// import org.dreambot.api.methods.filter.Filter;


@ScriptManifest(author = "You", name = "My First Script", version = 1.0, description = "Simple Tea Thiever", category = Category.THIEVING)
public class main extends AbstractScript {

	public void onStart() {
		log("DEMO FISHING SCRIPT");
	}
	
	private enum fishState {
		ROAM, FISH, DROP
	}
	
	private NPC findFishingSpot() {
		return NPCs.closest("Fishing spot"); 
	}
	
	public void onExit() {

	}

	@Override
	public int onLoop() {
		NPC spot = findFishingSpot();
		log(spot);
		return Calculations.random(1000, 1200);
	}
}