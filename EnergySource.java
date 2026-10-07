abstract class EnergySource {
int id;
String name;
double energy;

EnergySource(int id,String name,double energy){
this.id = id;
this.name = name;
this.energy = energy;
}
abstract double calculateEfficiency ();

void display() {
System.out.println("ID: " + id);
System.out.println("name: " + name);
System.out.println("Enargy: " + energy + "kwh");
System.out.println("Effeciency: " + calculateEfficiency() + "%");
}
}

class SolarEnergy extends
EnergySource{
SolarEnergy(int id, String name, double energy){
super(id, name, energy);
}
double calculateEfficiency(){
return (energy/5000)*100;
}
}

class WindEnergy extends
EnergySource{
WindEnergy(int id, String name, double energy){
super(id, name, energy);
}
double calculateEfficiency(){
return (energy/8000)*100;
}
}

class main{
public static void main(String[] args){
EnergySource e;

e=new SolarEnergy(101, "solar panel", 4000);
e.display();
System.out.println();

e=new WindEnergy(102, "Wind turbine", 6000);
e.display();
}
}







