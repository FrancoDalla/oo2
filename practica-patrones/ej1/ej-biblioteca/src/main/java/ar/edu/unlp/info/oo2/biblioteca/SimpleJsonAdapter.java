package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class SimpleJsonAdapter extends VoorheesExporter{

	
	private JSONObject exportar(Socio socio) {
		JSONObject retorno = new JSONObject();
		retorno.put("nombre",socio.getNombre());
		retorno.put("email",socio.getEmail());
		retorno.put("legajo", socio.getLegajo());
		return retorno;
	}
	
	@Override
	public String exportar(List<Socio> socios) {
		if(socios.isEmpty()){
			return "[]";
		}
		JSONArray jsonList = new JSONArray();
		socios.stream()
		.map(this::exportar)
		.forEach(jsonList::add);
		
		String retorno = jsonList.toString().replaceAll(",", ",\n");
		retorno = retorno.replaceAll("\\{", "\n\t\\{\n");
		retorno = retorno.replaceAll("\n\"", "\n\t\t\"");
		retorno = retorno.replaceAll("\":", "\": ");
		retorno = retorno.replaceAll("\"\\}]", "\"\n\t\\}\n]");
		return retorno;
	}
}
