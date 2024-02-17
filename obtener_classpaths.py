import pandas as pd

# Leer el primer archivo y crear un DataFrame
data1 = []
with open('classes.txt', 'r') as file:
    for line in file:
        parts = line.strip().split(' ')
        project_name = parts[0]
        class_name = ' '.join(parts[1:])
        data1.append([project_name, class_name])
df1 = pd.DataFrame(data1, columns=['Project Name', 'Class Path'])

# Leer el segundo archivo y crear un DataFrame
data2 = []
with open('panichella_classes.txt', 'r') as file:
    for line in file:
        parts = line.strip().split(' ')
        project_name = parts[0]
        class_path = ' '.join(parts[1:])
        data2.append([project_name, class_path])
df2 = pd.DataFrame(data2, columns=['Project Name', 'Class Name'])

# Combinar ambos DataFrames en uno solo usando 'Project Name' como clave
df_combined = pd.merge(df1, df2, on='Project Name', how='inner')

# Crear un nuevo DataFrame filtrado donde ClassName aparece en ClassPath
filtered_df = df_combined[df_combined.apply(lambda row: row['Class Name'] == row['Class Path'].split(".")[-1], axis=1)]

# Imprimir el DataFrame filtrado
print(filtered_df)

# Guardar el DataFrame filtrado en un archivo CSV
filtered_df.to_csv('filtered_classes.csv', index=False)