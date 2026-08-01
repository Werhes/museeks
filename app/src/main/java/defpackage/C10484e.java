package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۘۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10484e {
    public final long ad;

    public /* synthetic */ C10484e(long j) {
        this.ad = j;
    }

    public static String ad(long j) {
        return AbstractC1634e.mopub(j, "ClassKey(key=", ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10484e) {
            return this.ad == ((C10484e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return ad(this.ad);
    }
}
