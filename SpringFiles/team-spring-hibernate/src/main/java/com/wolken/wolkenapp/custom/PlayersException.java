package com.wolken.wolkenapp.custom;

public class PlayersException extends Exception {

	@Override
	public String toString() {
		return "Invalid entry - Team must contain 1-15 players to be registered";
	}
}
