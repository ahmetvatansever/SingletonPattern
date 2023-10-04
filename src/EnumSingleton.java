public enum EnumSingleton {

    INSTANCE("Durum: 0");

    private String info;

    private EnumSingleton(String info){
        this.info = info;
    }

    public EnumSingleton getInstance(){
        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
