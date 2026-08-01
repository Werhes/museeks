package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۖۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4302e extends AbstractC15023e implements Serializable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC15023e f9409e;

    public C4302e(AbstractC15023e abstractC15023e) {
        this.f9409e = abstractC15023e;
    }

    @Override // defpackage.AbstractC15023e
    public final AbstractC15023e ad() {
        return this.f9409e;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f9409e.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4302e) {
            return this.f9409e.equals(((C4302e) obj).f9409e);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f9409e.hashCode();
    }

    public final String toString() {
        return this.f9409e + ".reverse()";
    }
}
