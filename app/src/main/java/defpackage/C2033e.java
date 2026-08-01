package defpackage;

import java.math.BigInteger;

/* renamed from: eؓۗٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2033e extends AbstractC5490e {
    public static final AbstractC7861e[] mopub = {new C6002e(InterfaceC4563e.Signature)};
    public final C9345e adcel;

    public C2033e() {
        super(571, 2, 5, 10);
        this.adcel = new C9345e(this, null, null, 17);
        this.vip = new C6002e(BigInteger.valueOf(0L));
        this.metrica = new C6002e(BigInteger.valueOf(1L));
        this.license = new BigInteger(1, AbstractC7240e.metrica("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.appmetrica = BigInteger.valueOf(4L);
        this.purchase = 6;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        return new C2033e();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC7861e adcel(BigInteger bigInteger) {
        return new C6002e(bigInteger);
    }

    @Override // defpackage.AbstractC0362e
    public final int advert() {
        return 571;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e appmetrica(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        return new C9345e(this, abstractC7861e, abstractC7861e2, 17);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC16982e metrica() {
        return new C4630e(2);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C9345e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 17);
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
        long[] jArr = new long[i * 18];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i3];
            AbstractC11538e.metrica(i2, ((C6002e) abstractC9932e.vip).f12654e, jArr);
            AbstractC11538e.metrica(i2 + 9, ((C6002e) abstractC9932e.metrica).f12654e, jArr);
            i2 += 18;
        }
        return new C9869e(this, i, jArr, 0);
    }
}
