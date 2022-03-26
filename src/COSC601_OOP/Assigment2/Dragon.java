package Assigment2;

import AssignmentUML.AssignmentUML5.busDepotApp.Bus;

public abstract class Dragon implements Comparable<Dragon> ,DragonAttacker {

    /////////////////////     Attributes    /////////////////////

    private int nAttackRank;
    private int nDefenseRank;
    private int nHitPoints;
    private int nInitiative;
    private DragonSize nSize;

    /////////////////////     Methods    /////////////////////

    Dragon(DragonSize nSize){
        if (nSize== DragonSize.Small){
            nHitPoints = 51 + (int)(Math.random() * ((70 - 51) + 1));
            nInitiative = 40 + (int)(Math.random() * ((60 - 40) + 1));
            nAttackRank = 36 + (int)(Math.random() * ((50 - 36) + 1)) - 30;
            nDefenseRank = 10 + (int)(Math.random() * ((19 - 10) + 1));
        }else  if (nSize== DragonSize.Medium){
            nHitPoints = 71 + (int)(Math.random() * ((85 - 71) + 1));
            nInitiative = 20 + (int)(Math.random() * ((40 - 20) + 1));;
            nAttackRank = 51 + (int)(Math.random() * ((60 - 51) + 1)) - 20;
            nDefenseRank = 20 + (int)(Math.random() * ((29 - 20) + 1));
        }else  if (nSize== DragonSize.Large){
            nHitPoints = 86 + (int)(Math.random() * ((100 - 86) + 1));
            nInitiative = 0 + (int)(Math.random() * ((10 - 0) + 1));;
            nAttackRank = 61 + (int)(Math.random() * ((70 - 61) + 1));
            nDefenseRank = 29 + (int)(Math.random() * ((35 - 29) + 1));
        }
    }

    public int getInitiative(){
        return  nInitiative;
    }

    public int getNumAttacksPerTurn(){
        if(nSize ==DragonSize.Small)
            return 3;
        else if(nSize ==DragonSize.Medium)
            return 2;
        else if(nSize ==DragonSize.Large)
            return 1;
        else
            return -1;
    }
    public int getAttack(){
        return nAttackRank;
    }

    public int getDefense(){
        return nDefenseRank;
    }

    public boolean isDead(){
        return (nHitPoints<=0);
    }

    public void resurrect(int nHitPoints){
        this.nHitPoints= nHitPoints;
    }

    public DragonSize getSize() {
        return nSize;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer( getClass().getName() );
        stringBuffer.append("Dragon[");
        stringBuffer.append("nAttackRank=" + nAttackRank);
        stringBuffer.append(", nDefenseRank=" + nDefenseRank);
        stringBuffer.append( ", nHitPoints=" + nHitPoints);
        stringBuffer.append(", nInitiative=" + nInitiative);
        stringBuffer.append(", nSIze=" + nSize);
        stringBuffer.append("']" );
        return stringBuffer.toString();
    }

    @Override
    public int compareTo(Dragon dragon){
        if(this.nHitPoints== dragon.nHitPoints)
            return 0;
        else if(this.nHitPoints>dragon.nHitPoints)
            return 1;
        else
            return -1;
    }

}
