package test;
public class HardDisk {
	private int amount;          
	public int rate;       
	HardDisk(){}                           //���췽��1
	HardDisk(int amount,int rate){    //���췽��2
		this.amount=amount;
		this.rate=rate;
	}
	void setAmount(int amount){       //�趨Ӳ������
		this.amount = amount;
	}
	void setRate(int rate){       //�趨Ӳ������
		this.rate=rate;
	}
	int getAmount() {            //��ȡӲ������
		return amount;
	}
	int getRate() {
		return rate;
	}
}