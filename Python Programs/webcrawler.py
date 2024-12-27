import requests
from bs4 import BeautifulSoup
from urllib.parse import urljoin

# Function to crawl a web page and extract all links
def crawl(url):
    # Send an HTTP request to the given URL
    response = requests.get(url)
    
    # Check if the request was successful (status code 200)
    if response.status_code != 200:
        print(f"Failed to retrieve {url}")
        return

    # Parse the HTML content of the page
    soup = BeautifulSoup(response.text, 'html.parser')

    # Find all anchor tags (<a>) and extract the href attributes (URLs)
    links = soup.find_all('a', href=True)
    
    # Loop through each link and print the full URL
    for link in links:
        # Get the href attribute (relative or absolute URL)
        link_url = link['href']
        
        # Resolve relative URLs to absolute URLs
        full_url = urljoin(url, link_url)
        
        print(full_url)

# Start URL to crawl
start_url = 'https://google.com'

# Crawl the start URL
crawl(start_url)
