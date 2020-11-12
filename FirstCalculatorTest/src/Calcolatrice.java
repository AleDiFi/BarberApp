
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Calcolatrice extends Application{
	
	Label display;
	Rectangle displayBackground;
	
	Button zero;
	Button one;
	Button two;
	Button three;
	Button four;
	Button five;
	Button six;
	Button seven;
	Button eight;
	Button nine;
	
	Button add;
	Button calculate;
	Button reset;
	Button subtract;
	Button multiply;
	Button divide;
	
	float sum=0;
	String newad="";
	String result="";
	String op="";
	
	public void start(Stage stage) throws Exception{
		
		display = new Label("Enter equation");
		display.setLayoutX(4);
		display.setLayoutY(5);
		// display.setStyle("-fx-border-color: grey;");
		displayBackground = new Rectangle(83,20);
		displayBackground.setLayoutX(3);
		displayBackground.setLayoutY(4);
		//displayBackground.setStyle("-fx-border-color: pink;");
		displayBackground.setFill(Color.LIGHTGRAY);
		
		zero = new Button("0");
		zero.setLayoutX(3);
		zero.setLayoutY(120);
		zero.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				newad+="0";
			}
		});
		
		one = new Button("1");
		one.setLayoutX(3);
		one.setLayoutY(90);
		one.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				newad+="1";
			}
		});
		
		two = new Button("2");
		two.setLayoutX(33);
		two.setLayoutY(90);
		two.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				newad+="2";
			}
		});
		
		three = new Button("3");
		three.setLayoutX(63);
		three.setLayoutY(90);
		three.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				newad+="3";
			}
		});
		
		four = new Button("4");
		four.setLayoutX(3);
		four.setLayoutY(60);
		four.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				newad+="4";
			}
		});
		
		five = new Button("5");
		five.setLayoutX(33);
		five.setLayoutY(60);
		five.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				newad+="5";
			}
		});
		
		six = new Button("6");
		six.setLayoutX(63);
		six.setLayoutY(60);
		six.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				newad+="6";
			}
		});
		
		seven = new Button("7");
		seven.setLayoutX(3);
		seven.setLayoutY(30);
		seven.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				newad+="7";
			}
		});
		
		eight = new Button("8");
		eight.setLayoutX(33);
		eight.setLayoutY(30);
		eight.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				newad+="8";
			}
		});
		
		nine = new Button("9");
		nine.setLayoutX(63);
		nine.setLayoutY(30);
		nine.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				newad+="9";
			}
		});
		
		add = new Button("+");
		add.setLayoutX(93);
		add.setLayoutY(60);
		add.setStyle("-fx-background-color: #C0C0C0");
		add.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				if(!(newad.equals(""))) {
					sum+= Integer.parseInt(newad);
					newad="";
					op = "1";
					System.out.println("operation = " + op);
				}
			}
		});
		
		calculate = new Button("=");
		calculate.setLayoutX(93);
		calculate.setLayoutY(90);
		calculate.setStyle("-fx-background-color: #C0C0C0");
		calculate.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if(!(newad.equals(""))) {
					if(op.equals("1")){
						sum+= Float.parseFloat(newad);
					}
					else if(op.equals("2")) {
						sum-= Float.parseFloat(newad);
					}
					else if(op.equals("3")) {
						sum*= Float.parseFloat(newad);
					}
					else if(op.equals("4")){
						System.out.println("newad = " + newad + ", float value = " + Float.parseFloat(newad));
							sum/= Float.parseFloat(newad);
					}
				}
				result=String.valueOf(sum);
				display.setText(result);
				newad="0";
				op = "0";
			}
		});
		
		reset = new Button("C");
		reset.setLayoutX(93);
		reset.setLayoutY(30);
		reset.setStyle("-fx-background-color: #C0C0C0");
		reset.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				newad="";
				sum=0;
				display.setText("0");
			}
		});
		
		subtract = new Button("-");
		subtract.setLayoutX(123);
		subtract.setLayoutY(90);
		subtract.setStyle("-fx-background-color: #C0C0C0");
		subtract.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				if(!(newad.equals(""))) {
					sum+= Float.parseFloat(newad);
					newad="";
					op = "2";
					System.out.println("operation = " + op);
				}
			}
		});
		
		multiply = new Button("x");
		multiply.setLayoutX(123);
		multiply.setLayoutY(30);
		multiply.setStyle("-fx-background-color: #C0C0C0");
		multiply.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				if(!(newad.equals(""))) {
					sum+= Float.parseFloat(newad);
					newad="";
					op = "3";
					System.out.println("operation = " + op);
				}
			}
		});
		
		divide = new Button("/");
		divide.setLayoutX(123);
		divide.setLayoutY(60);
		divide.setStyle("-fx-background-color: #C0C0C0");
		divide.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				if(!(newad.equals(""))) {
					sum+= Float.parseFloat(newad);
					newad="";
					op = "4";
					System.out.println("operation = " + op);
				}
			}
		});
		
		Group root = new Group(displayBackground, display, zero, one, two, three, four, five, six, seven, eight, nine, add, subtract, multiply, divide, calculate, reset);
		Scene scene = new Scene(root, 150, 160);
		stage.setTitle("First Calculator");
		scene.setFill(Color.CADETBLUE);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
