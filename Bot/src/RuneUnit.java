import java.util.Queue;
import javaGOAP.*;

public class RuneUnit extends GoapUnit{
	
	Character unitChar;
	public RuneUnit(Character character) {
		this.unitChar = character;
		this.addWorldState(new GoapState(0, "level up melee", false));
		this.addGoalState(new GoapState(10, "level up melee", true));
		this.addAvailableAction(new LevelUpMeleeAction(this.unitChar));
	}
	
	@Override
	public void goapPlanFailed(Queue<GoapAction> arg0) {
		System.out.println("Plan Failed.");		
	}

	@Override
	public void goapPlanFinished() {
		System.out.println("Plan Finished.");
	}

	@Override
	public void goapPlanFound(Queue<GoapAction> arg0) {
		System.out.println("Plan Found");		
	}

	@Override
	public boolean moveTo(Object arg0) {
		// Changes the FSM directly
		return false;
	}

	@Override
	public void update() {
		// Called by the Agent.update() method
	}

}
