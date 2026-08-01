package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؚۜ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7475e {
    public static final C10728e Companion = new Object();
    public final String ad;
    public final String vip;

    public C7475e(String str, int i, String str2) {
        Throwable th = null;
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C16271e.vip);
            throw null;
        }
        this.ad = str;
        this.vip = str2;
        char c = (char) 0;
        if (AbstractC5304e.isPro(str, c)) {
            throw new C6301e(1, AbstractC17861e.Signature("Invalid key: 'pattern' contains null byte: ", str).toString(), th);
        }
        if (AbstractC5304e.isPro(str2, c)) {
            throw new C6301e(1, AbstractC17861e.Signature("Invalid key: 'options' contains null byte: ", str2).toString(), th);
        }
    }

    public C7475e(String str, String str2) {
        this.ad = str;
        this.vip = str2;
        char c = (char) 0;
        Throwable th = null;
        if (AbstractC5304e.isPro(str, c)) {
            throw new C6301e(1, AbstractC17861e.Signature("Invalid key: 'pattern' contains null byte: ", str).toString(), th);
        }
        if (AbstractC5304e.isPro(str2, c)) {
            throw new C6301e(1, AbstractC17861e.Signature("Invalid key: 'options' contains null byte: ", str2).toString(), th);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7475e)) {
            return false;
        }
        C7475e c7475e = (C7475e) obj;
        return AbstractC7890e.billing(this.ad, c7475e.ad) && AbstractC7890e.billing(this.vip, c7475e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BsonValueData(pattern=");
        sb.append(this.ad);
        sb.append(", options=");
        return AbstractC4653e.applovin(sb, this.vip, ')');
    }
}
