package com.springinaction.knights;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({KnightsConfiguration.class, MinstrelsConfiguration.class})
public class KingdomTalesConfiguration {

}
