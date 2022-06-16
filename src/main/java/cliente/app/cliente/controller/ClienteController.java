package cliente.app.cliente.controller;

import cliente.app.cliente.model.Cliente;
import cliente.app.cliente.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class ClienteController {

  private final ClienteRepository clienteRepository;

  @PostMapping("salvar-cliente")
  private ResponseEntity<Cliente> post(@RequestBody Cliente cliente) {
    final var save = clienteRepository.save(cliente);
    return ResponseEntity.ok(save);
  }

//  @GetMapping("recuperar-clientes")
//  private ResponseEntity<List<Cliente>> get() {
//    final var clientes = clienteRepository.findAll();
//    return ResponseEntity.ok(clientes);
//  }
//
//  @PutMapping("atualiza-cliente")
//  private ResponseEntity<?> put(@RequestParam Long id, @RequestBody Cliente cliente) {
//    final var clienteOptional = clienteRepository.findById(id);
//    final var clienteModel = new Cliente();
//    if(clienteOptional.isPresent()){
//      clienteModel.setId(clienteOptional.get().getId());
//      clienteModel.setNome(cliente.getNome());
//      clienteModel.setIdade(cliente.getIdade());
//
//      final var clienteSalvo = clienteRepository.save(clienteModel);
//      return ResponseEntity.ok(clienteSalvo);
//    }
//
//    return ResponseEntity.badRequest().body("ID de cliente não existe");
//  }
//
//  @DeleteMapping("delete-cliente")
//  private ResponseEntity<?> delete(@RequestParam Long id){
//    final var cliente = new Cliente();
//    cliente.setId(id);
//    clienteRepository.delete(cliente);
//    return ResponseEntity.accepted().body("Cliente Deletado");
//  }
}
