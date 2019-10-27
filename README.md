# CSBridge Guinea
This repository holds the CSBridge sections held in Guinea, which all share the same dns subdomain (guinea.csbridge.org). The repository currently contains the below sections:

- Koumbia 2019: https://guinea.csbridge.org/koumbia/19
- Fria 2019: https://guinea.csbridge.org/fria/19 (work in progress)


## Structure
This repository is structured as illustrated in the below tree. The HTTP root path maps to `/docs/`. The individual CSBridge section docs are symlinked under this folder. For instance `/docs/koumbia/19` symlinks to `/guinea/koumbia/19/docs`. Therefore the Koumbia 2019 section is available at https://guinea.csbridge.org/koumbia/19. 

```
├── docs
│   ├── CNAME
│   ├── index.html
│   ├── en
│   │   └── index.html
│   ├── fr
│   │   └── index.html
│   ├── fria
│   │   └── 19 -> ../../guinea/fria/19/docs
│   ├── koumbia
│   │   └── 19 -> ../../guinea/koumbia/19/docs
│   └── ...
├── guinea
│   ├── fria
│   │   └── 19
│   └── koumbia
│       └── 19
├── templates
│   ├── en
│   │   └── index.html
│   ├── fr
│   │   └── index.html
│   └── ...
├── README.md
├── compile.py
...
```

## Adding a new Section

### 1. Create the files for the section
You may start from the [CSBridge master copy](https://github.com/csbridge/csbridge.github.io/blob/master/instructions.md), or you may copy an existing section from this repository.
```
# From an existing section
mkdir -p guinea/fria/19
cp -r guinea/koumbia/19/* guinea/fria/19/
```

### 2. Symlink the docs folder of the new section into the main docs folder
```
mkdir docs/fria
cd docs/fria/
ln -s ../../guinea/fria/19/docs 19
```

### 3. Add the new section to the index
```
# edit the following files to add new section to home page
template/en/index.html
template/fr/index.html
```

### 4. Update the navigation home of the new section as appropria
Use `/fria/19/en/index.html` or `/fria/19/fr/index.html` to refer to the home page of the new section as appropriate. You may need to update the following files:
```
# edit the following files to add new section to home page
template/en/index.html # Update the CSBridge Guinea sections table (CSBridge Fria 2019)
template/fr/index.html # Update the CSBridge Guinea sections table (CSBridge Fria 2019)
guinea/fria/19/templates/parts/navBar.html # Update the brand navigation link (CSBridge)
guinea/fria/19/templates/parts/navBarFr.html # Update the brand navigation link (CSBridge)
```


## Compiling HTML templates
### 1. Compile the Guinea portal as follow
```
# PWD: <root>
python compile.py
```

### 2. Compile individual sections as follow
```
# PWD: <root>/guinea/fria/19
python compile.py
```

### Run local http server
```
# PWD: <root>/docs
python -m http.server
```