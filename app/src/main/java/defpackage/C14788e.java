package defpackage;

import java.math.BigInteger;

/* renamed from: eٔ٘ۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14788e extends AbstractC5490e {
    public static final AbstractC7861e[] mopub = {new C0037e(InterfaceC4563e.Signature)};
    public final C9345e adcel;

    public C14788e() {
        super(131, 2, 3, 8);
        this.adcel = new C9345e(this, null, null, 4);
        this.vip = new C0037e(new BigInteger(1, AbstractC7240e.metrica("03E5A88919D7CAFCBF415F07C2176573B2")));
        this.metrica = new C0037e(new BigInteger(1, AbstractC7240e.metrica("04B8266A46C55657AC734CE38F018F2192")));
        this.license = new BigInteger(1, AbstractC7240e.metrica("0400000000000000016954A233049BA98F"));
        this.appmetrica = BigInteger.valueOf(2L);
        this.purchase = 6;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        return new C14788e();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC7861e adcel(BigInteger bigInteger) {
        return new C0037e(bigInteger);
    }

    @Override // defpackage.AbstractC0362e
    public final int advert() {
        return 131;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e appmetrica(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        return new C9345e(this, abstractC7861e, abstractC7861e2, 4);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C9345e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 4);
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
            AbstractC16091e.yandex(i2, ((C0037e) abstractC9932e.vip).f1173e, jArr);
            AbstractC16091e.yandex(i2 + 3, ((C0037e) abstractC9932e.metrica).f1173e, jArr);
            i2 += 6;
        }
        return new C2679e(this, i, jArr, 17);
    }
}
