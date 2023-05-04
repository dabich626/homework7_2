// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task3();
        task4();
        task5();
        task6();
        }

    private static void task6() {
        int salary = 15000;
        int bankPercent = (salary/100)*7;
        int mounth = 0;
        int totalSaved = 15000;
        while(mounth<108){
            mounth = mounth + 1;
            bankPercent = (totalSaved/100)*7;
            totalSaved = totalSaved+bankPercent;
            if (mounth%6 ==0){
                System.out.println("месяц " + mounth + " сумма на счете " + totalSaved);
            }
        }
    }

    private static void task5() {
        ///видоизменено ниже в задаче 4
    }

    private static void task3() {
        int totalY = 12000000;
        int fertility = 17/1000;
        int mortality = 8/1000;
        int growth = fertility - mortality;
        int naturalGrowth =  + (growth/totalY)*1000;
        int totalGrowth = totalY+naturalGrowth;
        System.out.println("в первый год численность населения составит " + totalGrowth);
        int year = 0;
        while(year<10){
            year = year + 1;
            totalGrowth = totalGrowth + naturalGrowth;
            System.out.println("год " + year + ". население страны Y составляет: " + totalGrowth);
        }
        }



    private static void task4() {
        int firstDeposit = 15000;
        int bankBonuse = firstDeposit/100*7;
        System.out.println("бонус банка за один месяц " + bankBonuse);
        int mounth = 0;
        int totalSavedMoney = 15000;
        int bankBonuse1 = totalSavedMoney/100*7;
        while(totalSavedMoney<12000000){
            mounth = mounth + 1;
            bankBonuse1 = totalSavedMoney/100*7;
            totalSavedMoney = totalSavedMoney + bankBonuse1;
            if(mounth%6 == 0){
            System.out.println("месяц " + mounth + ". сумма накоплений на счете составляет " +totalSavedMoney);}
        }
    }
}
