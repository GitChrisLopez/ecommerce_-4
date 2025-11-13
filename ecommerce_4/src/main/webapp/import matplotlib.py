import matplotlib.pyplot as plt
import numpy as np

# Datos
x_data = [0.05, 0.4, 0.8, 1.2, 1.6, 2.0, 2.4]
y_data = [500, 750, 1000, 1500, 2000, 3000, 3800]

# Ecuación ajustada
a = 1648
b = 0.495
x_model = np.linspace(0.05, 2.4, 100)
y_model = a * x_model**b

# Gráfica
plt.figure(figsize=(8, 6))
plt.scatter(x_data, y_data, color='red', label='Datos')
plt.plot(x_model, y_model, color='blue', label='Ajuste: y = 1648 x^{0.495}')
plt.xlabel('x')
plt.ylabel('y')
plt.legend()
plt.grid(True)
plt.show()