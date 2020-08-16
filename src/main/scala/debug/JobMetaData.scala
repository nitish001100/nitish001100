package debug


case class JobMetaDataMaster(jobMetaData: JobMetaData)

case class JobMetaData(tableMetaData: List[TableMetaData])

case class TableMetaData(tableName: String, mappers: Int, sqoopQuery: String)



