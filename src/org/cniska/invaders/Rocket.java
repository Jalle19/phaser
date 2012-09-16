package org.cniska.invaders;

import org.cniska.phaser.core.GameView;
import org.cniska.phaser.node.Actor;
import org.cniska.phaser.scene.World;

public class Rocket extends SpaceActor {

	/**
	 * Creates a new actor.
	 *
	 * @param view The game view.
	 * @param world The parent world.
	 */
	public Rocket(GameView view, World world) {
		super(view, world);
		id = 3;
		name = "rocket";
	}

	@Override
	public void init() {
		super.init();
		loadBitmap(R.drawable.missile_01);
		explosion.loadBitmap(R.drawable.explosion_01);
	}

	@Override
	public boolean collides(Actor other) {
		return other instanceof Alien && intersects(other);
	}
}
