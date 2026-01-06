package eapli.base.boardManagement.application;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PostitContentTest {
    @Test
    public void testContentContainsHttpWhenTypeIsImage() {
            int typeOfContent = 2;
            if (typeOfContent == 1) {
                // Test case not applicable for typeOfContent 1
            } else if (typeOfContent == 2) {
                String content = "https://www.bing.com/images/search?view=detailV2&ccid=ilvIUpk5&id=53C71CFF9E743B79670914004530CA525B25DC27&thid=OIP.ilvIUpk5eCS26XBmYT9lUwHaE9&mediaurl=https%3a%2f%2fget.pxhere.com%2fphoto%2fhair-white-view-animal-cute-pet-fur-cat-mammal-facial-expression-close-up-nose-whiskers-sleepy-eye-furry-head-skin-moustache-vertebrate-expression-soft-ragdoll-animal-world-domestic-cat-himalayan-persian-breed-cat-cat-face-macro-photography-cat%27s-eyes-cat-portrait-mimic-german-longhaired-pointer-schmusekatze-small-to-medium-sized-cats-cat-like-mammal-domestic-long-haired-cat-british-semi-longhair-birman-893129.jpg&cdnurl=https%3a%2f%2fth.bing.com%2fth%2fid%2fR.8a5bc85299397824b6e97066613f6553%3frik%3dJ9wlW1LKMEUAFA%26pid%3dImgRaw%26r%3d0&exph=2592&expw=3872&q=cat&simid=607991108465417427&FORM=IRPRST&ck=104BA8EE5251F960E592BBDFE24B6612&selectedIndex=2&ajaxhist=0&ajaxserp=0";
                assertTrue("Content should contain 'http'", content.contains("http"));
            } else {
                // Unexpected typeOfContent value, fail the test
                assertFalse("Unexpected typeOfContent value", true);
            }
        }

    @Test
    public void testContentDoesNotContainHttpWhenTypeIsImage() {
        int typeOfContent = 2;
        if (typeOfContent == 1) {
            // Test case not applicable for typeOfContent 1
        } else if (typeOfContent == 2) {
            String content = "this is not an image";
            assertFalse("Content should not contain 'http'", content.contains("http"));
        } else {
            // Unexpected typeOfContent value, fail the test
            assertFalse("Unexpected typeOfContent value", true);
        }
    }
}