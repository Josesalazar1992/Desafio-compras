public class Compras {
    private int limiteDeDinero = 0; // Variable que almacena el limite de credito
    private int acumulado = 0; // Variable que acumula el monto de las compras
    private int saldo = 0; // Variable Saldo para compras disponible
    private int costoArticulo = 0;

    public int getCostoArticulo() {
        return costoArticulo;
    }

    public void setCostoArticulo(int costoArticulo) {
        // Operacion que suma las compras
        acumulado = acumulado + costoArticulo;
        this.costoArticulo = costoArticulo;
    }

    public int getLimiteDeDinero() {
        return limiteDeDinero;
    }

    public void setLimiteDeDinero(int limiteDeDinero) {
        this.limiteDeDinero = limiteDeDinero;
    }

    public int getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(int acumulado) {
        this.acumulado = acumulado;
    }

    public int getSaldo() {
        // operacion que calcula la diferencia entre el limite de la tarjeta y el acumulado de compras
        saldo = limiteDeDinero - acumulado;
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
