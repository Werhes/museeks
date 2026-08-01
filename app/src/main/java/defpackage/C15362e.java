package defpackage;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15362e extends AbstractC13977e {
    @Override // defpackage.AbstractC13977e
    public final boolean ad() {
        try {
            BufferedImage bufferedImage = (BufferedImage) vip();
            this.license = bufferedImage.getWidth();
            this.appmetrica = bufferedImage.getHeight();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final Object vip() {
        return ImageIO.read(ImageIO.createImageInputStream(new ByteArrayInputStream(this.ad)));
    }
}
