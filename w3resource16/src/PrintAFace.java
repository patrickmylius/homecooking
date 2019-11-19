public class PrintAFace {
    public static void main(String[] args) {

        System.out.println(" +\\\"\\\"\\\"\\\"\\\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");

        String[] palle = new String[5];

        palle[0] = " +\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"+ ";
        palle[1] = "[| o o |]";
        palle[2] = " |  ^  |";
        palle[3] = " | '-' |";
        palle[4] = " +-----+";

        for (int i = 0; i < 5; i++){
            System.out.println(palle[i]);
        }
    }
}
