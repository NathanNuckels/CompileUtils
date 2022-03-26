syntax on
filetype on
set number
set nowrap
set cursorline
set showcmd
"set statusline=
"set statusline+=\ %F\ %M\ %Y\ %R
"set statusline+=%=
"set statusline+=\ ASCII:\ %b\ ROW:\ %l\ COL:\ %c\ PERCENT:\ %p%%
set laststatus=2
call plug#begin()
"Plug 'arcticicestudio/nord-vim'
Plug 'lambdalisue/battery.vim'
"Plug 'NLKNguyen/papercolor-theme'
Plug 'vim-airline/vim-airline'
Plug 'Shougo/unite'
Plug 'liuchengxu/space-vim-dark'
call plug#end()
set t_Co=256
set background=dark
colorscheme space-vim-dark
"colorscheme nord
