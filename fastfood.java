
import javax.swing.*;

public class fastfood {

    static double n1, pagar, total, diferenca, continuarpag;
    static int refeicao, escolha, quantidade, adicional, completo, pronto, cartao, a, i;

    public static double desconto(int d1, double d2) {
        double resultado = 0;

        if (d1 == 1) {
            resultado = (d2 * 10) / 100;
        } else if (d1 == 2) {
            resultado = (d2 * 20) / 100;
        } else if (d1 == 3) {
            resultado = (d2 * 30) / 100;
        }
        return resultado;
    }

    public static double diferencas(double d1, double d2) {
        diferenca = d1 - d2;
        return diferenca;
    }

    public static void Cardapio() {

        {
            refeicao = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "ZANNNNONI" + "\nEscolha sua refeicao" + "\n[1] Cafe da manha" + "\n[2] Almoco" + "\n[3] Janta"));

            if (refeicao == 1)
                Cafe(refeicao);
            else if (refeicao == 2)
                Almoco(refeicao);
            else if (refeicao == 3)
                Janta(refeicao);
        }
    }

    public static void Cafe(int refeicao) {
        escolha = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Café da manha escolhas " + "\n[1] Bolo de cenoura + cafe     \t8.00"
                        + "\n[2] Bolo de chocolate + cafe  \t8.00" + "\n[3] Pao com queijo derretido + cafe   \t12.00"
                        + "\n[4] Pao com ovo + cafe      \t12.00" + "\n[5] Apenas café    \t3.00"));

        quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade? "));

        if (escolha == 1) {
            n1 = 8 * quantidade;
        } else if (escolha == 2) {
            n1 = 8 * quantidade;
        } else if (escolha == 3) {
            n1 = 12 * quantidade;
        } else if (escolha == 4) {
            n1 = 12 * quantidade;
        } else if (escolha == 5) {
            n1 = 3 * quantidade;

        }

        adicional = Integer
                .parseInt(JOptionPane.showInputDialog("Algo a mais? :" + "\n[1]Sim" + "\n[2]Nao" + "\nEscolha: "));
        if (adicional == 1) {
            Cardapio();
        } else if (adicional == 2) {
            pronto = Integer
                    .parseInt(JOptionPane.showInputDialog("Seu lanche ta completo? " + "\n[1]Sim" + "\n[2]Nao"));

            if (pronto == 1)
                Pagamento();
            if (pronto == 2)
                Cafe(refeicao);
        }

    }

    public static void Almoco(int refeicao) {
        escolha = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Escolhas de  Almoco" + "\n[1] Arroz, feijao e bife a milanesa  \t59.00"
                        + "\n[2] Macarrao, molho de tomate e carne moida  \t59.00"
                        + "\n[3] Arroz, feijao e picanha      \t99.00" + "\n[4] Prato da casa          \t79.00"
                        + "\n[5] Arroz, feijao e bife com batata frita      \t29.00"));

        quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a quantidade?"));

        if (escolha == 1) {
            n1 = 59 * quantidade;
        } else if (escolha == 2) {
            n1 = 59 * quantidade;
        } else if (escolha == 3) {
            n1 = 99 * quantidade;
        } else if (escolha == 4) {
            n1 = 79 * quantidade;
        } else if (escolha == 5) {
            n1 = 35 * quantidade;
        }

        adicional = Integer
                .parseInt(JOptionPane.showInputDialog("Algo mais?:" + "\n[1]Sim" + "\n[2]Nao" + "\nEscolha: "));
        if (adicional == 1) {
            Cardapio();
        } else if (adicional == 2) {
            pronto = Integer.parseInt(JOptionPane.showInputDialog("Pedido completo? " + "\n[1]Sim" + "\n[2]Nao"));

            if (pronto == 1)
                Pagamento();
            if (pronto == 2)
                Almoco(refeicao);
        }
    }

    public static void Janta(int refeicao) {
        escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha de janta" + "\n[1] Pizza       \t59.00"
                + "\n[2] Salada  \t29.00" + "\n[3] Anchova grelhada           \t89.00"
                + "\n[4] Picanha ao ponto            \t99.00" + "\n[5] Hamburguer       \t35.00"));

        quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade?"));

        if (escolha == 1) {
            n1 = 59 * quantidade;
        } else if (escolha == 2) {
            n1 = 29 * quantidade;
        } else if (escolha == 3) {
            n1 = 89 * quantidade;
        } else if (escolha == 4) {
            n1 = 99 * quantidade;
        } else if (escolha == 5) {
            n1 = 35 * quantidade;
        }

        adicional = Integer
                .parseInt(JOptionPane.showInputDialog("Algo a mais?:" + "\n[1]Sim" + "\n[2]Nao" + "\nEscolha: "));
        if (adicional == 1) {
            Cardapio();
        } else if (adicional == 2) {
            pronto = Integer.parseInt(JOptionPane.showInputDialog("Pedido completo? " + "\n[1]Sim" + "\n[2]Nao"));

            if (pronto == 1)
                Pagamento();
            if (pronto == 2)
                Janta(refeicao);
        }
    }

    public static void Pagamento() {

        cartao = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Tem cartão da nossa empresa para descontos ? " + " \n[1]Sim" + " \n[2]Nao"));

        if (cartao == 1) {

            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual seu cartao para descontos? " + " \n[1]Cliente"
                    + " \n[2]Cliente da casa" + " \n[3]Cliente fiel"));

            total = n1 - desconto(a, n1);

            continuarpag = Integer.parseInt(JOptionPane.showInputDialog(
                    " O valor de compra eh de " + total + " \n Deseja continuar?" + " \n[1]Sim " + " \n[2]Nao"));

            if (continuarpag == 1)
                pagar = Double.parseDouble(JOptionPane.showInputDialog("Coloque seu dinheiro: "));
            if (pagar >= total) {
                JOptionPane.showMessageDialog(null, "Compra bem sucedida de " + quantidade + " " + PEDIDOS[0]
                        + "\n\nO seu troco eh de " + diferencas(pagar, total));
            } else {
                JOptionPane.showMessageDialog(null, "Compra mal sucedida, tente novamente");
                Pagamento();
            }
            if (continuarpag == 2)
                JOptionPane.showMessageDialog(null, "Sua compra foi cancelada");

        } else if (cartao == 2) {

            total = n1;

            continuarpag = Integer.parseInt(JOptionPane.showInputDialog(
                    " O valor de compra eh de " + total + " \n Deseja continuar?" + " \n[1]Sim " + " \n[2]Nao"));

            if (continuarpag == 1) {
                pagar = Double.parseDouble(JOptionPane.showInputDialog("Coloque seu dinheiro: "));

                if (pagar >= total) {
                    JOptionPane.showMessageDialog(null, "Compra bem sucedida
                             \n\nO seu troco eh de " + diferencas(pagar, total));
                } else {
                    JOptionPane.showMessageDialog(null, "Compra mal sucedida, tente novamente");
                    Pagamento();
                }
                if (continuarpag == 2)
                    JOptionPane.showMessageDialog(null, "Sua compra foi cancelada");
            }

        }

    }

    public static void main(String args[]) {

        Cardapio();

    }

}
