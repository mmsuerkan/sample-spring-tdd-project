import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
class Math2Test {

    @InjectMocks
    Math2 math2;

    @Mock
    EmailService emailService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void sum() {
        when(emailService.sendEmail(anyString())).thenReturn("Email sent to");
        assertEquals(5, math2.sum(2, 3));
        verify(emailService, times(1)).sendEmail(anyString());
        verify(emailService, never()).getMail();

    }
}
