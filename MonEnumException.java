package calculatrice2;

public enum MonEnumException {
	UTILISATION_DU_ZERO(1,"Utilisation d'un zero"),  
	UTILISATION_DE_UN(2,"Utilisation de un"),
        UTILISATION_DIFF_NOMBRE(3,"Utilisation d'un caractère différent d'un nombre"),
        SERVER_ERROR(4, "Erreur de serveur"),
        UTILISATION_SIGNE_MAUVAIS(5,"Utilisation du mauvais signe");
	
	private final int code;
	private final String defaultMessage;
	
	MonEnumException(int code, String defaultMessage){
		this.code=code;
		this.defaultMessage=defaultMessage;
	}
	public int getCode( ) {
		return code;
	}
	
	public String getDefaultMessage() {
		return defaultMessage;
	}
	
	public static String getNameFromCode(int code) {
		for(MonEnumException e : MonEnumException.values()) {
			if(code == e.code)
				return e.name();
		}
		return null;
	}
}
