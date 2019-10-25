# CSBridge Guinea

## Structure
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

```
# From an existing section
mkdir -p guinea/fria/19
cp -r guinea/koumbia/19/* guinea/fria/19/
```

### 2. Symlink the docs folder of the new section in the main docs folder
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

### 4. Compile home page
```
python compile.py
```



### Run local http server
```
cd docs
python -m http.server
```