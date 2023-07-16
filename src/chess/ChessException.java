package chess;

import boardgame.BoardExcepcion;

public class ChessException extends BoardExcepcion {
   private static final long serialVersionUID = 1L;

   public ChessException(String msg){
        super(msg);
   }
}
