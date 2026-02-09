public class Interface{
    public static void main(String[] args) {
        Queen queen=new Queen();
        queen.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Queen moves in any direction");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("King moves in any direction but one step");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Rook moves in straight line");
    }
}
class Bishop implements ChessPlayer{
    public void moves(){
        System.out.println("Bishop moves in diagonal");
    }
}
class Knight implements ChessPlayer{
    public void moves(){
        System.out.println("Knight moves in L shape");
    }
}