public class CuentaBancaria implements Imprimible{
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public void imprimir() {
        System.out.println("La cuenta bancaria de " + this.titular + " tiene " + this.saldo + "€");
    }
}
