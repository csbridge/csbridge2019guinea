# CSBridge Guinea

## Structure
```
├── docs
│   ├── CNAME
│   ├── policy.txt
│   ├── index.html
│   ├── fria
│   │   └── 19 -> ../../guinea/fria/19/docs
│   ├── koumbia
│   │   └── 19 -> ../../guinea/koumbia/19/docs
│   └── ...
├── guinea
│   ├── fria
│   │   └── 19
│   │       ├── compile.py
│   │       ├── docs
│   │       ├── templates
│   │       └── ...
│   └── koumbia
│       └── 19
│           ├── compile.py
│           ├── docs
│           ├── templates
│           └── ...
└── README.md
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
vi docs/index.html
```