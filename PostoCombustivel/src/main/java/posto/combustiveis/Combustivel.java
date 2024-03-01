package posto.combustiveis;

public abstract class Combustivel {
    public Float getPrecoLitro() {
        return precoLitro;
    }

    public void setPrecoLitro(Float precoLitro) {
        this.precoLitro = precoLitro;
    }

    private Float precoLitro;
}
