public class TennisGame {
    private static final int scoreMax =4;
    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore = 0;
        if (scorePlayer1 == scorePlayer2) {
            switch (scorePlayer1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (scorePlayer1 >= scoreMax || scorePlayer2 >= scoreMax) {
            score = resultScore(scorePlayer1, scorePlayer2);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scorePlayer1;
                else {
                    score = score + "-";
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case 0:
                        score = score + "Love";
                        break;
                    case 1:
                        score = score + "Fifteen";
                        break;
                    case 2:
                        score = score + "Thirty";
                        break;
                    case 3:
                        score = score + "Forty";
                        break;
                }
            }
        }
        return score;
    }

    private static String resultScore(int scorePlayer1, int scorePlayer2) {
        String score;
        int minusResult = scorePlayer1 - scorePlayer2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }
}