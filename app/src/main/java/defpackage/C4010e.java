package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٍْؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4010e {
    public static final C13139e Companion = new Object();
    public final String ad;
    public final String vip;

    public C4010e(String str, int i, String str2) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C10430e.vip);
            throw null;
        }
        this.ad = str;
        this.vip = str2;
    }

    public C4010e(String str, String str2) {
        this.ad = str;
        this.vip = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4010e)) {
            return false;
        }
        C4010e c4010e = (C4010e) obj;
        return AbstractC7890e.billing(this.ad, c4010e.ad) && AbstractC7890e.billing(this.vip, c4010e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BsonValueData(base64=");
        sb.append(this.ad);
        sb.append(", subType=");
        return AbstractC4653e.applovin(sb, this.vip, ')');
    }
}
