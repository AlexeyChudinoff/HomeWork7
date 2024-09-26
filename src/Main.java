public class Main {

  public static void main(String[] args) {

//HW7 Test1
    System.out.println("HW7 Test1");
    int nakoplenie2 = 0;
    int otchislenie2 = 15000;
    int mounth = 0;
    while (nakoplenie2 <= 2_459_000) {
      nakoplenie2 = nakoplenie2 + otchislenie2;
      mounth++;
      System.out.println(
          "Месяц " + mounth + " сумма накоплений равна " + nakoplenie2 + " рублей");
    }

    //HW7 Test2
    System.out.println("HW7 Test2");
    int n = 0;
    while (n < 10) {
      n++;
      System.out.print(" " + n);
    }
    System.out.println();

    int n1 = 10;
    while (n1 > 0) {
      System.out.print(" " + n1);
      n1--;
    }
    System.out.println();
//HW7 Test3
    System.out.println("HW7 Test3");
    int people = 12_000_000;
    int year = 0;
    int smertnostNaTisachu = 17;
    int rogdaemostNaTisachu = 8;
    while (year <= 10) {
      people = people + (people / 1000 * 17) - (people / 1000 * 8);
      year++;
      System.out.println(" год " + year + "численность составляет " + people + " человек");
    }

//HW7 Test4
    System.out.println("HW7 Test4");
    int vklad = 15000;
    int mounth1 = 0;
    while (vklad <= 12_000_000) {
      vklad = vklad + (vklad / 100 * 7);
      mounth1++;
      System.out.println("Накопления за " + mounth1 + " месяц составляют " + vklad + " рублей");
    }

//HW7 Test5
    System.out.println("HW7 Test5");
    int vklad2 = 15000;
    int mounth2 = 0;
    while (vklad2 <= 12_000_000) {
      vklad2 = vklad2 + (vklad2 / 100 * 7);
      mounth2++;
      if (mounth2 % 6 == 0) {
        System.out.println("Накопления за " + mounth2 + " месяц составляют " + vklad2 + " рублей");
      }

    }
//HW7 Test6
    System.out.println("HW7 Test6");
    int vklad6 = 15000;
    int month6 = 0;
    while (month6 <= 108) { // 108 мес = 9лет * 12 мес. в году
      vklad6 = vklad6 + (vklad6 / 100 * 7);
      month6++;
      if (month6 % 6 == 0) {
        System.out.println("Накопления за " + month6 + " месяц составляют " + vklad6 + " рублей");
      }
    }

//HW7 Test7
    System.out.println("HW7 Test7");
    int friday = 3;
    do {
      System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет");
      friday += 7;
    } while (friday <= 31);

    //HW7 Test8
    System.out.println("HW7 Test8");
    int currentYear = 2024;
    int year1 = 0;
    int perDo = currentYear - 200;
    int perPosle = currentYear + 100;

    while (year1 <= perPosle) {
      year1 += 79;
      if (year1 >= perDo && year1 <= perPosle) {

        System.out.println(year1);

      }
    }


  }
}