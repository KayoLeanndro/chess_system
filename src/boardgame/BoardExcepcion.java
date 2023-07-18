package boardgame;

public class BoardExcepcion extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public BoardExcepcion(String msg) {
        super(msg);
    }
}
