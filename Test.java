package test;
public class Test {
public static void main(String args[]) {
	CPU cpu=new CPU();
	HardDisk HD=new HardDisk();
	cpu.setSpeed(2200);
	HD.setAmount(200);
	HD.setRate(500);
	cpu.setPrice(1000);
	PC pc=new PC();
	pc.setCPU(cpu);
	pc.SetHardDisk(HD);
	pc.show();
}
}
