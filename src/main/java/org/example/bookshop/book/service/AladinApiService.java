package org.example.bookshop.book.service;

import lombok.RequiredArgsConstructor;
import org.example.bookshop.book.repositroy.BookRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AladinApiService {
    private final BookRepository bookRepository;
    private final RestTemplate restTemplate = new RestTemplate();
    private final BookService bookService;
    @Value("${aladin.ttbkey}")
    private String ttbKey;

    public void fetchBooksByCategory(String genre, int categoryId){
        int page = 1;
        int totalSaved =0;

        while(true){
            String url = String.format("http://www.aladin.co.kr/ttb/api/ItemList.aspx?ttbkey=ttba01022664945220400&QueryType=Bestseller&MaxResults=100&start=%d&SearchTarget=Book&output=js&CategoryId=%d",
                    ttbKey, page, categoryId);
            try {
                ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);
                List<Map<String, Object>> items = (List<Map<String, Object>>) response.getBody().get("items");
                if (items == null ||items.isEmpty()){
                    System.out.printf("[%s] 카테고리 수집 완료 (총 %d권 저장됨)\n", genre, totalSaved);
                    break;
                }
                for (Map<String, Object> item : items) {
                    String isbn13 = (String) item.get("isbn13");
//                    if(isbn13 == null || bookRepository.)//중복체크인데existsByIsbn13없음

                }
            }
        }
    }
}
