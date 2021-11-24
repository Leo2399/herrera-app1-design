package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.*;

public class ToDoListsController {

    @FXML
    private Button addButton;

    @FXML
    private Button addListButton;

    @FXML
    private TableColumn<Items, String> columnDescription;

    @FXML
    private TableColumn<Items, String> columnDueDate;

    @FXML
    private TableColumn<Items, String> columnStatus;

    @FXML
    private Button deleteButton;

    @FXML
    private Button deleteListButton;

    @FXML
    private TextField descriptionTextField;

    @FXML
    private TextField dueDateTextField;

    @FXML
    private Button loadButton;

    @FXML
    private Button saveButton;

    @FXML
    private TableView<Items> taskTableView;

    @FXML
    private TextField listTitleTextField;

    @FXML
    private ListView<String> toDoListView;

    @FXML
    private ComboBox<String> filterListBox;

    @FXML
    private ComboBox<String> statusBox;

    @FXML
    void addList(ActionEvent event) {
        // When the add list button is clicked add new to-do list entered
        // Make sure the title is at least 3 character long
        // Add new list to the list view
    }

    @FXML
    void addTask(ActionEvent event) {
        // Add new item to selected to-do list
        // TextFields should not be empty
        // Makes sure the due date is in YYYY-MM-DD
        // Get completion status from combo box
        // Add to the tableview for the selected list
    }

    @FXML
    void deleteList(ActionEvent event) {
        // Get highlighted list and remove it
    }

    @FXML
    void deleteTask(ActionEvent event) {
        // Get highlighted item in a selected to-do list and remove it
    }

    @FXML
    void loadList(ActionEvent event) {
        // Get an already existing list and load into a current to-do list
        // Make sure the file is not empty
        // Make sure that it replaces everything in the current list
    }

    @FXML
    void saveToFile(ActionEvent event) {
        // Write a new text file to store the data of a single to-do list
        // Set the file location, and name
    }

    @FXML
    void filterList(ActionEvent event) {
        // Filter current to-do list using the combo box
        // View either All, Complete, or Incomplete
    }

    @FXML
    public void initialize(){
        // List view should be able to open up table views with different data
        // Allow data to be added to all columns in a tableview
        // Allow editing for Due Date and Description columns
        // Set filterBox options, "All", "Complete", "Incomplete"
        // Set statusBox options, "Complete", "Incomplete
    }

}


