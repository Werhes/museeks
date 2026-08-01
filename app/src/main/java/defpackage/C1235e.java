package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؒۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1235e {
    public final long ad;

    public /* synthetic */ C1235e(long j) {
        this.ad = j;
    }

    public static boolean ad(long j, Object obj) {
        return (obj instanceof C1235e) && j == ((C1235e) obj).ad;
    }

    public final boolean equals(Object obj) {
        return ad(this.ad, obj);
    }

    public final int hashCode() {
        long j = this.ad;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC1634e.mopub(this.ad, "PropertyKey(key=", ")");
    }
}
