package defpackage;

import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3395e {
    public static final C7936e ad;
    public static final int appmetrica;
    public static final int license;
    public static final int metrica;
    public static final int vip;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        ad = new C7936e(2);
        vip = 4;
        metrica = 4;
        license = 4;
        appmetrica = 12;
    }

    public static void ad(FileChannel fileChannel, C18524e c18524e) {
        if (!AbstractC1983e.yandex(c18524e.f36318e) || fileChannel.position() >= fileChannel.size()) {
            return;
        }
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        ad.getClass();
        int i = C1724e.ad;
        fileChannel.position(fileChannel.position() + 1);
    }
}
