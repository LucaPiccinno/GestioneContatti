package gestione_contatti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gestione_contatti.dao.ContattiDao;
import gestione_contatti.model.Contatto;

@RestController
public class ContattiController {

	@Autowired
	ContattiDao contattiDao;
	
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public ResponseEntity<List<Contatto>> mostraContatto(){
		
		List<Contatto> contatti = contattiDao.getListContatti();
		
		if(contatti.isEmpty()) {
			return ResponseEntity.ok().body(contatti);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(contatti);
		}
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.PUT)
	public ResponseEntity<Contatto> aggiungiContatto(@RequestBody Contatto contatto){
		//DA FARE
		return null;
	}
	
	@RequestMapping(value = "/modify/", method = RequestMethod.PUT)
	public ResponseEntity<Contatto> modificaContatto(){
		//DA FARE
		return null;
	}
	
	@RequestMapping(value = "delete/", method = RequestMethod.DELETE)
	public ResponseEntity<Contatto> eliminaContatto(){
		//DA FARE
		return null;
	}
}
