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

    }

    @FXML
    void deleteTask(ActionEvent event) {

    }

    @FXML
    void saveToFile(ActionEvent event) {

    }

    public void initialize(){

    }

}

