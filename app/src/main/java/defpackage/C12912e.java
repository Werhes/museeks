package defpackage;

import java.math.BigInteger;

/* renamed from: eّۣۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12912e extends AbstractC5490e {
    public static final AbstractC7861e[] mopub = {new C6139e(InterfaceC4563e.Signature)};
    public final C9345e adcel;

    public C12912e() {
        super(193, 15, 0, 0);
        this.adcel = new C9345e(this, null, null, 9);
        this.vip = new C6139e(new BigInteger(1, AbstractC7240e.metrica("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B")));
        this.metrica = new C6139e(new BigInteger(1, AbstractC7240e.metrica("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE")));
        this.license = new BigInteger(1, AbstractC7240e.metrica("010000000000000000000000015AAB561B005413CCD4EE99D5"));
        this.appmetrica = BigInteger.valueOf(2L);
        this.purchase = 6;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        return new C12912e();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC7861e adcel(BigInteger bigInteger) {
        return new C6139e(bigInteger);
    }

    @Override // defpackage.AbstractC0362e
    public final int advert() {
        return 193;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e appmetrica(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        return new C9345e(this, abstractC7861e, abstractC7861e2, 9);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C9345e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 9);
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
        long[] jArr = new long[i * 8];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i3];
            AbstractC10077e.billing(i2, ((C6139e) abstractC9932e.vip).f12909e, jArr);
            AbstractC10077e.billing(i2 + 4, ((C6139e) abstractC9932e.metrica).f12909e, jArr);
            i2 += 8;
        }
        return new C2679e(this, i, jArr, 22);
    }
}
