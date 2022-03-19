package ma.education.tp4.interfacekeyword;

public class CompteBancaire implements Compte{
    private String numero;
    private int balance;

    public CompteBancaire(){
        this.numero=numero;
    }

    @Override
    public void deposer(int montant) {
        this.balance+=montant;
    }

    @Override
    public int retirer(int montant) {
        if(balance<montant){
            return 0;
        }
        return this.balance-=montant;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    public String getNumero() {
        return numero;
    }
}
