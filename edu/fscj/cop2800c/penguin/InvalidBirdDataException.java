// InvalidBirdDataException.java
// Kevin Gordie
// 4/4/26
// Custom exception for invalid bird data

package edu.fscj.cop2800c.penguin;

public class InvalidBirdDataException extends Exception {
    public InvalidBirdDataException(String message) {
        super(message);
    }
}