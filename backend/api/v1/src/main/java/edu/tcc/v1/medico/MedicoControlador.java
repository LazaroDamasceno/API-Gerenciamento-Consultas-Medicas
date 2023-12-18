package edu.tcc.v1.medico;

import edu.tcc.v1.agendamedica.AgendaMedica;
import edu.tcc.v1.agendamedica.CadastrarAgendaMedicaDTO;
import edu.tcc.v1.consulta.Consulta;
import edu.tcc.v1.consulta.ObservacoesMedicasDTO;
import edu.tcc.v1.prontuario.Prontuario;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MedicoControlador {

    ResponseEntity<Void> cadastrarAgendaMedica(CadastrarAgendaMedicaDTO dto, String crm);
    ResponseEntity<List<AgendaMedica>> buscarAgendasMedicas(String crm);
    ResponseEntity<List<AgendaMedica>> buscarAgendasMedicasEntreDatas(String crm, String dataInicial, String dataFinal);
    ResponseEntity<Void> adicionarObservacoesMedicasAConsulta(String crm,String dataAgendamento, ObservacoesMedicasDTO dto);
    ResponseEntity<List<Consulta>> buscarConsultas(String crm);
    ResponseEntity<List<Consulta>> buscarConsultasAgendadas(String crm);
    ResponseEntity<List<Consulta>> buscarConsultasCanceladas(String crm);
    ResponseEntity<List<Consulta>> buscarConsultasEntreDatas(String crm, String dataInicial, String dataFinal);
    ResponseEntity<List<Consulta>> buscarConsultasAgendadasEntreDatas(String crm, String dataInicial, String dataFinal);
    ResponseEntity<List<Consulta>> buscarConsultasCanceladasEntreDatas(String crm, String dataInicial, String dataFinal);
    ResponseEntity<List<Consulta>> buscarConsultasEntreDatasPeloNomeDoCliente(String crm, String nome, String dataInicial, String dataFinal);
    ResponseEntity<List<Consulta>> buscarConsultasAgendadasEntreDatasPeloNomeDoCliente(String crm, String nome, String dataInicial, String dataFinal);
    ResponseEntity<List<Consulta>> buscarConsultasCanceladasEntreDatasPeloNomeDoCliente(String crm, String nome, String dataInicial, String dataFinal);
    ResponseEntity<List<Consulta>> buscarConsultasPeloNomeDoCliente(String crm, String nome);
    ResponseEntity<List<Consulta>> buscarConsultasAgendadasPeloNomeDoCliente(String crm, String nome);
    ResponseEntity<List<Consulta>> buscarConsultasCanceladasPeloNomeDoCliente(String crm, String nome);
    ResponseEntity<Void> criarProntuario(String crm, String cpf);
    ResponseEntity<Void> adicionarConsultaAoProntuario(String crm, String cpf, String dataAgendamento);
    ResponseEntity<Prontuario> buscarProntuarioDeCliente(String crm, String cpf);
    ResponseEntity<List<Prontuario>> buscarProntuarios(String crm);   


}
