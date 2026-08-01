package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8929e {
    public final C0500e ad;
    public final C16399e vip;

    public C8929e(C6071e c6071e, AbstractC16167e abstractC16167e) {
        this.ad = c6071e.license;
        List adcel = C6071e.adcel(4, c6071e);
        this.vip = new C16399e(adcel.size());
        int size = adcel.size();
        for (int i = 0; i < size; i++) {
            C6071e c6071e2 = (C6071e) adcel.get(i);
            if (abstractC16167e.ad(c6071e2.purchase)) {
                this.vip.ad(c6071e2.purchase);
            }
        }
    }
}
