# Progress Bar with Downloader
# @program 11 
# date 06-11-2018

from tqdm import tqdm
import time

for i in tqdm(range(500)):
    time.sleep(0.01)