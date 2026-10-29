class ClockTime{
    int hour, minute;
    public int compara(ClockTime a){
        if(a.hour == hour){
            if(a.minute >= minute) return 1;
            return 0;
        }
        if(a.hour > hour) return 1;
        return 0;
    }
}

class Schedule{
    ClockTime departure;
    ClockTime arrival;
    public int durata(){
        return arrival.hour*60 + arrival.minute - departure.hour*60 - departure.minute;
    }
}

class Route{
    String origin;
    String destination;
    Route(String a, String b){
        origin = a;
        destination = b;
    }
    Route(){
        this("", "");
    }
    public boolean verificTurRetur(Route a){
        if(origin == a.destination && destination == a.origin) return true;
        return false;
    }
}

class Train{
    Route r;
    Schedule s;
    boolean local; // local va fi 0 pentru local si 1 pentru international
    Train(Route a, Schedule b, boolean c){
        r = a;
        s = b;
        local = c;
    }
    Train(){
        this(null, null, 0);
    }
    public int valoareBilet{
        if(local == 0){
            return s.durata();
        }
        return 2*s.durata();
    }
}


public class Prob7 {
}
