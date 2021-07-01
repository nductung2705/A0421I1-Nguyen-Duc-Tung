function inputMatrix(){
            do{
            var width=parseInt(prompt("Nhập chiều dài ma trận"));
            }
            while(isNaN(width)||width<=0)
            do{
            var length=parseInt(prompt("Nhập chiều dài ma trận"));
            }
            while(isNaN(length)||length<=0)
            var matrix=new Array(width);
            for(let i=0;i<width;i++){
                matrix[i]=new Array(length);
                for(let j=0;j<length;j++){
                    matrix[i][j]=Math.round(Math.random()*9);
                }
            }
            for(let a=0;a<width;a++){
                document.write("[")
                for(let b=0;b<length;b++){
                    document.write(matrix[a][b]+" ")
                }
                document.write("]"+"<br>")
            }
            return matrix;
        }