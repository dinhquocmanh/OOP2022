"""List files and dirs in a Directory"""
import os 

def get_list_dir(path):
    # get all sub files and dir of a path
    return os.listdir(path)



if __name__ == "__main__":
    path = input()
    ldir = get_list_dir(path)
    print("Dir: " + path)
    for f in ldir:
        # if os.path.isdir(path+"/"+f):
        #     print("\tSub dir: " + f)
        #     subdir=get_list_dir(path+"/"+f)
        #     for s in subdir:
        #         print("\t\t"+s)
        # else: print("\t"+f)
        print("\t"+f)