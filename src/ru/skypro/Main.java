package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        System.out.println("Pervoe zadanie");
        System.out.println("");
        int snow = 12;
        byte rain = 123;
        short sun = 250;
        long fog = 32123L;
        float hail = 1.34f;
        double ice = 0.65665435;
        char weather = '+';
        boolean nowSunny = sun > 200;


    // Задание 2
        System.out.println("Vtoroe zadanie");
        float firstBoxer = 78.2f;
        System.out.println("Ves pervogo boksera - " + firstBoxer + " kg");
        float secondBoxer = 82.7f;
        System.out.println("Ves vtorogo boksera - " + secondBoxer + " kg");
        float totalWeight = firstBoxer + secondBoxer;
        System.out.println("Obshyi ves bokserov - " + totalWeight + " kg");
        float differenceWeight = secondBoxer - firstBoxer;
        System.out.println("Raznica v vese bokserov - " + differenceWeight + " kg");
        System.out.println("");


    // Задание 3
        System.out.println("Tretie zadanie");
        byte neadBananas = 5;
        byte bananaWeight = 80;
        int bananasInSmuzi = neadBananas * bananaWeight;
        byte neadMilk = 2;
        byte milkWeight = 105;
        int milkInSmuzi = neadMilk * milkWeight;
        byte neadIceCream = 2;
        byte iceCreamWeeight = 100;
        int iceCreamInSmuzi = neadIceCream * iceCreamWeeight;
        byte neadEggs = 4;
        byte eggWeight = 70;
        int eggsInSmuzi = neadEggs * eggWeight;
        int smuziWeigtGrams = bananasInSmuzi + milkInSmuzi + iceCreamInSmuzi + eggsInSmuzi;
        System.out.println("Ves smuzi v grammah - " + smuziWeigtGrams + "gr.");
        double smuziWeightKg = (double) smuziWeigtGrams / 1000;
        System.out.println("Ves smuzi v kilogrammah - " + smuziWeightKg + "kg.");
        System.out.println("");


    // Задание 4
        System.out.println("Chetvertoe zadanie");
        byte nujnoSbrosit = 7;
        short dieta250 = 257;
        short dieta500 = 313;
        float sbrosPo250 = (float) nujnoSbrosit * 1000 / dieta250;
        System.out.println("Nujno sidet na diete 250 - " + sbrosPo250 + " dnei");
        float sbrosPo500 = (float) nujnoSbrosit * 1000 / dieta500;
        System.out.println("Nujno sidet na diete 500 - " + sbrosPo500 + " dnei");
        float srednyayaDieta = (sbrosPo250 + sbrosPo500) / 2;
        System.out.println("V srednem dieta prodlitsya - " + srednyayaDieta + " dnei");
        System.out.println("");
    // Задал тип переменных float для более гибкого решения. Чтобы можно было задавать не только кратные тысячи значения в переменные похудания.


    // Задание 5
        System.out.println("Pyatoe zadanie");
        int zpMashaDo = 67_760;
        double zpMashaPosle = zpMashaDo * 0.1 + zpMashaDo;
        int godovayaZpMashaDo = zpMashaDo * 12;
        double godovayaZpMashaPosle = zpMashaPosle * 12;
        double dohodZaGodMasha = godovayaZpMashaPosle - godovayaZpMashaDo;
        System.out.println("Mesyachnaya zp Mashi do povysheniya - " + zpMashaDo + " rub.");
        System.out.println("Mesyachnaya zp Mashi posle povysheniya - " + zpMashaPosle + " rub.");
        System.out.println("Godovaya zp Mashi do povysheniya - " + godovayaZpMashaDo + " rub.");
        System.out.println("Godovaya zp Mashi posle povysheniya - " + godovayaZpMashaPosle + " rub.");
        System.out.println("Godovoi dohod Mashi vyros na - " + dohodZaGodMasha + " rub.");
        System.out.println("");
        int zpDenisDo = 83_690;
        double zpDenisPosle = zpDenisDo * 0.1 + zpDenisDo;
        int godovayaZpDenisDo = zpDenisDo * 12;
        double godovayaZpDenisPosle = zpDenisPosle * 12;
        double dohodZaGodDenis = godovayaZpDenisPosle - godovayaZpDenisDo;
        System.out.println("Mesyachnaya zp Kristiny do povysheniya - " + zpDenisDo + " rub.");
        System.out.println("Mesyachnaya zp Denisa posle povysheniya - " + zpDenisPosle + " rub.");
        System.out.println("Godovaya zp Denisa do povysheniya - " + godovayaZpDenisDo + " rub.");
        System.out.println("Godovaya zp Denisa posle povysheniya - " + godovayaZpDenisPosle + " rub.");
        System.out.println("Godovoi dohod Denisa vyros na - " + dohodZaGodDenis + " rub.");
        System.out.println("");
        int zpKristinaDo = 76_230;
        double zpKristinaPosle = zpKristinaDo * 0.1 + zpKristinaDo;
        int godovayaZpKristinaDo = zpKristinaDo * 12;
        double godovayaZpKristinaPosle = zpKristinaPosle * 12;
        double dohodZaGodKristina = godovayaZpKristinaPosle - godovayaZpKristinaDo;
        System.out.println("Mesyachnaya zp Kristiny do povysheniya - " + zpKristinaDo + " rub.");
        System.out.println("Mesyachnaya zp Kristiny posle povysheniya - " + zpKristinaPosle + " rub.");
        System.out.println("Godovaya zp Kristiny do povysheniya - " + godovayaZpKristinaDo + " rub.");
        System.out.println("Godovaya zp Kristiny posle povysheniya - " + godovayaZpKristinaPosle + " rub.");
        System.out.println("Godovoi dohod Kristiny vyros na - " + dohodZaGodKristina + " rub.");











    }
}
