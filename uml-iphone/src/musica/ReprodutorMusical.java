package musica;

import login.IPhone;

/**
 * IPhone
 */
public class ReprodutorMusical extends IPhone {

    //private String musica;

    public ReprodutorMusical() {
        super();
    }

    public String tocar() {
        return "tocando musica";
    }
    
    public String pausar() {
        return "pausar musica";
    }
    
    public String selecionar() {
        return "selecionar musica";
    }
}