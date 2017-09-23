package chess;

public final class Rook extends Piece
{
    //CONSTRUCTOR
    public Rook(int team, int x, int y)
    {
        this.team = team;
        this.x = x;
        this.y = y;
        setPrefix();
        setPiecetype();
    }  
    
    @Override
    chessPiece getPiecetype()
    {
        return this.type;
    }

    @Override
    void possibleMove(int nextX, int nextY)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void setPiecetype()
    {
        this.type = chessPiece.ROOK;
    }

    @Override
    void setPrefix()
    {
        this.prefix = "R";
    }
    
}
