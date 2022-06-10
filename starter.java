import pkg.*;

import java.util.ArrayList;


public class starter implements InputControl, InputKeyControl {
	static	boolean start = false ;
	static Rectangle play_button;
	static Text play;
	static Color blue;

	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		int[][] gameboard = new int [3][3];
		Rectangle background = new Rectangle(10,10,10000,10000);
		background.draw();
		background.fill();
		//background.setColor(backcolor);
		Color purple = new Color(200,180,255);
		background.setColor(purple);
		Text title = new Text(630,100,"Tic Tac Toe");
		title.draw();
		title.grow(150,100);
		//play
		 play_button = new Rectangle(550,300,200,100);
		play_button.draw();
		Color darkcolor = new Color(102,0,204);
		play_button.setColor(darkcolor);
		play_button.fill();
		//play text
		  play = new Text (640,330,"Play");
		 play.draw();
		play.grow(50,50);
		//while stuff
		// while(true){
		// placePiece(gameBoard,playerPos,"player"); 
		// Random rand = new Random();
		// int cpuPos = rand.nextInt(9)+1;
		// placePiece(gameBoard,playerPos,"cpu");
		// printGameBoard(gameBoard);
		
		// }

	}
	//
	public void onMouseClick(double x, double y) {
		
		if(x>=550&&x<=750&&y>=300&&y<= 400 && !start ){
			play();
			start = true;
			//System.out.println("Play(it works)");
		}
		 else if(x>=350 && x<=550&&y>=200&&y<=340&& start){
			System.out.println("square 1 works");
			//x(x,y);
			Charx num1 = new Charx(370.00,220.00);
			gameBoard [0][0] = 1;
		}
		else if(x>=570 && x<=750 &&y>=200 && y<=340&& start){
			System.out.println("square 2 works ");
			Charx num1 = new Charx(590.00,230.00);
			gameBoard[0][1] =1;
		}
		else if (x>=770&&x<=950&& y>=200&&y<=340&& start){
			System.out.println("square 3 works");
			Charx num1 = new Charx(790.00,230.00);
			gameBoard[0][2] =1;
		}
		else if(x>=350 && x<=550&& y>=360&&y<=520&& start){
			System.out.println("square 4 works");
			Charx num1 = new Charx(390.00,390.00);
			gameBoard[1][0] =1;
		}
		else if(x>=570 && x<=750&&y>=360&&y<=520&& start){
			System.out.println("square 5 works");
			Charx num1 = new Charx(600.00,390.00);
			gameBoard[1][1] = 1;
		}
		else if (x>=770&&x<=950&&y>=360&&y<=520&& start ){
			System.out.println("square 6 works");
			Charx num1 = new Charx(790.00,390.00);
			gameBoard[1][2] = 1;
		}
		else if(x>=350 && x<=550&&y>=570&&y<=700&& start){
			System.out.println("square 7 works");
			Charx num1 = new Charx(380.00,600.00);
			gameBoard[2][0]=1;
		}
		else if(x>=570 && x<=750&&y>=570&&y<=700&& start){
			System.out.println("square 8 works");
			Charx num1 = new Charx(600.00,600.00);
			gameBoard[2][1] = 1;
		}
		else if (x>=770&&x<=950&&y>=570&&y<=700&& start ){
			System.out.println("square 9 works");
			Charx num1 = new Charx(790.00,600.00);
			gameBoard[2][2] = 1;
		}
		
		

		
	}
		
		public void play(){
			play.undraw();
			play_button.undraw();
			Rectangle column1 = new Rectangle(550,200,20,500);
			 blue = new Color(80, 118, 212);
			column1.setColor(blue);
			column1.draw();
			column1.fill();

			Rectangle column2 = new Rectangle(750,200,20,500);
			column2.draw();
			column2.fill();
			column2.setColor(blue);

			Rectangle row1 = new Rectangle(350,340,600,20);
			row1.draw();
			row1.fill();
			row1.setColor(blue);

			Rectangle row2 = new Rectangle(350,520,600,20);
			row2.draw();
			row2.fill();
			row2.setColor(blue);
			Rectangle box = new Rectangle (350,200,600,500);
			box.draw();


		}
		
		
		 public static void placePiece (int [][] gameBoard,int pos, String user){

			switch(pos){
				case 1 :
					gameBoard[0] [0] = x();
					break;
				case 2 :
					gameBoard[0] [1] = x();
					break;
				case 3 :
					gameBoard[0] [2] = x();
					break;	
				case 4 :
					gameBoard[1] [0] = x();
					break;
				case 5 :
					gameBoard[1] [1] = x();
					break;
				case 6 :
					gameBoard[1] [2] = x();
					break;
				case 7 :
					gameBoard[2] [0] = x();
					break;
				case 8 :
					gameBoard[2] [1] = x();
					break;
				case 9 :
					gameBoard[2] [2] = x();
					break;
					default:
					break;
				}
			
		

		

	public void keyPress(String s) {
		// enter code here

	}

}
