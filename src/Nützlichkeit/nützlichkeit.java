package Nützlichkeit;


import Arbeiter.arbeiter;
import Behinderter.behinderterArbeiter;
import Faul.faulArbeiter;
import Gut.gutArbeiter;
import Kind.kindArbeiter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class nützlichkeit {
    public static int getRandomNumber(int pMinWert, int pMaxWert){
        return new Random().nextInt(pMaxWert) + pMinWert;
    }
    public static List<arbeiter> randomWorkergenerieren(int pAnzahl){
        List<arbeiter> arbeiterList = new ArrayList<arbeiter>();

        for(int index = 0; index < pAnzahl; index++){
            int randomNumberForWorkerType = nützlichkeit.getRandomNumber(0, 4);
            switch (randomNumberForWorkerType){
                case 0:
                    behinderterArbeiter behinderterArbeiter = new behinderterArbeiter();
                    arbeiterList.add(behinderterArbeiter);
                    break;
                case 1:
                    faulArbeiter faulArbeiter = new faulArbeiter();
                    arbeiterList.add(faulArbeiter);
                    break;
                case 2:
                    kindArbeiter kindArbeiter = new kindArbeiter();
                    arbeiterList.add(kindArbeiter);
                    break;
                case 3:
                    gutArbeiter gutArbeiter = new gutArbeiter();
                    arbeiterList.add(gutArbeiter);
                    break;
            }
        }
        return arbeiterList;
    }

    public static int berechnenTotalMoney(List<arbeiter> pArbeitList){
        int totalMoney = 0;

        for (int index =0 ; index < pArbeitList.size(); index++){
            totalMoney += pArbeitList.get(index).preisBerechnen();
        }

         return totalMoney;
    }
}
