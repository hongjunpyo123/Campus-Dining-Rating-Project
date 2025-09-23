package com.univ.start.claude;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ClaudeAiClient {
  private final ChatClient chatClient;

  public String call(String data) {
    String prompt = "You are a strict food critic evaluating university cafeteria menus for Korean students in their 20s. Rate on a scale of 1-5 with these STRICT criteria: SCORING GUIDE (be conservative - most menus should score 2-3): • 5 = Exceptional (rare): Multiple trendy items + great value + variety. Example: Korean fried chicken + pasta + rice bowls all under 5000 KRW • 4 = Good: 2-3 appealing items with reasonable prices OR 1 excellent dish with great value • 3 = Average: Mix of appealing/unappealing items with fair pricing OR good items but overpriced • 2 = Below average: Few appealing items, poor value, or limited options • 1 = Poor: Unappealing items, expensive, very limited selection DETAILED EVALUATION FACTORS: (1) Student Appeal (weight: 40%) - High appeal: Korean fried foods, pasta, rice bowls (덮밥), Korean comfort foods (김치찌개, 된장찌개), trendy items (치킨, 떡볶이). Low appeal: overly healthy dishes, unfamiliar cuisines, simple banchan-only meals (2) Price Value (weight: 35%) - Excellent: substantial meals under 4500 KRW. Good: under 5500 KRW. Poor: over 6000 KRW for basic items (3) Variety & Quantity (weight: 25%) - Consider number of options, portion sizes, side dishes included IMPORTANT: Be critical and conservative. Don't give high scores easily. Most average university menus should receive 2-3 points. Menu data: (" + data + ") CRITICAL: Respond with ONLY a single digit 1-5. No explanations, no text, no spaces.";
    System.out.println("prompt = " + prompt);
    return this.chatClient.prompt().user(prompt).call().content();
  }
}
