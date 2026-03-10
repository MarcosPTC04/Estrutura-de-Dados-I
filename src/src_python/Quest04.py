total_segundos = int(input("Digite o tempo em segundos: "))

horas = total_segundos // 3600
resto = total_segundos % 3600

minutos = resto // 60
segundos = resto % 60

print(horas, "h,", minutos, "min e", segundos, "seg")