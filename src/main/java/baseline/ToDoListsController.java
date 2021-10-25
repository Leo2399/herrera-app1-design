package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class ToDoListsController {

    @FXML
    private TableColumn<?, ?> columnDescription;

    @FXML
    private TableColumn<?, ?> columnDueDate;

    @FXML
    private TableColumn<?, ?> columnTitle;

    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;

    @FXML
    private TextField deleteTextField;

    @FXML
    private TextField descriptionTextField;

    @FXML
    private TextField dueDateTextField;

    @FXML
    private Button saveButton;

    @FXML
    private TextField titleTextField;

    @FXML
    void addTask(ActionEvent event) {
        // This method should add the task into the list
        // add the title of the task into the title column
        // add the due date of the task into the due date column
        // add the description into the description column
        // after the task has been added the text field should refresh and be blank to enter new information

    }

    @FXML
    void deleteTask(ActionEvent event) {
        // This method should delete a task from the list
        // get the task you want to delete
        // have that task deleted
        // after a task has been deleted, refresh the text field to be blank
    }

    @FXML
    void saveToFile(ActionEvent event) {
        // This method should be able to save the list into a file
        // write the data from the task list into a new file of a new name given by the user
    }

    public void initialize(){
        // not exactly sure what I need to do in this method in this method
        // will eventually figure it out
    }

}

