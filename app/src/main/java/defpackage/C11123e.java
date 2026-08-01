package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٜۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11123e {
    public static final C11123e appmetrica;
    public static final C13935e purchase;
    public final boolean ad;
    public final List license;
    public final boolean metrica;
    public final boolean vip;

    static {
        C11123e c11123e = new C11123e(14);
        C11123e c11123e2 = new C11123e(13);
        appmetrica = c11123e2;
        purchase = AbstractC8439e.ad(AbstractC6874e.startapp(new C6571e("close", c11123e), new C6571e("keep-alive", c11123e2), new C6571e("upgrade", new C11123e(11))), new C2894e(19), new C8436e((byte) 0, 2));
    }

    public /* synthetic */ C11123e(int i) {
        this((i & 1) == 0, (i & 2) == 0, (i & 4) == 0, C13664e.f27089e);
    }

    public C11123e(boolean z, boolean z2, boolean z3, List list) {
        this.ad = z;
        this.vip = z2;
        this.metrica = z3;
        this.license = list;
    }

    public final String ad() {
        StringBuilder sb = new StringBuilder();
        List list = this.license;
        ArrayList arrayList = new ArrayList(list.size() + 3);
        if (this.ad) {
            arrayList.add("close");
        }
        if (this.vip) {
            arrayList.add("keep-alive");
        }
        if (this.metrica) {
            arrayList.add("Upgrade");
        }
        if (!list.isEmpty()) {
            arrayList.addAll(list);
        }
        AbstractC13480e.m3610while(arrayList, sb, null, null, null, null, 126);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11123e.class != obj.getClass()) {
            return false;
        }
        C11123e c11123e = (C11123e) obj;
        return this.ad == c11123e.ad && this.vip == c11123e.vip && this.metrica == c11123e.metrica && AbstractC7890e.billing(this.license, c11123e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + ((((((this.ad ? 1231 : 1237) * 31) + (this.vip ? 1231 : 1237)) * 31) + (this.metrica ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        if (!this.license.isEmpty()) {
            return ad();
        }
        boolean z = this.metrica;
        boolean z2 = this.vip;
        boolean z3 = this.ad;
        return (!z3 || z2 || z) ? (z3 || !z2 || z) ? (!z3 && z2 && z) ? "keep-alive, Upgrade" : ad() : "keep-alive" : "close";
    }
}
