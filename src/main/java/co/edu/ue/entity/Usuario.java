package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="usu_id")
	private int usuId;

	@Column(name="usu_contraseña")
	private String usuContraseña;

	@Column(name="usu_correo")
	private String usuCorreo;

	public Usuario() {
	}

	public int getUsuId() {
		return this.usuId;
	}

	public void setUsuId(int usuId) {
		this.usuId = usuId;
	}

	public String getUsuContraseña() {
		return this.usuContraseña;
	}

	public void setUsuContraseña(String usuContraseña) {
		this.usuContraseña = usuContraseña;
	}

	public String getUsuCorreo() {
		return this.usuCorreo;
	}

	public void setUsuCorreo(String usuCorreo) {
		this.usuCorreo = usuCorreo;
	}

}