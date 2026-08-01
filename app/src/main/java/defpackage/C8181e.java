package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eًؚۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8181e<C> {
    public static final C0484e Companion = new Object();
    public static final C4707e metrica;
    public final List ad;
    public final int vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؑۖ, java.lang.Object] */
    static {
        C4707e c4707e = new C4707e("com.arkivanov.decompose.router.pages.Pages", null, 2);
        c4707e.advert("items", false);
        c4707e.advert("selectedIndex", false);
        metrica = c4707e;
    }

    public /* synthetic */ C8181e(int i, int i2, List list) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, metrica);
            throw null;
        }
        this.ad = list;
        this.vip = i2;
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        if (i2 < 0 || i2 >= size) {
            throw new IllegalArgumentException(("The selectedIndex argument must be with the range: " + AbstractC6874e.purchase(list) + ". Actual: " + i2 + '.').toString());
        }
    }

    public C8181e(int i, List list) {
        this.ad = list;
        this.vip = i;
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IllegalArgumentException(("The selectedIndex argument must be with the range: " + AbstractC6874e.purchase(list) + ". Actual: " + i + '.').toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8181e)) {
            return false;
        }
        C8181e c8181e = (C8181e) obj;
        return AbstractC7890e.billing(this.ad, c8181e.ad) && this.vip == c8181e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pages(items=");
        sb.append(this.ad);
        sb.append(", selectedIndex=");
        return AbstractC1786e.pro(sb, this.vip, ')');
    }
}
