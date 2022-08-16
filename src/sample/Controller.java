package sample;

import java.io.IOException;
import java.net.URL;
import  java.util.*;
import javafx.animation.RotateTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

public class Controller implements Initializable {
    public Button PauseGame;
    public Button ResetGame;
    public Button button;
    public Circle Circle1;
    public Circle Circle2;
    public Circle Circle3;
    public Button buttonPlay;
    public Button CreditsButton;
    public Button ExitButton;
    public AnchorPane FirstAnchorPane;



    ArrayList<String> list=new ArrayList<>();

//   Random random=new Random();
//
//    public Random getRandom() {
//        random.ints(list);
//        return random;
//    }



    public void setList(ArrayList<String> list) {

    }

    public void StartAction(ActionEvent event) {
    }

    public void ResetA(ActionEvent event) {
    }

    public void PauseAction(ActionEvent event) {
    }
    public void SetRotation(Circle c,Boolean reverse, int angle, int duration)
    {
        RotateTransition rotateTransition=new RotateTransition(Duration.seconds(duration),c);
        rotateTransition.setAutoReverse(reverse);
        rotateTransition.setByAngle(angle);
        rotateTransition.setDuration(Duration.seconds(duration));
        rotateTransition.setRate(30);
        rotateTransition.setCycleCount(500);
        rotateTransition.play();
    }
    int count=0;
    public void vedioAction(ActionEvent event)
    {
        count++;
        if(count%2!=0){
            credits.setText("IDEA OF GAME : HUNTER OMI"+"\n"+"DEVELOPER: HUNTER OMI & TERROR TANZID"+"\n"+"SPECIAL THANKS TO JANNAT ARA (MEEM) Mam"+"\n" +"& MAINUL FUAD sir");




        }
        else if (count%2==0){
            credits.setVisible(false);
        }
   }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        SetRotation(Circle1,true,360,20);
        SetRotation(Circle2,true,180,30);
        SetRotation(Circle3,true,145,50);

    }

    public void PlayAction(ActionEvent event) throws IOException {
        AnchorPane pane=FXMLLoader.load(getClass().getResource("sample.fxml"));
        FirstAnchorPane.getChildren().setAll(pane);

    }

    @FXML
    private Label credits;
    public void CreditsButton(ActionEvent event)
    {

        //credits.setText("T");
    }


    public void exitButtonAction(ActionEvent event) {
        Platform.exit();
    }
}
