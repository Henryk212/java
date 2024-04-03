import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class App {
    public static void main(String[] args) throws Exception {
        // é melhor para buscas e acesso aleatorio
        List<String> arraList = new ArrayList<>();
        arraList.add("Java");
        arraList.add("PHP");
        arraList.add("C#");

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("PHP");
        linkedList.add("C#");

        System.out.println(arraList);
        System.out.println(linkedList);

        linkedList.replaceAll(elemento -> elemento.equals("C#")? "C++" : elemento);
        linkedList.removeIf(e -> e.equals("C++"));
        linkedList.addAll(Arrays.asList("python", "HTML", "CSS"));

        linkedList.forEach(System.out::println);

        int[] i = {0};
        arraList.forEach(e -> System.out.println("Valor: " + (i[0]++)+ " " + e));

        for (int j : i){
            System.out.println("O valor atual é " + j);
        }

        Aluno aluno = new Aluno("Pedro", new ArrayList<>());

        String[] nomeMateria = {"python", "HTML", "CSS","Java","JavaScript"};

        for (String mat : nomeMateria){
            aluno.getMateria().add(new Materia(mat));
        }

        System.out.println(aluno);

        Materia html = new Materia("HTML");

        Materia novaMat = new Materia(null);

        for (Materia mat : aluno.getMateria()) {
            if(mat.getNome().equals("HTML")){
                novaMat = mat;
            }
        }

        aluno.getMateria().remove(novaMat);

        System.out.println(aluno);

        System.out.println("Verificando se o objeto esta no vetor "+  aluno.getMateria().contains(html));


        aluno.getMateria().set(3, html);
        System.out.println(aluno);

        System.out.println("\n ///////////////////// STREAM EM jAVA ////////////////////\n");

        Materia php = aluno.getMateria()
            .stream()
            .filter(e -> e.getNome().equals("PHP"))
            .findFirst()
            .orElse(null);

            System.out.println("Materia PHP " + php);

            System.out.println(aluno);

            List<Materia> listaNova = aluno.getMateria()
                .stream()
                .map(m -> new Materia(m.getNome() + " !"))
                .collect(Collectors.toList());

           System.out.println(listaNova);    
           
           aluno.getMateria().add(new Materia("PHP"));

           listaNova = aluno.getMateria()
                .stream()
                .filter(m -> m.getNome().equals("PHP"))
                .collect(Collectors.toList());

                System.out.println(listaNova);

           System.out.println(
            aluno.getMateria()
                .stream()
                .map(Materia::getNome)
                .reduce("Materia: ",(novaString, StringIteradora) -> novaString + StringIteradora + ", " )
           );     


           System.out.println("\n ///////////////////// STREAM EM jAVA ////////////////////\n");
//Set não permite itens duplicados 
//HasSet não mantem a ordem
        //    Set<String> set = new HashSet<>();
        //    set.add("java");
        //    set.add("PHP");
        //    set.add("javaScript");
        //    set.add("C++");
        //    set.add("C#");
        //    set.add("Cobol");
        //    set.add("CSS");

           // linkedHesSet mantem a ordem
        //    Set<String> set = new LinkedHashSet<>();
        //    set.add("java");
        //    set.add("PHP");
        //    set.add("javaScript");
        //    set.add("C++");
        //    set.add("C#");
        //    set.add("Cobol");
        //    set.add("CSS");

           Set<String> set = new TreeSet<>();
           set.add("java");
           set.add("PHP");
           set.add("PHP");
           set.add("PHP");
           set.add("PHP");
           set.add("javaScript");
           set.add("C++");
           set.add("C#");
           set.add("Cobol");
           set.add("CSS");



           System.out.println(set);
           System.out.println(aluno.getMateria());

           Set<Materia> setMateria = new TreeSet<>();
           setMateria.addAll(aluno.getMateria());
           System.out.println(setMateria);

    }
}
