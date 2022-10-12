package builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CasaBuilderTest {

	@Test
	void test() {
		try {
            CasaBuilder casaBuilder = new CasaBuilder();
            Casa casa = casaBuilder
                    .setRua("Rua 1")
                    .setPais("Brasil")
                    .setParedes(0)
                    .build();
           fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade de Paredes Inválida", e.getMessage());
        }
	}
}
