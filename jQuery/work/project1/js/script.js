$(document).ready(function() {
    // Add a Task to the list
    $('#addTask').click(function() {
        var taskValue = $('#taskInput').val();
        if (taskValue != '') {
            // Append the task to the list
            $('#taskList').append('<li><span class="taskText">' + taskValue + '</span><span class="editButton">Edit</span><span class="removeButton">Remove</span></li>');
            $('#taskInput').val('');
        }
    });

    //Highlight the input field on focus
    $('#taskInput').focus(function() {
        $(this).addClass('highlight');
    });

    //Remove the highlight from the input field on blur
    $('#taskInput').blur(function() {
        $(this).removeClass('highlight');
    });

    // Mark the task as done
    $('#taskList').on('click', '.taskText', function() {
        $(this).toggleClass('completed');
    });

    // Remove the task from the list
    $('#taskList').on('click', '.removeButton', function() {
        $(this).parent().remove();
    });

    // Edit task text
    // $('#taskList').on('click', '.editButton', function() {
    //     var taskText = $(this).siblings('.taskText').text();
    //     $(this).siblings('.taskText').replaceWith('<input type="text" class="editTask" value="' + taskText + '">');
    //     $(this).text('Save').removeClass('editButton').addClass('saveButton');
    // });

    // Save edited task
    // $('#taskList').on('click', '.saveButton', function() {
    //     var taskText = $(this).siblings('.editTask').val();
    //     $(this).siblings('.editTask').replaceWith('<span class="taskText">' + taskText + '</span>');
    //     $(this).text('Edit').removeClass('saveButton').addClass('editButton');
    // });

    //edit task
    $('#taskList').on('click','.editButton',function(){
        var $taskText = $(this).siblings('.taskText');
        var currentText = $taskText.text();
        var newText = prompt('Edit Task', currentText);
        if(newText != ''){
            $taskText.text(newText);
        }
    });


    // Event for moueeneter on task list
    $('#taskList').on('mouseenter', '.taskText', function() {
        $(this).css('cursor', 'pointer');
    });

});