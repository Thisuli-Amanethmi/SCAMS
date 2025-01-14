package com.example.sacms_grp30;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SACMSViewController {
    @FXML
    private Button studentButton;

    @FXML
    private Button clubAdvisorButton;

    public void studentButtonOnClick(ActionEvent actionEvent) throws Exception {
        navigateStudent(actionEvent);
    }

    private void navigateStudent(ActionEvent actionEvent) throws Exception {
        Stage newStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("student-view.fxml"));
        newStage.setTitle("SCAMS - Student");
        newStage.setScene(new Scene(root, 800, 500));
        newStage.show();

        Stage previousStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        previousStage.close();
    }

    public void clubAdvisorButtonOnClick(ActionEvent actionEvent) throws Exception {
        navigateClubAdvisorConfirmation(actionEvent);
    }

    private void navigateClubAdvisorConfirmation(ActionEvent actionEvent) throws Exception {
        Stage newStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("clubAdvisorConfirmation-view.fxml"));
        newStage.setTitle("SCAMS - Club Advisor Confirmation");
        newStage.setScene(new Scene(root, 440, 290));
        newStage.show();

        Stage previousStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        previousStage.close();

    }
}
