package defpackage;

/* renamed from: eؘٕٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15281e extends AbstractC11540e {
    public final int appmetrica;
    public final int purchase;

    public C15281e(C7017e c7017e) {
        super(c7017e);
        this.appmetrica = c7017e.appmetrica;
        this.purchase = c7017e.purchase;
    }

    @Override // defpackage.AbstractC11540e
    public final byte[] ad() {
        byte[] ad = super.ad();
        AbstractC3628e.billing(0, 16, ad);
        AbstractC3628e.billing(this.appmetrica, 20, ad);
        AbstractC3628e.billing(this.purchase, 24, ad);
        return ad;
    }
}
