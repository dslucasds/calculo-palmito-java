package calculoimc;

public class Tamanho {
    double media;
    double op;
    public double calcular(double idade, double altura){
        if(idade >= 10 && idade <= 13 ){
            op = 0;
            return media = 13;     
        }else if(idade >= 14 && idade <= 16){
            op = 1;
            return media = 16;
        }else{
            op = 2;
            return media = 18;
        }
    }
    public String CalcSit(double tamanho){
        if(op = 0){
               if(tamanho <= 7){
                   return "Seu palmito eh peqeuno";
               }else if(tamanho > 7 && tamanho < 16){
                   return "Seu palmito esta na media";
               }else{
                   return "Seu palmito eh enorme";
               }
        }
        return "ta abaixo";
    }
}
