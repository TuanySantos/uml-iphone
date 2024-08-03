package internet;

import login.IPhone;

/**
 * IPhone
 */
public class Navegador extends IPhone {


    public Navegador() {
        super();
    }

    public String exibirPagina() {
        return "Exibir página";
    }
    
    public String selcionarNovaAba() {
        return "Selecionar Nova Aba";
    }
    
    public String atualizarPagina() {
        return "Atualizar Página";
    }
}