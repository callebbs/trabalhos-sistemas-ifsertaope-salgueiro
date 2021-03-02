arquivo = open("dados_aula00_escrita.txt", "w") 

arquivo.write("Sistemas para Internet\n")
for i in range(1,12):
    arquivo.write(str(i) + "\n")

arquivo.write("Fim da escrita no arquivo.")

arquivo.close()