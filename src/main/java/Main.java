public class Main {
    public static void main(String[] args) {
        // simulate the passing of time
        int startingYear = 2000;
        int targetYear = 2011;
        int currentYear = startingYear;
        while (currentYear < targetYear) {
            if (currentYear != startingYear) {
               int yearDifference = (currentYear - startingYear);
               String sentenceEnder = "";
               if (yearDifference <= 1) {
                   sentenceEnder = " year has passed";
               }
               else {
                   sentenceEnder = " years have passed";
               }
                System.out.println((yearDifference) +  sentenceEnder);
            } 
            // else {
            //     System.out.println("Current year and Starting year are the same!");
            // }

            // conditional logic based on the current year
            currentYear++;
        }
        currentYear = startingYear;

        for (int i = currentYear; i < targetYear; i++) {
            if (i != startingYear) {
                int yearDifferenceLoop = (i - startingYear);
                String sentenceEnderLoop = "";
                if (yearDifferenceLoop == 1){
                    sentenceEnderLoop = " year has passed";
                }
                else {
                    sentenceEnderLoop = " years have passed";
                }
                System.out.println((yearDifferenceLoop) + sentenceEnderLoop);
                // System.out.println((i - startingYear) + " year(s) have passed");
            }
        }
    }
}
