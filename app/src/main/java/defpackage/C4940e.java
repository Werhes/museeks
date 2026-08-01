package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٗٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4940e {
    public final long ad;
    public final String license;
    public final C17621e metrica;
    public final long vip;

    public C4940e(long j, long j2, C17621e c17621e, String str) {
        this.ad = j;
        this.vip = j2;
        this.metrica = c17621e;
        this.license = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4940e) {
            C4940e c4940e = (C4940e) obj;
            if (this.ad == c4940e.ad && this.vip == c4940e.vip && AbstractC7890e.billing(this.metrica, c4940e.metrica) && AbstractC7890e.billing(this.license, c4940e.license)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        long j2 = this.vip;
        return this.license.hashCode() + ((this.metrica.hashCode() + ((((int) ((j2 >>> 32) ^ j2)) + (((int) (j ^ (j >>> 32))) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder tapsense = AbstractC17861e.tapsense("RealmObjectIdentifier(classKey=", C10484e.ad(this.ad), ", objectKey=", AbstractC1634e.mopub(this.vip, "ObjectKey(key=", ")"), ", versionId=");
        tapsense.append(this.metrica);
        tapsense.append(", path=");
        tapsense.append(this.license);
        tapsense.append(")");
        return tapsense.toString();
    }
}
