package application;

import javafx.application.Application;

public class Main extends Application {
	//variables
	static int speed = 5;
	static int foodcolor = 0;
	static int width = 20;
	static int height = 20;
	static int foodX = 0;
	static int foodY = 0;
	static int cornersize = 25;
	static List<Corner> snake = new ArrayList<>();
	static Dir direction = Dir.left;
	static boolean gameOver = false;
	static Random rand = new Random();


	public enum Dir {
		left, right, up, down 
	}


	public static class Corner{
		int x;
		int y;

		public Corner(int x, int y){
			this.x = x;
			this.y = y;
			
		}
	}



	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			Canvas c = new Canvas(widh*cornersize, height*cornersize);
			GraphicsContext gc = new c.getGraphicsContex2D();


			Scene scene = new Scene (root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
