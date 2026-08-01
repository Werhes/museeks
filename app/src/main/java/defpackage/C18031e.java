package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ٘۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18031e {
    public final long ad;

    public /* synthetic */ C18031e(long j) {
        this.ad = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C18031e) {
            return this.ad == ((C18031e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC1634e.mopub(this.ad, "ObjectKey(key=", ")");
    }
}
