def pedir_positivo(texto):
    while True:
        try:
            x = float(input(texto))
            if x > 0:
                return x
            print("Debe ser un número positivo.")
        except ValueError:
            print("Entrada no válida.")

base = pedir_positivo("Base: ")
altura = pedir_positivo("Altura: ")
area = base * altura
print(f"Área = {area}")