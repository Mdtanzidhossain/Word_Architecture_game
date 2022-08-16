package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class ControllerOfMainPage<i> {
    public AnchorPane ScoundPage;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn10;
    public Button btn11;
    public Button btn12;
    public Button btn13;
    public Button btn14;
    public Button btn15;
    public Button btn16;
    public Button btn17;
    public Button btn18;
    public Button btn19;
    public Button btn20;
    public Button btn21;
    public Button btn22;
    public Button btn23;
    public Button btn24;
    public Button btn25;
    public Button btn26;
    public Button btn27;
    public Button btn28;
    public Button btn29;
    public Button btn30;
    public Button btn31;
    public Button btn32;
    public Button btn33;
    public Button btn34;
    public Button btn35;
    public Button btn36;
    public Button btn37;
    public Button btn38;
    public Button btn39;
    public Button btn40;
    public Label selectword;
    public TextField inputwords;
    public Label hiscore;
    public Button searchfile;
    public Button menubutton;
    public Label score;
    public Label newScore;



    static String AplphaNumericString(int n)
    {
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder stringBuilder=new StringBuilder(n);
        for (int i=0;i<n;i++)
        {
            int index=(int)(alphabet.length()*Math.random());
            stringBuilder.append(alphabet.charAt(index));
        }
        return stringBuilder.toString();
    }
    public void initialize(){
        btn1.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn2.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn3.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn4.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn5.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn6.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn7.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn8.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn9.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn10.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn11.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn12.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn13.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn14.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn15.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn16.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn17.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn18.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn19.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn20.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn21.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn22.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn23.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn24.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn25.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn26.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn27.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn28.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn29.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn30.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn31.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn32.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn33.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn34.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn36.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn37.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn38.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn39.setText(ControllerOfMainPage.AplphaNumericString(1));
        btn40.setText(ControllerOfMainPage.AplphaNumericString(1));
    }
    ArrayList<String> word=new ArrayList<>();
    StringBuffer sb=new StringBuffer();
    String[] s=new String[word.size()];
    String w,h;
    int scr=0;
    int sum=0;
    int incre=10;
    public void wordMaking(ActionEvent event) {
       /* w=((Button)event.getSource()).getText();
        word.add(w);*/
       w=inputwords.getText();
       String k=((Button)event.getSource()).getText();
       h=w+k;
       inputwords.setText(h);
    }

    public void wrdshow(ActionEvent event) {
//        s=word.toArray(s);
//        for (int i=0;i<s.length;i++)
//        {
//            sb.append(s[i]);
//        }
//        h=sb.toString();
//        inputwords.setText(h);
//        scr=h.length();
//        System.out.println(scr);
        String omm=inputwords.getText();
        System.out.println(omm);
        scr=omm.length();
        System.out.println(scr);
        inputwords.setText("");
        try {
            FileReader fr=new FileReader("D:\\AOOP project\\New folder\\WordArc\\src\\sample\\dictionary.txt");
            BufferedReader br=new BufferedReader(fr);
            String str;
            while ((str=br.readLine())!=null)
            {
                if (omm.equals(str))
                {
                    //System.out.println("omi");
                   // sum+=scr;
                    //System.out.println(sum);
                    sum=sum+incre;

                    newScore.setText(""+sum);
                    score.setText(""+sum);
                   // System.out.println(sum);
                }
             /*   else
               {
                   incre=10;
                    //sum-=scr;
                   sum=sum-incre;
                    newScore.setText(""+sum);
                }*/
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }




    }


    public void menuAction(ActionEvent actionEvent) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("FirstPage.fxml"));
        ScoundPage.getChildren().setAll(pane);
    }
}

