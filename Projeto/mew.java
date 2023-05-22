
public class mew extends teste{

    public mew(int ivhp, int ivatk, int ivspa, int ivdef, int ivspf, int ivspe, int evhp, int evatk, int evspa,
            int evdef, int evspf, int evspe, String move1, String move2, String move3, String move4, String nature) {
        super(ivhp, ivatk, ivspa, ivdef, ivspf, ivspe, evhp, evatk, evspa, evdef, evspf, evspe, move1, move2, move3, move4,
                nature);
        

    }


    public int[] stats = new int[]{100, 100, 100, 100, 100, 100};
    public String[] type = new String[]{"psychic", null};
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
