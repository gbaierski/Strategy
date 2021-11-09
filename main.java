public class main{

    public static void main(String[] args) {

        Guerreiro guerreiro = new Guerreiro();
        Duende duende = new Duende();
        Rei rei = new Rei();
        Rainha rainha = new Rainha();

        System.out.println("=====================================================");
        System.out.println("Os monstros estão chegando para tomar o castelo, portanto o rei e a rainha solicitam ajuda! \n");
        System.out.println("Aparecem 2 personagens para ajudar: \n");
        guerreiro.exibir();
        duende.exibir();

        System.out.println("\n --- Próximo turno --- \n");
        
        guerreiro.exibir();
        guerreiro.trocarArma(new Espada());
        guerreiro.atacar();
        System.out.println("\n --- Próximo turno --- \n");

        duende.exibir();
        duende.trocarArma(new Faca());
        duende.atacar();
        System.out.println("\n --- Próximo turno --- \n");

        System.out.println("Os monstros estão atacando! Alvos: \n");
        rei.exibir();
        rainha.exibir();
        System.out.println("\n --- Próximo turno --- \n");

        guerreiro.exibir();
        guerreiro.trocarArma(new ArcoeFlexa());
        guerreiro.atacar();
        System.out.println("\n Os monstros se machucaram gravemente! \n");
        System.out.println("\n --- Próximo turno --- \n");

        duende.exibir();
        duende.trocarArma(new Machado());
        duende.atacar();
        System.out.println("\n Os monstros foram derrotados! \n");
        System.out.println("\n --- FIM --- \n");

        System.out.println("=====================================================");
    }
}