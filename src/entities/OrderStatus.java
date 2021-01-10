package entities;

public enum OrderStatus {

    PENDING(0),
    DELIVERED(1);

    OrderStatus(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    private int codigo;
}
