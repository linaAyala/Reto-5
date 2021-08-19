package Modelo.vo;

public class Requerimiento_1 {
    // Su código
    private Integer ID_Proyecto;
    private String Ciudad;
    private String Banco_Vinvulado;
    private String Constructora;
        
    public Requerimiento_1() {
    }

    public Requerimiento_1(Integer iD_Proyecto, String ciudad) {
        ID_Proyecto = iD_Proyecto;
        Ciudad = ciudad;
    }

    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }
    public void setID_Proyecto(Integer iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }
    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }
    public String getBanco_Vinvulado() {
        return Banco_Vinvulado;
    }
    public void setBanco_Vinvulado(String banco_Vinvulado) {
        Banco_Vinvulado = banco_Vinvulado;
    }
    public String getConstructora() {
        return Constructora;
    }
    public void setConstructora(String constructora) {
        Constructora = constructora;
    }

    
}
