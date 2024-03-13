package pacote;

import java.time.LocalDate;

public class SistemaReserva {
    private String nomeCliente;
    private int numeroPessoas;
    private LocalDate data;
    private double valorReserva;

    public void setNomeCliente( String nomeCliente ) {
        this.nomeCliente = nomeCliente;
    }
    public String getNomeCliente() {
        return this.nomeCliente;
    }
    public void setNumeroPessoas( int numeroPessoas ) {
        this.numeroPessoas = numeroPessoas;
    }
    public int getNumeroPessoas() {
        return this.numeroPessoas;
    }
    public void setData( LocalDate data ) {
        this.data = data;
    }
    public LocalDate getData() {
        return this.data;
    }
    public void setValorReserva( double valorReserva ) {
        this.valorReserva = valorReserva;
    }
    public double getValorReserva() {
        return this.valorReserva;
    }

    public float calcularValorTotal() {
        return (float) (this.valorReserva * this.numeroPessoas);
    }
    public String exibirReserva() {
        return "Reserva [data=" + data + ", nomeCliente=" + nomeCliente + ", numeroPessoas=" + numeroPessoas + ", valorReserva=" + valorReserva + "]";
    }

}
