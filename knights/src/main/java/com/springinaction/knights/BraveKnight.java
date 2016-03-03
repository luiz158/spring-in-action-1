package com.springinaction.knights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("knight")
public class BraveKnight implements Knight {

	private Quest quest;

	@Autowired
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}
	
	public void embarkOnQuest() throws QuestException {
		quest.embark();
	}

}
