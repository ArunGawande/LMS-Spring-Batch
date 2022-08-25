package com.bridgelabz.lmsspringbatch.config;

import com.bridgelabz.lmsspringbatch.entity.Candidates;
import org.springframework.batch.item.ItemProcessor;

public class CandidateProcessor implements ItemProcessor<Candidates, Candidates> {

    @Override
    public Candidates process(Candidates candidates) throws Exception {
      //  if (candidates.getCandidateStatus().equals("complete")) {
            return candidates;
      //  } else {
       //     return null;
       // }
    }
}