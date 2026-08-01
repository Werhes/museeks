package defpackage;

import java.math.BigInteger;

/* renamed from: eؚؑٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0450e extends AbstractC16982e {
    public final C0961e license;
    public final AbstractC0362e metrica;

    public C0450e(AbstractC0362e abstractC0362e, C0961e c0961e) {
        if (abstractC0362e.license == null) {
            throw new IllegalArgumentException("Need curve with known group order");
        }
        this.metrica = abstractC0362e;
        this.license = c0961e;
    }

    @Override // defpackage.AbstractC16982e
    public final AbstractC9932e appmetrica(AbstractC9932e abstractC9932e, BigInteger bigInteger) {
        AbstractC0362e abstractC0362e = abstractC9932e.ad;
        AbstractC0362e abstractC0362e2 = abstractC9932e.ad;
        if (!this.metrica.startapp(abstractC0362e)) {
            throw new IllegalStateException();
        }
        BigInteger mod = bigInteger.mod(abstractC0362e2.license);
        C0961e c0961e = this.license;
        BigInteger[] ad = c0961e.ad(mod);
        BigInteger bigInteger2 = ad[0];
        BigInteger bigInteger3 = ad[1];
        c0961e.getClass();
        boolean z = bigInteger2.signum() < 0;
        boolean z2 = bigInteger3.signum() < 0;
        BigInteger abs = bigInteger2.abs();
        BigInteger abs2 = bigInteger3.abs();
        C15664e startapp = AbstractC0903e.startapp(abstractC9932e, AbstractC0903e.yandex(Math.max(abs.bitLength(), abs2.bitLength()), 8, AbstractC0903e.metrica));
        AbstractC9932e abstractC9932e2 = ((C10421e) abstractC0362e2.admob(abstractC9932e, "bc_endo", new C13391e(c0961e, abstractC9932e, 19))).vip;
        C15664e c15664e = (C15664e) abstractC9932e2.ad.admob(abstractC9932e2, "bc_wnaf", new C11883e(startapp, c0961e.vip, 27));
        int min = Math.min(8, startapp.purchase);
        int min2 = Math.min(8, c15664e.purchase);
        return AbstractC0853e.license(z ? startapp.license : startapp.metrica, z ? startapp.metrica : startapp.license, AbstractC0903e.metrica(min, abs), z2 ? c15664e.license : c15664e.metrica, z2 ? c15664e.metrica : c15664e.license, AbstractC0903e.metrica(min2, abs2));
    }
}
