package defpackage;

import java.math.BigInteger;

/* renamed from: eؘؖۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3931e extends AbstractC5490e {
    public static final AbstractC7861e[] mopub = {new C18203e(InterfaceC4563e.Signature)};
    public final C9345e adcel;

    public C3931e() {
        super(409, 87, 0, 0);
        this.adcel = new C9345e(this, null, null, 16);
        this.vip = new C18203e(BigInteger.valueOf(1L));
        this.metrica = new C18203e(new BigInteger(1, AbstractC7240e.metrica("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F")));
        this.license = new BigInteger(1, AbstractC7240e.metrica("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173"));
        this.appmetrica = BigInteger.valueOf(2L);
        this.purchase = 6;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        return new C3931e();
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
        return new C9345e(this, abstractC7861e, abstractC7861e2, 16);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C9345e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 16);
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
        long[] jArr = new long[i * 14];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i3];
            AbstractC13438e.ad(i2, ((C18203e) abstractC9932e.vip).f35630e, jArr);
            AbstractC13438e.ad(i2 + 7, ((C18203e) abstractC9932e.metrica).f35630e, jArr);
            i2 += 14;
        }
        return new C2679e(this, i, jArr, 29);
    }
}
