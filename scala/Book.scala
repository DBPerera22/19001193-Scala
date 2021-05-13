object Book extends App{
  def Tcost(x:Int){
    var t :Double=0
    if(x>50){
      var y:Int=x-50
      t = (24.95*0.6*x)+150+0.75*y
    }

    else{
      t = (24.95*0.6*x)+3*x
    }
    println("\nTotal Cost is: " +t +"\n");
  }

  Tcost(60);

  }
