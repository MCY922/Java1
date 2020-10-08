package test;
public class HardDisk {
	private int amount;          
	public int rate;       
	HardDisk(){}                           //构造方法1
	HardDisk(int amount,int rate){    //构造方法2
		this.amount=amount;
		this.rate=rate;
	}
	void setAmount(int amount){       //设定硬盘容量
		this.amount = amount;
	}
	void setRate(int rate){       //设定硬盘容量
		this.rate=rate;
	}
	int getAmount() {            //获取硬盘容量
		return amount;
	}
	int getRate() {
		return rate;
	}
}