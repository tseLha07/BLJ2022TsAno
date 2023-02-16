package com.example.hellofx;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.util.ArrayList;
import java.util.Timer;

public class HelloController {
    private ListView mListView = new ListView();
    ArrayList<Email> nebulae = new ArrayList();

    Timer timer = new Timer();
    int counter = 0;
    @FXML
    private TextField To;
    @FXML
    private TextField Cc;
    @FXML
    private TextField Bcc;
    @FXML
    private TextArea Subject;
    @FXML
    private TextArea Content;
    @FXML
    private Text confirmationText;
    @FXML
    protected void onSentButtonClick() {

        // confirmationText.setText("The email is sent!");
        //System.out.println("Test");
        Email em = new Email("hello", "hello", "test", "test", "test");
        nebulae.add(em);
        To.setText(To.getText());
        Cc.setText(Cc.getText());
        Bcc.setText(Bcc.getText());
        Subject.setText(Subject.getText());
    }

    @FXML
    protected void onClearButtonClick(){
        nebulae.remove(counter);
    }

    @FXML
    protected void onNextButtonClick(){
        counter++;

    }

    @FXML
    protected void onPreviousButtonClick(){
        counter--;
    }
}