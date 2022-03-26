package Assigment2;

public class Red extends Dragon implements DragonAttacker{
    /////////////////////     Attributes    /////////////////////
    public String sName;

    /////////////////////     Methods    /////////////////////
    public Red(DragonSize nSize, String sName) {
        super(nSize);
        this.sName = sName;
    }

    @Override
    public void defendAttack(Dragon obOther) {
        if (obOther.equals("Red")) {
            resurrect( 100 - getDefense() );
        }else if (obOther.equals("Green")){
            resurrect( 80 - getDefense() );
        }else if (obOther.equals("White")){
            resurrect( 120 - getDefense() );
        }else if (obOther.equals("Black")) {
            resurrect(100 - getDefense());
        }
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer( getClass().getName() );
        stringBuffer.append("Red");
        stringBuffer.append("[sName='" + sName );
        stringBuffer.append("']" );
        return stringBuffer.toString();
    }
}
