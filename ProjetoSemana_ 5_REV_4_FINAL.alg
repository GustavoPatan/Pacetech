algoritmo "Projeto Semana 5 - Conversão temperaturas"
// Função :
// Autor :
// Data : Junho/2022

var
aux1, aux2: real
sel : literal
i, j : inteiro
temperatura, horario : vetor[1..4] de real

procedimento menu()
inicio
Escreval("**********Programa para conversão de temperatura**********")
escreval("")
escreval("Selecione a opção desejada:")
escreval("1- Converter Celsius para Fahrenheit")
escreval("2- Converter Fahrenheit para Celsius")
escreval("3- Sair")
leia(sel)
escreval("")
fimprocedimento

procedimento coleta()
inicio
escreval("Você deve informar 4 temperaturas e o horário em que elas foram coletadas.")
escreval("Informe apenas números.")
escreval("")
para i de 1 ate 4 faca
   escreva("Informe a ",i, "ª temperatura:")
   leia(temperatura[i])

   escreval("Informe o horário correspondente: (h) ")
   leia(horario[i])
   escreval("")
fimpara
limpatela
fimprocedimento

procedimento Bolha()
inicio
para i de 1 ate 4 faca
   para j de 1 ate 4 faca
      se temperatura[j] > temperatura[i] entao
         aux1 <- temperatura[i]
         aux2 <- horario[i]
         temperatura[i] <- temperatura[j]
         horario[i] <- horario[j]
         temperatura[j] <- aux1
         horario[j] <- aux2
      fimse
   fimpara
fimpara
fimprocedimento

procedimento conv()
inicio
Bolha()
se sel = "1" entao
   para i de 1 ate 4 faca
      escreval("Temperatura", temperatura[i]," graus Celsius regitrada às", horario[i],"h corresponde a ", ((temperatura[i] * 1.8) + 32):4:2," graus Fahrenheit")
   fimpara
   escreval("")
senao
   se sel = "2" entao
      para i de 1 ate 4 faca
         escreval("Temperatura", temperatura[i]," graus Fahrenheit registrada às", horario[i],"h corresponde a ", ((temperatura[i] - 32) / 1.8):4:2," graus Celsius")
      fimpara
      escreval("")
   fimse
fimse

fimprocedimento

inicio

repita
   menu()
   escolha sel

   caso "1"
      coleta()
      conv()

   caso "2"
      coleta()
      conv()
      
   caso "3"
   outrocaso
   limpatela
      escreval("Opção inválida.")
      escreval("")
   fimescolha
ate sel = "3"
limpatela
escreval ("Obrigado por utilizar o programa!")
escreval ("Necessitando de outras soluções em software entre em contato!")
escreval ("Desenvolvido por Gustavo Patan (51) 98322-2310")
fimalgoritmo

