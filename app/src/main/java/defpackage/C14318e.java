package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14318e extends AbstractC0459e {
    public final long license;

    public C14318e(long j) {
        super("artist", String.valueOf(j), new C13887e(15));
        this.license = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14318e) && this.license == ((C14318e) obj).license;
    }

    public final int hashCode() {
        long j = this.license;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC10257e.mopub(new StringBuilder("Artist(artistId="), this.license, ')');
    }
}
