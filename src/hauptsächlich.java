import Arbeiter.arbeiter;
import Nützlichkeit.nützlichkeit;

import java.util.List;

public class hauptsächlich {
    public static void main(String[] args) {
        int randomNumberForWorkerCount = nützlichkeit.getRandomNumber(2,5);

        List<arbeiter> arbeiterList = nützlichkeit.randomWorkergenerieren(randomNumberForWorkerCount);

        int totalMoney = nützlichkeit.berechnenTotalMoney(arbeiterList);

        System.out.println("Total money payable to workers : " + totalMoney);
    }
}
