public class Persona {

    public String nombres;
    public String paterno;
    public String materno;
    public int ano;
    public int mes;
    public int dia;
    public String sexo;
    public String estado;
    public String PateVoc;

    //Nombres 
    public String getNombres(){
        return nombres.toUpperCase();
    }
    public void setNombres(String nombres){
        this.nombres = nombres;
    }

    //apellido paterno
    public String getPaterno(){
        return paterno.toUpperCase();
    }    
    public void setPaterno(String paterno){
        this.paterno = paterno;
    }
    
    //for para saber la primera vocal del apellido paterno
    public String getPaternoVoca(){
        for(int i=1;i<paterno.length() ;i++){
            if(paterno.charAt(i)=='a'||paterno.charAt(i)=='e'||paterno.charAt(i)=='i'||paterno.charAt(i)=='o'||paterno.charAt(i)=='u'||paterno.charAt(i)=='A'||paterno.charAt(i)=='E'||paterno.charAt(i)=='I'||paterno.charAt(i)=='O'||paterno.charAt(i)=='U'){ 
                PateVoc+= paterno.charAt(i);    
                break;                       
            }
        }
        
        return PateVoc.toUpperCase();
    }
    public void setPaternoVoca(String PateVoc){
        this.PateVoc=PateVoc;
    }
    

    //apellido materno
    public String getMaterno(){ 
        return materno.toUpperCase();
    }
    public void setMaterno(String materno){
        this.materno=materno;
    }

    //ano
    public int getAno(){ 
        return ano;
    }
    public void setAno(int ano){
        this.ano=ano;
    }

    //mes
    public int getMes(){ 
        return mes;
    }
    public void setMes(int mes){
        this.mes=mes;
    }

    //dia
    public int getDia(){ 
        return dia;
    }
    public void setDia(int dia){
        this.dia=dia;
    }

    //sexo
    public String getSexo(){ 
        return sexo.toUpperCase();
    }
    public void setSexo(String sexo){
        this.sexo=sexo;
    }

    //estado
    public String getEstado(){
        String che = "";
        switch(estado)
        {
        case "AGUAS_CALIENTES":
                 che = "AS";      
               break;
        case "BAJA_CALIFORNIA":
            che = "BC";
            break;
        case "BAJA_CALIFORNIA_SUR":
            che = "BS";
            break;
        case "CAMPECHE":
            che = "CC";
            break;
        case "COAHUILA":
            che = "CL";
            break;
        case "COLIMA":
            che = "CM";
            break;
        case "CHIAPAS":
            che = "CS";
            break;
        case "CHIHUAHUA":
            che = "CH";
            break;
        case "DISTRITO_FEDERAL":
            che = "DF";
            break;
        case "DURANGO":
            che = "DG";
            break;
        case "GUANAJUATO":
            che= "GT";
            break;
        case "GUERRERO":
            che = "GR";
            break;
        case "HIDALGO":
            che = "HG";
            break;
        case "JALISCO":
            che = "JC";
            break;
        case "ESTADO_DE_MEX":
            che="MC";
            break;
        case "MICHOACAN":
            che="MN";
            break;
        case "MORELOS":
            che="MS";
            break;
        case "NAYARIT":
            che="NT";
            break;
        case "NUEVO_LEON":
            che="NL";
            break;
        case "OAXACA":
            che="OC";
            break;
        case "PUEBLA":
            che="PL";
            break;
        case "QUERERTARO":
            che="QT";
            break;
        case "QUINTANA_ROO":
            che="QR";
            break;
        case "SAN_LUIS_POTOSI":
            che="SP";
            break;
        case "SINALOA":
            che = "SL";
            break;
        case "SONORA":
            che = "SR";
            break;
        case "TABASCO":
            che = "TC";
            break;
        case "TAMAULIPAS":
            che = "TS";
            break;
        case "TLAXCALA":
            che ="TL";
            break;
        case "VERACRUZ":
            che="VZ";
            break;
        case "YUCATAN":
            che="YN";
            break;
        case "ZACATECAS":
            che="ZS";
            break;
           
        case "NACIDO_EXTRANJERO":
            che="NE";
            break;
       
           
        }
        return che;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public Persona(){
        this.nombres = "";
        this.paterno = "";
        this.materno = "";
        this.ano = 0;
        this.mes = 0;
        this.dia = 0;
        this.sexo = "";
        this.estado = "";
        this.PateVoc = "";
    }

    public Persona(String nombres, String paterno, String materno, int ano, int mes,int dia, String sexo, String estado, String PateVoc){
        this.nombres = nombres;
        this.paterno = paterno;
        this.materno = materno;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.sexo = sexo;
        this.estado = estado;
        this.PateVoc = PateVoc;
    }
}