package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؗۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3162e extends AbstractC9848e {
    static {
        new AbstractC9848e((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3162e)) {
            return false;
        }
        if (isEmpty() && ((C3162e) obj).isEmpty()) {
            return true;
        }
        C3162e c3162e = (C3162e) obj;
        return this.f19444e == c3162e.f19444e && this.f19443e == c3162e.f19443e;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f19444e * 31) + this.f19443e;
    }

    public final boolean isEmpty() {
        return AbstractC7890e.yandex(this.f19444e, this.f19443e) > 0;
    }

    public final String toString() {
        return this.f19444e + ".." + this.f19443e;
    }
}
