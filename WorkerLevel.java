public enum WorkerLevel {
    JUNIOR(1),
    MID_LEVEL(2),
    SENIOR(3);

    private final int valor;

    private WorkerLevel(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static WorkerLevel fromCode(int code) {
        for (WorkerLevel level : values()) {
            if (level.getValor() == code) {
                return level;
            }
        }
        throw new IllegalArgumentException("Código inválido para WorkerLevel: " + code);
    }

    public static String listLevels() {
        return "(1 - JUNIOR / 2 - MID_LEVEL / 3 - SENIOR)";
    }
}
