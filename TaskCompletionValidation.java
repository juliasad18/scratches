import com.tasktracking.model.Task;

import java.util.List;

class Scratch {

    public boolean isTaskAParentTask(int taskId) {
        Task task = taskRepository.findTaskById(taskId);
        Integer parentTaskId = task.getParentTaskId();
        if(task.getParentTaskId().equals(null)){
            return true;
        } else {
            return false;
        }
    }

    public int[] getSubTaskIds(int taskId) {
        List<Task> subTaskList = taskRepository.findSubTasks(taskId);
        int[] subTaskArray = new int [subTaskList.size()];
        int counter = 0;
        for(Task task : subTaskList) {
            subTaskArray[counter] = task.getTmsTaskId();
            counter++;
        }
        return subTaskArray;
    }

    public boolean areTasksCompleted(int[] subTaskArray) {
        boolean areTasksCompleted = false;
        for (int subTaskId : subTaskArray) {
            if(!taskRepository.findTaskById(subTaskId).getIsFinishedFlag()) {
                areTasksCompleted = false;
            } else {
                areTasksCompleted = true;
            }
        }
        return areTasksCompleted;

    }

    public boolean isSetTaskCompletedAllowed(int taskId) {
        if (isTaskAParentTask(taskId)) {
            if(areTasksCompleted(getSubTaskIds(taskId))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        
    }




}