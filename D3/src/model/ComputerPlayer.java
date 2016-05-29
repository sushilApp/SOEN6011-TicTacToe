package model;

import control.Controller;
import control.MoveStrategyContext;
import ui.GameBoard;

public class ComputerPlayer extends Player{

	public ComputerPlayer( String mark){
		this.token = mark;
		this.name = "Computer";
	}

	public static void notifyTurn(String btnValue[], MoveStrategyContext ctx){
		int p = ctx.getNextMove(btnValue);
		Controller.makeMove(p);
	}

}
