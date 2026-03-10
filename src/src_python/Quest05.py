def verificar_unicos(vetor):
    tamanho = len(vetor)

    for i in range(tamanho):
        for j in range(i + 1, tamanho):
            if vetor[i] == vetor[j]:
                return "Há números repetidos na lista."

    return "Todos os números são únicos."

numeros = [1, 2, 3, 4, 5]

resultado = verificar_unicos(numeros)
print(resultado)