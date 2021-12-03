import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting(){
        return "Hello, lovely to see you. How are you?";
    }
    public String guestGreeting(String name) {
        return String.format("\nHello, %s, lovely to see you.", name);
    }
    public String dateAnnouncement(){
        Date date = new Date();
        return "Today is " + date;
    }
    public String respondBeforeAlexis(String conversation){
        if(conversation.contains("Alexis")){
            return conversation;
        }
        else if (conversation.contains("Alfred")){
            return conversation;
        }
        else {
            return conversation;
        }
    }
}