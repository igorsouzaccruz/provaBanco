# provaBanco

<p>1) Crie uma Classe Chamada ContaBanco</p>

![image](https://user-images.githubusercontent.com/88636711/191991278-32262eca-460c-4ecf-9dbd-a0a2c5fd792f.png)

<h1>Restrições:</h1>
<br>
<p> a) o atributo tipo só pode assumir 2 valores (1 - para conta corrente ou 2 - para conta poupança)</p>
<p> b) o atributo status só pode assumir 2 valores (true - aberto ou false - fechado )</p>
<br>
<p> 2) Implemente os getters e setters para todos os atributos </p>
<p> 3) Implemente um construtor que receba como parâmetro: número da conta, tipo e dono. O construtor deve 
iniciar os atributos status e saldo com os valores false e 0 respectivamente.</p>
<p> 4) Implemente o método abrirConta() que deve verificar se a conta está fechada (status = false), caso positivo 
ele deve abrir a conta. (status = true). Ao Abrir a conta como tipo 1 o método deve adicionar ao saldo R$ 50,00,
caso o tipos for = 2 o método deve adicionar ao saldo R$ 150,00 </p>
<p> 5) Implemente o método fecharConta() que deve verificar se a conta esta aberta (status = true) e com saldo = 
0, caso positivo o método deve modificar o status da conta para false </p>
<p> 6) Implemente os métodos </p>
<p> a) depositar(double valor) - o método deve verificar se a conta esta aberta e se o valor do depósit é positivo, 
caso afirmativo o valor deve ser adicionado ao saldo </p>
<p> b) sacar(double valor) - o método deve verificar se a conta esta aberta e possui saldo maior ou igual ao valor 
solicitado (que deve ser positivo), caso afirmativo, o valor sacado deverá ser subtraido do saldo </p>
<p> c) pagarMensalidade() - se a conta estiver aberta, deve subtrair do saldo um valor dependendo do tipo da conta 
R$ 12,00 para conta corretente (tipo = 1) ou R$ 20,00 para conta poupança (tipo = 2) </p>
<p> 7) Implemente uma classe de teste que crie 2 contas, uma conta corrente e uma conta poupança. Para cada uma 
delas a classe deve abrir a conta, depositar dinheiro , sacar dinheiro, mostrar o saldo ao fim de cada operação e 
tentar fechar a conta. </p>
