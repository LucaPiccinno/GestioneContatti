package gestione_contatti.factory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestione_contatti.dto.ContattoDto;
import gestione_controller.service.ContattiServiceImpl;

@Service
public class ContattiImplFactory implements ContattiFactory {

	@Autowired
	private ContattiServiceImpl contattiService;
	
	@Override
	public List<ContattoDto> getListContatti() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContattoDto save(ContattoDto contattoDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateById(Long id, ContattoDto contattoDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
