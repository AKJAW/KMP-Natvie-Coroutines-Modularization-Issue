package co.touchlab.kmm.todos.count.api.domain

import co.touchlab.kmm.todos.count.api.data.TodoCount
import kotlinx.coroutines.flow.Flow

class GetTodoCountIos(
    private val getTodoCount: GetTodoCount
){

    fun invoke(): Flow<TodoCount> = getTodoCount()
}
