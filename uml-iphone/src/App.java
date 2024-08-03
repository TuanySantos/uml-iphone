import internet.Navegador;
import musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class App {
    public static void main(String[] args) throws Exception {
        
    
        ReprodutorMusical rm = new ReprodutorMusical();
        AparelhoTelefonico at = new AparelhoTelefonico();
        Navegador navegador = new Navegador();

        System.out.println(rm.tocar());
        System.out.println(at.atender());
        System.out.println(navegador.atualizarPagina());
        
    }
}
