package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؑۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15926e extends C11241e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C15926e f31384e = new C11241e(1, 0, 1);

    public final boolean appmetrica(int i) {
        return this.f22523e <= i && i <= this.f22522e;
    }

    @Override // defpackage.C11241e
    public final boolean equals(Object obj) {
        if (!(obj instanceof C15926e)) {
            return false;
        }
        if (isEmpty() && ((C15926e) obj).isEmpty()) {
            return true;
        }
        C15926e c15926e = (C15926e) obj;
        return this.f22523e == c15926e.f22523e && this.f22522e == c15926e.f22522e;
    }

    @Override // defpackage.C11241e
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f22523e * 31) + this.f22522e;
    }

    @Override // defpackage.C11241e
    public final boolean isEmpty() {
        return this.f22523e > this.f22522e;
    }

    @Override // defpackage.C11241e
    public final String toString() {
        return this.f22523e + ".." + this.f22522e;
    }
}
