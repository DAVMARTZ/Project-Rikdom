package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the solicitudes database table.
 * 
 */
@Entity
@Table(name="solicitudes")
@NamedQuery(name="Solicitude.findAll", query="SELECT s FROM Solicitude s")
public class Solicitude implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sol_id")
	private int solId;

	@Column(name="sol_estado")
	private String solEstado;

	@Column(name="sol_fecha")
	private String solFecha;

	//bi-directional many-to-one association to Entrega
	@OneToMany(mappedBy="solicitude")
	private List<Entrega> entregas;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="clientes_cli_id")
	private Cliente cliente;

	public Solicitude() {
	}

	public int getSolId() {
		return this.solId;
	}

	public void setSolId(int solId) {
		this.solId = solId;
	}

	public String getSolEstado() {
		return this.solEstado;
	}

	public void setSolEstado(String solEstado) {
		this.solEstado = solEstado;
	}

	public String getSolFecha() {
		return this.solFecha;
	}

	public void setSolFecha(String solFecha) {
		this.solFecha = solFecha;
	}

	public List<Entrega> getEntregas() {
		return this.entregas;
	}

	public void setEntregas(List<Entrega> entregas) {
		this.entregas = entregas;
	}

	public Entrega addEntrega(Entrega entrega) {
		getEntregas().add(entrega);
		entrega.setSolicitude(this);

		return entrega;
	}

	public Entrega removeEntrega(Entrega entrega) {
		getEntregas().remove(entrega);
		entrega.setSolicitude(null);

		return entrega;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

    public void setId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}