package Assigment2;

import java.util.ArrayList;
import java.util.Objects;

public class GameTest {
    public static void main(String[] args) {
        ArrayList<Dragon> dragons= new ArrayList<Dragon>();

        Red r11= new Red(DragonSize.Small, "SmallRed1");
        Red r12= new Red(DragonSize.Small, "SmallRed2");
        Red r13= new Red(DragonSize.Small, "SmallRed3");
        Red r21= new Red(DragonSize.Medium, "MediumRed1");
        Red r22= new Red(DragonSize.Medium, "MediumRed2");
        Red r23= new Red(DragonSize.Medium, "MediumRed3");
        Red r31= new Red(DragonSize.Large, "LargeRed1");
        Red r32= new Red(DragonSize.Large, "LargeRed2");
        Red r33= new Red(DragonSize.Large, "LargeRed3");

        Green g11= new Green(DragonSize.Small, "SmallGreen1");
        Green g12= new Green(DragonSize.Small, "SmallGreen2");
        Green g13= new Green(DragonSize.Small, "SmallGreen3");
        Green g21= new Green(DragonSize.Medium, "MediumGreen1");
        Green g22= new Green(DragonSize.Medium, "MediumGreen2");
        Green g23= new Green(DragonSize.Medium, "MediumGreen3");
        Green g31= new Green(DragonSize.Large, "LargeGreen1");
        Green g32= new Green(DragonSize.Large, "LargeGreen2");
        Green g33= new Green(DragonSize.Large, "LargeGreen3");

        White w11= new White(DragonSize.Small, "SmallWhite1");
        White w12= new White(DragonSize.Small, "SmallWhite2");
        White w13= new White(DragonSize.Small, "SmallWhite3");
        White w21= new White(DragonSize.Medium, "MediumWhite1");
        White w22= new White(DragonSize.Medium, "MediumWhite2");
        White w23= new White(DragonSize.Medium, "MediumWhite3");
        White w31= new White(DragonSize.Large, "LargeWhite1");
        White w32= new White(DragonSize.Large, "LargeWhite2");
        White w33= new White(DragonSize.Large, "LargeWhite3");

        Black b11= new Black(DragonSize.Small, "SmallBlack1");
        Black b12= new Black(DragonSize.Small, "SmallBlack2");
        Black b13= new Black(DragonSize.Small, "SmallBlack3");
        Black b21= new Black(DragonSize.Medium, "MediumBlack1");
        Black b22= new Black(DragonSize.Medium, "MediumBlack2");
        Black b23= new Black(DragonSize.Medium, "MediumBlack3");
        Black b31= new Black(DragonSize.Large, "LargeBlack1");
        Black b32= new Black(DragonSize.Large, "LargeBlack2");
        Black b33= new Black(DragonSize.Large, "LargeBlack3");

        dragons.add(r11);
        dragons.add(r12);
        dragons.add(r13);
        dragons.add(r21);
        dragons.add(r22);
        dragons.add(r23);
        dragons.add(r31);
        dragons.add(r32);
        dragons.add(r33);

        dragons.add(g11);
        dragons.add(g12);
        dragons.add(g13);
        dragons.add(g21);
        dragons.add(g22);
        dragons.add(g23);
        dragons.add(g31);
        dragons.add(g32);
        dragons.add(g33);

        dragons.add(w11);
        dragons.add(w12);
        dragons.add(w13);
        dragons.add(w21);
        dragons.add(w22);
        dragons.add(w23);
        dragons.add(w31);
        dragons.add(w32);
        dragons.add(w33);

        dragons.add(b11);
        dragons.add(b12);
        dragons.add(b13);
        dragons.add(b21);
        dragons.add(b22);
        dragons.add(b23);
        dragons.add(b31);
        dragons.add(b32);
        dragons.add(b33);

        for (Dragon d1 : dragons){
            for (Dragon d2 : dragons) {
                battleRound(d1,d2);
            }
            d1.resurrect(d1.getNumAttacksPerTurn());
        }
        for (Dragon d : dragons) {
            System.out.println(d.toString());
        }
    }

    public static Dragon battleRound(Dragon obDragon1, Dragon obDragon2){
        Dragon first;
        Dragon other;
        if(obDragon1.getInitiative()>obDragon2.getInitiative()) {
            first = obDragon1;
            other = obDragon2;
        } else if(obDragon1.getInitiative()<obDragon2.getInitiative()) {
            first = obDragon2;
            other = obDragon1;
        }else {
            first = obDragon1;
            other = obDragon2;
        }
        first.getNumAttacksPerTurn();
        other.getNumAttacksPerTurn();
        first.getAttack();
        while(true){
            first.defendAttack(other);
            if(other.isDead())
                return first;
            else if(first.isDead())
                return other;

        }

    }
}
