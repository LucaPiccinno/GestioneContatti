package gestione_contatti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gestione_contatti.dao.ContattoDao;
import gestione_contatti.dto.ContattoDto;
import gestione_contatti.factory.ContattiFactory;
import jakarta.websocket.server.PathParam;

@RestController
public class ContattiController {

	@Autowired
	private ContattiFactory contattiFactory;
	
	@RequestMapping(value = "/contacts", method = RequestMethod.GET)
	public ResponseEntity<List<ContattoDto>> mostraContatto(){
		
		List<ContattoDto> contatti = contattiFactory.getListContatti();
		
		if(contatti.isEmpty()) {
			return ResponseEntity.ok().body(contatti);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(contatti);
		}
	}
	
	@RequestMapping(value = "/contact", method = RequestMethod.PUT)
	public ResponseEntity<ContattoDto> aggiungiContatto(@RequestBody ContattoDto contattoDto){
		ContattoDto contattoCreate = contattiFactory.save(contattoDto);
		return ResponseEntity.ok(contattoCreate);
	}
	
	@RequestMapping(value = "/contact/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ContattoDto> modificaContatto(@PathVariable final Long id, final ContattoDto contattoDto){
		contattiFactory.updateById(id, contattoDto);
		return ResponseEntity.ok(null);
	}
	
	@RequestMapping(value = "/contact/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ContattoDto> eliminaContatto(@PathVariable final Long id){
		contattiFactory.deleteById(id);
		return ResponseEntity.ok(null);
	}
}
