# Name: Meg Prescott
# 2021-01-27

file_name = input()  #name of file containing input
bound_1 = input()    #lowest boundary word
bound_2 = input()    #highest boundary word

user_file = open(str(file_name))
word_list = user_file.readlines()

for x in word_list:
    x = x.strip('\n')
    if x >= bound_1 and x <= bound_2:
        print(x)

user_file.close()

