class RaceTrack{
	public static void main(String[] args){
		Car c = new Car(2010,"Porsche",25.0);
		System.out.println("Year of Manufacture "+"."+c.getYear()+" Name of car "+c.getMake()+"."+" Speed of car "+c.getSpeed());
		
		c.accelerate();
		System.out.println(c.getSpeed());	
	}

}