public class Tarefa {
    private String titulo;
    private int prioridade;
    private String descricao;
    private String prazo;

    
    public Tarefa(String titulo, int prioridade, String descricao, String prazo) {
        this.titulo = titulo;
        this.prioridade = prioridade;
        this.descricao = descricao;
        this.prazo = prazo;
    }

    
    public Tarefa(String titulo, int prioridade) {
        this.titulo = titulo;
        this.prioridade = prioridade;
        this.descricao = "Descrição padrão"; 
        this.prazo = "Prazo padrão";         
    }

    
}

public class Tarefa {
    private String titulo;
    private int prioridade;
    private String descricao;
    private String prazo;

    
    public Tarefa(String titulo, int prioridade, String descricao, String prazo) {
        if (!isPrioridadeValida(prioridade)) {
            throw new IllegalArgumentException("Prioridade deve estar entre 1 e 5.");
        }
        this.titulo = titulo;
        this.prioridade = prioridade;
        this.descricao = descricao;
        this.prazo = prazo;
    }

    
    public Tarefa(String titulo, int prioridade) {
        if (!isPrioridadeValida(prioridade)) {
            throw new IllegalArgumentException("Prioridade deve estar entre 1 e 5.");
        }
        this.titulo = titulo;
        this.prioridade = prioridade;
        this.descricao = "Descrição padrão"; 
        this.prazo = "Prazo padrão";        
    }

    
    private boolean isPrioridadeValida(int prioridade) {
        return prioridade >= 1 && prioridade <= 5;
    }

    o
}
