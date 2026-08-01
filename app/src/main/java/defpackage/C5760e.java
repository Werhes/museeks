package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٜۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5760e extends AbstractC13870e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public C15921e f12187e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public InterfaceC3314e f12188e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public C15037e f12189e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public long f12190e;

    @Override // defpackage.AbstractC13616e
    /* renamed from: eَؑۨ */
    public final void mo338e() {
        this.f12190e = AbstractC7572e.ad;
    }

    @Override // defpackage.AbstractC13870e, defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        long j2;
        AbstractC2832e admob = interfaceC16719e.admob(j);
        if (interfaceC13158e.mo398transient()) {
            j2 = (admob.f6806e << 32) | (admob.f6804e & 4294967295L);
        } else {
            C15037e c15037e = this.f12189e;
            if (c15037e == null) {
                j2 = (admob.f6806e << 32) | (admob.f6804e & 4294967295L);
                this.f12190e = j2;
            } else {
                long j3 = (admob.f6804e & 4294967295L) | (admob.f6806e << 32);
                C2919e ad = c15037e.ad(new C17097e(this, j3), new C17725e(this, j3, 3));
                this.f12187e.getClass();
                j2 = ((C12729e) ad.getValue()).ad;
                this.f12190e = ((C12729e) ad.getValue()).ad;
            }
        }
        return interfaceC13158e.ads((int) (j2 >> 32), (int) (4294967295L & j2), C9139e.f18290e, new C10410e(this, admob, j2));
    }
}
