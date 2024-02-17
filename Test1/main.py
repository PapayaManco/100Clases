from copiador_evosuite import copiar_a_proyectos_inyectados
from extraer_info import info
from copiador_evosuite import copiar_a_original
import subprocess
import os
import random
c = 0

# Funciones de preparación
copiar_a_proyectos_inyectados()
copiar_a_original()

# Obtener un numero random de 13 digitos
seed = str(random.randint(1000000000000, 9999999999999))
#original
for fila in info:
    proyecto = fila[0]
    clase_path = fila[1]
    clase = fila[2]
    print("Generando tests a la clase: ",clase)
    # Comando sin redirección
    command = [
        'java', '-jar', 'evosuite-master-1.2.1-SNAPSHOT.jar',
        '-class', clase_path,
        '-projectCP', 'build/classes',
        '-seed', seed,
        '-Dshow_progress=FALSE',
        '-Dsearch_budget=180',
        '-Dassertion_timeout=600',
        '-Dminimization_timeout=600',
        '-Dconfiguration_id=EvoSuite_fixed'
        '-Dalgorithm=DynaMOSA',
    ]
    # Nombre del archivo de salida
    output_file = 'DumpsOriginal/' + clase + '_original.txt'

    try:
        # Ejecutar el comando y redirigir la salida al archivo
        with open(output_file, 'w') as output:
            subprocess.run(command, cwd="projects og/" + proyecto, stdout=output, stderr=subprocess.PIPE, check=True)
    except subprocess.CalledProcessError as e:
        print("Error:", e)
print("Original listo")



# Injected
for fila in info:
    clase_path = fila[1]
    clase = fila[2]
    proyecto = fila[0]
    print("Generando tests a la clase: ",clase)
    # Comando sin redirección
    command = [
        'java', '-jar', 'evosuite-master-1.2.1-SNAPSHOT.jar',
        '-class', clase_path,
        '-projectCP', 'build/classes',
        '-seed', seed,
        '-Dshow_progress=FALSE',
        '-Dsearch_budget=180',
        '-Dassertion_timeout=600',
        '-Dminimization_timeout=600',
        '-Dconfiguration_id=EvoSuite_fixed',
        '-Dalgorithm=DynaMOSA',
    ]
    # Nombre del archivo de salida
    output_file = 'DumpsInjected/' + clase + '_injected.txt'

    try:
        # Ejecutar el comando y redirigir la salida al archivo
        with open(output_file, 'w') as output:
            subprocess.run(command, cwd="projects/" + proyecto, stdout=output, stderr=subprocess.PIPE, check=True)
    except subprocess.CalledProcessError as e:
        print("Error:", e)

print("Inyectado listo")

import get_results
