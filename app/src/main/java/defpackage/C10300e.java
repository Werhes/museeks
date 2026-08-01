package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10300e implements InterfaceC13969e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC5052e f20322e;

    public C10300e(InterfaceC5052e interfaceC5052e) {
        this.f20322e = interfaceC5052e;
    }

    @Override // defpackage.InterfaceC13969e, defpackage.InterfaceC1182e
    public final AbstractC1186e ad() {
        return this.f20322e.mo1458e();
    }

    public final boolean equals(Object obj) {
        C10300e c10300e = obj instanceof C10300e ? (C10300e) obj : null;
        return AbstractC7890e.billing(this.f20322e, c10300e != null ? c10300e.f20322e : null);
    }

    public final int hashCode() {
        return this.f20322e.hashCode();
    }

    public final String toString() {
        return "Class{" + this.f20322e.mo1458e() + '}';
    }
}
