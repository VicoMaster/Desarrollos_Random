# -*- mode: python ; coding: utf-8 -*-

from kivy_deps import sdl2

block_cipher = None


a = Analysis(['calculadora.py'],
             pathex=['D:\\ProyectosDev\\Desarrollos_Random\\PyCharm_Proyectos\\inicial_kivy\\calculadora\\windows_ejecutable'],
             binaries=[],
             datas=[],
             hiddenimports=[],
             hookspath=[],
             runtime_hooks=[],
             excludes=[],
             win_no_prefer_redirects=False,
             win_private_assemblies=False,
             cipher=block_cipher,
             noarchive=False)
pyz = PYZ(a.pure, a.zipped_data,
             cipher=block_cipher)
exe = EXE(pyz,
          a.scripts,
          [],
          exclude_binaries=True,
          name='calculadora',
          debug=False,
          bootloader_ignore_signals=False,
          strip=False,
          upx=True,
          console=False , icon='D:\\ProyectosDev\\Desarrollos_Random\\PyCharm_Proyectos\\inicial_kivy\\calculadora\\windows_ejecutable\\calcu_icon.ico')
coll = COLLECT(exe, 
Tree('dist\\share\\sdl2\\bin\\'),
Tree('D:\\ProyectosDev\\Desarrollos_Random\\PyCharm_Proyectos\\inicial_kivy\\calculadora\\windows_ejecutable'),
               a.binaries,
               a.zipfiles,
               a.datas,
               strip=False,
               upx=True,
               upx_exclude=[],
               name='calculadora')
