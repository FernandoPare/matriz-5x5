matriz = []
for i in range(5):
    fila = []
    for j in range(5):
        valor = int(input(f"Ingrese el valor para la posición [{i}][{j}]: "))
        fila.append(valor)
    matriz.append(fila)
print("\nMatriz ingresada:")
for i in range(5):
    for j in range(5):
        print(matriz[i][j], end="\t")
    print()