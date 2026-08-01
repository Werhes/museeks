package defpackage;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٟؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2761e implements InterfaceC10166e {
    public final float[] ad;
    public double appmetrica;
    public double billing;
    public float[] license;
    public float[] metrica;
    public double purchase;
    public float[] vip;
    public final /* synthetic */ C14351e yandex;

    public C2761e(C14351e c14351e) {
        this.yandex = c14351e;
        int i = c14351e.yandex;
        this.ad = new float[i];
        int i2 = i * c14351e.vip;
        this.vip = new float[i2];
        this.metrica = new float[i2];
        this.license = new float[i2];
    }

    @Override // defpackage.InterfaceC10166e
    public final void Signature(int i) {
        this.vip = subscription(this.yandex.adcel, i, this.vip);
    }

    @Override // defpackage.InterfaceC10166e
    public final void ad(int i, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.vip;
        C14351e c14351e = this.yandex;
        asFloatBuffer.get(fArr, c14351e.adcel * c14351e.vip, i / 4);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // defpackage.InterfaceC10166e
    public final void adcel(int i) {
        this.metrica = subscription(this.yandex.mopub, i, this.metrica);
    }

    @Override // defpackage.InterfaceC10166e
    public final int admob(int i, int i2) {
        return remoteconfig(0, i, i2, this.ad);
    }

    @Override // defpackage.InterfaceC10166e
    public final Object advert() {
        return this.license;
    }

    @Override // defpackage.InterfaceC10166e
    public final void amazon(int i) {
        this.license = subscription(this.yandex.advert, i, this.license);
    }

    @Override // defpackage.InterfaceC10166e
    public final void appmetrica(int i, int i2) {
        C14351e c14351e = this.yandex;
        int i3 = c14351e.yandex / i2;
        int i4 = c14351e.vip;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            double d = 0.0d;
            for (int i8 = 0; i8 < i5; i8++) {
                d += this.vip[(i7 * i5) + i6 + i8];
            }
            this.ad[i7] = (float) (d / i5);
        }
    }

    @Override // defpackage.InterfaceC10166e
    public final void billing() {
        this.billing = this.appmetrica;
    }

    @Override // defpackage.InterfaceC10166e
    public final void flush() {
        this.billing = 0.0d;
        this.appmetrica = 0.0d;
        this.purchase = 0.0d;
    }

    @Override // defpackage.InterfaceC10166e
    public final void license(int i, int i2) {
        for (int i3 = 0; i3 < this.yandex.vip * i2; i3++) {
            this.vip[i + i3] = 0.0f;
        }
    }

    @Override // defpackage.InterfaceC10166e
    public final int loadAd() {
        return 4;
    }

    @Override // defpackage.InterfaceC10166e
    public final void metrica(int i, long j, long j2) {
        int i2 = 0;
        while (true) {
            C14351e c14351e = this.yandex;
            int i3 = c14351e.vip;
            if (i2 >= i3) {
                return;
            }
            float[] fArr = this.metrica;
            int i4 = (c14351e.mopub * i3) + i2;
            float[] fArr2 = this.license;
            int i5 = (i * i3) + i2;
            float f = fArr2[i5];
            float f2 = fArr2[i5 + i3];
            long j3 = c14351e.amazon * j;
            long j4 = (r1 + 1) * j2;
            long j5 = j4 - j3;
            long j6 = j4 - (c14351e.smaato * j2);
            fArr[i4] = ((((float) (j6 - j5)) * f2) + (((float) j5) * f)) / ((float) j6);
            i2++;
        }
    }

    @Override // defpackage.InterfaceC10166e
    public final boolean mopub() {
        double d = this.appmetrica;
        return d != 0.0d && this.yandex.Signature != 0 && this.purchase <= d * 3.0d && d * 2.0d > this.billing * 3.0d;
    }

    @Override // defpackage.InterfaceC10166e
    public final int purchase(int i, int i2, int i3) {
        return remoteconfig(i, i2, i3, this.vip);
    }

    public final int remoteconfig(int i, int i2, int i3, float[] fArr) {
        int i4 = this.yandex.vip * i;
        double d = 1.0d;
        int i5 = 0;
        double d2 = 0.0d;
        int i6 = 255;
        int i7 = i2;
        while (i7 <= i3) {
            double d3 = 0.0d;
            for (int i8 = 0; i8 < i7; i8++) {
                d3 += Math.abs(fArr[i4 + i8] - fArr[(i4 + i7) + i8]);
            }
            int i9 = i4;
            double d4 = i7;
            if (i5 * d3 < d * d4) {
                i5 = i7;
                d = d3;
            }
            if (i6 * d3 > d4 * d2) {
                i6 = i7;
                d2 = d3;
            }
            i7++;
            i4 = i9;
        }
        this.appmetrica = d / i5;
        this.purchase = d2 / i6;
        return i5;
    }

    @Override // defpackage.InterfaceC10166e
    public final void smaato(int i, int i2, int i3, int i4, int i5) {
        float[] fArr = this.metrica;
        float[] fArr2 = this.vip;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                fArr[i7] = ((fArr2[i8] * i10) + (fArr2[i9] * (i - i10))) / i;
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    @Override // defpackage.InterfaceC10166e
    public final Object startapp() {
        return this.metrica;
    }

    public final float[] subscription(int i, int i2, float[] fArr) {
        int length = fArr.length;
        int i3 = this.yandex.vip;
        int i4 = length / i3;
        return i + i2 <= i4 ? fArr : Arrays.copyOf(fArr, (((i4 * 3) / 2) + i2) * i3);
    }

    @Override // defpackage.InterfaceC10166e
    public final void vip(int i, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.metrica;
        C14351e c14351e = this.yandex;
        asFloatBuffer.put(fArr, 0, c14351e.vip * i);
        byteBuffer.position((i * 4 * c14351e.vip) + byteBuffer.position());
    }

    @Override // defpackage.InterfaceC10166e
    public final Object yandex() {
        return this.vip;
    }
}
