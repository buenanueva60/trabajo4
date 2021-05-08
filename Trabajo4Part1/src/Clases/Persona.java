package Clases;

public class Persona {
	private String Nombre;
	private String apellido;
	private Long DNI;
	private String Domicilio;
	private String telefono;
	private String email;
	private String Actividad; 
	private Autorizacion autorizacion;
	
	
	public Autorizacion getAutorizacion() {
		return autorizacion;
	}

	public void setAutorizacion(Autorizacion autorizacion) {
		this.autorizacion = autorizacion;
	}

	//constructor se registra la persona// 
	public Persona (Long DNI, String Actividad) {
		this.DNI = DNI; 
		this.Actividad = Actividad; 
		}
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public void setDNI(Long dNI) {
		DNI = dNI;
	}
	 public void setActividad(String actividad) {
		Actividad = actividad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDomicilio() {
		return Domicilio;
	}

	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getDNI() {
		return DNI;
	}

	public String getActividad() {
		return Actividad;
	}
	
	
	}

