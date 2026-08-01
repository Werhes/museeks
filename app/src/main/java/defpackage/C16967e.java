package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16967e extends AbstractC0459e {
    public final long license;

    public C16967e(long j) {
        super("album", String.valueOf(j), new C13887e(14));
        this.license = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16967e) && this.license == ((C16967e) obj).license;
    }

    public final int hashCode() {
        long j = this.license;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC10257e.mopub(new StringBuilder("Album(albumId="), this.license, ')');
    }
}
