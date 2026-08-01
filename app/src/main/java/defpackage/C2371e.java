package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؕۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2371e implements InterfaceC16132e, InterfaceC17335e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C9770e f5934e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C0576e f5937e = new C0576e(null, C7086e.purchase);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0576e f5935e = new C0576e(null, C8679e.billing);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C15038e f5936e = new C15038e();

    @Override // defpackage.InterfaceC17335e
    public final AbstractC8618e appmetrica() {
        return this.f5936e;
    }

    @Override // defpackage.InterfaceC17335e
    public final AbstractC8618e billing(AbstractC8618e abstractC8618e, AbstractC8618e abstractC8618e2, AbstractC8618e abstractC8618e3) {
        return abstractC8618e3;
    }

    @Override // defpackage.InterfaceC16132e
    public final Object getValue() {
        C8679e c8679e;
        C7086e c7086e = (C7086e) this.f5937e.getValue();
        if (c7086e == null || (c8679e = (C8679e) this.f5935e.getValue()) == null) {
            return null;
        }
        return metrica(c7086e, c8679e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0206, code lost:
    
        if (r6.vip.ad.vip() != false) goto L111;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C12476e metrica(defpackage.C7086e r30, defpackage.C8679e r31) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2371e.metrica(eؚِٙ, eٌٓۡ):eِّٔ");
    }

    @Override // defpackage.InterfaceC17335e
    public final void yandex(AbstractC8618e abstractC8618e) {
        this.f5936e = (C15038e) abstractC8618e;
    }
}
