package online.decentworld.rdb.task;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Sammax on 2016/10/3.
 */
public class ChatHistoryPersistTask implements Job{

    private static Logger logger= LoggerFactory.getLogger(ChatHistoryPersistTask.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.debug("[BEGIN_CHAT_RECORD_PERSIST_TASK]");

    }

}
