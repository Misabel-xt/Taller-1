package Ejercicio1;
//Define una clase CuentaBancaria con las propiedades: numeroCuenta, saldo y tipoCuenta. Define:
//1. Un constructor por defecto.
//2. Un constructor parametrizado con dos parámetros (numeroCuenta y tipoCuenta).
//3. Un constructor sobrecargado con tres parámetros (numeroCuenta, saldo, y tipoCuenta).
public class cuentaBancaria {
    private int numeroCuenta:
    private int  saldo;
    private String tipoCuenta:

    public cuenraBancaria(){
        numeroCuenta = 00000;
        saldo = 0;
        tipoCuenta = "Sin tipo de cuenta";
    }

    public cuentaBancaria(int numeroCuenta, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public cuentaBancaria(int numeroCuenta, int saldo, String tipoCuenta){
        this(numeroCuenta,tipoCuenta);
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}
