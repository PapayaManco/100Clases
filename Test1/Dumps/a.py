import os

def count_files_with_string(directory, string):
    count = 0
    for filename in os.listdir(directory):
        with open(directory + filename, 'r') as file:
            if string in file.read():
                count += 1
            else:
                print(filename)
    return count

print(count_files_with_string('seed_1/DumpsOriginal/', "Resulting test suite's mutation score"))
