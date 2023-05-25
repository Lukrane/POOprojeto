
public class mew extends teste{
    
    public mew(int ivhp, int ivatk, int ivdef, int ivspa, int ivspf, int ivspe, int evhp, int evatk, int evdef,
            int evspa, int evspf, int evspe, String move1, String move2, String move3, String move4, String nature) {
        super(ivhp, ivatk, ivdef, ivspa, ivspf, ivspe, evhp, evatk, evdef, evspa, evspf, evspe, move1, move2, move3, move4,
                nature);
        natureincrement = calcularnaturepositiva();      
        naturedecrement = calcularnaturenegativa();    
        statsf[0] = calcularhp(); 
        statsf[1] = calcularatk(); 
        statsf[2] = calculardef(); 
        statsf[3] = calcularspa(); 
        statsf[4] = calcularspf(); 
        statsf[5] = calcularspe(); 
        
        
        
    }
        
    public float[] natureincrement = new float[5];
    public float[] naturedecrement = new float[5];
    public int[] stats = new int[]{100, 100, 100, 100, 100, 100};
    public String[] type = new String[]{"psychic", null};
    public double[] statsf = new double[6];
    public double calcularhp(){
        return Math.floor((((2*stats[0]+ivhp+(evhp/4))*100)/100)+100+10);
        
    }
    public double calcularatk(){
        return Math.floor(((((2*stats[1]+ivatk+(evatk/4))*100)/100)+5)*natureincrement[0]*naturedecrement[0]);
        
    }
    public double calculardef(){
        return Math.floor(((((2*stats[2]+ivdef+(evdef/4))*100)/100)+5)*natureincrement[1]*naturedecrement[1]);
        
    }
    public double calcularspa(){
        return Math.floor(((((2*stats[3]+ivspa+(evspa/4))*100)/100)+5)*natureincrement[2]*naturedecrement[2]);
        
    }
    public double calcularspf(){
        return Math.floor(((((2*stats[4]+ivspf+(evspf/4))*100)/100)+5)*natureincrement[3]*naturedecrement[3]);
        
    }
    public double calcularspe(){
        return Math.floor(((((2*stats[5]+ivspe+(evspe/4))*100)/100)+5)*natureincrement[4]*naturedecrement[4]);
        
    }
    public float[] calcularnaturepositiva(){
        for(int i=0;i<5; i++ ){
            natureincrement[i] = 1f;
        }
        if (nature == "Lonely" || nature == "Brave" || nature == "Adamant" || nature == "Naughty"){
            natureincrement[0] = 1.1f;
        
        }
        else if (nature == "Bold" || nature == "Relaxed" || nature == "Impish" || nature == "Lax"){
            natureincrement[1] = 1.1f;
        
        }
        else if (nature == "Modest" || nature == "Mild" || nature == "Quiet" || nature == "Rash"){
            natureincrement[2] = 1.1f;
        
        }
        else if (nature == "Calm" || nature == "Gentle" || nature == "Sassy" || nature == "Careful"){
            natureincrement[3] = 1.1f;
        
        }
        else if (nature == "Timid" || nature == "Hasty" || nature == "Jolly" || nature == "Naive"){
            natureincrement[4] = 1.1f;
        
        }
            
        return natureincrement;
         
    }
    public float[] calcularnaturenegativa(){
        for(int i=0;i<5; i++ ){
            naturedecrement[i] = 1f;
        }
        if (nature == "Bold" || nature == "Timid" || nature == "Modest" || nature == "Calm"){
            naturedecrement[0] = 0.9f;
        
        }
        else if (nature == "Lonely" || nature == "Hasty" || nature == "Mild" || nature == "Gentle"){
            naturedecrement[1] = 0.9f;
        
        }
        else if (nature == "Adamant" || nature == "Impish" || nature == "Jolly" || nature == "Careful"){
            naturedecrement[2] = 0.9f;
        
        }
        else if (nature == "Naughty" || nature == "Lax" || nature == "Naive" || nature == "Rash"){
            naturedecrement[3] = 0.9f;
        
        }
        else if (nature == "Brave" || nature == "Relaxed" || nature == "Quiet" || nature == "Sassy"){
            naturedecrement[4] = 0.9f;
        
        }
            
        return naturedecrement;
         
    }

 

    public void confirmarstats(){
        for (int i = 0; i<6; i++){
        System.out.println(stats[i]);
        }
    }
    public void confirmartype(){
        for (int i = 0; i<2; i++){
        System.out.println(type[i]);
        }
    }
    public void confirmarstatsfinais(){
        for(int i = 0;i<6;i++){
            System.out.println(String.format("%.0f", statsf[i]));
        }

    }
    public void confirmariv(){
        System.out.println(ivhp);
        System.out.println(ivatk);
        System.out.println(ivdef);
        System.out.println(ivspa);
        System.out.println(ivspf);
        System.out.println(ivspe);

    }
    public void confirmarev(){
        System.out.println(evhp);
        System.out.println(evatk);
        System.out.println(evdef);
        System.out.println(evspa);
        System.out.println(evspf);
        System.out.println(evspe);

    }
    public void confirmarmoves(){
        System.out.println(move1);
        System.out.println(move2);
        System.out.println(move3);
        System.out.println(move4);

    }
    public void confirmarnature(){
        System.out.println(nature);
    }
    public void confirmarall(){
        confirmarnature();
        confirmarstats();
        confirmartype();
        confirmarev();
        confirmariv();
        confirmarmoves();
    }
}
