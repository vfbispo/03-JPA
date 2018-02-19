package br.com.fiap.jpa.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="TB_CLIENTE")
@SequenceGenerator(name="cliente", sequenceName="SQ_TB_CLIENTE", allocationSize=1)
public class Cliente implements Serializable {
	
	@Id
	@Column(name="ID_CLIENTE")
	@GeneratedValue(generator="cliente", strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="NM_CLIENTE", nullable= false, length=150)
	private String nome;
	
	@Column(name="DT_ANIVERSARIO", nullable=false)
	@Temporal(TemporalType.DATE)
	private Calendar DataAniversario;
	
	@Column(name="CD_CARTAO_FIDELIDADE")
	private int codigoCartaoFidelidade;
	
	@Enumerated(EnumType.STRING)
	@Column(name="DS_SEXO", nullable=false)
	private Sexo sexo;
	
	@Lob
	@Column(name="FT_CLIENTE")
	private byte[] foto;
	
	@Enumerated(EnumType.STRING)
	@Column(name="DS_STATUS", nullable=false)
	private Status staus;

	public Cliente(String nome, Calendar dataAniversario, int codigoCartaoFidelidade, Sexo sexo, byte[] foto,
			Status staus) {
		super();
		
		this.nome = nome;
		this.DataAniversario = dataAniversario;
		this.codigoCartaoFidelidade = codigoCartaoFidelidade;
		this.sexo = sexo;
		this.foto = foto;
		this.staus = staus;
	}

	public Cliente() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataAniversario() {
		return DataAniversario;
	}

	public void setDataAniversario(Calendar dataAniversario) {
		DataAniversario = dataAniversario;
	}

	public int getCodigoCartaoFidelidade() {
		return codigoCartaoFidelidade;
	}

	public void setCodigoCartaoFidelidade(int codigoCartaoFidelidade) {
		this.codigoCartaoFidelidade = codigoCartaoFidelidade;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Status getStaus() {
		return staus;
	}

	public void setStaus(Status staus) {
		this.staus = staus;
	}
	
	

}
