package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16239e extends AbstractC15023e implements Serializable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C6575e f31917e;

    public C16239e(C6575e c6575e) {
        this.f31917e = c6575e;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f31917e.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16239e) {
            return this.f31917e.equals(((C16239e) obj).f31917e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31917e.hashCode();
    }

    public final String toString() {
        return this.f31917e.toString();
    }
}
