import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        boolean on = true;
        int menuInput = 0;
        int kogus;
        int product;
        Toiduaine newProduct = null;
        String kustutamiseks;
        String toituNimi;
        String omaNimi;
        Double omaValgud;
        Double omaRasvad;
        Double omaSusivesikud;
        ArrayList<Toit> toituList = new ArrayList<>();



        Toiduaine kartul = new Toiduaine("Kartul", 2.0,0.1,17.0);
        Toiduaine hapukoor = new Toiduaine("Hapukoor", 2.0,20.0,3.0);
        Toiduaine vorst = new Toiduaine("Vorst", 14.0,31.0,1.1);
        Toiduaine sibul = new Toiduaine("Sibul", 1.1,0.1,9.34);
        Toiduaine porgand = new Toiduaine("Porgand", 0.63,0.20,5.56);

        //Toiduaine test = new Toiduaine("Test", 102.999,105.12,2.1);

        DeliContainer deliContainer = new DeliContainer();

        Scanner input = new Scanner(System.in);

        while (on) {
            while(menuInput < 1 || menuInput > 6) {
                System.out.println("1. Lisa toiduaine");
                System.out.println("2. Kustuta toiduaine");
                System.out.println("3. Vaata konteineri");
                System.out.println("4. Loe kokku");
                System.out.println("5. Lisa oma toiduaine");
                System.out.println("6. Valmista toidu konteinerist");
                System.out.println("7. Leia toiduaine");
                System.out.println("8. Toitu list");
                System.out.println("9. Lahku");
                System.out.println("---------------");
                menuInput = input.nextInt();
            }
            switch (menuInput) {
                case 1 :
                    System.out.println("Mida soovid lisada?");
                    deliContainer.productsToAdd();
                    product = 0;
                    while(product < 1 || product > 5) {
                        product = input.nextInt();
                        switch (product) {
                            case 1:
                                newProduct = kartul;
                                break;
                            case 2:
                                newProduct = hapukoor;
                                break;
                            case 3:
                                newProduct = vorst;
                                break;
                            case 4:
                                newProduct = sibul;
                                break;
                            case 5:
                                newProduct = porgand;
                                break;
                        }
                    }
                    System.out.println("Vajalik kogus");
                    kogus = input.nextInt();
                    Toidukomponent uusKogus = new Toidukomponent(kogus,newProduct);
                    deliContainer.addComponent(uusKogus);
                    break;
                case 2:
                    deliContainer.printList();
                    if (!(deliContainer.toidukomponentList.isEmpty())) {
                        System.out.println("Kirjutage mida tahate kustutada");
                         kustutamiseks = input.next();
                         deliContainer.removeComponent(kustutamiseks);
                    }
                    break;
                case 3:
                    deliContainer.printList();
                    break;
                case 4:
                    deliContainer.checkProducts();
                    break;
                case 5:
                    System.out.println("Toiduaine(nt: Õun): ");
                    omaNimi = input.next();
                    System.out.println("Valgud(nt: 2.0): ");
                    omaValgud = Double.valueOf(input.next());
                    System.out.println("Rasvad(nt: 3.0): ");
                    omaRasvad = Double.valueOf(input.next());
                    System.out.println("Süsivesikud(nt: 0.3): ");
                    omaSusivesikud = Double.valueOf(input.next());
                    Toiduaine omaToiduAine = new Toiduaine(omaNimi, omaValgud,omaRasvad,omaSusivesikud);
                    System.out.println("Kogus(nt 25): ");
                    kogus = input.nextInt();
                    Toidukomponent omaToidukomponent = new Toidukomponent(kogus,omaToiduAine);
                    deliContainer.addComponent(omaToidukomponent);
                    break;
                case 6:
                    System.out.println("Toidu nimetus(nt: Pitsa): ");
                    toituNimi = input.next();
                    Toit toit = new Toit(toituNimi, deliContainer);
                    toituList.add(toit);
                    deliContainer.cleanList();
                    break;
                case 7:
                    deliContainer.printList();
                    String nimetus = input.next();
                    deliContainer.findComponent(nimetus);
                    break;
                case 8:
                    System.out.println("Valmis toit: ");
                    for (Toit element:
                         toituList) {
                        System.out.println(element);
                    }
                    break;
                case 9:
                    on = false;
                    System.out.println("Nägemiseni");
                    break;

            }
            menuInput = 0;
        }

    }
}
