package Maze;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class WholeFrame extends JFrame{
	
	private PlayerLocationService playerLocationService;
	
	public WholeFrame() {
		this.playerLocationService = new PlayerLocationService();
		this.playerLocationService.getMazeArr();
		addEventListener();
	}
	
	public void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyReleased(e);
			}
			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_UP:
					playerLocationService.move(1);
					break;
				}
			}
		});
	}
	
	
	public static void main(String[] args) {
		new WholeFrame();
	}
}
