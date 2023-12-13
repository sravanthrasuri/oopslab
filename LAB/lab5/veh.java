interface Vehicle
{
    String getCompany();
    String getModel();
    String getType();
    double getConsumption();
    void info();
}

class TwoWheelers implements Vehicle
{
    private String company,model,type;
    private double consumption;
    
    public TwoWheelers(String company,String model,String type)
    {
       this.company=company;
       this.model=model;
       this.type=type;
       
    switch(type)
    {
       case "petrol":
          this.consumption = 62;
          break;
       case "diesel":
          this.consumption = 82;
          break;
       case "cng":
          this.consumption = 72;
          break;
      default:
          System.out.println(" this type not a petrol or diseal or cng");
           
    }
   } 
    @Override
    public String getCompany()
    {
        return company;
    } 
    
     @Override
    public String getModel()
    {
        return model;
    }
    
     @Override
    public String getType()
    {
        return type;
    }
    
     @Override
    public double getConsumption()
    {
        return consumption;
    }
    
    @Override
    public void info()
    {
       System.out.println(" 2-wheeler details:");
       System.out.println("company:"+getCompany());
       System.out.println("type:"+getType());
       System.out.println("model:"+getModel());
       System.out.println("consumption:"+getConsumption()+" km/l");
       
    }
}

class FourWheelers implements Vehicle
{
    private String company,model,type;
    private double consumption;
    
    public FourWheelers(String company,String model,String type)
    {
       this.company=company;
       this.model=model;
       this.type=type;
    
    switch (type)
    {
       case "petrol":
          this.consumption = 14;
          break;
       case "diesel":
          this.consumption = 22;
          break;
       case "cng":
          this.consumption = 18;
          break;
      default:
          System.out.println(" this type not a petrol or diseal or cng");
           
    }
    }
    
    @Override
    public String getCompany()
    {
        return company;
    } 
    
     @Override
    public String getModel()
    {
        return model;
    }
    
     @Override
    public String getType()
    {
        return type;
    }
    
     @Override
    public double getConsumption()
    {
        return consumption;
    }
    
    @Override
    public void info()
    {
       System.out.println(" 4-wheeler details:");
       System.out.println("company:"+getCompany());
       System.out.println("type:"+getType());
       System.out.println("model:"+getModel());
       System.out.println("consumption:"+getConsumption()+" km/l");
       
    }
}


class veh
{
   public static void main(String[] args)
   {
      TwoWheelers bike = new TwoWheelers("honda","cbr","petrol");
      FourWheelers car = new FourWheelers("nano","corolla","diesel");
      
      bike.info();
      car.info();
   }
}
