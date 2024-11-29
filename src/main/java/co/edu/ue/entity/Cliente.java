package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the clientes database table.
 * 
 */
@Entity
@Table(name="clientes")
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cli_id")
	private int cliId;

	@Column(name="cli_apellidos")
	private String cliApellidos;

	@Column(name="cli_direccion")
	private String cliDireccion;

	@Column(name="cli_document")
	private String cliDocument;

	@Column(name="cli_nombres")
	private String cliNombres;

	@Column(name="cli_telefono")
	private int cliTelefono;

	//bi-directional many-to-one association to Solicitude
	@OneToMany(mappedBy="cliente")
	private List<Solicitude> solicitudes;

	public Cliente() {
	}

	public int getCliId() {
		return this.cliId;
	}

	public void setCliId(int cliId) {
		this.cliId = cliId;
	}

	public String getCliApellidos() {
		return this.cliApellidos;
	}

	public void setCliApellidos(String cliApellidos) {
		this.cliApellidos = cliApellidos;
	}

	public String getCliDireccion() {
		return this.cliDireccion;
	}

	public void setCliDireccion(String cliDireccion) {
		this.cliDireccion = cliDireccion;
	}

	public String getCliDocument() {
		return this.cliDocument;
	}

	public void setCliDocument(String cliDocument) {
		this.cliDocument = cliDocument;
	}

	public String getCliNombres() {
		return this.cliNombres;
	}

	public void setCliNombres(String cliNombres) {
		this.cliNombres = cliNombres;
	}

	public int getCliTelefono() {
		return this.cliTelefono;
	}

	public void setCliTelefono(int cliTelefono) {
		this.cliTelefono = cliTelefono;
	}


	public List<Solicitude> getSolicitudes() {
		return this.solicitudes;
	}

	public void setSolicitudes(List<Solicitude> solicitudes) {
		this.solicitudes = solicitudes;
	}

	public Solicitude addSolicitude(Solicitude solicitude) {
		getSolicitudes().add(solicitude);
		solicitude.setCliente(this);

		return solicitude;
	}

	public Solicitude removeSolicitude(Solicitude solicitude) {
		getSolicitudes().remove(solicitude);
		solicitude.setCliente(null);

		return solicitude;
	}

}