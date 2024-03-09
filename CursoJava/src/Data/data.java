package Data;

public class data {
    int dia;
    int mes;
    int ano;
    String obterdata(){
        return String.format("A data digitada foi: "+dia+"/"+mes+"/"+ano);
    }
    data(int Dia, int Mes, int Ano){
       dia=Dia;
       mes=Mes;
       ano=Ano;
    }
    data(){
        dia=1;
        mes=1;
        ano=1970;
    }
}
