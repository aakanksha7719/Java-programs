from datetime import date, datetime
# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.
def get_date():
    today = date.today()
    return today.strftime("%B %d, %Y")

def get_time():
    time = datetime.now()
    return time.strftime("%H/%M/%S")

def get_friends():
    friends = ["Yadnesh", "Nihar", "Suyog", "Sanika"]
    return friends

commands_dict = {
    "hi": "Hello there....",
    "how are you": "I am fine",
    "you are available on web": "Not yet... but if you want we could really be there...",
    "Who are you": "Are you serious bro? your asking this question to machine...",
    "what is today's date": get_date(),
    "what is time": get_time(),
    "who created you": "Dnyanesh Bachhav is the one...",
    "Are you a smart bot": "Not yet... surely will become one like JARVIS",
    "What is your age": "May be 1 hour as pratical started on 9:45AM only...",
    "list my friends name": get_friends(),


}
def response(command):
    # Use a breakpoint in the code line below to debug your script.
    # print(f'Hi, {command}')  # Press Ctrl+F8 to toggle the breakpoint.
    for key in commands_dict:
        if command == key:
           return commands_dict[key]

    return "Please enter a valid key..."


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    # response('PyCharm')
    while True:

        command = input("Me: ")
        print("Chatbot: ", response(command))

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
