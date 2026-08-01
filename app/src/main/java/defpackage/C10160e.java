package defpackage;

import java.math.BigInteger;

/* renamed from: eٌَۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10160e extends AbstractC5490e {
    public static final AbstractC7861e[] mopub = {new C18203e(InterfaceC4563e.Signature)};
    public final C9345e adcel;

    public C10160e() {
        super(409, 87, 0, 0);
        this.adcel = new C9345e(this, null, null, 15);
        this.vip = new C18203e(BigInteger.valueOf(0L));
        this.metrica = new C18203e(BigInteger.valueOf(1L));
        this.license = new BigInteger(1, AbstractC7240e.metrica("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF"));
        this.appmetrica = BigInteger.valueOf(4L);
        this.purchase = 6;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        return new C10160e();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC7861e adcel(BigInteger bigInteger) {
        return new C18203e(bigInteger);
    }

    @Override // defpackage.AbstractC0362e
    public final int advert() {
        return 409;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e appmetrica(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        return new C9345e(this, abstractC7861e, abstractC7861e2, 15);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC16982e metrica() {
        return new C4630e(2);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C9345e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 15);
    }

    @Override // defpackage.AbstractC0362e
    public final boolean remoteconfig(int i) {
        return i == 6;
    }

    @Override // defpackage.AbstractC5490e
    public final boolean signatures() {
        return true;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e smaato() {
        return this.adcel;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC2413e vip(AbstractC9932e[] abstractC9932eArr, int i) {
        long[] jArr = new long[i * 14];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i3];
            AbstractC13438e.ad(i2, ((C18203e) abstractC9932e.vip).f35630e, jArr);
            AbstractC13438e.ad(i2 + 7, ((C18203e) abstractC9932e.metrica).f35630e, jArr);
            i2 += 14;
        }
        return new C2679e(this, i, jArr, 28);
    }
}
