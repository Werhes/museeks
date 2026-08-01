package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12776e {
    public final long ad;
    public final long appmetrica;
    public final long license;
    public final long metrica;
    public final long vip;

    public C12776e(long j, long j2, long j3, long j4, long j5) {
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
        this.license = j4;
        this.appmetrica = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C12776e)) {
            return false;
        }
        C12776e c12776e = (C12776e) obj;
        return C3618e.metrica(this.ad, c12776e.ad) && C3618e.metrica(this.vip, c12776e.vip) && C3618e.metrica(this.metrica, c12776e.metrica) && C3618e.metrica(this.license, c12776e.license) && C3618e.metrica(this.appmetrica, c12776e.appmetrica);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return C10994e.ad(this.appmetrica) + AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(C10994e.ad(this.ad) * 31, this.vip, 31), this.metrica, 31), this.license, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        AbstractC5087e.m1754try(this.ad, ", textColor=", sb);
        AbstractC5087e.m1754try(this.vip, ", iconColor=", sb);
        AbstractC5087e.m1754try(this.metrica, ", disabledTextColor=", sb);
        AbstractC5087e.m1754try(this.license, ", disabledIconColor=", sb);
        sb.append((Object) C3618e.startapp(this.appmetrica));
        sb.append(')');
        return sb.toString();
    }
}
