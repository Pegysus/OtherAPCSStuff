public abstract class TV {
    private boolean tvON;
    public boolean gettvON() {
        return tvON;
    }
    public void settvON(boolean t) {
        tvON = t;
    }
    public abstract String tyType();
}