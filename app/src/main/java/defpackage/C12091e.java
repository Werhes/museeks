package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۥؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12091e extends AbstractC12834e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f24234e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f24235e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C13197e f24236e;

    public C12091e(String str, long j, C13197e c13197e) {
        this.f24235e = str;
        this.f24234e = j;
        this.f24236e = c13197e;
    }

    @Override // defpackage.AbstractC12834e
    /* renamed from: eؘؕۥ */
    public final InterfaceC4895e mo1012e() {
        return this.f24236e;
    }

    @Override // defpackage.AbstractC12834e
    public final long license() {
        return this.f24234e;
    }

    @Override // defpackage.AbstractC12834e
    public final C14133e purchase() {
        String str = this.f24235e;
        if (str == null) {
            return null;
        }
        C10445e c10445e = C14133e.license;
        try {
            return AbstractC1266e.vip(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
