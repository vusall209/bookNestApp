package az.booknestapp.service;

import az.booknestapp.entity.MyBookList;
import az.booknestapp.repository.MyBookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyBookListServiceImpl {
    private final MyBookRepository myBookRepository;

    public void saveMyBooks(MyBookList book){
        myBookRepository.save(book);
    }
}
