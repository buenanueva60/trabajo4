package Clases;

	public class empresa extends Persona {
		String cuit ;
		String rasonSocial;
		
		public empresa(String cu, String rs) {
			super();
			cuit = cu;
			rasonSocial = rs;		
		}
		public String getCuit() {
			return cuit;
		}

		public void setCuit(String cuit) {
			this.cuit = cuit;
		}

		public String getRasonSocial() {
			return rasonSocial;
		}

		public void setRasonSocial(String rasonSocial) {
			this.rasonSocial = rasonSocial;
		}
	}
