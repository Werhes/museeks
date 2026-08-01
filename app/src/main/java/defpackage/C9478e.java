package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9478e implements InterfaceC11304e {
    public final C14914e[] ad;
    public final String vip;

    public C9478e(C14914e... c14914eArr) {
        this.ad = c14914eArr;
        ArrayList arrayList = new ArrayList(c14914eArr.length);
        for (C14914e c14914e : c14914eArr) {
            c14914e.getClass();
            arrayList.add("gzip");
        }
        this.vip = AbstractC13480e.m3608try(arrayList, ", ", null, null, null, 62);
    }

    @Override // defpackage.InterfaceC11304e
    public final C11058e ad(C9840e c9840e) {
        C8650e c8650e = (C8650e) c9840e.startapp;
        if (c8650e.metrica.appmetrica("Accept-Encoding") != null) {
            return c9840e.purchase(c8650e);
        }
        C18464e ad = c8650e.ad();
        ((C15783e) ad.f36192e).adcel("Accept-Encoding", this.vip);
        C11058e purchase = c9840e.purchase(new C8650e(ad));
        if (AbstractC1277e.ad(purchase)) {
            AbstractC12834e abstractC12834e = purchase.f21945e;
            String appmetrica = purchase.f21946e.appmetrica("Content-Encoding");
            if (appmetrica == null) {
                appmetrica = null;
            }
            if (appmetrica != null) {
                C14914e c14914e = this.ad[0];
                c14914e.getClass();
                if (("gzip".equalsIgnoreCase(appmetrica) ? c14914e : null) != null) {
                    C13197e c13197e = new C13197e(new C3728e(abstractC12834e.mo1012e()));
                    C7677e ad2 = purchase.ad();
                    ad2.purchase.startapp("Content-Encoding");
                    ad2.purchase.startapp("Content-Length");
                    C2599e c2599e = AbstractC12834e.f25655e;
                    ad2.billing = new C2599e(abstractC12834e.purchase(), -1L, c13197e);
                    return ad2.ad();
                }
            }
        }
        return purchase;
    }
}
