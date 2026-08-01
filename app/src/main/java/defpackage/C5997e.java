package defpackage;

import java.math.BigInteger;

/* renamed from: eؘۣؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5997e extends AbstractC5490e {
    public static final AbstractC7861e[] mopub = {new C1185e(InterfaceC4563e.Signature)};
    public final C9345e adcel;

    public C5997e() {
        super(239, 158, 0, 0);
        this.adcel = new C9345e(this, null, null, 12);
        this.vip = new C1185e(BigInteger.valueOf(0L));
        this.metrica = new C1185e(BigInteger.valueOf(1L));
        this.license = new BigInteger(1, AbstractC7240e.metrica("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
        this.appmetrica = BigInteger.valueOf(4L);
        this.purchase = 6;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        return new C5997e();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC7861e adcel(BigInteger bigInteger) {
        return new C1185e(bigInteger);
    }

    @Override // defpackage.AbstractC0362e
    public final int advert() {
        return 239;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e appmetrica(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        return new C9345e(this, abstractC7861e, abstractC7861e2, 12);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC16982e metrica() {
        return new C4630e(2);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C9345e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 12);
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
        long[] jArr = new long[i * 8];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i3];
            AbstractC10077e.billing(i2, ((C1185e) abstractC9932e.vip).f3784e, jArr);
            AbstractC10077e.billing(i2 + 4, ((C1185e) abstractC9932e.metrica).f3784e, jArr);
            i2 += 8;
        }
        return new C2679e(this, i, jArr, 25);
    }
}
