package cl.sglex.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import cl.sglex.util.Util;

@ManagedBean
@ViewScoped
public class Index implements Serializable {

	private static final long serialVersionUID = 5203766472164334427L;

	private String inicio;
	
	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public Index(){
		inicio = Util.obtieneValorParametroPorNombre("urlSistema");
	}
	
}
