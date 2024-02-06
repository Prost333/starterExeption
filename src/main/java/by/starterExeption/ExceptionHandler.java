package by.starterExeption;

import by.starterExeption.model.ErrorResponse;

public interface ExceptionHandler {
    ErrorResponse handleException(Exception e);
}
