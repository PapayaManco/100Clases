from copiador_evosuite import copiar_a_proyectos_inyectados
from extraer_info import info
from copiador_evosuite import copiar_a_original
import subprocess
import os
import random
import shutil

EVOSUITE_JAR = "evosuite-master-1.2.1-SNAPSHOT.jar"
#EVOSUITE_JAR = "evosuite-master-1.0.7-SNAPSHOT.jar"

# Funciones de preparación
copiar_a_proyectos_inyectados(EVOSUITE_JAR)
copiar_a_original(EVOSUITE_JAR)

projects = [row[0] for row in info]
projects = list(set(projects))
projects_cp = {}
for project in projects:
    properties_file_path = f'projects og/{project}/evosuite-files/evosuite.properties'
    if os.path.exists(properties_file_path):
        with open(properties_file_path, 'r') as f:
            first_line = f.readline().strip()
            value_after_equal_sign = first_line.split('=')[1].strip()
            value_after_equal_sign = value_after_equal_sign.replace(':', ';')
            projects_cp[project] = value_after_equal_sign

for iteracion in range(1,2):
    seed = str(random.randint(1000000000000, 9999999999999))
    for fila in info:
        proyecto = fila[0]
        clase_path = fila[1]
        clase = fila[2]
        print("Generando tests a la clase: ",clase)
        # Comando sin redirección
        command = [
            "java",
            "-Xmx3G",
            "-jar",
            EVOSUITE_JAR,
            "-generateMOSuite",
            "-Dalgorithm=DynaMOSA",
            "-Dsearch_budget=180",
            "-Dassertion_timeout=600",
            "-Dminimization_timeout=600",
            "-Dconfiguration_id=EvoSuite_fixed",
            "-Doutput_variables=TARGET_CLASS,criterion,configuration_id,Total_Goals,Total_Branches,Lines,Covered_Goals,Generations,Statements_Executed,Fitness_Evaluations,Tests_Executed,Generations,Total_Time,Size,Result_Size,Length,Result_Length,BranchCoverage,Random_Seed",
            "-Dshow_progress=FALSE",
            "-mem","2500",
            "-Dplot=false",
            "-Dclient_on_thread=false",
            "-class", clase_path,
            "-projectCP", projects_cp[proyecto]
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
            "java",
            "-Xmx3G",
            "-jar",
            EVOSUITE_JAR,
            "-generateMOSuite",
            "-Dalgorithm=DynaMOSA",
            "-Dsearch_budget=180",
            "-Dassertion_timeout=600",
            "-Dminimization_timeout=600",
            "-Dconfiguration_id=EvoSuite_fixed",
            "-Doutput_variables=TARGET_CLASS,criterion,configuration_id,Total_Goals,Total_Branches,Lines,Covered_Goals,Generations,Statements_Executed,Fitness_Evaluations,Tests_Executed,Generations,Total_Time,Size,Result_Size,Length,Result_Length,BranchCoverage,Random_Seed",
            "-Dshow_progress=FALSE",
            "-mem","2500",
            "-Dplot=false",
            "-Dclient_on_thread=false",
            "-class", clase_path
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
for project in projects:
    source_folder = 'projects og/'+project+'/test_seeds'
    destination_folder = 'tests_seeds/'+project
    # Copy the folder and its contents
    if os.path.exists(source_folder):
        shutil.copytree(source_folder, destination_folder)