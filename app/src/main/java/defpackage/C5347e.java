package defpackage;

import java.math.BigInteger;

/* renamed from: eؘؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5347e extends AbstractC5490e {
    public static final AbstractC7861e[] mopub = {new C6139e(InterfaceC4563e.Signature)};
    public final C9345e adcel;

    public C5347e() {
        super(193, 15, 0, 0);
        this.adcel = new C9345e(this, null, null, 8);
        this.vip = new C6139e(new BigInteger(1, AbstractC7240e.metrica("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
        this.metrica = new C6139e(new BigInteger(1, AbstractC7240e.metrica("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
        this.license = new BigInteger(1, AbstractC7240e.metrica("01000000000000000000000000C7F34A778F443ACC920EBA49"));
        this.appmetrica = BigInteger.valueOf(2L);
        this.purchase = 6;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        return new C5347e();
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
        return new C9345e(this, abstractC7861e, abstractC7861e2, 8);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C9345e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 8);
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
        return new C2679e(this, i, jArr, 21);
    }
}
