import argparse
import sys
import random
from version import *

def do_main():
    args = parse()
    check_args(args)
    shurtext = do_magic(args.t)
    print(shurtext)

def parse():
    parser = argparse.ArgumentParser()

    parser.add_argument("-v", action="store_true", help="Display ErReSuLoNaDorH's version")
    parser.add_argument("-t", type=str, metavar="<text>", help="Text to ReSuLoNaRH")

    return parser.parse_args(sys.argv[1:])
    
def check_args(args):
    if args.v:
        print_version()
        sys.exit(0)
    if not args.t:
        print("[Error] no text specified (--text or --help)")
        sys.exit(-1)

def print_version():
    print("Version: %s" % ERESULONADORH_VERSION)
    print("Authors:\n\tPhyrionX - original idea\n\tuZetta27 - python support")

def do_magic(text):
    shurtext = ""
    for i, ch in enumerate(text):
        if (ch == ' '):
            is_h_upper = random.choice([True, False])
            if is_h_upper:
                shurtext += 'H '
            else:
                shurtext += 'h '
        else:
            if ((i != 0) and (i % 2 == 0)):
                if ch.islower():
                    shurtext += ch.upper()
                else:
                    shurtext += ch.lower()
            else:
                shurtext += ch
    return shurtext + "h"

do_main()
