# CSBridge Guinea/Koumbia 2019 website

The instructions here refer to the https://guinea.csbridge.org/koumbia/19 secion of the website, which relate to the `guinea/koumbia/19` subtree of the repository.

Please see the [Main README](../../../README.md) for more information.
### Updating the website

1. Change any file templates in ```templates/```

2. ```python compile.py``` creates full html pages underneath the ```docs/``` folder.

3. Any slides or starter code changed in the top directory are symlinked to change the actual files in ```docs/```.

4. After pushing to GitHub, it may take a few minutes for the changes to appear on the CSBridge website.
