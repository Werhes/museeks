package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eّ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17710e {
    public static final C17435e Companion = new Object();
    public static final InterfaceC3477e[] license = {null, null, AbstractC18039e.appmetrica(2, new C0743e(23))};
    public final int ad;
    public final List metrica;
    public final int vip;

    public /* synthetic */ C17710e(int i, int i2, int i3, List list) {
        if ((i & 1) == 0) {
            this.ad = 0;
        } else {
            this.ad = i2;
        }
        if ((i & 2) == 0) {
            this.vip = 0;
        } else {
            this.vip = i3;
        }
        if ((i & 4) == 0) {
            this.metrica = C13664e.f27089e;
        } else {
            this.metrica = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17710e)) {
            return false;
        }
        C17710e c17710e = (C17710e) obj;
        return this.ad == c17710e.ad && this.vip == c17710e.vip && AbstractC7890e.billing(this.metrica, c17710e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + (((this.ad * 31) + this.vip) * 31);
    }

    public final String toString() {
        StringBuilder pro = AbstractC17861e.pro(this.ad, this.vip, "AudioAddResponseDto(itemCount=", ", errorCount=", ", items=");
        pro.append(this.metrica);
        pro.append(")");
        return pro.toString();
    }
}
