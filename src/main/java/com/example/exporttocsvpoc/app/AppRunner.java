package com.example.exporttocsvpoc.app;

import com.example.exporttocsvpoc.BulkUpdates;
import com.example.exporttocsvpoc.ReportsGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {
    final Logger logger = LoggerFactory.getLogger(AppRunner.class);

    @Autowired
    ReportsGeneration reportsGeneration;

    @Autowired
    BulkUpdates bulkUpdates;

    @Override
    public void run(String... args) throws Exception {
        logger.info("Iniciando...");
        bulkUpdates.atualizaFormsComFieldNecessario();
        logger.info("Concluído!");
    }
}
