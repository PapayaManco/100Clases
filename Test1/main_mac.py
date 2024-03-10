from copiador_evosuite import copiar_a_proyectos_inyectados
from extraer_info import info
from copiador_evosuite import copiar_a_original
import subprocess
import os
import random
import shutil
c = 0

# Funciones de preparación
copiar_a_proyectos_inyectados()
copiar_a_original()

# Obtener un numero random de 13 digitos
#original
for iteracion in range(1,2):
    seed = str(random.randint(1000000000000, 9999999999999))
    for fila in info:
        proyecto = fila[0]
        clase_path = fila[1]
        clase = fila[2]
        print("Generando tests a la clase: ",clase)
        # Comando sin redirección
        command = [
            'java', '-jar', 'evosuite-master-1.2.1-SNAPSHOT.jar',
            '-class', clase_path,
            '-seed', seed,
            '-Dshow_progress=FALSE',
            '-Dsearch_budget=180',
            '-Dassertion_timeout=600',
            '-Dminimization_timeout=600',
            '-Dconfiguration_id=EvoSuite_fixed'
            '-Dalgorithm=DynaMOSA',
            f'-Dtest_dir=test_seeds/seed_{iteracion}/tests_original'
        ]
        # Nombre del archivo de salida
        output_file = f'Dumps/seed_{iteracion}/DumpsOriginal/' + clase + '_original.txt'
        output_directory = f'Dumps/seed_{iteracion}/DumpsOriginal'
        if not os.path.exists(output_directory):
            os.makedirs(output_directory)

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
            '-seed', seed,
            '-Dshow_progress=FALSE',
            '-Dsearch_budget=180',
            '-Dassertion_timeout=600',
            '-Dminimization_timeout=600',
            '-Dconfiguration_id=EvoSuite_fixed',
            '-Dalgorithm=DynaMOSA',
            f'-Dtest_dir=test_seeds/seed_{iteracion}/tests_injected'
        ]
        # Nombre del archivo de salida
        output_file = f'Dumps/seed_{iteracion}/DumpsInjected/' + clase + '_injected.txt'
        output_directory = f'Dumps/seed_{iteracion}/DumpsInjected'
        if not os.path.exists(output_directory):
            os.makedirs(output_directory)

        try:
            # Ejecutar el comando y redirigir la salida al archivo
            with open(output_file, 'w') as output:
                subprocess.run(command, cwd="projects/" + proyecto, stdout=output, stderr=subprocess.PIPE, check=True)
        except subprocess.CalledProcessError as e:
            print("Error:", e)
    print("Inyectado listo")

#Copiar Tests
projects = [row[0] for row in info]
projects = list(set(projects))
for project in projects:
    source_folder = 'projects og/'+project+'/test_seeds'
    destination_folder = 'tests_seeds/'+project
    # Copy the folder and its contents
    if os.path.exists(source_folder):
        shutil.copytree(source_folder, destination_folder)