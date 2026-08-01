package defpackage;

import androidx.car.app.model.Alert;
import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eًَٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7922e extends AbstractC4325e {
    public static final BigInteger adcel = C18150e.f35561e;
    public static final BigInteger advert;
    public static final BigInteger mopub;
    public static final AbstractC7861e[] smaato;
    public final C17373e startapp;

    static {
        BigInteger bigInteger = new BigInteger(1, AbstractC7240e.metrica("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144"));
        mopub = bigInteger;
        advert = new BigInteger(1, AbstractC7240e.metrica("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864"));
        smaato = new AbstractC7861e[]{new C18150e(InterfaceC4563e.Signature), new C18150e(bigInteger)};
    }

    public C7922e() {
        super(adcel);
        AbstractC7861e abstractC7861e = null;
        this.startapp = new C17373e(this, abstractC7861e, abstractC7861e, 0);
        this.vip = new C18150e(mopub);
        this.metrica = new C18150e(advert);
        this.license = new BigInteger(1, AbstractC7240e.metrica("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.appmetrica = BigInteger.valueOf(8L);
        this.purchase = 4;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        return new C7922e();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC7861e adcel(BigInteger bigInteger) {
        return new C18150e(bigInteger);
    }

    @Override // defpackage.AbstractC0362e
    public final int advert() {
        return adcel.bitLength();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e appmetrica(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        return new C17373e(this, abstractC7861e, abstractC7861e2, 0);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C17373e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 0);
    }

    @Override // defpackage.AbstractC0362e
    public final boolean remoteconfig(int i) {
        return i == 4;
    }

    @Override // defpackage.AbstractC4325e
    public final BigInteger signatures() {
        return adcel;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e smaato() {
        return this.startapp;
    }

    @Override // defpackage.AbstractC4325e, defpackage.AbstractC0362e
    public final AbstractC7861e subscription(SecureRandom secureRandom) {
        int i;
        int i2;
        int[] iArr = new int[8];
        do {
            byte[] bArr = new byte[32];
            do {
                secureRandom.nextBytes(bArr);
                AbstractC3628e.amazon(bArr, 0, iArr, 0, 8);
                iArr[7] = iArr[7] & Alert.DURATION_SHOW_INDEFINITELY;
            } while (AbstractC12797e.ads(8, iArr, AbstractC15710e.ad) == 0);
            i2 = 0;
            for (i = 0; i < 8; i++) {
                i2 |= iArr[i];
            }
        } while (((((i2 & 1) | (i2 >>> 1)) - 1) >> 31) != 0);
        return new C18150e(iArr);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC2413e vip(AbstractC9932e[] abstractC9932eArr, int i) {
        int[] iArr = new int[i * 16];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i3];
            AbstractC10077e.purchase(i2, ((C18150e) abstractC9932e.vip).f35562e, iArr);
            AbstractC10077e.purchase(i2 + 8, ((C18150e) abstractC9932e.metrica).f35562e, iArr);
            i2 += 16;
        }
        return new C2679e(this, i, iArr, 0);
    }
}
