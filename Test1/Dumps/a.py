#open every file in DumpsInjected and count if it has the string Writing JUnit

import os

def count_files_with_string(directory, string):
    count = 0
    for filename in os.listdir(directory):
        with open(directory + filename, 'r') as file:
            if string in file.read():
                count += 1
    return count

print(count_files_with_string('seed_1/DumpsOriginal/', 'Writing JUnit'))
