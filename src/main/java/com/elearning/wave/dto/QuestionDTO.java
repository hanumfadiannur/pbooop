package com.elearning.wave.dto;

import com.elearning.wave.model.base.Options;
import com.elearning.wave.model.base.Question;

import java.util.List;

public class QuestionDTO {
    private long questionId;
    private String questionText;
    private List<OptionDTO> options;

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<OptionDTO> getOptions() {
        return options;
    }

    public void setOptions(List<OptionDTO> options) {
        this.options = options;
    }
}
