algoritmo "Convers�o temperatura"
// Data : 17/05/2022
// Se��o de Declara��es
var
temperaturaF: real
temperaturaC:real
inicio

escreval ("Informe a temperatura (F): ")
leia (temperaturaF)
temperaturaC <- (temperaturaF - 32) * (5/9)
escreval ("A temperatura em graus Celcius �: ", temperaturaC:1:2)
se temperaturaC <= 15 entao
   escreval ("Est� frio")
senao
   se temperaturaC > 28 entao
      escreval ("Est� calor")
   senao
      escreval ("Est� agrad�vel")
   FIMSE
FIMSE

fimalgoritmo
