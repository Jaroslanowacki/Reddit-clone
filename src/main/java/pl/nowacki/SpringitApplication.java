package pl.nowacki;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import pl.nowacki.domain.Comment;
import pl.nowacki.domain.Link;
import pl.nowacki.repository.CommentRepository;
import pl.nowacki.repository.LinkRepository;

@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}
	
	/**@Bean
	CommandLineRunner runner(LinkRepository linkRepository,CommentRepository commentRepository) {
		return args->{
			Link link = new Link("Strona wp", "https://www.wp.pl/");
			linkRepository.save(link);
			
			
			Comment comment = new Comment("Link do strony informacyjnej", link);
			commentRepository.save(comment);
			link.addComment(comment);
			
			
		};
	}
*/


}

