package defpackage;

import java.math.BigInteger;

/* renamed from: eَٜۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10391e extends AbstractC5490e {
    public static final C6002e advert;
    public static final AbstractC7861e[] mopub = {new C6002e(InterfaceC4563e.Signature)};
    public static final C6002e smaato;
    public final C9345e adcel;

    static {
        C6002e c6002e = new C6002e(new BigInteger(1, AbstractC7240e.metrica("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        advert = c6002e;
        smaato = (C6002e) c6002e.isPro();
    }

    public C10391e() {
        super(571, 2, 5, 10);
        this.adcel = new C9345e(this, null, null, 18);
        this.vip = new C6002e(BigInteger.valueOf(1L));
        this.metrica = advert;
        this.license = new BigInteger(1, AbstractC7240e.metrica("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
        this.appmetrica = BigInteger.valueOf(2L);
        this.purchase = 6;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        return new C10391e();
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
        return new C9345e(this, abstractC7861e, abstractC7861e2, 18);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C9345e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 18);
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
        long[] jArr = new long[i * 18];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i3];
            AbstractC11538e.metrica(i2, ((C6002e) abstractC9932e.vip).f12654e, jArr);
            AbstractC11538e.metrica(i2 + 9, ((C6002e) abstractC9932e.metrica).f12654e, jArr);
            i2 += 18;
        }
        return new C9869e(this, i, jArr, 1);
    }
}
