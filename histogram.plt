set terminal png fontscale 1.2
set xlabel "{/:Italic x}"
set ylabel "{/:Italic p}"
set xrange [-1.1:1.1]
set yrange [0:.6]
set ytic 0.2 #y軸の目盛り
set output "uniform.png"
set title "Uniform Distribution"
set style fill solid border lc rgb "black" #ヒストグラムのスタイル
plot "Uniform-output.txt" with boxes notitle, .5 notitle
