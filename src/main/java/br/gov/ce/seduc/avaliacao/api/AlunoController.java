package br.gov.ce.seduc.avaliacao.api;

import br.gov.ce.seduc.avaliacao.domain.Aluno;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1/alunos")
public class AlunoController {

    @GetMapping("/cadastrar-novo")
    public void cadastrar(Aluno aluno){
        //todo impl
    }

    @PostMapping("/pesquisa")
    public void pesquisar(String nome, String cpf){
        //todo impl
    }

    @DeleteMapping("/{cpf}/deletar")
    public void deletar(String cpf){
        //todo impl
    }

    @PutMapping("/buscar-id")
    public void buscarPorId(Long id){
        //todo impl
    }

    @GetMapping("/atualizar-informacoes")
    public void atualizar(Long id, String nome, Integer cpf, String dataNascimento){
        //todo impl
    }

    public void ativarOuInativar(){
        //todo impl
    }
}
