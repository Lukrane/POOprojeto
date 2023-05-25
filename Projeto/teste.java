import java.lang.Math;


abstract class teste implements inter{
    public int ivhp;
    public int ivatk;
    public int ivspa;
    public int ivdef;
    public int ivspf;
    public int ivspe;
    public int evhp;
    public int evatk;
    public int evspa;
    public int evdef;
    public int evspf;
    public int evspe;
    public String move1;
    public String move2;
    public String move3;
    public String move4;
    public String nature;

    public String type[] = new String[2];
    public int[] stats = new int[6];
    public teste(int ivhp, int ivatk, int ivdef, int ivspa, int ivspf, int ivspe, int evhp, int evatk, int evdef,
            int evspa, int evspf, int evspe, String move1, String move2, String move3, String move4, String nature) {
        this.ivhp = Math.max(0, Math.min(ivhp, 31));
        this.ivatk = Math.max(0, Math.min(ivatk, 31));
        this.ivspa = Math.max(0, Math.min(ivspa, 31));
        this.ivdef = Math.max(0, Math.min(ivdef, 31));
        this.ivspf = Math.max(0, Math.min(ivspf, 31));
        this.ivspe = Math.max(0, Math.min(ivspe, 31));
        this.evhp = Math.max(0, Math.min(evhp, 252));
        this.evatk = Math.max(0, Math.min(evatk, 252));
        this.evspa = Math.max(0, Math.min(evspa, 252));
        this.evdef = Math.max(0, Math.min(evdef, 252));
        this.evspf = Math.max(0, Math.min(evspf, 252));
        this.evspe = Math.max(0, Math.min(evspe, 252));
        if(this.evhp + this.evatk + this.evspa + this.evdef + this.evspe + this.evspf > 508){
            System.out.println("Valor de evs excedido, maximo de 508");
            this.evhp = 0;
            this.evatk = 0;
            this.evspa = 0;
            this.evspf = 0;
            this.evdef = 0;
            this.evspe = 0;
        }
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
        this.nature = nature;
    }

    

}
