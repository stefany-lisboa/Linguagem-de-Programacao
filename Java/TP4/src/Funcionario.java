//FELLIPE SOARES ROMANO CB3005411
//STEFANY LISBOA DA SILVA CB3005551

public class Funcionario {
    protected int cod_func;
    protected String nome_func;
    protected double sal_func;
    protected String ds_cargo;
        Funcionario(int i, String n, double s, String c){
            cod_func = i;
            nome_func = n;
            sal_func = s;
            ds_cargo = c;
        }
        
        public String getNome() {
            return nome_func;
        }
    
        public double getSal() {
            return sal_func;
        }

        public String getCargo() {
            return ds_cargo;
        }
}
