package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eّٟٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12648e {
    public static final C15139e Companion = new Object();
    public static final InterfaceC3477e[] license = {AbstractC18039e.appmetrica(2, new C0743e(21)), null, null};
    public final EnumC14431e ad;
    public final String metrica;
    public final String vip;

    public /* synthetic */ C12648e(int i, EnumC14431e enumC14431e, String str, String str2) {
        if (1 != (i & 1)) {
            AbstractC5756e.billing(i, 1, C3891e.ad.appmetrica());
            throw null;
        }
        this.ad = enumC14431e;
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = str;
        }
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12648e)) {
            return false;
        }
        C12648e c12648e = (C12648e) obj;
        return this.ad == c12648e.ad && AbstractC7890e.billing(this.vip, c12648e.vip) && AbstractC7890e.billing(this.metrica, c12648e.metrica);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        String str = this.vip;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.metrica;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsScopeDto(name=");
        sb.append(this.ad);
        sb.append(", title=");
        sb.append(this.vip);
        sb.append(", description=");
        return AbstractC1786e.signatures(sb, this.metrica, ")");
    }
}
