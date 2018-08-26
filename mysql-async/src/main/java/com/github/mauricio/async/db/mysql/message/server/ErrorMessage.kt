
package com.github.mauricio.async.db.mysql.message.server

data class ErrorMessage( val errorCode : Int, val sqlState : String, val errorMessage : String )
  : ServerMessage( ServerMessage.Error )
