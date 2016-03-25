databaseChangeLog = {

	changeSet(author: "earn (generated)", id: "1458913997024-1") {
		createTable(tableName: "TODO") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_2")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "DUE_DATE", type: "TIMESTAMP") {
				constraints(nullable: "false")
			}

			column(name: "PRIORITY", type: "INT") {
				constraints(nullable: "false")
			}

			column(name: "SUBJECT", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}
}
