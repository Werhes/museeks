package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.HashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٟۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9655e extends C1781e {
    public static final HashSet billing;

    static {
        HashSet hashSet = new HashSet();
        billing = hashSet;
        hashSet.add("BANNER_IMAGE");
        hashSet.add("BANNER_IMAGE_TYPE");
        hashSet.add("BANNER_IMAGE_URL");
        hashSet.add("COPYRIGHT_URL");
    }

    @Override // defpackage.C1781e
    public final long adcel(ByteArrayOutputStream byteArrayOutputStream) {
        long license = license();
        byteArrayOutputStream.write(this.vip.ad());
        AbstractC12394e.startapp(license, byteArrayOutputStream);
        if (purchase("BANNER_IMAGE_TYPE").isEmpty()) {
            C8905e c8905e = new C8905e(EnumC6816e.CONTENT_BRANDING, "BANNER_IMAGE_TYPE", 3, 0);
            c8905e.purchase(0L);
            vip(c8905e);
        }
        AbstractC12394e.yandex(metrica(0, "BANNER_IMAGE_TYPE").metrica(), byteArrayOutputStream);
        byte[] license2 = metrica(1, "BANNER_IMAGE").license();
        AbstractC12394e.yandex(license2.length, byteArrayOutputStream);
        byteArrayOutputStream.write(license2);
        AbstractC12394e.yandex(billing("BANNER_IMAGE_URL").length(), byteArrayOutputStream);
        String billing2 = billing("BANNER_IMAGE_URL");
        Charset charset = AbstractC4639e.ad;
        byteArrayOutputStream.write(billing2.getBytes(charset));
        AbstractC12394e.yandex(billing("COPYRIGHT_URL").length(), byteArrayOutputStream);
        byteArrayOutputStream.write(billing("COPYRIGHT_URL").getBytes(charset));
        return license;
    }

    @Override // defpackage.C1781e
    public final long license() {
        return metrica(1, "BANNER_IMAGE").f17870e.length + 40 + billing("BANNER_IMAGE_URL").length() + billing("COPYRIGHT_URL").length();
    }

    @Override // defpackage.C1781e
    public final boolean yandex(C8905e c8905e) {
        return billing.contains(c8905e.f17871e) && super.yandex(c8905e);
    }
}
