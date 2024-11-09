package com.primestore.bl_product_service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class BlProductServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlProductServiceApplication.class, args);
    }

    @PostConstruct
    public void sampleProductInsert() {
//        Cpu cpu = new Cpu().builder().model("MediaTek Helio G99 Ultra").cores(8).build();
//        Memory memory = new Memory().builder().ramType("LPDDR4X").ram(12).rom(256).romType("UFS 2.2").build();
//        Display display =
//                new Display().builder().type("AMOLED").diagonal(6.67).resolution("2400x1080").refreshRate(120).build();
//        Battery battery =
//                new Battery().builder().capacity(5000).maxChargePower(67.).hasFastCharge(true).hasWirelessCharge(false).hasReverseCharge(false).build();
//        Phone build = new Phone().builder()
//                .type("Смартфон")
//                .brand("Xiaomi")
//                .model("Redmi Note 13 Pro")
//                .description("Смартфон Xiaomi Redmi Note 13 Pro оснащен основной камерой на 200 Мп и поддерживает технологию быстрой и точной автофокусировки Super QPD. А благодаря системе стабилизации изображения OIS и EIS фотографии получаются максимально четкими даже во время съемки в движении. Также, помимо основной камеры Redmi Note 13 Pro оснащен сверхширокоугольной камерой на 8 Мп и макрокамерой на 2 Мп.\n" +
//                        "Оптическая стабилизация изображения (OIS) компенсирует дрожание рук и движение камеры. В сочетании с EIS (электронная стабилизация изображения) она действует как штатив, позволяя делать более четкие снимки и видео. Объектив флагманского уровня 7P с ALD и 16-кратным бинированием пикселей позволяет получить максимальный размер пикселя 2.24 мкм, обеспечивая четкое и динамичное изображение при низком освещении.\n" +
//                        "Разрешение 200 Мп и технология внутрисенсорного зума обеспечивают эффект телефото, сравнимый с традиционным оптическим зумом, и 4-кратный зум без потерь, что дает четкие снимки вблизи и на расстоянии. Основная камера Redmi Note 13 Pro регистрирует более широкий цветовой охват, чем традиционный sRGB, обеспечивая более насыщенные цветовые градации и реалистичное воспроизведение сцены.")
//                .discount(6)
//                .priceExDiscount(31999)
//                .cost(34447.42)
//                .count(12)
//                .color("Midnight Black")
//                .warranty(12)
//                .releaseYear(2024)
//                .height(161.1)
//                .width(75.)
//                .thickness(8.)
//                .weight(188.)
//                .country("Китай")
//                .cpu(cpu)
//                .memory(memory)
//                .display(display)
//                .battery(battery)
//                .operationSystem("Android 13")
//                .hasExMemoryCardSlot(true)
//                .communicationStandard("4G")
//                .countSimCards(2)
//                .countMainCamera(3)
//                .mainCameraResolution("200+8+2")
//                .esimSupport(false)
//                .hasNFC(true)
//                .bluetooth("5.2")
//                .wifi("4 (802.11n), 5 (802.11ac)")
//                .build();
    }

}
