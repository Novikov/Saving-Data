/*
 *
 * Copyright (c) 2019 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 */

package com.raywenderlich.droidquiz.data.model

import androidx.room.Embedded
import androidx.room.Relation

class QuestionAndAllAnswers {
  @Embedded
  var question: Question? = null

  @Relation(
    parentColumn = "question_id",
    entityColumn = "question_id"
  )
  var answers: List<Answer> = ArrayList()
}

//данный класс это упрощение взамен создания двух методов в DAO. Подробнее на странице 128.
//Он содержит вопрос и лист ответов для него.
//@Query("SELECT * FROM question ORDER BY question_id")
//fun getAllQuestions(): LiveData<List<Question>>
//@Query("SELECT * FROM answer WHERE question_id = :questionId")
//fun getAnswersForQuestion(questionId: Int): List<Answer>


//Аннотация @Embedded (в переводе встроенный) используется для добавления сущнойстоей одного класса в другой, чтобы обращаться
// к нему как к единому целому

