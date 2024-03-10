import os
import shutil

def copiar_a_proyectos_inyectados(evosuite_file):
    cwd = os.getcwd()
    cwd = cwd + "/projects"
    folders = os.listdir(cwd)
    for folder in folders:
        if folder != ".DS_Store":
            shutil.copyfile(evosuite_file, cwd + "/" + folder + "/"+evosuite_file)

def copiar_a_original(evosuite_file):
    cwd = os.getcwd()
    cwd = cwd + "/projects og"
    folders = os.listdir(cwd)
    for folder in folders:
        if folder != ".DS_Store" and folder != ".hgignore":
            shutil.copyfile(evosuite_file, cwd + "/" + folder + "/" + evosuite_file)