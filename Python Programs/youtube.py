# From Python 3 by Bill Lubanovic

import json
from urllib.request import urlopen

url = "https://raw.githubusercontent.com/koki0702/introducing-python/master/dummy_api/youTube_top_rated.json"

response = urlopen(url)
contents = response.read()

data = json.loads(contents)
for video in data['feed']['entry'][0:6]:
    print(video['title']['$t'])
