public class ContaBanco {
    public String numConta;
    public Integer tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(String numConta, Integer tipo, String dono) throws Exception {

        if(tipo == 1 || tipo == 2) {
            this.numConta = numConta;
            this.dono = dono;
            this.tipo = tipo;
            this.saldo = 0;
            this.status = false;
        }else {
            throw new RuntimeException("Tipo invalido");
        }
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(){
        if (!isStatus()){
            setStatus(true);
            switch (getTipo()) {
                case 1 -> setSaldo(50.0);
                case 2 -> setSaldo(150.0);
                default -> throw new RuntimeException("Erro de tipo!");
            }
        }
    }

    public void fecharConta(){
        if (isStatus() && getSaldo() == 0){
            setStatus(false);
            System.out.println("Conta tipo: " + getTipo() + " Fechada...");
        }else{
            System.out.println("Conta não pode ser fechada...");
        }
    }

    public void depositar(Double valor){
        if(isStatus() && valor > 0){
            this.saldo += valor;
            System.out.println("O valor R$" + valor + " foi depositado!");
        }else{
            System.out.println("Valor invalido");
        }
    }

    public void sacar(Double valor){
        if(isStatus() && this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("O valor R$" + valor +  " foi sacado!");
            System.out.println("Saldo atual: R$" + this.saldo );
        }else{
            System.out.println("Saque superior ao saldo!");
        }
    }

    public void pagarMensalidade(){
        if(isStatus()){
            switch (getTipo()) {
                case 1 -> this.saldo -= 12.0;
                case 2 -> this.saldo -= 20.0;
                default -> throw new RuntimeException("Erro de tipo!");
            }
        }
    }

    @Override
    public String toString() {
        return "ContaBanco{" +
                "numConta='" + numConta + '\'' +
                ", tipo=" + tipo +
                ", dono='" + dono + '\'' +
                ", saldo=" + saldo +
                ", status=" + status +
                '}';
    }
}
