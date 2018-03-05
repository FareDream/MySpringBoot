LogInfo
=
* 可以修改默认日志的输出颜色。可以选择是否彩色输出spring.output.ansi.enabled
* 可以更改默认日志的输出位置。logging.file为输出到文件可以附带路径 logging.path为设置目录默认生成spring.log文件
  * 日志文件会在10Mb大小的时候被截断，产生新的日志文件，默认级别为：ERROR、WARN、INFO
  * logging.level.*=LEVEL为修改日志级别的配置
