package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13238e extends AbstractC17001e {
    public static final C8873e appmetrica;
    public static final C8873e license;
    public static final C15483e metrica = new C15483e();

    static {
        C8873e c8873e = new C8873e(0);
        c8873e.purchase.put("URI", new C6018e(c8873e, 0));
        license = c8873e;
        C8873e c8873e2 = new C8873e(1);
        C11392e c11392e = new C11392e(c8873e2, 0);
        HashMap hashMap = c8873e2.purchase;
        hashMap.put("AUDIO", c11392e);
        hashMap.put("SUBTITLES", new C11392e(c8873e2, 1));
        hashMap.put("CLOSED-CAPTIONS", new C11392e(c8873e2, 2));
        appmetrica = c8873e2;
    }

    @Override // defpackage.AbstractC17001e, defpackage.InterfaceC16282e
    public final void ad(C15816e c15816e, C11154e c11154e) {
        if (c11154e.ad()) {
            appmetrica(c15816e, c11154e.ad);
        }
    }

    public abstract void appmetrica(C15816e c15816e, C4541e c4541e);
}
