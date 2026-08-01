package defpackage;

/* renamed from: eؚۨۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7629e {
    public final int ad;
    public final int adcel;
    public final int appmetrica;
    public final int billing;
    public final int license;
    public final int metrica;
    public final int purchase;
    public final int startapp;
    public final int vip = 4;
    public final int yandex;

    public AbstractC7629e(int i, int i2, int i3, int i4, int i5) {
        int i6;
        this.ad = i;
        int i7 = (i * 8) / 4;
        this.license = i7;
        if (i <= 8) {
            i6 = 2;
        } else {
            if (i > 136) {
                if (i > 256) {
                    throw new IllegalArgumentException("cannot precompute SPX_WOTS_LEN2 for n outside {2, .., 256}");
                }
                this.appmetrica = 4;
                this.metrica = i7 + this.appmetrica;
                this.purchase = i2;
                this.billing = i3;
                this.yandex = i4;
                this.startapp = i5;
                this.adcel = i5 / i2;
            }
            i6 = 3;
        }
        this.appmetrica = i6;
        this.metrica = i7 + this.appmetrica;
        this.purchase = i2;
        this.billing = i3;
        this.yandex = i4;
        this.startapp = i5;
        this.adcel = i5 / i2;
    }

    public abstract byte[] ad(C13935e c13935e, byte[] bArr, byte[] bArr2);

    public abstract byte[] appmetrica(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public abstract void billing(byte[] bArr);

    public abstract byte[] license(C13935e c13935e, byte[] bArr, byte[] bArr2);

    public abstract C15475e metrica(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5);

    public abstract byte[] purchase(C13935e c13935e, byte[] bArr, byte[] bArr2);

    public abstract byte[] vip(C13935e c13935e, byte[] bArr, byte[] bArr2, byte[] bArr3);
}
