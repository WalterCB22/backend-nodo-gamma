package contador;

import java.util.Objects;

public class Contador {
    private Integer numeroInicial;
    private  Integer numeroIncremento;
    private Integer numeroDecremento;

    public Contador() {}
    public Contador(Integer numeroInicial, Integer numeroIncremento, Integer numeroDecremento) {
        this.numeroInicial = numeroInicial;
        this.numeroIncremento = numeroIncremento;
        this.numeroDecremento = numeroDecremento;
    }

    public Contador(Contador datos){
        if (Objects.nonNull(datos)) {
            this.numeroInicial = datos.numeroInicial;
            this.numeroIncremento = datos.numeroIncremento;
            this.numeroDecremento = datos.numeroDecremento;
        } else {
            numeroInicial = 0;
            numeroIncremento = 1;
            numeroDecremento = 2;
        }
    }

    public Integer getNumeroInicial() {
        return numeroInicial;
    }

    public void setNumeroInicial(Integer numeroInicial) {
        this.numeroInicial = numeroInicial;
    }

    public Integer getNumeroIncremento() {
        return numeroIncremento;
    }

    public void setNumeroIncremento(Integer numeroIncremento) {
        this.numeroIncremento = numeroIncremento;
    }

    public Integer getNumeroDecremento() {
        return numeroDecremento;
    }

    public void setNumeroDecremento(Integer numeroDecremento) {
        this.numeroDecremento = numeroDecremento;
    }

    public void incrementar() {
        if (this.numeroIncremento == null){
            this.numeroInicial++;
        } else {
            this.numeroInicial += this.numeroIncremento;
        }
    }

    public void decrementar() {
        if (this.numeroDecremento == null){
            this.numeroInicial--;
        } else {
            this.numeroInicial -= this.numeroDecremento;
        }
    }
}
