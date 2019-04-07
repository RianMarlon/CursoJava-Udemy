/*Fazer um programa para ler os dados de uma conta banc�ria e depois realizar um
saque nesta conta banc�ria, mostrando o novo saldo. Um saque n�o pode ocorrer
ou se n�o houver saldo na conta, ou se o valor do saque for superior ao limite de
saque da conta. Implemente a conta banc�ria conforme projeto abaixo:*/

package modelo.entidades10;

public class Account {
	
	private Integer number;
	//dono
	private String holder;
	//saldo
	private Double balance;
	//limite de retirada
	private Double withdrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void deposit (Double amount) {
		this.balance +=amount;
	}
	
	public void withdraw (Double amount) throws SaqueException {
		if (amount > this.withdrawLimit) {
			throw new SaqueException ("The amount exceeds withdraw limit");
		}if (amount > this.balance) {
			throw new SaqueException ("Not enough balance");
		
		} else {
			this.balance -= amount;
			System.out.print("New balance: "+ String.format("%.2f", this.balance));
		}
			
	}

}
