/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amir.agami
 */
println "test"
(1..10).findAll({ it%2==0}).each({ println "in a closure: $it" })

