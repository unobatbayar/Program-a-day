import requests
from bs4 import BeautifulSoup
from urllib.parse import urljoin

def grab_urls(url):
    # Send a GET request to the URL
    response = requests.get(url)
    
    # If the request was successful (HTTP status code 200)
    if response.status_code == 200:
        html_content = response.text
        
        # Parse the HTML content with BeautifulSoup
        soup = BeautifulSoup(html_content, 'html.parser')
        
        # Find all anchor tags (<a>) with href attribute
        links = soup.find_all('a', href=True)
        
        # Extract the URLs
        urls = set()  # Use a set to avoid duplicates
        for link in links:
            # Get the href attribute (URL)
            href = link.get('href')
            
            # Resolve relative URLs to absolute URLs
            absolute_url = urljoin(url, href)
            
            # Add the URL to the set
            urls.add(absolute_url)
        
        return urls
    else:
        print(f"Failed to retrieve the page: {response.status_code}")
        return None

# Example usage
if __name__ == "__main__":
    target_url = ""  # Change to any URL you want
    urls = grab_urls(target_url)
    
    if urls:
        for url in urls:
            print(url)
