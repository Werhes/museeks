package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: e٘ؕۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17545e {
    public static final C7119e Companion = new Object();
    public final int ad;
    public final String vip;

    public /* synthetic */ C17545e(int i, int i2, String str) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C3596e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = str;
    }

    public C17545e(int i, String str) {
        this.ad = i;
        this.vip = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17545e)) {
            return false;
        }
        C17545e c17545e = (C17545e) obj;
        return this.ad == c17545e.ad && AbstractC7890e.billing(this.vip, c17545e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessData(pid=");
        sb.append(this.ad);
        sb.append(", uuid=");
        return AbstractC4653e.applovin(sb, this.vip, ')');
    }
}
