package defpackage;

import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/* renamed from: eٕٗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17328e extends AbstractC4325e {
    public static final Set advert = DesugarCollections.synchronizedSet(new HashSet());
    public static final Csuper smaato = new Csuper((byte) 0, 3);
    public BigInteger adcel;
    public C17373e mopub;
    public BigInteger startapp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C17328e(java.math.BigInteger r10, java.math.BigInteger r11, java.math.BigInteger r12, java.math.BigInteger r13, java.math.BigInteger r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17328e.<init>(java.math.BigInteger, java.math.BigInteger, java.math.BigInteger, java.math.BigInteger, java.math.BigInteger, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٕٗۡ, eؑ٘ؑ, eَؖۘ] */
    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        BigInteger bigInteger = this.startapp;
        BigInteger bigInteger2 = this.adcel;
        AbstractC7861e abstractC7861e = this.vip;
        AbstractC7861e abstractC7861e2 = this.metrica;
        BigInteger bigInteger3 = this.license;
        BigInteger bigInteger4 = this.appmetrica;
        ?? abstractC4325e = new AbstractC4325e(bigInteger);
        abstractC4325e.startapp = bigInteger;
        abstractC4325e.adcel = bigInteger2;
        AbstractC7861e abstractC7861e3 = null;
        abstractC4325e.mopub = new C17373e(abstractC4325e, abstractC7861e3, abstractC7861e3, 1);
        abstractC4325e.vip = abstractC7861e;
        abstractC4325e.metrica = abstractC7861e2;
        abstractC4325e.license = bigInteger3;
        abstractC4325e.appmetrica = bigInteger4;
        abstractC4325e.purchase = 4;
        return abstractC4325e;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC7861e adcel(BigInteger bigInteger) {
        BigInteger bigInteger2 = this.startapp;
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(bigInteger2) >= 0) {
            throw new IllegalArgumentException("x value invalid for Fp field element");
        }
        return new C1456e(bigInteger2, this.adcel, bigInteger);
    }

    @Override // defpackage.AbstractC0362e
    public final int advert() {
        return this.startapp.bitLength();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e amazon(AbstractC9932e abstractC9932e) {
        int i;
        return (this == abstractC9932e.ad || this.purchase != 2 || abstractC9932e.advert() || !((i = abstractC9932e.ad.purchase) == 2 || i == 3 || i == 4)) ? super.amazon(abstractC9932e) : new C17373e(this, adcel(abstractC9932e.vip.firebase()), adcel(abstractC9932e.metrica.firebase()), new AbstractC7861e[]{adcel(abstractC9932e.license[0].firebase())}, 1);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e appmetrica(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        return new C17373e(this, abstractC7861e, abstractC7861e2, 1);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C17373e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 1);
    }

    @Override // defpackage.AbstractC0362e
    public final boolean remoteconfig(int i) {
        return i == 0 || i == 1 || i == 2 || i == 4;
    }

    @Override // defpackage.AbstractC4325e
    public final BigInteger signatures() {
        return this.startapp;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e smaato() {
        return this.mopub;
    }
}
