package dat3.security_demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class InfoResponse {
    String info;
    public InfoResponse(String info) {
        this.info = info;
    }
}
