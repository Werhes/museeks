package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۨٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6084e extends AbstractC2803e implements InterfaceC1012e {
    public final C2545e metrica;
    public final ArrayList vip;

    public C6084e(String str) {
        C9847e c9847e = C9847e.vip;
        List<C1252e> list = AbstractC12447e.billing(str).ad;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        for (C1252e c1252e : list) {
            if (c1252e.vip != 1) {
                throw new IllegalArgumentException("rootPath should be constant, no wildcards supported.");
            }
            arrayList.add(c1252e.ad);
        }
        this.vip = arrayList;
        this.metrica = new C2545e(1.0d, arrayList.size(), 2);
    }

    public final String toString() {
        return AbstractC13480e.m3608try(this.vip, "/", null, null, null, 62);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.AbstractC2803e
    public final AbstractC9510e yandex(C1740e c1740e, int i) {
        if (i != 0) {
            throw new IllegalStateException("Root selector should be evaluated first.");
        }
        ArrayList arrayList = this.vip;
        if (arrayList.isEmpty()) {
            return AbstractC9510e.license;
        }
        ?? r5 = c1740e.f4739e;
        if (r5.size() < arrayList.size()) {
            return AbstractC9510e.ad;
        }
        int size = arrayList.size() + i;
        while (i < size) {
            if (!AbstractC7890e.billing(r5.get(i), arrayList.get(i))) {
                return AbstractC9510e.ad;
            }
            i++;
        }
        return this.metrica;
    }
}
