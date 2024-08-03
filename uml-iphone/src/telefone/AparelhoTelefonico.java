package telefone;

import login.IPhone;

/**
 * IPhone
 */
public class AparelhoTelefonico extends IPhone {

    //private String musica;

    public AparelhoTelefonico() {
        super();
    }

    public String iniciarCorreioVoz() {
        return "Iniciar correio de voz";
    }
    
    public String ligar() {
        return "Fazer ligação";
    }
    
    public String atender() {
        return "Atender ligação";
    }

}