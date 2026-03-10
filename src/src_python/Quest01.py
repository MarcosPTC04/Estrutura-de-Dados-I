notas = [7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8]

soma = 0
for nota in notas:
    soma = soma + nota

media = soma / len(notas)

print("Média das notas:", media)

contador = 0
for nota in notas:
    if nota > media:
        contador = contador + 1

print("Quantidade de alunos acima da média:", contador)

maior = notas[0]

for nota in notas:
    if nota > maior:
        maior = nota

print("Maior nota:", maior)