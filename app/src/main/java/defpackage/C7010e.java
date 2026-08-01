package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7010e implements ImageDecoder$OnHeaderDecodedListener {
    public final /* synthetic */ int ad;
    public final /* synthetic */ InterfaceC5355e metrica;
    public final /* synthetic */ C9302e vip;

    public /* synthetic */ C7010e(InterfaceC5355e interfaceC5355e, C9302e c9302e, int i) {
        this.ad = i;
        this.metrica = interfaceC5355e;
        this.vip = c9302e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.graphics.ImageDecoder$OnPartialImageListener, java.lang.Object] */
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        switch (this.ad) {
            case 0:
                Size size = imageInfo.getSize();
                int width = size.getWidth();
                int height = size.getHeight();
                C6302e c6302e = ((C10472e) this.metrica).vip;
                C16320e c16320e = c6302e.vip;
                int i = c6302e.metrica;
                C12916e c12916e = AbstractC2182e.vip;
                long ad = AbstractC2774e.ad(width, height, c16320e, i, (C16320e) AbstractC8306e.license(c6302e, c12916e));
                int i2 = (int) (ad >> 32);
                int i3 = (int) (ad & 4294967295L);
                if (width > 0 && height > 0 && (width != i2 || height != i3)) {
                    C6302e c6302e2 = ((C10472e) this.metrica).vip;
                    double vip = AbstractC2774e.vip(width, height, i2, i3, c6302e2.metrica, (C16320e) AbstractC8306e.license(c6302e2, c12916e));
                    boolean z = vip < 1.0d;
                    this.vip.f18534e = z;
                    if (z || ((C10472e) this.metrica).vip.license == 1) {
                        imageDecoder.setTargetSize(AbstractC1561e.license(width * vip), AbstractC1561e.license(vip * height));
                    }
                }
                C6302e c6302e3 = ((C10472e) this.metrica).vip;
                imageDecoder.setAllocator(AbstractC11815e.firebase(AbstractC15659e.vip(c6302e3)) ? 3 : 1);
                imageDecoder.setMemorySizePolicy(1 ^ (((Boolean) AbstractC8306e.license(c6302e3, AbstractC15659e.billing)).booleanValue() ? 1 : 0));
                C12916e c12916e2 = AbstractC15659e.metrica;
                if (C11180e.billing(AbstractC8306e.license(c6302e3, c12916e2)) != null) {
                    imageDecoder.setTargetColorSpace(C11180e.billing(AbstractC8306e.license(c6302e3, c12916e2)));
                }
                if (AbstractC8306e.license(c6302e3, AbstractC13467e.vip) != null) {
                    throw new ClassCastException();
                }
                imageDecoder.setPostProcessor(null);
                return;
            default:
                Size size2 = imageInfo.getSize();
                int width2 = size2.getWidth();
                int height2 = size2.getHeight();
                C6302e c6302e4 = ((C3716e) this.metrica).metrica;
                C16320e c16320e2 = c6302e4.vip;
                int i4 = c6302e4.metrica;
                C12916e c12916e3 = AbstractC2182e.vip;
                long ad2 = AbstractC2774e.ad(width2, height2, c16320e2, i4, (C16320e) AbstractC8306e.license(c6302e4, c12916e3));
                int i5 = (int) (ad2 >> 32);
                int i6 = (int) (ad2 & 4294967295L);
                if (width2 > 0 && height2 > 0 && (width2 != i5 || height2 != i6)) {
                    C6302e c6302e5 = ((C3716e) this.metrica).metrica;
                    double vip2 = AbstractC2774e.vip(width2, height2, i5, i6, c6302e5.metrica, (C16320e) AbstractC8306e.license(c6302e5, c12916e3));
                    boolean z2 = vip2 < 1.0d;
                    this.vip.f18534e = z2;
                    if (z2 || ((C3716e) this.metrica).metrica.license == 1) {
                        imageDecoder.setTargetSize(AbstractC1561e.license(width2 * vip2), AbstractC1561e.license(vip2 * height2));
                    }
                }
                C3716e c3716e = (C3716e) this.metrica;
                imageDecoder.setOnPartialImageListener(new Object());
                C6302e c6302e6 = c3716e.metrica;
                imageDecoder.setAllocator(AbstractC11815e.firebase(AbstractC15659e.vip(c6302e6)) ? 3 : 1);
                imageDecoder.setMemorySizePolicy(!((Boolean) AbstractC8306e.license(c6302e6, AbstractC15659e.billing)).booleanValue() ? 1 : 0);
                C12916e c12916e4 = AbstractC15659e.metrica;
                if (C11180e.billing(AbstractC8306e.license(c6302e6, c12916e4)) != null) {
                    imageDecoder.setTargetColorSpace(C11180e.billing(AbstractC8306e.license(c6302e6, c12916e4)));
                }
                imageDecoder.setUnpremultipliedRequired(!((Boolean) AbstractC8306e.license(c6302e6, AbstractC15659e.license)).booleanValue());
                return;
        }
    }
}
