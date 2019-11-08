package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.Entity;

public class Player2 extends Entity {
	
	public Player2(MyGdxGame game, float x, float y, int width, int height, float speed, Texture texture, String shape) {
		super(game, x, y, width, height, speed, texture, shape);
	}

	@Override
	public void update(float delta) {
		
		dx = 0;
		dy = 0;

		// move
		if(Gdx.input.isKeyPressed(Keys.W)) {
			dy = speed * delta;
		}
		if(Gdx.input.isKeyPressed(Keys.S)) {
			dy = -speed * delta;
		}
		if(Gdx.input.isKeyPressed(Keys.A)) {
			dx = -speed * delta;
		}
		if(Gdx.input.isKeyPressed(Keys.D)) {
			dx = speed * delta;
		}
	}
	
}