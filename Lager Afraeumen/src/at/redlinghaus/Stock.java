package at.redlinghaus;

public class Stock {

    private Field[][] matrix = new Field[10][10];
    private boolean isEmpty = false;

    public Stock(){
        for (int i = 0; i < matrix.length; i++){
            for ( int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = new Field();
            }
        }
    }

    public void switchEmpty() {
        boolean isNotEmpty = false;
        for(int i = 0; i < getMatrix().length; i++){
            for (int j = 0; j < getMatrix()[i].length; j++){
                if(!(i == 0 && j == 0)){
                    if(getMatrix()[i][j].getProductsOnField().size() > 0) {
                        isNotEmpty = true;
                    }
                }
            }
        }
        setEmpty(!isNotEmpty);
    }

    public Field[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Field[][] matrix) {
        this.matrix = matrix;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
