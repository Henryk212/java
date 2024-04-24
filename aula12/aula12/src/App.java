import animal.Animal;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("#####  HERANÇA ######");

        Animal gato = new Gato("bili ", "mia");

        Cachorro dog = new Cachorro();
        dog.setNome("Ursinho");
        dog.setSom("au au");
        dog.setFome(true);
        dog.setDormindo(false);

    }


}
