package gerenciador_questionario;

import java.util.UUID;

public class Pergunta {

    private UUID id;
    private String texto;

    private String reposta;

    public Pergunta(String texto, String resposta) {
        this.id = UUID.randomUUID();
        this.texto = texto;
        this.reposta = resposta;
    }

    public UUID getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public String getReposta() {
        return reposta;
    }

}