# 🗺️ CSBridge/Guinea
This repository holds the CSBridge sections held in Guinea, which all share the same DNS subdomain (guinea.csbridge.org). The repository currently contains the below sections:

|Section|Sources|URL|
|---|---|---|
|Koumbia 2019|[guinea/koumbia/19](guinea/koumbia/19)|https://guinea.csbridge.org/koumbia/19|
|Fria 2019|[guinea/fria/19](guinea/fria/19)|https://guinea.csbridge.org/fria/19|




## 📁 Structure
This repository is structured as illustrated in the below tree. The HTTP root path maps to the `/docs/` directory. The `copy_section_docs.sh` script is used to copy the individual CSBridge section compiled docs to this directory. For instance, the script copies `/guinea/koumbia/19/docs` to `/docs/koumbia/19`. Therefore the Koumbia 2019 section is available at https://guinea.csbridge.org/koumbia/19.


```
├── docs (HTT Root. https://guinea.csbridge.org maps to this)
│   ├── CNAME
│   ├── en
│   │   └── index.html
│   ├── fr
│   │   └── index.html
│   ├── fria
│   │   └── 19 (copy of ../../guinea/fria/19/docs)
│   │       ├── en
│   │       ├── fr
│   │       ├── img
│   │       ├── index.html
│   │       └── ...
│   ├── koumbia
│   │   └── 19 (copy of ../../guinea/koumbia/19/docs)
│   │       ├── en
│   │       ├── fr
│   │       ├── img
│   │       ├── index.html
│   │       └── ...
│   └── ...
├── guinea
│   ├── fria
│   │   └── 19
│   │       ├── compile.py (compiles the Fria 2019 section)
│   │       ├── docs
│   │       ├── templates
│   │       └── ...
│   └── koumbia
│       └── 19
│           ├── compile.py (compiles the Koumbia 2019 section)
│           ├── docs
│           ├── templates
│           └── ...
├── templates
│   ├── en
│   │   └── index.html
│   ├── fr
│   │   └── index.html
│   └── ...
├── README.md
├── compile.py (compiles the CSBridge/Guinea portal)
├── copy_section_docs.sh (copies compiled section docs to HTTP Root)
└── ...


```

## ➕ Adding a new Section

### 1. Create the files for the section
You may start from the [CSBridge master copy](https://github.com/csbridge/csbridge.github.io/blob/master/instructions.md), or you may copy an existing section from this repository.
```
# From an existing section
mkdir -p guinea/fria/19
cp -r guinea/koumbia/19/* guinea/fria/19/
```

### 2. Edit `copy_section_docs.sh` 
This script is used to copy the compiled section docs to the main docs folder. Add the following copy command for the Fria 2019 section.
```
cp -r  guinea/fria/19/docs/* docs/fria/19/
```

### 4. Update the hyperlinks to new section
Use `/fria/19/en/index.html` (English) or `/fria/19/fr/index.html` (French) to refer to the home page of the new section as appropriate. You may need to update the following files:

|File|Change|
|---|---|
|template/en/index.html|Update table of CSBridge Guinea sections|
|template/fr/index.html|Update table of CSBridge Guinea sections|
|guinea/fria/19/templates/parts/navBar.html|Update home navigation link (labeled CSBridge)|
|guinea/fria/19/templates/parts/navBarFr.html|Update home navigation link (labeled CSBridge)|


## ⚙️ Compiling HTML templates
### <a name="a-compile-portal"></a>1. Compile the Guinea portal
```
# PWD: <root>
python compile.py
```

### <a name="a-compile-individual-section"></a>2. Compile individual sections
Note, this doesn't copy the section's compiled files to the main `docs` directory.
```
# PWD: <root>/guinea/fria/19 # adjust as appropriate
python compile.py
```

### 3. <a name="a-copy-section-files"></a>Copy the section's compiled files to the main docs directory
Always perform this stage before pushing. Otherwise the compiled section files will not be served at https://guinea.csbridge.org
```
source copy_section_docs.sh
```

## <a name="a-run-section-http-server"></a>⚙️ Running a local http server for a single section
This is recommended when you are working on a single section.
In order to run a local http server for a single section:
```
# PWD: <root>/guinea/fria/19/docs/ # adjust as appropriate
python -m http.server
```
Then open http://localhost:8000 in your web browser.


- 🔁 Your development loop:
    - Edit section template files
    - Run `python compile.py` (under the section directory)
    - Refresh your browser window

## <a name="a-run-portal-http-server"></a>⚙️ Running a local http server for the entire portal
This is recommended when you are working on the CSBridge/Guinea portal, or before you push new commits to github (so that you can see what https://guinea.csbridge.org will look like before you push).


```
# PWD: <root>/docs
python -m http.server
```
Then open http://localhost:8000 in your web browser.


- 🔁 Your development loop:
    - Edit portal template files and/or section html files
    - [Compile the portal](#a-compile-portal)
    - [Compile individual sections](#a-compile-individual-section)
    - [Copy compiled section files to the main docs directory](#a-copy-section-files)
    - Refresh your web browser


# ⚠️ Common issues
## I get the 'HTTP Port already in use' error
- While attempting to run http servers, if you get the following error:
```
OSError: [Errno 98] Address already in use
```
You might have tried to start more than 1 http server bound to the same port. You should probably kill the other one first. You may also run multiple http servers bound to different ports. Learn more about python's http.server [here](https://docs.python.org/3.6/library/http.server.html).

## I pushed, but the website is not updated
- Note that Github Pages deployments are not instantaneous. They may take a few minutes.
- [Run a local HTTP-server for the portal](#a-run-portal-http-server), to verify that things are as you expect.
- Check your email. Did support@github.com send you a 'Page build failure' email?
- Check the [current status of github services](https://www.githubstatus.com/), and ensure that GitHub Pages is operational




