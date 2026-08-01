package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17130e extends AbstractC7255e {
    public final Object Signature;
    public final long admob;

    public C17130e(long j, Object obj) {
        this.Signature = obj;
        this.admob = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17130e)) {
            return false;
        }
        C17130e c17130e = (C17130e) obj;
        return AbstractC7890e.billing(this.Signature, c17130e.Signature) && this.admob == c17130e.admob;
    }

    public final int hashCode() {
        int hashCode = this.Signature.hashCode() * 31;
        long j = this.admob;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PredictiveBackHandlerInfo(owner=");
        sb.append(this.Signature);
        sb.append(", compositeKey=");
        return AbstractC10257e.mopub(sb, this.admob, ')');
    }
}
