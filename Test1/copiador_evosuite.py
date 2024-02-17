# i want to copy the file evosuite-tests/evosuite-tests-1.2.1-SNAPSHOT.jar to all the folders in the folder projects

import os
import shutil


def copiar_a_proyectos_inyectados():
# get the current working directory and go to the folder projects
    cwd = os.getcwd()
    cwd = cwd + "/projects"
    #print(cwd)

    # get the list of all the folders in the current working directory
    folders = os.listdir(cwd)
    #print(folders)

    # copy the file evosuite-tests/evosuite-tests-1.2.1-SNAPSHOT.jar to all the folders in the folder projects

    for folder in folders:
        if folder != ".DS_Store":
            shutil.copyfile("evosuite-master-1.2.1-SNAPSHOT.jar", cwd + "/" + folder + "/evosuite-master-1.2.1-SNAPSHOT.jar")
            #print("copied to " + folder)

def copiar_a_original():
    # get the current working directory and go to the folder projects
    cwd = os.getcwd()
    cwd = cwd + "/projects og"
    #print(cwd)

    # get the list of all the folders in the current working directory
    folders = os.listdir(cwd)
    #print(folders)

    # copy the file evosuite-tests/evosuite-tests-1.2.1-SNAPSHOT.jar to all the folders in the folder projects

    for folder in folders:
        if folder != ".DS_Store" and folder != ".hgignore":
            shutil.copyfile("evosuite-master-1.2.1-SNAPSHOT.jar", cwd + "/" + folder + "/evosuite-master-1.2.1-SNAPSHOT.jar")
            #print("copied to " + folder)