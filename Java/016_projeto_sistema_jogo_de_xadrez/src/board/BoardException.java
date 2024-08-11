package board;

public class BoardException extends RuntimeException {
    private static final long serialVerisonUID = 1L;

    public BoardException(String message) {
        super(message);
    }
}