# User settings (don't use the \ character)
target_folders = [ "materials", "models", "particles", "scenes","sound","resource" ]
file_types = ["vmt", "vtf", "mdl", "phy", "vtx", "vvd", "pcf", "vcd","wav","mp3","res"]

#Place here the path to your portal 2 vpk file, switch any "\" for "\\" like the example below
vpk_path='"D:\\Arquivos de Programas (x86)\\Steam\\steamapps\\common\\Portal 2\\bin\\vpk.exe"'

# Script begins, generates responsefile.txt
import os,subprocess

from os.path import join
response_path = join(os.getcwd(),"responsefile.txt")

out = open(response_path,'w')
len_cd = len(os.getcwd()) + 1

for user_folder in target_folders:
	for root, dirs, files in os.walk(join(os.getcwd(),user_folder)):
		for file in files:
			if len(file_types) and file.rsplit(".")[-1] in file_types:
				out.write(os.path.join(root[len_cd:].replace("/","\\"),file) + "\n")
out.close()

#This section generates the batch file and executes (for some reason I could only execute the process like this)
title_text = 'ECHO !#!#!#!#!===== DO NOT CLOSE THIS WINDOW UNTIL THE END OF THE PROCESS =====!#!#!#!#! \n'
directory = join(os.getcwd())
with open(os.path.join(directory, 'packing.bat'), 'w') as OPATH:
    OPATH.writelines(['@ECHO OFF \n',title_text,vpk_path,' -M a pak01 @responsefile.txt \n','pause'])
    
response_p = join(os.getcwd(),"packing.bat")
subprocess.call([response_p])


