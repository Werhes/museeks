package defpackage;

import java.math.BigInteger;

/* renamed from: eٌٜ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17640e extends AbstractC5490e {
    public static final AbstractC7861e[] mopub = {new C4489e(InterfaceC4563e.Signature)};
    public final C9345e adcel;

    public C17640e() {
        super(113, 9, 0, 0);
        this.adcel = new C9345e(this, null, null, 1);
        this.vip = new C4489e(new BigInteger(1, AbstractC7240e.metrica("003088250CA6E7C7FE649CE85820F7")));
        this.metrica = new C4489e(new BigInteger(1, AbstractC7240e.metrica("00E8BEE4D3E2260744188BE0E9C723")));
        this.license = new BigInteger(1, AbstractC7240e.metrica("0100000000000000D9CCEC8A39E56F"));
        this.appmetrica = BigInteger.valueOf(2L);
        this.purchase = 6;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        return new C17640e();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC7861e adcel(BigInteger bigInteger) {
        return new C4489e(bigInteger);
    }

    @Override // defpackage.AbstractC0362e
    public final int advert() {
        return 113;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e appmetrica(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        return new C9345e(this, abstractC7861e, abstractC7861e2, 1);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C9345e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 1);
    }

    @Override // defpackage.AbstractC0362e
    public final boolean remoteconfig(int i) {
        return i == 6;
    }

    @Override // defpackage.AbstractC5490e
    public final boolean signatures() {
        return false;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e smaato() {
        return this.adcel;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC2413e vip(AbstractC9932e[] abstractC9932eArr, int i) {
        long[] jArr = new long[i * 4];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i3];
            AbstractC0173e.license(i2, ((C4489e) abstractC9932e.vip).f9708e, jArr);
            AbstractC0173e.license(i2 + 2, ((C4489e) abstractC9932e.metrica).f9708e, jArr);
            i2 += 4;
        }
        return new C2679e(this, i, jArr, 14);
    }
}
