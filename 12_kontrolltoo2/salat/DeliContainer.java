import java.util.ArrayList;
import java.util.Objects;



public class DeliContainer {
    String kustuseks;
    ArrayList<Toidukomponent> toidukomponentList = new ArrayList<>();


    public boolean addComponent(Toidukomponent toidukomponent) {
        toidukomponentList.add(toidukomponent);
        System.out.println(toidukomponent.toiduaine.nimetus + " edukalt lisatud!");
        System.out.println("--------------");
        return true;
    }

    public boolean findComponent(String nimetus) {
        if (!(toidukomponentList.isEmpty())) {
            for (Toidukomponent component: toidukomponentList) {
                if (Objects.equals(component.toiduaine.nimetus, nimetus)) {
                    System.out.println(component.toiduaine.nimetus);
                    System.out.println("Valgud: " + component.toiduaine.valgud);
                    System.out.println("Süsivesikud: " + component.toiduaine.susivesikud);
                    System.out.println("Rasvad: " + component.toiduaine.rasvad);
                    System.out.println("--------------");
                }
            }
            return true;
        }
        System.out.println("Konteiner on tühi");
        return false;
    }
    public boolean removeComponent(String nimetus) {
        if (!(toidukomponentList.isEmpty())) {
            toidukomponentList.removeIf(component ->
                    Objects.equals(component.toiduaine.nimetus, nimetus));
            System.out.println("Edukalt kustutatud");
            System.out.println("--------------");
            return true;
        }
        return false;
    }

    public void printList() {
        if (!(toidukomponentList.isEmpty())) {
            for (Toidukomponent component : toidukomponentList) {
                System.out.println(component.toiduaine.nimetus);
                System.out.println("Valgud: " + component.toiduaine.valgud);
                System.out.println("Süsivesikud: " + component.toiduaine.susivesikud);
                System.out.println("Rasvad: " + component.toiduaine.rasvad);
                System.out.println("--------------");
            }
        }else {
            System.out.println("Hetkel tühi");
            System.out.println("--------------");
        }


    }

    public void productsToAdd() {
        System.out.println("1. Kartul");
        System.out.println("2. Hapukoor");
        System.out.println("3. Vorst");
        System.out.println("4. Sibul");
        System.out.println("5. Porgand");

    }

    public boolean checkProducts() {
        double rasvad = 0;
        double valgud = 0;
        double susivesikud = 0;
        if (!(toidukomponentList.isEmpty())) {
            for (Toidukomponent component : toidukomponentList) {
                rasvad += component.toiduaine.rasvad;
                valgud += component.toiduaine.valgud;
                susivesikud += component.toiduaine.susivesikud;
            }
            System.out.println("Rasvad kokku: " + rasvad);
            System.out.println("Valgud kokku: " + valgud);
            System.out.println("Süsivesikud kokku: " + susivesikud);
            System.out.println("--------------");
            return true;
        }
        else {
            System.out.println("Hetkel tühi");
            System.out.println("--------------");
            return false;
        }
    }

    public void cleanList() {
        for (Toidukomponent toidukomponent : toidukomponentList) {
            toidukomponentList.remove(toidukomponent);
        }
    }

}
