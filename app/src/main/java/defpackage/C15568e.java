package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٚٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15568e implements InterfaceC18155e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Class f30737e;

    public C15568e(Class cls) {
        this.f30737e = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15568e) {
            return AbstractC7890e.billing(this.f30737e, ((C15568e) obj).f30737e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30737e.hashCode();
    }

    @Override // defpackage.InterfaceC18155e
    public final Class subs() {
        return this.f30737e;
    }

    public final String toString() {
        return this.f30737e.toString() + " (Kotlin reflection is not available)";
    }
}
