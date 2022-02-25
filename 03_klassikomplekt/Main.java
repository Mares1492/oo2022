public class Main {
    public static void main(String[] args) {
//        Arvuti arvuti = new Arvuti(new Info("asd","ads","da",1,1),1999);

        Info info = new Info("asd","ads","da",1,1);
        Arvuti arvuti = new Arvuti(info,1999);

        String arvutiInfo = arvuti.getInfo();
        System.out.println(arvutiInfo);
    }
}