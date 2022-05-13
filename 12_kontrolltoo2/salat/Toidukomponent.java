public class Toidukomponent {
    Toiduaine toiduaine;
    Integer kogus;
    public Toidukomponent(Integer kogus, Toiduaine toiduaine) {
        this.kogus = kogus;
        this.toiduaine = toiduaine;
    }
    public Double checkFat() {
        Double result  = (toiduaine.rasvad / 100) * kogus;
//        System.out.println(toiduaine.nimetus+ "↓");
//        System.out.println(result + "g rasva");
//        System.out.println("-------------------");
        return result;
    }
    public Double checkCarbohydrates() {
        Double result  = (toiduaine.susivesikud / 100) * kogus;
//        System.out.println(toiduaine.nimetus+ "↓");
//        System.out.println(result + "g rasva");
//        System.out.println("-------------------");
        return result;
    }
    public Double checkProteins() {
        Double result  = (toiduaine.valgud / 100) * kogus;
//        System.out.println(toiduaine.nimetus+ "↓");
//        System.out.println(result + "g rasva");
//        System.out.println("-------------------");
        return result;
    }
}
