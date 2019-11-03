# CSBridge Guinea/Fria 2019 website

The instructions here refer to the https://guinea.csbridge.org/fria/19 secion of the website, which relate to the `guinea/fria/19` subtree of the repository.

Please see the [Main README](../../../README.md) for more information.
### Updating the website

1. Change any file templates in ```templates/```

2. ```python compile.py``` creates full html pages underneath the ```docs/``` folder.

3. Any slides or starter code changed in the top directory are symlinked to change the actual files in ```docs/```.

4. [Copy the compiled files to the main docs directory](../../../README.md#3-copy-the-sections-compiled-files-to-the-main-docs-directory) for more information.

5. After pushing to GitHub, it may take a few minutes for the changes to appear on the CSBridge website.
