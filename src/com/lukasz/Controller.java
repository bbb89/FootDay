package com.lukasz;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

public class Controller {
    MatchList matchList = LoadData.load();

    @FXML
    private ListView<Match> listView;
    @FXML
    private TextArea matchDetailsTextArea;

    public void initialize() {
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        listView.getItems().setAll(matchList.getMatchList());
        if(listView.getItems().size() > 0) matchDetailsTextArea.setText(listView.getItems().get(0).getMatchDetails());
        else matchDetailsTextArea.setText("Przykro mi! Dzisiaj nie ma meczów w polskiej TV :(");
    }

    @FXML
    public void handleClickListView() {
        Match selectedMatch = listView.getSelectionModel().getSelectedItem();
        matchDetailsTextArea.setText(selectedMatch.getMatchDetails());
    }

}
