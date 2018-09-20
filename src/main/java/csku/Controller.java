package csku;
/**
 *Thun Rutthanawin 581041015
 */



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.concurrent.TransferQueue;

public class Controller {
    private Account account = new Account();

    @FXML
    private Label messageLabel;
    @FXML
    private Button spendButton;
    @FXML
    private Button receiveButton;
    @FXML
    private TextField moneyField;
    @FXML
    private TextField descriptionField;
    @FXML
    private TextArea textArea;


    private ObservableList data = FXCollections.observableArrayList();
    @FXML
    private ListView<String> transactionList = new ListView<>();


    public void spendButtonHandler(ActionEvent actionEvent){

        if((moneyField.getText() != null)){
            int money = Integer.parseInt(moneyField.getText());


            account.addToSpend(money);
            account.spend(money);
            Description des = new Description(descriptionField.getText(),Integer.parseInt(moneyField.getText()),"spend");
            account.addDescription(des);

            transactionList.getItems().add(des.toString());
        }
        else {
            messageLabel.setText("Field Empty");
        }




        moneyField.clear();

    }
    public void receiveButtonHandler(ActionEvent actionEvent){
        if((moneyField.getText() != null  )){
            account.addToIncome(Integer.parseInt(moneyField.getText()));
            Description des = new Description(descriptionField.getText(),Integer.parseInt(moneyField.getText()),"receive");
            account.addDescription(des);
            transactionList.getItems().add(des.toString());



        }
        else {
            messageLabel.setText("Field Empty");
        }

        moneyField.clear();

    }





}
