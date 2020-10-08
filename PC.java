package test;
public class PC {
CPU cpu;
HardDisk HD;
PC(){}//构造方法一
PC(CPU cpu,HardDisk HD){//构造方法二
	this.cpu=cpu;
	this.HD=HD;
}
void setCPU(CPU cpu) {
	this.cpu=cpu;
}
void SetHardDisk(HardDisk HD) {
	this.HD=HD;
}
void show() {
	System.out.println("CPU速度:"+cpu.getSpeed());
	System.out.println("硬盘容量"+HD.getAmount());
	System.out.println("CPU的价格"+cpu.getPrice());
	System.out.println("硬盘转速"+HD.getRate());
}
}
