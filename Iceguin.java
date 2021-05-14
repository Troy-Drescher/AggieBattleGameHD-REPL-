class Iceguin implements Creature
{
   private int hp, atk, def, sp;
   private int[] stats;
  
   public Iceguin()
   {
     
     hp = 75;
     atk = 125;
     def = 35;
     sp = 40;
     stats = new int[] {hp, atk, def, sp};
     
   }
   
   public String getName()
   {
      return "Iceguin";
   }
   
   public String getDescription()
   {
     return "A penguin that can swim in ice, not water, but solid ice.";
   }
  
  // ability 1, ability 2, ability 3, super
 
  public int[] getStats()
  {
     return stats;
  }
  
  public Ability[] getAbility()
  {
    Ability iceshot = new Ability("IceShot","buff health","Heals itself 20 pts","20");
    Ability subZero = new Ability("subZero","debuff speed","decreases opponents speed 20ps","-20");
    Ability iceBarrage = new Ability("icy Barrage","Attack","attacks opponent with an icy barrage","none");
    Ability iceStorm = new Ability("IceStorm","super Attack","attacks an opponent with a storm of ice opponent is hit and loses one turn","debuff turn");
    
    Ability[] abilities = new Ability[] {iceshot,subZero,iceBarrage,iceStorm};
  	return abilities;
  }
  
   
   
}
