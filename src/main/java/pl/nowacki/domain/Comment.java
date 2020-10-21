package pl.nowacki.domain;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.ocpsoft.prettytime.PrettyTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import pl.nowacki.service.BeanUtil;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Getter @Setter
public class Comment extends Auditable {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NonNull
	private String body;
	
	@ManyToOne
	@NonNull
	private Link link;

	public String getPrettyTime() {
	    PrettyTime pt = BeanUtil.getBean(PrettyTime.class);
	    return pt.format(convertToDateViaInstant(getCreationDate()));
	}

	private Date convertToDateViaInstant(LocalDateTime dateToConvert) {
	    return java.util.Date.from(dateToConvert.atZone(ZoneId.systemDefault()).toInstant());
	}
	
	
	
}
