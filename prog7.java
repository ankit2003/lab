package application;

import java.awt.Label;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class labfx extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	public void start(Stage primaryStage){
		Text nameLabel=new Text("Name");
		TextField nameText=new TextField();
		Text dobLabel=new Text("Date of Birth");
		DatePicker datePicker=new DatePicker();
		Text genderLabel=new Text("Gender");
		ToggleGroup groupGender=new ToggleGroup();
		RadioButton maleRadio=new RadioButton("Male");
		maleRadio.setToggleGroup(groupGender);
		RadioButton femaleRadio=new RadioButton("Female");
		femaleRadio.setToggleGroup(groupGender);
		Text nptel=new Text("Have you registered for NPTEL?");
		ToggleGroup group=new ToggleGroup();
		ToggleButton yes=new ToggleButton("Yes");
		yes.setToggleGroup(group);
		yes.setUserData(yes);
		ToggleButton no=new ToggleButton("No");
		no.setUserData(no);
		no.setToggleGroup(group);
		Text locationLabel=new Text("Location");
		ChoiceBox locationchoiceBox=new ChoiceBox();
		locationchoiceBox.getItems().addAll("Bangalore","Hyderabad","Chennai","Delhi","Mumbai","Vizag");
		locationchoiceBox.getSelectionModel().selectFirst();
		Button buttonRegister=new Button("Register");
		GridPane gridPane=new GridPane();
		gridPane.setPadding(new Insets(10,10,10,10));
		gridPane.setVgap(10);
		gridPane.setHgap(5);
		gridPane.setAlignment(Pos.CENTER);
		gridPane.add(nameLabel,0,0);
		gridPane.add(nameText,1,0);
		gridPane.add(dobLabel,0,1);
		gridPane.add(datePicker,1,1);
		gridPane.add(genderLabel,0,2);
		gridPane.add(maleRadio,1,2);
		gridPane.add(femaleRadio,2,2);
		gridPane.add(nptel,0,3);
		gridPane.add(yes,1,3);
		gridPane.add(no,2,3);
		gridPane.add(locationLabel,0,6);
		gridPane.add(locationchoiceBox,1,6);
		Text Resp=new Text();
		gridPane.add(Resp,1,15);
		gridPane.add(buttonRegister,2,8);
		buttonRegister.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				System.out.println("Registraton complete");
				System.out.println("Name: "+nameText.getText());
				System.out.println("DOB: "+datePicker.getValue());
				System.out.println("Location: "+locationchoiceBox.getValue());
				Resp.setText("Registration successfull");
			}

			
		});
		buttonRegister.setStyle("-fx-background-color: Red; -fx-textfill: white;");
		nameLabel.setStyle("-fx-font:normal bold 15px 'serif'; ");
		dobLabel.setStyle("-fx-font:normal bold 15px 'serif'; ");
		genderLabel.setStyle("-fx-font:normal bold 15px 'serif'; ");
		nptel.setStyle("-fx-font:normal bold 15px 'serif'; ");
		locationLabel.setStyle("-fx-font:normal bold 15px 'serif'; ");
		gridPane.setStyle("-fx-background-color: BEIGE;");
		Scene scene2=new Scene(gridPane);
		primaryStage.setTitle("Registration Form");
		primaryStage.setScene(scene2);
		primaryStage.show();
	}
}