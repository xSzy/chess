package chess;

/**
 *
 * @author LarryxD
 */

//cac loai piece
enum chessPiece
{
    ROOK,
    KNIGHT,
    BISHOP,
    QUEEN,
    KING,
    PAWN
}

public abstract class Piece
{
    //team ?
    public int team;
    //vi tri hien tai cua piece
    public int x, y;
    //prefix cua piece
    public String prefix;
    //quan nay la quan gi ?
    chessPiece type;
    //xem no la quan gi nao
    abstract chessPiece getPiecetype();
    //xem no di duoc nhung nuoc ntn
    abstract void possibleMove(int nextX, int nextY);
    //dat. cho no 1 loai quan
    abstract void setPiecetype();
    //dat prefix cho quan do
    abstract void setPrefix();
    //team nao the em ei
    int getTeam()
    {
        return team;
    }
    //dat team cho piece
    void setTeam(int team)
    {
        this.team = team;
    }
}
