package OrderSystem;
import DroneHierarchi.Drone;
public class Order {
  private int id;
  private String client;
  private Deliverable deliverable;
  private double cost;
  private String urgency;
  private String status;
  private Drone drone;
  private static int counter=0;
  public Order(String client,Deliverable deliverable,double cost,String urgency){
    this.id= ++counter;
    this.client=client;
    this.deliverable=deliverable;
    this.cost=cost;
    this.urgency=urgency;
    this.status="PANDING";
  }
  public String toString(){
    return "Order [id: "+this.id+", client: "+this.client+", deliverable: "+this.deliverable+", urgency: "+this.urgency+", cost: "+this.cost+", status: "+this.status+"]";
  }
  public int equals(Order ord){
    if(ord.id==this.id){
        return 1;
    }else{
        return 0;
    }
  }
  public Deliverable getdeliverable(){
    return this.deliverable;
  }
  public double getcost(){
    return this.cost;
  }
  public String geturgency(){
    return this.urgency;
  }
  public void setcost(double cost){
    this.cost=cost;
  }
  public void setstatus(String status){
    this.status=status;
  }
  public Drone getdrone(){
    return this.drone;
  }
  public void setdrone(Drone d){
    this.drone=d;
  }
}
