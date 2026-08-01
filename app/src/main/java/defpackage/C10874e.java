package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eًُؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10874e implements InterfaceC2558e {
    public static final C16187e Companion = new Object();
    public final String ad;
    public final String vip;

    public /* synthetic */ C10874e(String str, int i, String str2) {
        if (1 != (i & 1)) {
            AbstractC5756e.billing(i, 1, C11612e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = str2;
        }
    }

    public C10874e(String str, String str2) {
        this.ad = str;
        this.vip = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10874e)) {
            return false;
        }
        C10874e c10874e = (C10874e) obj;
        return AbstractC7890e.billing(this.ad, c10874e.ad) && AbstractC7890e.billing(this.vip, c10874e.vip);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        String str = this.vip;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Plain(text=");
        sb.append(this.ad);
        sb.append(", credits=");
        return AbstractC4653e.applovin(sb, this.vip, ')');
    }
}
