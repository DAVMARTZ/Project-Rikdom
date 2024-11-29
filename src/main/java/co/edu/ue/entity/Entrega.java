package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the entrega database table.
 * 
 */
@Entity
@NamedQuery(name="Entrega.findAll", query="SELECT e FROM Entrega e")
public class Entrega implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ent_id")
	private int entId;

	@Column(name="ent_fecha")
	private String entFecha;

	//bi-directional many-to-one association to Solicitude
	@ManyToOne
	@JoinColumn(name="solicitudes_sol_id")
	private Solicitude solicitude;

	//bi-directional many-to-one association to TarjetasCredito
	@ManyToOne
	@JoinColumn(name="tarjetas_creditos_tdc_id")
	private TarjetasCredito tarjetasCredito;

	public Entrega() {
	}

	public int getEntId() {
		return this.entId;
	}

	public void setEntId(int entId) {
		this.entId = entId;
	}

	public String getEntFecha() {
		return this.entFecha;
	}

	public void setEntFecha(String entFecha) {
		this.entFecha = entFecha;
	}

	public Solicitude getSolicitude() {
		return this.solicitude;
	}

	public void setSolicitude(Solicitude solicitude) {
		this.solicitude = solicitude;
	}

	public TarjetasCredito getTarjetasCredito() {
		return this.tarjetasCredito;
	}

	public void setTarjetasCredito(TarjetasCredito tarjetasCredito) {
		this.tarjetasCredito = tarjetasCredito;
	}

}