senha = input("Digite a senha: ")

tamanho_valido = False
if len(senha) >= 8:
    tamanho_valido = True
especial_valido = False

for caractere in senha:
    if caractere == '@' or caractere == '#' or caractere == '$' or caractere == '%' or caractere == '&' or caractere == '*':
        especial_valido = True

if tamanho_valido and especial_valido:
    print("Senha Válida")
else:
    print("Senha Inválida")

    if not tamanho_valido:
        print("A senha deve possuir pelo menos 8 caracteres.")

    if not especial_valido:
        print("A senha deve conter pelo menos um caractere especial (@, #, $, %, &, *).")