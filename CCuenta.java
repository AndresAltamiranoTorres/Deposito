/**
 * Esta clase CCuenta, tiene 2 metodos Ingresar y Retirar con sus respectivas Excepciones
 *
 * @author Andres Altamirano
 * @version 1.0
 * @since 0.9
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Devuelve el saldo actual de la cuenta
     * @return getSaldo (el saldo de la cuenta)
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad de dinero a la cuenta
     * si la cantidad es negativa salta una exception
     * @param cantidad
     * @throws Exception
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad de dinero de la cuenta
     * Si la cantidad a retirar es negativa salta una exception
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Un get para obtener un nombre
     * @return getNombre (nombre)
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Enviar un nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtener la cuenta
     * @return getCuenta()
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Enviar una cuenta
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtener el saldo
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Enviar un saldo
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtener el tipo de interes
     * @return tipoInteres
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Enviar un tipo de interes
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
