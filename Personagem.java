public abstract class Personagem {
    ArmaInterface arma;

    public void atacar() {
        arma.ataca();
    }

    public void lutar() {
        System.out.println("lutando...");
    }

    public void trocarArma(ArmaInterface armaEscolhida) {
        this.arma = armaEscolhida;
    }

}

