package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import androidx.car.app.model.Alert;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۙؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11224e implements InterfaceC10166e {
    public int ad;
    public Object appmetrica;
    public Object billing;
    public final Object license;
    public int metrica;
    public Object purchase;
    public int vip;
    public final Object yandex;
    public static final int[] startapp = new int[3];
    public static final float[] adcel = {0.0f, 0.5f, 1.0f};
    public static final int[] mopub = new int[4];
    public static final float[] advert = {0.0f, 0.0f, 0.5f, 1.0f};

    public C11224e() {
        this.yandex = new Path();
        Paint paint = new Paint();
        this.billing = paint;
        this.license = new Paint();
        isVip(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.appmetrica = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.purchase = new Paint(paint2);
    }

    public C11224e(C1400e c1400e) {
        this.license = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC18273e(false));
        this.appmetrica = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC18273e(true));
        this.purchase = new Object();
        this.billing = new C9821e(2);
        this.yandex = new C9770e(7);
        this.ad = 4;
        this.vip = Alert.DURATION_SHOW_INDEFINITELY;
        this.metrica = 20;
    }

    public C11224e(C7589e c7589e) {
        this.license = c7589e;
        this.appmetrica = AbstractC14533e.startapp(C4471e.ad);
        this.purchase = new C16330e(0);
        this.vip = 1;
        this.yandex = new C16330e(0);
    }

    public C11224e(C14351e c14351e) {
        this.yandex = c14351e;
        int i = c14351e.yandex;
        this.license = new short[i];
        int i2 = i * c14351e.vip;
        this.appmetrica = new short[i2];
        this.purchase = new short[i2];
        this.billing = new short[i2];
    }

    @Override // defpackage.InterfaceC10166e
    public void Signature(int i) {
        this.appmetrica = subscription((short[]) this.appmetrica, ((C14351e) this.yandex).adcel, i);
    }

    @Override // defpackage.InterfaceC10166e
    public void ad(int i, ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.appmetrica;
        C14351e c14351e = (C14351e) this.yandex;
        asShortBuffer.get(sArr, c14351e.adcel * c14351e.vip, i / 2);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // defpackage.InterfaceC10166e
    public void adcel(int i) {
        this.purchase = subscription((short[]) this.purchase, ((C14351e) this.yandex).mopub, i);
    }

    @Override // defpackage.InterfaceC10166e
    public int admob(int i, int i2) {
        return remoteconfig((short[]) this.license, 0, i, i2);
    }

    @Override // defpackage.InterfaceC10166e
    public Object advert() {
        return (short[]) this.billing;
    }

    @Override // defpackage.InterfaceC10166e
    public void amazon(int i) {
        this.billing = subscription((short[]) this.billing, ((C14351e) this.yandex).advert, i);
    }

    @Override // defpackage.InterfaceC10166e
    public void appmetrica(int i, int i2) {
        short[] sArr = (short[]) this.appmetrica;
        C14351e c14351e = (C14351e) this.yandex;
        int i3 = c14351e.yandex / i2;
        int i4 = c14351e.vip;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            ((short[]) this.license)[i7] = (short) (i8 / i5);
        }
    }

    @Override // defpackage.InterfaceC10166e
    public void billing() {
        this.metrica = this.ad;
    }

    @Override // defpackage.InterfaceC10166e
    public void flush() {
        this.metrica = 0;
        this.ad = 0;
        this.vip = 0;
    }

    public void isVip(int i) {
        this.ad = AbstractC3898e.startapp(i, 68);
        this.vip = AbstractC3898e.startapp(i, 20);
        this.metrica = AbstractC3898e.startapp(i, 0);
        ((Paint) this.license).setColor(this.ad);
    }

    @Override // defpackage.InterfaceC10166e
    public void license(int i, int i2) {
        for (int i3 = 0; i3 < ((C14351e) this.yandex).vip * i2; i3++) {
            ((short[]) this.appmetrica)[i + i3] = 0;
        }
    }

    @Override // defpackage.InterfaceC10166e
    public int loadAd() {
        return 2;
    }

    @Override // defpackage.InterfaceC10166e
    public void metrica(int i, long j, long j2) {
        int i2 = 0;
        while (true) {
            C14351e c14351e = (C14351e) this.yandex;
            int i3 = c14351e.vip;
            if (i2 >= i3) {
                return;
            }
            short[] sArr = (short[]) this.purchase;
            int i4 = (c14351e.mopub * i3) + i2;
            short[] sArr2 = (short[]) this.billing;
            int i5 = (i * i3) + i2;
            short s = sArr2[i5];
            short s2 = sArr2[i5 + i3];
            long j3 = c14351e.amazon * j;
            long j4 = (r1 + 1) * j2;
            long j5 = j4 - j3;
            long j6 = j4 - (c14351e.smaato * j2);
            sArr[i4] = (short) ((((j6 - j5) * s2) + (s * j5)) / j6);
            i2++;
        }
    }

    @Override // defpackage.InterfaceC10166e
    public boolean mopub() {
        int i = this.ad;
        return i != 0 && ((C14351e) this.yandex).Signature != 0 && this.vip <= i * 3 && i * 2 > this.metrica * 3;
    }

    public AbstractC14049e pro() {
        return (AbstractC14049e) ((C0576e) this.appmetrica).getValue();
    }

    @Override // defpackage.InterfaceC10166e
    public int purchase(int i, int i2, int i3) {
        return remoteconfig((short[]) this.appmetrica, i, i2, i3);
    }

    public int remoteconfig(short[] sArr, int i, int i2, int i3) {
        int i4 = i * ((C14351e) this.yandex).vip;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.ad = i6 / i7;
        this.vip = i8 / i5;
        return i7;
    }

    public void signatures() {
        Object obj;
        List metrica = ((C7589e) this.license).metrica();
        int size = metrica.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = metrica.get(i);
            if (((C16223e) obj).license().vip()) {
                break;
            } else {
                i++;
            }
        }
        C16223e c16223e = (C16223e) obj;
        if (c16223e == null && ((C0404e) this.billing) == null) {
            return;
        }
        if (AbstractC7890e.billing(c16223e != null ? c16223e.f31875e : null, (C0404e) this.billing)) {
            return;
        }
        ((C16330e) this.yandex).startapp(this.metrica + 1);
    }

    @Override // defpackage.InterfaceC10166e
    public void smaato(int i, int i2, int i3, int i4, int i5) {
        short[] sArr = (short[]) this.purchase;
        short[] sArr2 = (short[]) this.appmetrica;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    @Override // defpackage.InterfaceC10166e
    public Object startapp() {
        return (short[]) this.purchase;
    }

    public short[] subscription(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = ((C14351e) this.yandex).vip;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public void tapsense() {
        Object obj;
        Object obj2;
        AbstractC14049e pro;
        C16330e c16330e = (C16330e) this.yandex;
        C7589e c7589e = (C7589e) this.license;
        C16330e c16330e2 = (C16330e) this.purchase;
        int i = 0;
        if (c16330e2.purchase() != this.ad) {
            this.ad = c16330e2.purchase();
            int m2467class = AbstractC8703e.m2467class(this.vip);
            if (m2467class == 0) {
                pro = pro();
            } else if (m2467class != 1) {
                pro = C4471e.ad;
                if (m2467class == 2) {
                    List metrica = c7589e.metrica();
                    int size = metrica.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            pro = pro().yandex();
                            break;
                        } else if (AbstractC7890e.billing(((C16223e) metrica.get(i2)).f31875e, (C0404e) this.billing)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else if (m2467class != 3) {
                    throw new C14803e(10);
                }
            } else {
                pro = pro().billing((C0404e) this.billing);
            }
            ((C0576e) this.appmetrica).setValue(pro);
            this.vip = 1;
        }
        if (c16330e.purchase() != this.metrica) {
            C0404e c0404e = null;
            if (c7589e.vip.vip()) {
                List metrica2 = c7589e.metrica();
                int size2 = metrica2.size();
                while (true) {
                    if (i >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = metrica2.get(i);
                    if (((C16223e) obj2).license().vip()) {
                        break;
                    } else {
                        i++;
                    }
                }
                C16223e c16223e = (C16223e) obj2;
                if (c16223e != null) {
                    c0404e = c16223e.f31875e;
                }
            } else {
                List vip = c7589e.vip();
                int size3 = vip.size();
                while (true) {
                    if (i >= size3) {
                        obj = null;
                        break;
                    }
                    obj = vip.get(i);
                    if (((C16223e) obj).license().vip()) {
                        break;
                    } else {
                        i++;
                    }
                }
                C16223e c16223e2 = (C16223e) obj;
                if (c16223e2 != null) {
                    c0404e = c16223e2.f31875e;
                }
            }
            if (!AbstractC7890e.billing(c0404e, (C0404e) this.billing)) {
                this.billing = c0404e;
            }
            this.metrica = c16330e.purchase();
        }
    }

    @Override // defpackage.InterfaceC10166e
    public void vip(int i, ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.purchase;
        C14351e c14351e = (C14351e) this.yandex;
        asShortBuffer.put(sArr, 0, c14351e.vip * i);
        byteBuffer.position((i * 2 * c14351e.vip) + byteBuffer.position());
    }

    @Override // defpackage.InterfaceC10166e
    public Object yandex() {
        return (short[]) this.appmetrica;
    }
}
