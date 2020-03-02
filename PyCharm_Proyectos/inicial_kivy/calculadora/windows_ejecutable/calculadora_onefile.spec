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
Tree('dist\\share\\sdl2\\bin\\'),
Tree('D:\\ProyectosDev\\Desarrollos_Random\\PyCharm_Proyectos\\inicial_kivy\\calculadora\\windows_ejecutable'),
          a.scripts,
          a.binaries,
          a.zipfiles,
          a.datas,
          [],
          name='calculadora',
          debug=False,
          bootloader_ignore_signals=False,
          strip=False,
          upx=True,
          upx_exclude=[],
          runtime_tmpdir=None,
          console=False , icon='calcu_icon.ico')
