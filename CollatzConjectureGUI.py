import tkinter as GUI

new_text = ("Collatz Conjecture: Start with a number n > 1. Find the number of steps it takes to reach one using "
            "the following process: If n is even, divide it by 2.\nIf n is odd, multiply it by 3 and add 1.")


class Application(GUI.Frame):
    def __init__(self, master):
        super().__init__(master)
        self.master = master
        self.pack()
        self.create_widgets()

    def create_widgets(self):
        self.text1 = GUI.Label(self, text="Hello!", font=('times', 20, 'bold'))
        self.text1.pack()
        self.text2 = GUI.Label(self,text="This script is related to all things Collatz Conjecture I am bothered to think about. Please"
                                    " select an option below.\n\n1: What is the Collatz Conjecture?\n2: Calculate the number of steps "
                                    "for a certain number.\n3: What is the worst number for Collatz Conjecture in a given range?")
        self.text2.pack()
        self.button1 = GUI.Button(self, command = lambda: self.changeText(self.text2, new_text), text = "Button 1")
        self.button2 = GUI.Button(self)
        self.button3 = GUI.Button(self)
        self.button1.pack()
        self.button2.pack()
        self.button3.pack()
        self.button2["text"] = "Button 2"
        self.button3["text"] = "Button 3"

    def changeText(self, c, t):
        c.config(text=t)


root = GUI.Tk()
app = Application(root)
app.mainloop()
