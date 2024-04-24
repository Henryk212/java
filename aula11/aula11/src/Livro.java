public class Livro {
    private String nome, genero, autor;
    private int qauntidade;
        public Livro(String nome, String genero, String autor, int qauntidade) {
            this.nome = nome;
            this.genero = genero;
            this.autor = autor;
            this.qauntidade = qauntidade;
        }



       


        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getGenero() {
            return genero;
        }
        public void setGenero(String genero) {
            this.genero = genero;
        }
        public String getAutor() {
            return autor;
        }
        public void setAutor(String autor) {
            this.autor = autor;
        }
        public int getQauntidade() {
            return qauntidade;
        }
        public void setQauntidade(int qauntidade) {
            this.qauntidade = qauntidade;
        }

        public boolean reduzirEstoque(){
            if(qauntidade > 0){
                qauntidade--;
                return true;
            }else{
                return false;
            }
        }
        public boolean aumentarEstoque(){
            if(qauntidade > 0){
                qauntidade++;
                return true;
            }else{
                return false;
            }
        }


        @Override
        public String toString() {
            return "Livro [nome=" + nome + ", genero=" + genero + ", autor=" + autor + ", qauntidade=" + qauntidade
                    + "]";
        }

        

   
}