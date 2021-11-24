package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListsControllerTest {

    @Test
    void addTask() {
        // create a new list, with set due dates, description, and status
        // compare a set of strings with a due date, a due date, and status and check if they match
    }

    @Test
    void deleteTask() {
        // test by setting a list with a set size
        // remove one item
        // define the size you expect the list to be after an item is removed
        // check if the size you expect is equal to the actual list size
    }

    @Test
    void saveToFile() {
        // create a new list with a set size of items
        // test to make sure that a file is opened to write into
        // check the size you expect the file to be and compare it to the actual size
    }

    @Test
    void addNewList(){
        // create a new listview with a set size
        // add an item to check if it went up by one
    }

    @Test
    void deleteList(){
        // create a new listview with a set size
        // remove an item and check if it went down by one
    }

    @Test
    void loadFile(){
        // compare an expected size with the actual size of the list from the file
    }

    @Test
    void testFilter(){
        // get the status from the constructor
        // add the number of items that match with the chosen filter to a new list
    }

    @Test
    void validDate() {
        // test to make sure the due date is in YYYY-MM-DD
        // create a new list, get the date and check if it matches the correct format
    }

    @Test
    void validDescription(){
        // make sure the description is not empty
        // if the description is empty the actual size of the list should be 0
    }

    @Test
    void validTitle(){
        // make sure that the title is at least 3 characters long
        // compare the size you expect the list to be after it's added to its actual size
    }

}