package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7200e extends AbstractC10385e {
    public final String ad;
    public final String metrica;
    public final int vip;

    public C7200e(String str, int i) {
        this.ad = str;
        this.vip = i;
        if (i <= 0) {
            throw new IllegalArgumentException("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
        }
        StringBuilder sb = new StringBuilder("ArrayKClassValue(");
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.ad);
        int i3 = this.vip;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        sb.append(")");
        this.metrica = sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7200e)) {
            return false;
        }
        C7200e c7200e = (C7200e) obj;
        return AbstractC7890e.billing(this.ad, c7200e.ad) && this.vip == c7200e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + this.vip;
    }

    public final String toString() {
        return this.metrica;
    }
}
