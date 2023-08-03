class Incremental {
    private static Incremental incremental = null;
    private static int count = 0;
    private static int numero;
    private Incremental() {
    }
    public static Incremental getInstance(){
    if(incremental == null){
    incremental = new Incremental();
    }
    numero = ++count;
    return incremental;
    }
    public String toString() {
    return "Incremental " + numero;
    }
    }