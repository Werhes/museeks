package defpackage;

import android.util.Size;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7868e {
    public static final C9654e ad;

    static {
        Object size = new Size(640, 480);
        Object c8070e = new C8070e(C5401e.f11579e, new C10492e(AbstractC2084e.metrica), null);
        C3186e c3186e = new C3186e(0);
        C14326e c14326e = InterfaceC13842e.f27422interface;
        C4069e c4069e = c3186e.f7297e;
        c4069e.yandex(c14326e, size);
        c4069e.yandex(InterfaceC12438e.f24901e, 1);
        c4069e.yandex(InterfaceC13842e.premium, 0);
        c4069e.yandex(InterfaceC13842e.f27423native, c8070e);
        C14677e c14677e = C14677e.license;
        if (!c14677e.equals(c14677e)) {
            throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
        }
        c4069e.yandex(InterfaceC14405e.ads, c14677e);
        ad = new C9654e(C17015e.vip(c4069e));
    }
}
