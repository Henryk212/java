import java.time.LocalDate;

import org.w3c.dom.events.Event;

import pacote.ContaBancaria;
import pacote.Evento;
import pacote.Pessoa;
import pacote.SistemaReserva;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("###################");
        System.out.println("### Exercício 01 ###");
        ContaBancaria conta = new ContaBancaria(123, "João");
        conta.depositar(5000);
        conta.sacar(50);
        System.out.println(conta);

        System.out.println("###################");
        System.out.println("### Exercício 02 ###");

        SistemaReserva reserva = new SistemaReserva();
        reserva.setNomeCliente("Pedro França");
        reserva.setNumeroPessoas(5);
        reserva.setData(LocalDate.now());
        reserva.setValorReserva(100);
        System.out.println(reserva.exibirReserva());

        System.out.println("###################");
        System.out.println("### Exercício 03 ###");

        Evento evento = new Evento("Show do Metallica", "10/10/2021", 100, 1000);
        evento.venderIngresso(10);
        evento.venderIngresso(10);
        evento.venderIngresso(10);
        System.out.println(evento.verArrecadacao());

    }
}
