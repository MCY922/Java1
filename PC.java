package test;
public class PC {
CPU cpu;
HardDisk HD;
PC(){}//���췽��һ
PC(CPU cpu,HardDisk HD){//���췽����
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
	System.out.println("CPU�ٶ�:"+cpu.getSpeed());
	System.out.println("Ӳ������"+HD.getAmount());
	System.out.println("CPU�ļ۸�"+cpu.getPrice());
	System.out.println("Ӳ��ת��"+HD.getRate());
}
}
