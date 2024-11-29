package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the tarjetas_creditos database table.
 * 
 */
@Entity
@Table(name="tarjetas_creditos")
@NamedQuery(name="TarjetasCredito.findAll", query="SELECT t FROM TarjetasCredito t")
public class TarjetasCredito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tdc_id")
	private int tdcId;

	@Column(name="tdc_fecha")
	private String tdcFecha;

	@Column(name="tdc_monto")
	private int tdcMonto;

	@Column(name="tdc_numero")
	private int tdcNumero;

	//bi-directional many-to-one association to Entrega
	@OneToMany(mappedBy="tarjetasCredito")
	private List<Entrega> entregas;

	public TarjetasCredito() {
	}

	public int getTdcId() {
		return this.tdcId;
	}

	public void setTdcId(int tdcId) {
		this.tdcId = tdcId;
	}

	public String getTdcFecha() {
		return this.tdcFecha;
	}

	public void setTdcFecha(String tdcFecha) {
		this.tdcFecha = tdcFecha;
	}

	public int getTdcMonto() {
		return this.tdcMonto;
	}

	public void setTdcMonto(int tdcMonto) {
		this.tdcMonto = tdcMonto;
	}

	public int getTdcNumero() {
		return this.tdcNumero;
	}

	public void setTdcNumero(int tdcNumero) {
		this.tdcNumero = tdcNumero;
	}

	public List<Entrega> getEntregas() {
		return this.entregas;
	}

	public void setEntregas(List<Entrega> entregas) {
		this.entregas = entregas;
	}

	public Entrega addEntrega(Entrega entrega) {
		getEntregas().add(entrega);
		entrega.setTarjetasCredito(this);

		return entrega;
	}

	public Entrega removeEntrega(Entrega entrega) {
		getEntregas().remove(entrega);
		entrega.setTarjetasCredito(null);

		return entrega;
	}

}