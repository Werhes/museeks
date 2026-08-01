package defpackage;

import java.math.BigInteger;

/* renamed from: eُِۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12064e extends AbstractC5490e {
    public static final AbstractC7861e[] mopub = {new C11291e(InterfaceC4563e.Signature)};
    public final C9345e adcel;

    public C12064e() {
        super(163, 3, 6, 7);
        this.adcel = new C9345e(this, null, null, 6);
        this.vip = new C11291e(new BigInteger(1, AbstractC7240e.metrica("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2")));
        this.metrica = new C11291e(new BigInteger(1, AbstractC7240e.metrica("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9")));
        this.license = new BigInteger(1, AbstractC7240e.metrica("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"));
        this.appmetrica = BigInteger.valueOf(2L);
        this.purchase = 6;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        return new C12064e();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC7861e adcel(BigInteger bigInteger) {
        return new C11291e(bigInteger);
    }

    @Override // defpackage.AbstractC0362e
    public final int advert() {
        return 163;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e appmetrica(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        return new C9345e(this, abstractC7861e, abstractC7861e2, 6);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C9345e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 6);
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
        long[] jArr = new long[i * 6];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i3];
            AbstractC16091e.yandex(i2, ((C11291e) abstractC9932e.vip).f22683e, jArr);
            AbstractC16091e.yandex(i2 + 3, ((C11291e) abstractC9932e.metrica).f22683e, jArr);
            i2 += 6;
        }
        return new C2679e(this, i, jArr, 19);
    }
}
