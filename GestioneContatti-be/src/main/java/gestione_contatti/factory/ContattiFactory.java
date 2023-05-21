package gestione_contatti.factory;

import java.util.List;

import gestione_contatti.dto.ContattoDto;

public interface ContattiFactory {
	
	public List<ContattoDto> getListContatti();
	
	public ContattoDto save(ContattoDto contattoDto);
	
	public void updateById(Long id, ContattoDto contattoDto);

	public void deleteById(Long id);
}
