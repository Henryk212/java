public class Cafeteira {
    boolean ligada;
    int quantidadeCafe;
    int quantidadeAgua;

    public Cafeteira() {
        this.ligada = false;
        this.quantidadeCafe = 0;
        this.quantidadeAgua = 0;
    }

    public void ligar() {
        if (!ligada) {
            ligada = true;
        }
    }

    public void desligar() {
        if (ligada) {
            this.ligada = false;
        }
    }

    public void encherCafe(int cafe) {
        if (cafe > 0) {
            this.quantidadeCafe += cafe;
        }
    }

    public void encherAgua(int agua) {
        if (agua > 0) {
            this.quantidadeAgua += agua;
        }
    }

    public boolean fazerCafe() {
        if (this.ligada && this.quantidadeCafe >= 7 && this.quantidadeAgua >= 30) {
            this.quantidadeCafe -= 7;
            this.quantidadeAgua -= 30;
            return true;

        }
        return false;
    }

    public String status() {
        return "Cafeteira " + (ligada ? "ligada" : "desligada") + ", quantidade de café: " + quantidadeCafe
                + "g, quantidade de água: " + quantidadeAgua + "ml";
    }
}