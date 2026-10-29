class ClockTime{
    int hour, minute;
    ClockTime(int h, int m){
        hour = h; minute = m;
    }
    ClockTime(){
        this(0, 0);
    }
    public int compara(ClockTime a){
        if(a.hour == hour){
            return 0;
        }
        if(a.hour > hour) return 1;
        return 0;
        // 1 inseamna a > this; 0 inseamna this >= a
    }
}

class Schedule{
    ClockTime departure;
    ClockTime arrival;
    Schedule(ClockTime d, ClockTime a){
        departure = d;
        arrival = a;
    }
    Schedule(){
        this(null, null);
    }
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
    Train(Route a, Schedule b, boolean c){
        r = a;
        s = b;
        local = c;
    }
    Train(){
    }
            return s.durata();
        }
        return 2*s.durata();
    }
    public String toString(){
        return local + " " + r.origin + " (" + s.departure.hour + ":" + s.departure.minute + ") -> " + r.destination + " (" + s.arrival.hour + ":" + s.arrival.minute + ")";
    }
    public static void main(String[] args){
        Train t1 = new Train(new Route("Bucuresti", "Paris"), new Schedule(new ClockTime(12, 30), new ClockTime(15, 40)), true);
        System.out.println(t1.toString());
    }
}


public class Prob7 {
}
