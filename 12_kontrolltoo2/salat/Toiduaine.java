public class Toiduaine {
    String nimetus;
    Double valgud;
    Double rasvad;
    Double susivesikud;

    public Toiduaine(  String nimetus,  Double valgud,  Double rasvad,  Double susivesikud) {
        if (valgud + rasvad + susivesikud < 100) {
            this.nimetus = nimetus;
            this.valgud = valgud;
            this.rasvad = rasvad;
            this.susivesikud = susivesikud;
        }

    }

    public Boolean checkPercentage() {
        if (valgud == null && rasvad ==  null && susivesikud ==  null) {
            System.out.println("Valed andmed");
            System.out.println("---------------------------");
            return false;
        }
        System.out.println(nimetus + " ↓¦↓");
        System.out.println("valgud: " + valgud + "%");
        System.out.println("rasvad: " + rasvad + "%");
        System.out.println("susivesikud: " + susivesikud + "%");
        System.out.println("---------------------------");
        return true;
    }



}
