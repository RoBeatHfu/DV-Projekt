from msilib.schema import File
from github import Github
import os

g = Github("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")      #connect to github via acces token
repo = g.get_repo("RoBeatHfu/DV-Projekt")                   #get our project repository as object
directory = os.path.dirname(os.path.abspath(__file__))      #get path to directory so that it can find it even when users save it in a different directory
filename = os.path.join(directory, "Highscore.md")          #make it an absolute path to a file instead of a directory
file = repo.get_contents("Highscore.md")
highscore = open(filename, "w")
content = str(file.decoded_content)
content = content.lstrip(content[0])
content = content.strip("'")
print(content)
highscore.write(content)