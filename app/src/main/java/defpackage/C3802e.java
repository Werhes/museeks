package defpackage;

/* renamed from: eؖؐٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3802e extends AbstractC11540e {
    public final int appmetrica;
    public final int billing;
    public final int purchase;

    public C3802e(C11145e c11145e) {
        super(c11145e);
        this.appmetrica = c11145e.appmetrica;
        this.purchase = c11145e.purchase;
        this.billing = c11145e.billing;
    }

    @Override // defpackage.AbstractC11540e
    public final byte[] ad() {
        byte[] ad = super.ad();
        AbstractC3628e.billing(this.appmetrica, 16, ad);
        AbstractC3628e.billing(this.purchase, 20, ad);
        AbstractC3628e.billing(this.billing, 24, ad);
        return ad;
    }
}
