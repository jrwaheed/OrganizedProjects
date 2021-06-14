package at.jamal.exceptions;


//DONT GET IT TWISTED. WE ARE SIMPLY JUST CREATING A NEW SCENARIO WHERE AN EXCEPTION IS NEED.
// JUST LIKE THE PREVIOUS EXAMPLES OF NULLPOINTEXCEPTIONS AND INDEXOUTOFBOUNDSEXCEPTIONS.
//REALLY NOT THAT COMPLICATED.

public class SameDepartmentException extends Exception{
    public SameDepartmentException(String message) {
        super(message);
    }
}
