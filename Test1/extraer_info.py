#open clases_info.csv

import csv

# Open the CSV file
with open('clases_info.csv', newline='') as csvfile:
    # Create a CSV reader
    csv_reader = csv.reader(csvfile)

    # Convert each row into a list
    rows_as_lists = [row for row in csv_reader]

# Print the list of rows

info = rows_as_lists
