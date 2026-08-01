package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13484e extends AbstractC7255e {
    public final Object Signature;
    public final long admob;

    public C13484e(long j, Object obj) {
        this.Signature = obj;
        this.admob = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13484e)) {
            return false;
        }
        C13484e c13484e = (C13484e) obj;
        return AbstractC7890e.billing(this.Signature, c13484e.Signature) && this.admob == c13484e.admob;
    }

    public final int hashCode() {
        int hashCode = this.Signature.hashCode() * 31;
        long j = this.admob;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackHandlerInfo(owner=");
        sb.append(this.Signature);
        sb.append(", compositeKey=");
        return AbstractC10257e.mopub(sb, this.admob, ')');
    }
}
