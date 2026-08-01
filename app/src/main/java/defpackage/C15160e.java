package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15160e {
    public final C7735e ad;
    public final C1032e vip;

    public /* synthetic */ C15160e(C7735e c7735e, C1032e c1032e) {
        this.ad = c7735e;
        this.vip = c1032e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15160e) {
            C15160e c15160e = (C15160e) obj;
            if (AbstractC5729e.vip(this.ad, c15160e.ad) && AbstractC5729e.vip(this.vip, c15160e.vip)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.ad, this.vip});
    }

    public final String toString() {
        C11883e c11883e = new C11883e(5, this);
        c11883e.vip(this.ad, "key");
        c11883e.vip(this.vip, "feature");
        return c11883e.toString();
    }
}
