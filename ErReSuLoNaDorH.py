import argparse
import sys
import random
from version import *

def do_main():
    args = parse()
    check_args(args)

def parse():
    parser = argparse.ArgumentParser()

    parser.add_argument("-v", action="store_true", help="Display ErReSuLoNaDorH's version")
    parser.add_argument("-t", type=str, metavar="<text>", help="Text to ReSuLoNaRH")
    parser.add_argument("-f", type=str, metavar="<path>", help="File to ReSuLoNaRH")

    return parser.parse_args(sys.argv[1:])
    
def check_args(args):
    if args.v:
        print_version()
        sys.exit(0)
    if args.f:
        do_file_magic(args.f)
    elif not args.t:
        print("[Error] no text specified (--text or --help)")
        sys.exit(-1)
    else:
        print(do_magic(args.t))


def print_version():
    print("Version: %s" % ERESULONADORH_VERSION)
    print("Authors:\n\tPhyrionX - original idea\n\tuZetta27 - python support")

def do_magic(text):
    shurtext = ""
    for i, ch in enumerate(text):
        if (ch == ' '):
            final_h = random.choice([True, False])
            if final_h:
                is_h_upper = random.choice([True, False])
                if is_h_upper:
                    shurtext += 'H '
                else:
                    shurtext += 'h '
            else:
                shurtext += ' '
        else:
            if ((i != 0) and (i % 2 == 0)):
                if ch.islower():
                    shurtext += ch.upper()
                else:
                    shurtext += ch.lower()
            else:
                shurtext += ch
    if shurtext:
        shurtext + "h"
    return shurtext

def do_file_magic(path):
    with open(path) as f:
        for line in f:
            print(do_magic(line))
do_main()
