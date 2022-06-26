from msilib.schema import File
from github import Github
import os

g = Github("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")      #connect to github via acces token
repo = g.get_repo("RoBeatHfu/DV-Projekt")                   #get our project repository as object
directory = os.path.dirname(os.path.abspath(__file__))      #get path to file so that it can find it even when users save it in a different directory
filename = os.path.join(directory, "Highscore.md")          #make it an absolute path to a file instead of a directory
file = repo.get_contents("Highscore.md")                    #get content of the highscore, important as we need the path for the file we want to update
highscoreFile = open(filename, "r")
highscoreList = highscoreFile.readlines()
highscoreFile.close()
highscore = ""
for player in highscoreList:
    highscore = highscore + player
print(highscore)
repo.update_file(file.path, "update of Highscore", highscore, file.sha)
