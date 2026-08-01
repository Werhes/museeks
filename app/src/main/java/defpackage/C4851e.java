package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4851e {
    public final EnumC10783e ad;
    public final String metrica;
    public final int vip;

    public C4851e(EnumC10783e enumC10783e, int i, String str) {
        this.ad = enumC10783e;
        this.vip = i;
        this.metrica = str;
    }

    public static C4851e ad(C4851e c4851e, EnumC10783e enumC10783e, String str) {
        int i = c4851e.vip;
        c4851e.getClass();
        return new C4851e(enumC10783e, i, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4851e)) {
            return false;
        }
        C4851e c4851e = (C4851e) obj;
        return this.ad == c4851e.ad && this.vip == c4851e.vip && AbstractC7890e.billing(this.metrica, c4851e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + (((this.ad.hashCode() * 31) + this.vip) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EcosystemState(method=");
        sb.append(this.ad);
        sb.append(", codeLength=");
        sb.append(this.vip);
        sb.append(", info=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }
}
