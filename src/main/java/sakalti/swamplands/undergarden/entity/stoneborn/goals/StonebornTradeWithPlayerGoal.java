package sakalti.swamplands.entity.stoneborn.goals;

import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.player.Player;
import sakalti.swamplands.entity.stoneborn.Stoneborn;

import java.util.EnumSet;

public class StonebornTradeWithPlayerGoal extends Goal {

	private final Stoneborn stoneborn;

	public StonebornTradeWithPlayerGoal(Stoneborn stoneborn) {
		this.stoneborn = stoneborn;
		this.setFlags(EnumSet.of(Goal.Flag.JUMP, Goal.Flag.MOVE));
	}

	@Override
	public boolean canUse() {
		if (!this.stoneborn.isAlive()) {
			return false;
		} else if (this.stoneborn.isInWater()) {
			return false;
		} else if (!this.stoneborn.onGround()) {
			return false;
		} else if (this.stoneborn.hurtMarked) {
			return false;
		} else {
			Player playerentity = this.stoneborn.getTradingPlayer();
			if (playerentity == null) {
				return false;
			} else if (this.stoneborn.distanceToSqr(playerentity) > 16.0D) {
				return false;
			} else {
				return playerentity.containerMenu != null;
			}
		}
	}

	@Override
	public void start() {
		this.stoneborn.getNavigation().stop();
	}

	@Override
	public void stop() {
		this.stoneborn.setTradingPlayer(null);
	}
}