valor = int(input("Digite o valor (multiplo de 10): "))

notas_50 = valor // 50
resto = valor % 50
notas_20 = resto // 20
resto = resto % 20
notas_10 = resto // 10

print("Notas de 50:", notas_50)
print("Notas de 20:", notas_20)
print("Notas de 10:", notas_10)