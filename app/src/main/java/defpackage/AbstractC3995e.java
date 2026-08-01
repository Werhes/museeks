package defpackage;

import android.graphics.Paint;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؖٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3995e {
    public static Field advert = null;
    public static boolean mopub = true;
    public static boolean smaato;
    public static final byte[] ad = {83, 105, 103, 69, 100, 52, 52, 56};
    public static final int[] vip = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    public static final int[] metrica = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};
    public static final int[] license = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};
    public static final int[] appmetrica = {110141154, 30892124, 160820362, 264558960, 217232225, 47722141, 19029845, 8326902, 183409749, 170134547, 90340180, 222600478, 61097333, 7431335, 198491505, 102372861};
    public static final int[] purchase = {221945828, 50763449, 132637478, 109250759, 216053960, 61612587, 50649998, 138339097, 98949899, 248139835, 186410297, 126520782, 47339196, 78164062, 198835543, 169622712};
    public static final Object billing = new Object();
    public static C18540e[] yandex = null;
    public static C18540e[] startapp = null;
    public static int[] adcel = null;

    public static void Signature(C12894e c12894e, C8221e c8221e) {
        int[] iArr = (int[]) c8221e.vip;
        int[] iArr2 = (int[]) c8221e.metrica;
        int[] iArr3 = (int[]) c8221e.license;
        int[] iArr4 = (int[]) c8221e.appmetrica;
        int[] iArr5 = (int[]) c8221e.yandex;
        int[] iArr6 = (int[]) c8221e.ad;
        int[] iArr7 = (int[]) c12894e.f25751e;
        int[] iArr8 = (int[]) c12894e.f25750e;
        AbstractC14410e.vip(iArr7, iArr8, iArr);
        AbstractC14410e.remoteconfig(iArr, iArr);
        AbstractC14410e.remoteconfig(iArr7, iArr2);
        AbstractC14410e.remoteconfig(iArr8, iArr3);
        AbstractC14410e.vip(iArr2, iArr3, iArr4);
        AbstractC14410e.metrica(iArr4);
        int[] iArr9 = (int[]) c12894e.f25752e;
        AbstractC14410e.remoteconfig(iArr9, iArr5);
        AbstractC14410e.vip(iArr5, iArr5, iArr5);
        AbstractC14410e.metrica(iArr5);
        AbstractC14410e.signatures(iArr4, iArr5, iArr6);
        AbstractC14410e.signatures(iArr, iArr4, iArr);
        AbstractC14410e.signatures(iArr2, iArr3, iArr2);
        AbstractC14410e.Signature(iArr, iArr6, iArr7);
        AbstractC14410e.Signature(iArr4, iArr2, iArr8);
        AbstractC14410e.Signature(iArr4, iArr6, iArr9);
    }

    public static boolean ad(byte[] bArr, boolean z, C18540e c18540e) {
        int i = (bArr[56] & 128) >>> 7;
        int[] iArr = (int[]) c18540e.f36382e;
        AbstractC14410e.yandex(0, 0, bArr, iArr);
        AbstractC14410e.yandex(7, 2, bArr, iArr);
        AbstractC14410e.yandex(14, 4, bArr, iArr);
        AbstractC14410e.yandex(21, 6, bArr, iArr);
        AbstractC14410e.yandex(28, 8, bArr, iArr);
        AbstractC14410e.yandex(35, 10, bArr, iArr);
        AbstractC14410e.yandex(42, 12, bArr, iArr);
        AbstractC14410e.yandex(49, 14, bArr, iArr);
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        AbstractC14410e.remoteconfig(iArr, iArr2);
        AbstractC14410e.loadAd(39081, iArr2, iArr3);
        AbstractC14410e.signatures(new int[16], iArr2, iArr2);
        iArr2[0] = iArr2[0] + 1;
        iArr3[0] = iArr3[0] + 1;
        int[] iArr4 = (int[]) c18540e.f36383e;
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        AbstractC14410e.remoteconfig(iArr2, iArr5);
        AbstractC14410e.Signature(iArr5, iArr3, iArr5);
        AbstractC14410e.remoteconfig(iArr5, iArr6);
        AbstractC14410e.Signature(iArr5, iArr2, iArr5);
        AbstractC14410e.Signature(iArr6, iArr2, iArr6);
        AbstractC14410e.Signature(iArr6, iArr3, iArr6);
        int[] iArr7 = new int[16];
        int[] iArr8 = new int[16];
        AbstractC14410e.remoteconfig(iArr6, iArr8);
        AbstractC14410e.Signature(iArr6, iArr8, iArr8);
        int[] iArr9 = new int[16];
        AbstractC14410e.remoteconfig(iArr8, iArr9);
        AbstractC14410e.Signature(iArr6, iArr9, iArr9);
        int[] iArr10 = new int[16];
        AbstractC14410e.subscription(3, iArr9, iArr10);
        AbstractC14410e.Signature(iArr9, iArr10, iArr10);
        int[] iArr11 = new int[16];
        AbstractC14410e.subscription(3, iArr10, iArr11);
        AbstractC14410e.Signature(iArr9, iArr11, iArr11);
        int[] iArr12 = new int[16];
        AbstractC14410e.subscription(9, iArr11, iArr12);
        AbstractC14410e.Signature(iArr11, iArr12, iArr12);
        int[] iArr13 = new int[16];
        AbstractC14410e.remoteconfig(iArr12, iArr13);
        AbstractC14410e.Signature(iArr6, iArr13, iArr13);
        int[] iArr14 = new int[16];
        AbstractC14410e.subscription(18, iArr13, iArr14);
        AbstractC14410e.Signature(iArr12, iArr14, iArr14);
        int[] iArr15 = new int[16];
        AbstractC14410e.subscription(37, iArr14, iArr15);
        AbstractC14410e.Signature(iArr14, iArr15, iArr15);
        int[] iArr16 = new int[16];
        AbstractC14410e.subscription(37, iArr15, iArr16);
        AbstractC14410e.Signature(iArr14, iArr16, iArr16);
        int[] iArr17 = new int[16];
        AbstractC14410e.subscription(111, iArr16, iArr17);
        AbstractC14410e.Signature(iArr16, iArr17, iArr17);
        int[] iArr18 = new int[16];
        AbstractC14410e.remoteconfig(iArr17, iArr18);
        AbstractC14410e.Signature(iArr6, iArr18, iArr18);
        int[] iArr19 = new int[16];
        AbstractC14410e.subscription(223, iArr18, iArr19);
        AbstractC14410e.Signature(iArr19, iArr17, iArr7);
        AbstractC14410e.Signature(iArr7, iArr5, iArr7);
        int[] iArr20 = new int[16];
        AbstractC14410e.remoteconfig(iArr7, iArr20);
        AbstractC14410e.Signature(iArr20, iArr3, iArr20);
        AbstractC14410e.signatures(iArr2, iArr20, iArr20);
        AbstractC14410e.admob(iArr20, 1);
        AbstractC14410e.admob(iArr20, -1);
        if (AbstractC14410e.amazon(iArr20) == 0) {
            return false;
        }
        AbstractC14410e.appmetrica(0, 0, iArr7, iArr4);
        AbstractC14410e.admob(iArr4, 1);
        AbstractC14410e.admob(iArr4, -1);
        if (i == 1 && AbstractC14410e.amazon(iArr4) != 0) {
            return false;
        }
        if (z ^ (i != (iArr4[0] & 1))) {
            AbstractC14410e.signatures(new int[16], iArr4, iArr4);
            AbstractC14410e.admob(iArr4, 1);
            AbstractC14410e.admob(iArr4, -1);
        }
        return true;
    }

    public static final boolean adcel(InterfaceC10857e interfaceC10857e) {
        InterfaceC10857e.ad.getClass();
        return !(interfaceC10857e == C12120e.vip || ((interfaceC10857e instanceof C0547e) && ((C0547e) interfaceC10857e).metrica == 16));
    }

    public static void admob(C18540e c18540e, C12894e[] c12894eArr, int i, int i2, C8221e c8221e) {
        C12894e c12894e = new C12894e(15);
        amazon(c18540e, c12894e);
        Signature(c12894e, c8221e);
        C12894e c12894e2 = new C12894e(15);
        c12894eArr[i] = c12894e2;
        amazon(c18540e, c12894e2);
        for (int i3 = 1; i3 < i2; i3++) {
            int i4 = i + i3;
            C12894e c12894e3 = new C12894e(15);
            c12894eArr[i4] = c12894e3;
            loadAd(c12894eArr[i4 - 1], c12894e3);
            mopub(c12894e, c12894eArr[i4], c8221e);
        }
    }

    public static void advert(boolean z, C18540e c18540e, C12894e c12894e, C8221e c8221e) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = (int[]) c8221e.vip;
        int[] iArr6 = (int[]) c8221e.metrica;
        int[] iArr7 = (int[]) c8221e.license;
        int[] iArr8 = (int[]) c8221e.appmetrica;
        int[] iArr9 = (int[]) c8221e.purchase;
        int[] iArr10 = (int[]) c8221e.billing;
        int[] iArr11 = (int[]) c8221e.yandex;
        if (z) {
            AbstractC14410e.signatures((int[]) c18540e.f36382e, (int[]) c18540e.f36383e, iArr11);
            iArr2 = iArr5;
            iArr = iArr8;
            iArr4 = iArr9;
            iArr3 = iArr10;
        } else {
            AbstractC14410e.vip((int[]) c18540e.f36382e, (int[]) c18540e.f36383e, iArr11);
            iArr = iArr5;
            iArr2 = iArr8;
            iArr3 = iArr9;
            iArr4 = iArr10;
        }
        int[] iArr12 = (int[]) c12894e.f25752e;
        int[] iArr13 = (int[]) c12894e.f25750e;
        int[] iArr14 = (int[]) c12894e.f25751e;
        AbstractC14410e.remoteconfig(iArr12, iArr5);
        AbstractC14410e.Signature((int[]) c18540e.f36383e, iArr14, iArr6);
        AbstractC14410e.Signature((int[]) c18540e.f36382e, iArr13, iArr7);
        AbstractC14410e.Signature(iArr6, iArr7, iArr8);
        AbstractC14410e.loadAd(39081, iArr8, iArr8);
        AbstractC14410e.vip(iArr5, iArr8, iArr3);
        AbstractC14410e.signatures(iArr5, iArr8, iArr4);
        AbstractC14410e.vip(iArr13, iArr14, iArr8);
        AbstractC14410e.Signature(iArr11, iArr8, iArr11);
        AbstractC14410e.vip(iArr7, iArr6, iArr);
        AbstractC14410e.signatures(iArr7, iArr6, iArr2);
        AbstractC14410e.metrica(iArr);
        AbstractC14410e.signatures(iArr11, iArr5, iArr11);
        AbstractC14410e.Signature(iArr11, iArr12, iArr11);
        AbstractC14410e.Signature(iArr8, iArr12, iArr8);
        AbstractC14410e.Signature(iArr9, iArr11, iArr14);
        AbstractC14410e.Signature(iArr8, iArr10, iArr13);
        AbstractC14410e.Signature(iArr9, iArr10, iArr12);
    }

    public static void amazon(C18540e c18540e, C12894e c12894e) {
        AbstractC14410e.appmetrica(0, 0, (int[]) c18540e.f36383e, (int[]) c12894e.f25751e);
        AbstractC14410e.appmetrica(0, 0, (int[]) c18540e.f36382e, (int[]) c12894e.f25750e);
        int[] iArr = (int[]) c12894e.f25752e;
        iArr[0] = 1;
        for (int i = 1; i < 16; i++) {
            iArr[i] = 0;
        }
    }

    public static final float appmetrica(Layout layout, int i, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = AbstractC10080e.ad;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : AbstractC4649e.ad[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final C0547e isVip(long j) {
        return new C0547e(j);
    }

    public static C6325e license(byte[] bArr) {
        C16253e c16253e = new C16253e(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        byte[] bArr2 = new byte[114];
        c16253e.purchase(0, 57, bArr);
        c16253e.metrica(0, 114, bArr2);
        byte[] bArr3 = new byte[57];
        remoteconfig(bArr2, bArr3);
        C12894e c12894e = new C12894e(15);
        pro(bArr3, c12894e);
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        AbstractC14410e.smaato((int[]) c12894e.f25752e, iArr2);
        AbstractC14410e.Signature(iArr2, (int[]) c12894e.f25751e, iArr);
        AbstractC14410e.Signature(iArr2, (int[]) c12894e.f25750e, iArr2);
        AbstractC14410e.admob(iArr, 1);
        AbstractC14410e.admob(iArr, -1);
        AbstractC14410e.admob(iArr2, 1);
        AbstractC14410e.admob(iArr2, -1);
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        AbstractC14410e.remoteconfig(iArr, iArr4);
        AbstractC14410e.remoteconfig(iArr2, iArr5);
        AbstractC14410e.Signature(iArr4, iArr5, iArr3);
        AbstractC14410e.vip(iArr4, iArr5, iArr4);
        AbstractC14410e.loadAd(39081, iArr3, iArr3);
        int[] iArr6 = new int[16];
        iArr6[0] = 1;
        AbstractC14410e.signatures(iArr3, iArr6, iArr3);
        AbstractC14410e.vip(iArr3, iArr4, iArr3);
        AbstractC14410e.admob(iArr3, 1);
        AbstractC14410e.admob(iArr3, -1);
        AbstractC14410e.admob(iArr5, 1);
        AbstractC14410e.admob(iArr5, -1);
        if ((AbstractC14410e.amazon(iArr3) & (~AbstractC14410e.amazon(iArr5))) == 0) {
            throw new IllegalStateException();
        }
        int[] iArr7 = new int[32];
        AbstractC14410e.appmetrica(0, 0, iArr, iArr7);
        AbstractC14410e.appmetrica(0, 16, iArr2, iArr7);
        return new C6325e(11, iArr7);
    }

    public static void loadAd(C12894e c12894e, C12894e c12894e2) {
        AbstractC14410e.appmetrica(0, 0, (int[]) c12894e.f25751e, (int[]) c12894e2.f25751e);
        AbstractC14410e.appmetrica(0, 0, (int[]) c12894e.f25750e, (int[]) c12894e2.f25750e);
        AbstractC14410e.appmetrica(0, 0, (int[]) c12894e.f25752e, (int[]) c12894e2.f25752e);
    }

    public static void metrica(C6325e c6325e, byte[] bArr, int i) {
        int[] iArr = (int[]) c6325e.f13170e;
        AbstractC14410e.advert(16, i, bArr, iArr);
        AbstractC14410e.advert(18, i + 7, bArr, iArr);
        AbstractC14410e.advert(20, i + 14, bArr, iArr);
        AbstractC14410e.advert(22, i + 21, bArr, iArr);
        AbstractC14410e.advert(24, i + 28, bArr, iArr);
        AbstractC14410e.advert(26, i + 35, bArr, iArr);
        AbstractC14410e.advert(28, i + 42, bArr, iArr);
        AbstractC14410e.advert(30, i + 49, bArr, iArr);
        bArr[i + 56] = (byte) ((((int[]) c6325e.f13170e)[0] & 1) << 7);
    }

    public static void mopub(C12894e c12894e, C12894e c12894e2, C8221e c8221e) {
        int[] iArr = (int[]) c8221e.ad;
        int[] iArr2 = (int[]) c8221e.vip;
        int[] iArr3 = (int[]) c8221e.metrica;
        int[] iArr4 = (int[]) c8221e.license;
        int[] iArr5 = (int[]) c8221e.appmetrica;
        int[] iArr6 = (int[]) c8221e.purchase;
        int[] iArr7 = (int[]) c8221e.billing;
        int[] iArr8 = (int[]) c8221e.yandex;
        AbstractC14410e.Signature((int[]) c12894e.f25752e, (int[]) c12894e2.f25752e, iArr);
        AbstractC14410e.remoteconfig(iArr, iArr2);
        int[] iArr9 = (int[]) c12894e.f25751e;
        int[] iArr10 = (int[]) c12894e2.f25751e;
        AbstractC14410e.Signature(iArr9, iArr10, iArr3);
        int[] iArr11 = (int[]) c12894e.f25750e;
        int[] iArr12 = (int[]) c12894e2.f25750e;
        AbstractC14410e.Signature(iArr11, iArr12, iArr4);
        AbstractC14410e.Signature(iArr3, iArr4, iArr5);
        AbstractC14410e.loadAd(39081, iArr5, iArr5);
        AbstractC14410e.vip(iArr2, iArr5, iArr6);
        AbstractC14410e.signatures(iArr2, iArr5, iArr7);
        AbstractC14410e.vip(iArr11, iArr9, iArr8);
        AbstractC14410e.vip(iArr12, iArr10, iArr5);
        AbstractC14410e.Signature(iArr8, iArr5, iArr8);
        AbstractC14410e.vip(iArr4, iArr3, iArr2);
        AbstractC14410e.signatures(iArr4, iArr3, iArr5);
        AbstractC14410e.metrica(iArr2);
        AbstractC14410e.signatures(iArr8, iArr2, iArr8);
        AbstractC14410e.Signature(iArr8, iArr, iArr8);
        AbstractC14410e.Signature(iArr5, iArr, iArr5);
        AbstractC14410e.Signature(iArr6, iArr8, iArr10);
        AbstractC14410e.Signature(iArr5, iArr7, iArr12);
        AbstractC14410e.Signature(iArr6, iArr7, (int[]) c12894e2.f25752e);
    }

    public static void pro(byte[] bArr, C12894e c12894e) {
        int[] iArr = (int[]) c12894e.f25752e;
        int[] iArr2 = (int[]) c12894e.f25750e;
        int[] iArr3 = (int[]) c12894e.f25751e;
        subscription();
        int i = 15;
        int[] iArr4 = new int[15];
        AbstractC15118e.vip(bArr, iArr4);
        int i2 = 0;
        int i3 = 1;
        long j = (-((~iArr4[0]) & 1)) & 4294967295L;
        long j2 = 0;
        int i4 = 0;
        while (i4 < 14) {
            int i5 = i;
            int[] iArr5 = iArr4;
            long j3 = j;
            long j4 = (iArr4[i4] & 4294967295L) + (AbstractC15118e.ad[i4] & j3) + j2;
            iArr5[i4] = (int) j4;
            j2 = j4 >>> 32;
            i4++;
            i3 = i3;
            i = i5;
            iArr4 = iArr5;
            j = j3;
        }
        int[] iArr6 = iArr4;
        int i6 = i3;
        iArr6[14] = 4 + ((int) j2);
        int i7 = i;
        int i8 = 0;
        while (true) {
            i7--;
            if (i7 < 0) {
                break;
            }
            int i9 = iArr6[i7];
            iArr6[i7] = (i8 << 31) | (i9 >>> 1);
            i8 = i9;
        }
        int[] iArr7 = new int[16];
        int[] iArr8 = new int[16];
        int[] iArr9 = new int[16];
        int[] iArr10 = new int[16];
        int[] iArr11 = new int[16];
        int[] iArr12 = new int[16];
        int[] iArr13 = new int[16];
        int[] iArr14 = new int[16];
        int[] iArr15 = new int[16];
        int[] iArr16 = new int[16];
        for (int i10 = 0; i10 < 16; i10++) {
            iArr3[i10] = 0;
        }
        iArr2[0] = i6;
        for (int i11 = i6; i11 < 16; i11++) {
            iArr2[i11] = 0;
        }
        iArr[0] = i6;
        for (int i12 = i6; i12 < 16; i12++) {
            iArr[i12] = 0;
        }
        int i13 = 17;
        while (true) {
            int i14 = i13;
            while (true) {
                if (i2 >= 5) {
                    break;
                }
                int i15 = i13;
                int i16 = 0;
                int i17 = 0;
                for (int i18 = 5; i16 < i18; i18 = 5) {
                    i17 = (i17 & (~(i6 << i16))) ^ ((iArr6[i14 >>> 5] >>> (i14 & 31)) << i16);
                    i14 += 18;
                    i16++;
                }
                int i19 = -((i17 >>> 4) & 1);
                int i20 = (i17 ^ i19) & 15;
                int i21 = i2 * AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                int i22 = i2;
                int[] iArr17 = iArr9;
                for (int i23 = 0; i23 < 16; i23++) {
                    int i24 = ((i23 ^ i20) - 1) >> 31;
                    AbstractC14410e.license(i24, i21, adcel, iArr7);
                    AbstractC14410e.license(i24, i21 + 16, adcel, iArr8);
                    i21 += 32;
                }
                int[] iArr18 = new int[16];
                AbstractC14410e.signatures(iArr18, iArr7, iArr18);
                AbstractC14410e.license(i19, 0, iArr18, iArr7);
                AbstractC14410e.remoteconfig(iArr, iArr10);
                AbstractC14410e.Signature(iArr7, iArr3, iArr11);
                AbstractC14410e.Signature(iArr8, iArr2, iArr12);
                AbstractC14410e.Signature(iArr11, iArr12, iArr13);
                AbstractC14410e.loadAd(39081, iArr13, iArr13);
                AbstractC14410e.vip(iArr10, iArr13, iArr14);
                AbstractC14410e.signatures(iArr10, iArr13, iArr15);
                AbstractC14410e.vip(iArr8, iArr7, iArr16);
                AbstractC14410e.vip(iArr2, iArr3, iArr13);
                AbstractC14410e.Signature(iArr16, iArr13, iArr16);
                AbstractC14410e.vip(iArr12, iArr11, iArr10);
                AbstractC14410e.signatures(iArr12, iArr11, iArr13);
                AbstractC14410e.metrica(iArr10);
                AbstractC14410e.signatures(iArr16, iArr10, iArr16);
                AbstractC14410e.Signature(iArr16, iArr, iArr16);
                AbstractC14410e.Signature(iArr13, iArr, iArr13);
                AbstractC14410e.Signature(iArr14, iArr16, iArr3);
                AbstractC14410e.Signature(iArr13, iArr15, iArr2);
                AbstractC14410e.Signature(iArr14, iArr15, iArr);
                i2 = i22 + 1;
                i13 = i15;
                iArr9 = iArr17;
            }
            int[] iArr19 = iArr9;
            int i25 = i13 - 1;
            if (i25 < 0) {
                return;
            }
            AbstractC14410e.vip(iArr3, iArr2, iArr10);
            AbstractC14410e.remoteconfig(iArr10, iArr10);
            AbstractC14410e.remoteconfig(iArr3, iArr11);
            AbstractC14410e.remoteconfig(iArr2, iArr12);
            AbstractC14410e.vip(iArr11, iArr12, iArr13);
            AbstractC14410e.metrica(iArr13);
            AbstractC14410e.remoteconfig(iArr, iArr16);
            AbstractC14410e.vip(iArr16, iArr16, iArr16);
            AbstractC14410e.metrica(iArr16);
            AbstractC14410e.signatures(iArr13, iArr16, iArr19);
            AbstractC14410e.signatures(iArr10, iArr13, iArr10);
            AbstractC14410e.signatures(iArr11, iArr12, iArr11);
            AbstractC14410e.Signature(iArr10, iArr19, iArr3);
            AbstractC14410e.Signature(iArr13, iArr11, iArr2);
            AbstractC14410e.Signature(iArr13, iArr19, iArr);
            i13 = i25;
            iArr9 = iArr19;
            i2 = 0;
        }
    }

    public static final float purchase(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = AbstractC10080e.ad;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? AbstractC4649e.ad[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static void remoteconfig(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | 128);
        bArr2[56] = 0;
    }

    public static void smaato(boolean z, C12894e c12894e, C12894e c12894e2, C8221e c8221e) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = (int[]) c12894e2.f25752e;
        int[] iArr6 = (int[]) c8221e.ad;
        int[] iArr7 = (int[]) c8221e.vip;
        int[] iArr8 = (int[]) c8221e.metrica;
        int[] iArr9 = (int[]) c8221e.license;
        int[] iArr10 = (int[]) c8221e.appmetrica;
        int[] iArr11 = (int[]) c8221e.purchase;
        int[] iArr12 = (int[]) c8221e.billing;
        int[] iArr13 = (int[]) c8221e.yandex;
        int[] iArr14 = (int[]) c12894e.f25750e;
        int[] iArr15 = (int[]) c12894e.f25751e;
        if (z) {
            AbstractC14410e.signatures(iArr14, iArr15, iArr13);
            iArr2 = iArr7;
            iArr = iArr10;
            iArr4 = iArr11;
            iArr3 = iArr12;
        } else {
            AbstractC14410e.vip(iArr14, iArr15, iArr13);
            iArr = iArr7;
            iArr2 = iArr10;
            iArr3 = iArr11;
            iArr4 = iArr12;
        }
        int[] iArr16 = (int[]) c12894e.f25752e;
        int[] iArr17 = (int[]) c12894e2.f25750e;
        int[] iArr18 = (int[]) c12894e2.f25751e;
        AbstractC14410e.Signature(iArr16, iArr5, iArr6);
        AbstractC14410e.remoteconfig(iArr6, iArr7);
        AbstractC14410e.Signature((int[]) c12894e.f25751e, iArr18, iArr8);
        AbstractC14410e.Signature((int[]) c12894e.f25750e, iArr17, iArr9);
        AbstractC14410e.Signature(iArr8, iArr9, iArr10);
        AbstractC14410e.loadAd(39081, iArr10, iArr10);
        AbstractC14410e.vip(iArr7, iArr10, iArr3);
        AbstractC14410e.signatures(iArr7, iArr10, iArr4);
        AbstractC14410e.vip(iArr17, iArr18, iArr10);
        AbstractC14410e.Signature(iArr13, iArr10, iArr13);
        AbstractC14410e.vip(iArr9, iArr8, iArr);
        AbstractC14410e.signatures(iArr9, iArr8, iArr2);
        AbstractC14410e.metrica(iArr);
        AbstractC14410e.signatures(iArr13, iArr7, iArr13);
        AbstractC14410e.Signature(iArr13, iArr6, iArr13);
        AbstractC14410e.Signature(iArr10, iArr6, iArr10);
        AbstractC14410e.Signature(iArr11, iArr13, iArr18);
        AbstractC14410e.Signature(iArr10, iArr12, iArr17);
        AbstractC14410e.Signature(iArr11, iArr12, iArr5);
    }

    public static void startapp(C12894e[] c12894eArr) {
        int length = c12894eArr.length;
        int[] iArr = new int[length * 16];
        int[] iArr2 = new int[16];
        AbstractC14410e.appmetrica(0, 0, (int[]) c12894eArr[0].f25752e, iArr2);
        AbstractC14410e.appmetrica(0, 0, iArr2, iArr);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= length) {
                break;
            }
            AbstractC14410e.Signature(iArr2, (int[]) c12894eArr[i2].f25752e, iArr2);
            AbstractC14410e.appmetrica(0, i2 * 16, iArr2, iArr);
            i = i2;
        }
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[14];
        AbstractC14410e.appmetrica(0, 0, iArr2, iArr3);
        AbstractC14410e.admob(iArr3, 1);
        AbstractC14410e.admob(iArr3, -1);
        AbstractC14410e.mopub(0, 0, iArr3, iArr4);
        AbstractC14410e.mopub(8, 7, iArr3, iArr4);
        AbstractC6143e.smaato(AbstractC14410e.metrica, iArr4, iArr4);
        AbstractC14410e.billing(0, 0, iArr4, iArr2);
        AbstractC14410e.billing(7, 8, iArr4, iArr2);
        int[] iArr5 = new int[16];
        while (i > 0) {
            int i3 = i - 1;
            AbstractC14410e.appmetrica(i3 * 16, 0, iArr, iArr5);
            AbstractC14410e.Signature(iArr5, iArr2, iArr5);
            AbstractC14410e.Signature(iArr2, (int[]) c12894eArr[i].f25752e, iArr2);
            AbstractC14410e.appmetrica(0, 0, iArr5, (int[]) c12894eArr[i].f25752e);
            i = i3;
        }
        AbstractC14410e.appmetrica(0, 0, iArr2, (int[]) c12894eArr[0].f25752e);
    }

    public static void subscription() {
        synchronized (billing) {
            try {
                if (adcel != null) {
                    return;
                }
                C12894e[] c12894eArr = new C12894e[144];
                C8221e c8221e = new C8221e();
                C18540e c18540e = new C18540e(17);
                AbstractC14410e.appmetrica(0, 0, metrica, (int[]) c18540e.f36383e);
                AbstractC14410e.appmetrica(0, 0, license, (int[]) c18540e.f36382e);
                admob(c18540e, c12894eArr, 0, 32, c8221e);
                C18540e c18540e2 = new C18540e(17);
                AbstractC14410e.appmetrica(0, 0, appmetrica, (int[]) c18540e2.f36383e);
                AbstractC14410e.appmetrica(0, 0, purchase, (int[]) c18540e2.f36382e);
                admob(c18540e2, c12894eArr, 32, 32, c8221e);
                C12894e c12894e = new C12894e(15);
                amazon(c18540e, c12894e);
                int i = 5;
                C12894e[] c12894eArr2 = new C12894e[5];
                for (int i2 = 0; i2 < 5; i2++) {
                    c12894eArr2[i2] = new C12894e(15);
                }
                int i3 = 0;
                int i4 = 64;
                while (i3 < i) {
                    int i5 = i4 + 1;
                    C12894e c12894e2 = new C12894e(15);
                    c12894eArr[i4] = c12894e2;
                    int i6 = 0;
                    while (i6 < i) {
                        if (i6 == 0) {
                            loadAd(c12894e, c12894e2);
                        } else {
                            mopub(c12894e, c12894e2, c8221e);
                        }
                        Signature(c12894e, c8221e);
                        loadAd(c12894e, c12894eArr2[i6]);
                        if (i3 + i6 != 8) {
                            for (int i7 = 1; i7 < 18; i7++) {
                                Signature(c12894e, c8221e);
                            }
                        }
                        i6++;
                        i = 5;
                    }
                    int[] iArr = (int[]) c12894e2.f25751e;
                    AbstractC14410e.signatures(new int[16], iArr, iArr);
                    i4 = i5;
                    for (int i8 = 0; i8 < 4; i8++) {
                        int i9 = 1 << i8;
                        int i10 = 0;
                        while (i10 < i9) {
                            C12894e c12894e3 = new C12894e(15);
                            c12894eArr[i4] = c12894e3;
                            loadAd(c12894eArr[i4 - i9], c12894e3);
                            mopub(c12894eArr2[i8], c12894eArr[i4], c8221e);
                            i10++;
                            i4++;
                        }
                    }
                    i3++;
                    i = 5;
                }
                startapp(c12894eArr);
                yandex = new C18540e[32];
                for (int i11 = 0; i11 < 32; i11++) {
                    C12894e c12894e4 = c12894eArr[i11];
                    C18540e[] c18540eArr = yandex;
                    C18540e c18540e3 = new C18540e(17);
                    c18540eArr[i11] = c18540e3;
                    AbstractC14410e.Signature((int[]) c12894e4.f25751e, (int[]) c12894e4.f25752e, (int[]) c18540e3.f36383e);
                    int[] iArr2 = (int[]) c18540e3.f36383e;
                    AbstractC14410e.admob(iArr2, 1);
                    AbstractC14410e.admob(iArr2, -1);
                    AbstractC14410e.Signature((int[]) c12894e4.f25750e, (int[]) c12894e4.f25752e, (int[]) c18540e3.f36382e);
                    int[] iArr3 = (int[]) c18540e3.f36382e;
                    AbstractC14410e.admob(iArr3, 1);
                    AbstractC14410e.admob(iArr3, -1);
                }
                startapp = new C18540e[32];
                for (int i12 = 0; i12 < 32; i12++) {
                    C12894e c12894e5 = c12894eArr[32 + i12];
                    C18540e[] c18540eArr2 = startapp;
                    C18540e c18540e4 = new C18540e(17);
                    c18540eArr2[i12] = c18540e4;
                    AbstractC14410e.Signature((int[]) c12894e5.f25751e, (int[]) c12894e5.f25752e, (int[]) c18540e4.f36383e);
                    int[] iArr4 = (int[]) c18540e4.f36383e;
                    AbstractC14410e.admob(iArr4, 1);
                    AbstractC14410e.admob(iArr4, -1);
                    AbstractC14410e.Signature((int[]) c12894e5.f25750e, (int[]) c12894e5.f25752e, (int[]) c18540e4.f36382e);
                    int[] iArr5 = (int[]) c18540e4.f36382e;
                    AbstractC14410e.admob(iArr5, 1);
                    AbstractC14410e.admob(iArr5, -1);
                }
                adcel = new int[2560];
                int i13 = 0;
                for (int i14 = 64; i14 < 144; i14++) {
                    C12894e c12894e6 = c12894eArr[i14];
                    int[] iArr6 = (int[]) c12894e6.f25751e;
                    AbstractC14410e.Signature(iArr6, (int[]) c12894e6.f25752e, iArr6);
                    int[] iArr7 = (int[]) c12894e6.f25751e;
                    AbstractC14410e.admob(iArr7, 1);
                    AbstractC14410e.admob(iArr7, -1);
                    int[] iArr8 = (int[]) c12894e6.f25750e;
                    AbstractC14410e.Signature(iArr8, (int[]) c12894e6.f25752e, iArr8);
                    int[] iArr9 = (int[]) c12894e6.f25750e;
                    AbstractC14410e.admob(iArr9, 1);
                    AbstractC14410e.admob(iArr9, -1);
                    AbstractC14410e.appmetrica(0, i13, (int[]) c12894e6.f25751e, adcel);
                    AbstractC14410e.appmetrica(0, i13 + 16, (int[]) c12894e6.f25750e, adcel);
                    i13 += 32;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void vip(C16253e c16253e, byte b, byte[] bArr) {
        int length = bArr.length + 10;
        byte[] bArr2 = new byte[length];
        System.arraycopy(ad, 0, bArr2, 0, 8);
        bArr2[8] = b;
        bArr2[9] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr2, 10, bArr.length);
        c16253e.purchase(0, length, bArr2);
    }

    public static boolean yandex(byte[] bArr, C6325e c6325e, byte[] bArr2, byte b, byte[] bArr3, int i) {
        boolean z;
        boolean z2;
        C18540e c18540e;
        C18540e c18540e2;
        int i2;
        int[] iArr;
        char c;
        int[] iArr2;
        boolean z3;
        int i3;
        boolean z4;
        if (bArr2 == null || bArr2.length >= 256) {
            throw new IllegalArgumentException("ctx");
        }
        byte[] bArr4 = new byte[57];
        System.arraycopy(bArr, 0, bArr4, 0, 57);
        byte[] bArr5 = new byte[57];
        System.arraycopy(bArr, 57, bArr5, 0, 57);
        if ((bArr4[56] & Byte.MAX_VALUE) != 0) {
            z = false;
        } else {
            int appmetrica2 = AbstractC12751e.appmetrica(52, bArr4);
            int[] iArr3 = vip;
            if (appmetrica2 != iArr3[13]) {
                z = true;
            } else {
                int[] iArr4 = new int[14];
                AbstractC12751e.purchase(14, bArr4, iArr4);
                z = !AbstractC12797e.subscription(14, iArr4, iArr3);
            }
        }
        if (z) {
            int[] iArr5 = new int[14];
            byte b2 = bArr5[56];
            int[] iArr6 = AbstractC15118e.ad;
            if (b2 != 0) {
                z2 = false;
            } else {
                AbstractC15118e.vip(bArr5, iArr5);
                z2 = !AbstractC12797e.subscription(14, iArr5, iArr6);
            }
            if (z2) {
                C18540e c18540e3 = new C18540e(17);
                if (ad(bArr4, true, c18540e3)) {
                    C18540e c18540e4 = new C18540e(17);
                    AbstractC14410e.signatures(new int[16], (int[]) c6325e.f13170e, (int[]) c18540e4.f36383e);
                    AbstractC14410e.appmetrica(16, 0, (int[]) c6325e.f13170e, (int[]) c18540e4.f36382e);
                    byte[] bArr6 = new byte[57];
                    metrica(c6325e, bArr6, 0);
                    C16253e c16253e = new C16253e(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    byte[] bArr7 = new byte[114];
                    vip(c16253e, b, bArr2);
                    c16253e.purchase(0, 57, bArr4);
                    c16253e.purchase(0, 57, bArr6);
                    c16253e.purchase(0, i, bArr3);
                    c16253e.metrica(0, 114, bArr7);
                    int[] iArr7 = new int[14];
                    AbstractC15118e.vip(AbstractC15118e.purchase(bArr7), iArr7);
                    int[] iArr8 = new int[8];
                    int[] iArr9 = new int[8];
                    int[] iArr10 = new int[28];
                    System.arraycopy(AbstractC15118e.vip, 0, iArr10, 0, 28);
                    int[] iArr11 = new int[28];
                    AbstractC12947e.isVip(iArr7, iArr11);
                    int i4 = 16;
                    long j = iArr7[7] & 4294967295L;
                    int i5 = 6;
                    int i6 = 0;
                    int i7 = 14;
                    while (true) {
                        int i8 = i5 - 1;
                        c18540e = c18540e4;
                        long j2 = iArr7[i5 + 7] & 4294967295L;
                        long j3 = j2 * j2;
                        c18540e2 = c18540e3;
                        iArr11[i7 + 13] = (i6 << 31) | ((int) (j3 >>> 33));
                        int i9 = i7 - 2;
                        iArr11[i7 + 12] = (int) (j3 >>> 1);
                        i2 = (int) j3;
                        if (i8 <= 0) {
                            break;
                        }
                        i7 = i9;
                        i6 = i2;
                        i5 = i8;
                        c18540e4 = c18540e;
                        c18540e3 = c18540e2;
                    }
                    long j4 = j * j;
                    iArr11[14] = (int) j4;
                    long j5 = iArr7[8] & 4294967295L;
                    long j6 = (j5 * j) + (((i2 << 31) & 4294967295L) | (j4 >>> 33));
                    int i10 = (int) j6;
                    iArr11[15] = (i10 << 1) | (((int) (j4 >>> 32)) & 1);
                    int i11 = i10 >>> 31;
                    long j7 = (iArr11[16] & 4294967295L) + (j6 >>> 32);
                    long j8 = iArr7[9] & 4294967295L;
                    int i12 = 18;
                    long j9 = (j8 * j) + j7;
                    int i13 = (int) j9;
                    iArr11[16] = (i13 << 1) | i11;
                    long amazon = AbstractC1786e.amazon(j8, j5, j9 >>> 32, iArr11[17] & 4294967295L);
                    long j10 = (iArr11[18] & 4294967295L) + (amazon >>> 32);
                    long j11 = iArr7[10] & 4294967295L;
                    long j12 = (iArr11[19] & 4294967295L) + (j10 >>> 32);
                    long j13 = (j11 * j) + (amazon & 4294967295L);
                    int i14 = (int) j13;
                    iArr11[17] = (i14 << 1) | (i13 >>> 31);
                    long amazon2 = AbstractC1786e.amazon(j11, j5, j13 >>> 32, j10 & 4294967295L);
                    long amazon3 = AbstractC1786e.amazon(j11, j8, amazon2 >>> 32, j12 & 4294967295L);
                    long j14 = (iArr11[20] & 4294967295L) + (j12 >>> 32) + (amazon3 >>> 32);
                    long j15 = iArr7[11] & 4294967295L;
                    long j16 = (iArr11[21] & 4294967295L) + (j14 >>> 32);
                    long j17 = j14 & 4294967295L;
                    long j18 = (j15 * j) + (amazon2 & 4294967295L);
                    int i15 = (int) j18;
                    iArr11[18] = (i15 << 1) | (i14 >>> 31);
                    long amazon4 = AbstractC1786e.amazon(j15, j5, j18 >>> 32, amazon3 & 4294967295L);
                    long amazon5 = AbstractC1786e.amazon(j15, j8, amazon4 >>> 32, j17);
                    long amazon6 = AbstractC1786e.amazon(j15, j11, amazon5 >>> 32, j16 & 4294967295L);
                    long j19 = amazon5 & 4294967295L;
                    long j20 = (iArr11[22] & 4294967295L) + (j16 >>> 32) + (amazon6 >>> 32);
                    long j21 = amazon6 & 4294967295L;
                    long j22 = iArr7[12] & 4294967295L;
                    long j23 = (iArr11[23] & 4294967295L) + (j20 >>> 32);
                    long j24 = (j22 * j) + (amazon4 & 4294967295L);
                    int i16 = (int) j24;
                    iArr11[19] = (i15 >>> 31) | (i16 << 1);
                    long amazon7 = AbstractC1786e.amazon(j22, j5, j24 >>> 32, j19);
                    long amazon8 = AbstractC1786e.amazon(j22, j8, amazon7 >>> 32, j21);
                    long amazon9 = AbstractC1786e.amazon(j22, j11, amazon8 >>> 32, j20 & 4294967295L);
                    long j25 = amazon8 & 4294967295L;
                    long amazon10 = AbstractC1786e.amazon(j22, j15, amazon9 >>> 32, j23 & 4294967295L);
                    long j26 = (iArr11[24] & 4294967295L) + (j23 >>> 32) + (amazon10 >>> 32);
                    long j27 = iArr7[13] & 4294967295L;
                    long j28 = (iArr11[25] & 4294967295L) + (j26 >>> 32);
                    long j29 = j26 & 4294967295L;
                    long j30 = (iArr11[26] & 4294967295L) + (j28 >>> 32);
                    long j31 = j28 & 4294967295L;
                    long j32 = (j27 * j) + (amazon7 & 4294967295L);
                    int i17 = (int) j32;
                    iArr11[20] = (i17 << 1) | (i16 >>> 31);
                    long amazon11 = AbstractC1786e.amazon(j27, j5, j32 >>> 32, j25);
                    long amazon12 = AbstractC1786e.amazon(j27, j8, amazon11 >>> 32, amazon9 & 4294967295L);
                    long amazon13 = AbstractC1786e.amazon(j27, j11, amazon12 >>> 32, amazon10 & 4294967295L);
                    long amazon14 = AbstractC1786e.amazon(j27, j15, amazon13 >>> 32, j29);
                    long amazon15 = AbstractC1786e.amazon(j27, j22, amazon14 >>> 32, j31);
                    long j33 = j30 + (amazon15 >>> 32);
                    int i18 = (int) amazon11;
                    iArr11[21] = (i17 >>> 31) | (i18 << 1);
                    int i19 = (int) amazon12;
                    iArr11[22] = (i18 >>> 31) | (i19 << 1);
                    int i20 = (int) amazon13;
                    iArr11[23] = (i20 << 1) | (i19 >>> 31);
                    int i21 = (int) amazon14;
                    iArr11[24] = (i20 >>> 31) | (i21 << 1);
                    int i22 = i21 >>> 31;
                    int i23 = (int) amazon15;
                    iArr11[25] = i22 | (i23 << 1);
                    int i24 = i23 >>> 31;
                    int i25 = (int) j33;
                    iArr11[26] = i24 | (i25 << 1);
                    iArr11[27] = (i25 >>> 31) | ((iArr11[27] + ((int) (j33 >>> 32))) << 1);
                    int appmetrica3 = AbstractC12947e.appmetrica(iArr11, iArr11);
                    int license2 = AbstractC12947e.license(21, 14, iArr11, iArr11, AbstractC12947e.license(0, 7, iArr11, iArr11, 0) + appmetrica3) + appmetrica3;
                    int[] iArr12 = new int[7];
                    AbstractC12947e.adcel(iArr7, iArr7, iArr12);
                    int[] iArr13 = new int[14];
                    AbstractC12947e.isVip(iArr12, iArr13);
                    AbstractC12797e.purchase(28, AbstractC12797e.m3399goto(14, 7, iArr13, iArr11) + license2, 21, iArr11);
                    iArr11[0] = iArr11[0] + 1;
                    int[] iArr14 = new int[28];
                    AbstractC12947e.subscription(iArr6, iArr7, iArr14);
                    long j34 = iArr7[7] & 4294967295L;
                    long j35 = iArr7[8] & 4294967295L;
                    long j36 = iArr7[9] & 4294967295L;
                    long j37 = iArr7[10] & 4294967295L;
                    long j38 = iArr7[11] & 4294967295L;
                    long j39 = iArr7[12] & 4294967295L;
                    long j40 = iArr7[13] & 4294967295L;
                    long j41 = iArr6[7] & 4294967295L;
                    int[] iArr15 = iArr7;
                    long j42 = j41 * j34;
                    iArr14[14] = (int) j42;
                    long j43 = (j41 * j35) + (j42 >>> 32);
                    iArr14[15] = (int) j43;
                    long j44 = (j41 * j36) + (j43 >>> 32);
                    iArr14[16] = (int) j44;
                    long j45 = (j41 * j37) + (j44 >>> 32);
                    iArr14[17] = (int) j45;
                    long j46 = (j41 * j38) + (j45 >>> 32);
                    iArr14[18] = (int) j46;
                    long j47 = (j41 * j39) + (j46 >>> 32);
                    iArr14[19] = (int) j47;
                    long j48 = (j41 * j40) + (j47 >>> 32);
                    iArr14[20] = (int) j48;
                    iArr14[21] = (int) (j48 >>> 32);
                    int i26 = 1;
                    int i27 = 14;
                    while (i26 < 7) {
                        int i28 = i27 + 1;
                        long j49 = iArr6[7 + i26] & 4294967295L;
                        int i29 = i26;
                        int i30 = i27;
                        long j50 = (j49 * j34) + (iArr14[i28] & 4294967295L);
                        iArr14[i28] = (int) j50;
                        long j51 = (j49 * j35) + (iArr14[r3] & 4294967295L) + (j50 >>> 32);
                        iArr14[i30 + 2] = (int) j51;
                        long j52 = (j49 * j36) + (iArr14[r3] & 4294967295L) + (j51 >>> 32);
                        iArr14[i30 + 3] = (int) j52;
                        long j53 = (j49 * j37) + (iArr14[r3] & 4294967295L) + (j52 >>> 32);
                        iArr14[i30 + 4] = (int) j53;
                        long j54 = (j49 * j38) + (iArr14[r3] & 4294967295L) + (j53 >>> 32);
                        iArr14[i30 + 5] = (int) j54;
                        long j55 = (j49 * j39) + (iArr14[r3] & 4294967295L) + (j54 >>> 32);
                        iArr14[i30 + 6] = (int) j55;
                        long j56 = (j49 * j40) + (iArr14[r3] & 4294967295L) + (j55 >>> 32);
                        iArr14[i30 + 7] = (int) j56;
                        iArr14[i30 + 8] = (int) (j56 >>> 32);
                        i26 = i29 + 1;
                        iArr15 = iArr15;
                        i27 = i28;
                    }
                    int[] iArr16 = iArr15;
                    int appmetrica4 = AbstractC12947e.appmetrica(iArr14, iArr14);
                    int license3 = AbstractC12947e.license(21, 14, iArr14, iArr14, AbstractC12947e.license(0, 7, iArr14, iArr14, 0) + appmetrica4) + appmetrica4;
                    int[] iArr17 = new int[7];
                    int[] iArr18 = new int[7];
                    boolean z5 = AbstractC12947e.adcel(iArr6, iArr6, iArr17) != AbstractC12947e.adcel(iArr16, iArr16, iArr18);
                    int[] iArr19 = new int[14];
                    AbstractC12947e.subscription(iArr17, iArr18, iArr19);
                    AbstractC12797e.purchase(28, license3 + (z5 ? AbstractC12797e.license(14, 7, iArr19, iArr14) : AbstractC12797e.m3399goto(14, 7, iArr19, iArr14)), 21, iArr14);
                    int[] iArr20 = new int[28];
                    int[] iArr21 = new int[8];
                    System.arraycopy(iArr6, 0, iArr21, 0, 8);
                    int[] iArr22 = new int[8];
                    System.arraycopy(iArr16, 0, iArr22, 0, 8);
                    int[] iArr23 = new int[8];
                    iArr23[0] = 1;
                    int appmetrica5 = AbstractC4520e.appmetrica(iArr11, 27);
                    int i31 = 27;
                    int i32 = 1788;
                    int[] iArr24 = new int[8];
                    int[] iArr25 = iArr22;
                    int[] iArr26 = iArr23;
                    int[] iArr27 = iArr11;
                    int[] iArr28 = iArr10;
                    int[] iArr29 = iArr21;
                    while (true) {
                        if (appmetrica5 <= 447) {
                            iArr = iArr8;
                            c = 0;
                            System.arraycopy(iArr25, 0, iArr, 0, 8);
                            iArr2 = iArr9;
                            System.arraycopy(iArr26, 0, iArr2, 0, 8);
                            z3 = true;
                            break;
                        }
                        i32--;
                        if (i32 < 0) {
                            iArr = iArr8;
                            iArr2 = iArr9;
                            c = 0;
                            z3 = false;
                            break;
                        }
                        int license4 = AbstractC4520e.license(iArr14, i31) - appmetrica5;
                        int i33 = license4 & (~(license4 >> 31));
                        if (iArr14[i31] < 0) {
                            AbstractC4520e.ad(i31, i33, iArr28, iArr27, iArr14, iArr20);
                            AbstractC4520e.vip(7, i33, iArr29, iArr24, iArr25, iArr26);
                        } else {
                            AbstractC4520e.adcel(i31, i33, iArr28, iArr27, iArr14, iArr20);
                            AbstractC4520e.mopub(7, i33, iArr29, iArr24, iArr25, iArr26);
                        }
                        int[] iArr30 = iArr25;
                        int[] iArr31 = iArr26;
                        int i34 = i31;
                        do {
                            int i35 = iArr28[i34] + RecyclerView.UNDEFINED_DURATION;
                            int i36 = iArr27[i34] + RecyclerView.UNDEFINED_DURATION;
                            if (i35 < i36) {
                                z4 = true;
                                break;
                            }
                            if (i35 > i36) {
                                break;
                            }
                            i34--;
                        } while (i34 >= 0);
                        z4 = false;
                        if (z4) {
                            int i37 = appmetrica5 >>> 5;
                            appmetrica5 = AbstractC4520e.appmetrica(iArr28, i37);
                            int[] iArr32 = iArr27;
                            iArr27 = iArr28;
                            iArr28 = iArr32;
                            i31 = i37;
                            iArr25 = iArr29;
                            iArr26 = iArr24;
                            iArr29 = iArr30;
                            iArr24 = iArr31;
                        } else {
                            iArr25 = iArr30;
                            iArr26 = iArr31;
                        }
                    }
                    if (!z3) {
                        throw new IllegalStateException();
                    }
                    int[] iArr33 = new int[22];
                    long j57 = iArr2[c] & 4294967295L;
                    long j58 = 0;
                    int i38 = 0;
                    while (true) {
                        long j59 = ((iArr5[i38] & 4294967295L) * j57) + j58;
                        iArr33[i38] = (int) j59;
                        j58 = j59 >>> 32;
                        i38++;
                        if (i38 >= 14) {
                            break;
                        }
                        i4 = i4;
                        i12 = i12;
                    }
                    iArr33[14] = (int) j58;
                    for (int i39 = 1; i39 < 8; i39++) {
                        iArr33[i39 + 14] = AbstractC12797e.premium(14, iArr2[i39], iArr5, iArr33, i39);
                    }
                    if (iArr2[7] < 0) {
                        AbstractC12797e.license(14, 8, iArr6, iArr33);
                        AbstractC12797e.m3399goto(14, 8, iArr5, iArr33);
                    }
                    byte[] bArr8 = new byte[88];
                    AbstractC12751e.yandex(22, bArr8, iArr33);
                    long license5 = AbstractC12751e.license(60, bArr8) << 4;
                    long j60 = license5 & 4294967295L;
                    long appmetrica6 = AbstractC12751e.appmetrica(70, bArr8);
                    long j61 = appmetrica6 & 4294967295L;
                    long appmetrica7 = AbstractC12751e.appmetrica(84, bArr8);
                    long j62 = (appmetrica7 & 4294967295L) >>> 28;
                    long license6 = (j62 * 43969588) + ((AbstractC12751e.license(32, bArr8) << 4) & 4294967295L);
                    long appmetrica8 = (j62 * 30366549) + (AbstractC12751e.appmetrica(35, bArr8) & 4294967295L);
                    long license7 = (j62 * 163752818) + ((AbstractC12751e.license(39, bArr8) << 4) & 4294967295L);
                    long appmetrica9 = (j62 * 258169998) + (AbstractC12751e.appmetrica(42, bArr8) & 4294967295L);
                    long license8 = (j62 * 96434764) + ((AbstractC12751e.license(46, bArr8) << 4) & 4294967295L);
                    long appmetrica10 = (j62 * 227822194) + (AbstractC12751e.appmetrica(49, bArr8) & 4294967295L);
                    long license9 = (j62 * 149865618) + ((AbstractC12751e.license(53, bArr8) << 4) & 4294967295L);
                    long appmetrica11 = (j62 * 550336261) + (AbstractC12751e.appmetrica(56, bArr8) & 4294967295L);
                    long license10 = ((AbstractC12751e.license(74, bArr8) << 4) & 4294967295L) + (j61 >>> 28);
                    long j63 = appmetrica6 & 268435455;
                    long appmetrica12 = (AbstractC12751e.appmetrica(77, bArr8) & 4294967295L) + (license10 >>> 28);
                    long license11 = ((AbstractC12751e.license(81, bArr8) << 4) & 4294967295L) + (appmetrica12 >>> 28);
                    long j64 = appmetrica12 & 268435455;
                    long j65 = (appmetrica7 & 268435455) + (license11 >>> 28);
                    long j66 = license11 & 268435455;
                    long j67 = (j65 * 30366549) + license6;
                    long j68 = (j65 * 163752818) + appmetrica8;
                    long j69 = (j65 * 258169998) + license7;
                    long j70 = (j65 * 96434764) + appmetrica9;
                    long j71 = (j65 * 227822194) + license8;
                    long j72 = (j65 * 149865618) + appmetrica10;
                    long license12 = (j66 * 43969588) + ((AbstractC12751e.license(25, bArr8) << 4) & 4294967295L);
                    long appmetrica13 = (j66 * 30366549) + (j65 * 43969588) + (AbstractC12751e.appmetrica(28, bArr8) & 4294967295L);
                    long j73 = (j66 * 163752818) + j67;
                    long j74 = (j66 * 258169998) + j68;
                    long j75 = (j66 * 96434764) + j69;
                    long j76 = (j66 * 227822194) + j70;
                    long j77 = (j66 * 149865618) + j71;
                    long j78 = (j66 * 550336261) + j72;
                    long appmetrica14 = (j64 * 43969588) + (AbstractC12751e.appmetrica(21, bArr8) & 4294967295L);
                    long j79 = (j64 * 30366549) + license12;
                    long j80 = (j64 * 163752818) + appmetrica13;
                    long j81 = (j64 * 258169998) + j73;
                    long j82 = (j64 * 96434764) + j74;
                    long j83 = (j64 * 227822194) + j75;
                    long j84 = (j64 * 149865618) + j76;
                    long j85 = (j64 * 550336261) + j77;
                    long appmetrica15 = (AbstractC12751e.appmetrica(63, bArr8) & 4294967295L) + (j60 >>> 28);
                    long j86 = license5 & 268435455;
                    long license13 = ((AbstractC12751e.license(67, bArr8) << 4) & 4294967295L) + (appmetrica15 >>> 28);
                    long j87 = j63 + (license13 >>> 28);
                    long j88 = license13 & 268435455;
                    long j89 = (license10 & 268435455) + (j87 >>> 28);
                    long j90 = j87 & 268435455;
                    long license14 = (j89 * 43969588) + ((AbstractC12751e.license(i12, bArr8) << 4) & 4294967295L);
                    long j91 = (j89 * 30366549) + appmetrica14;
                    long j92 = (j89 * 163752818) + j79;
                    long j93 = (j89 * 258169998) + j80;
                    long j94 = (j89 * 96434764) + j81;
                    long j95 = (j89 * 227822194) + j82;
                    long j96 = (j89 * 149865618) + j83;
                    long j97 = (j89 * 550336261) + j84;
                    long appmetrica16 = (j90 * 43969588) + (AbstractC12751e.appmetrica(14, bArr8) & 4294967295L);
                    long j98 = (j90 * 30366549) + license14;
                    long j99 = (j90 * 163752818) + j91;
                    long j100 = (j90 * 258169998) + j92;
                    long j101 = (j90 * 96434764) + j93;
                    long j102 = (j90 * 227822194) + j94;
                    long j103 = (j90 * 149865618) + j95;
                    long j104 = (j90 * 550336261) + j96;
                    long license15 = (j88 * 43969588) + ((AbstractC12751e.license(11, bArr8) << 4) & 4294967295L);
                    long j105 = (j88 * 30366549) + appmetrica16;
                    long j106 = (j88 * 163752818) + j98;
                    long j107 = (j88 * 258169998) + j99;
                    long j108 = (j88 * 96434764) + j100;
                    long j109 = (j88 * 227822194) + j101;
                    long j110 = (j88 * 149865618) + j102;
                    long j111 = (j65 * 550336261) + license9 + (j78 >>> 28);
                    long j112 = j78 & 268435455;
                    long j113 = appmetrica11 + (j111 >>> 28);
                    long j114 = j86 + (j113 >>> 28);
                    long j115 = (appmetrica15 & 268435455) + (j114 >>> 28);
                    long j116 = j114 & 268435455;
                    long appmetrica17 = (j115 * 43969588) + (AbstractC12751e.appmetrica(7, bArr8) & 4294967295L);
                    long j117 = (j115 * 30366549) + license15;
                    long j118 = (j115 * 163752818) + j105;
                    long j119 = (j115 * 258169998) + j106;
                    long j120 = (j115 * 96434764) + j107;
                    long j121 = (j115 * 227822194) + j108;
                    long j122 = (j115 * 149865618) + j109;
                    long j123 = (j115 * 550336261) + j110;
                    long license16 = (43969588 * j116) + ((AbstractC12751e.license(4, bArr8) << 4) & 4294967295L);
                    long j124 = (30366549 * j116) + appmetrica17;
                    long j125 = (163752818 * j116) + j117;
                    long j126 = (258169998 * j116) + j118;
                    long j127 = (96434764 * j116) + j119;
                    long j128 = (227822194 * j116) + j120;
                    long j129 = (149865618 * j116) + j121;
                    long j130 = (j116 * 550336261) + j122;
                    long j131 = ((j113 & 268435455) * 4) + ((j111 & 268435455) >>> 26) + 1;
                    long appmetrica18 = (j131 * 78101261) + (AbstractC12751e.appmetrica(0, bArr8) & 4294967295L);
                    long j132 = (j131 * 141809365) + license16;
                    long j133 = (j131 * 175155932) + j124;
                    long j134 = (j131 * 64542499) + j125;
                    long j135 = (j131 * 158326419) + j126;
                    long j136 = (j131 * 191173276) + j127;
                    long j137 = (j131 * 104575268) + j128;
                    long j138 = (j131 * 137584065) + j129;
                    long j139 = j132 + (appmetrica18 >>> 28);
                    long j140 = j133 + (j139 >>> 28);
                    long j141 = j134 + (j140 >>> 28);
                    long j142 = j140 & 268435455;
                    long j143 = j135 + (j141 >>> 28);
                    long j144 = j141 & 268435455;
                    long j145 = j136 + (j143 >>> 28);
                    long j146 = j137 + (j145 >>> 28);
                    long j147 = j138 + (j146 >>> 28);
                    long j148 = j130 + (j147 >>> 28);
                    long j149 = j123 + (j148 >>> 28);
                    long j150 = (j88 * 550336261) + j103 + (j149 >>> 28);
                    long j151 = j104 + (j150 >>> 28);
                    long j152 = j97 + (j151 >>> 28);
                    long j153 = j85 + (j152 >>> 28);
                    long j154 = j112 + (j153 >>> 28);
                    long j155 = (j111 & 67108863) + (j154 >>> 28);
                    long j156 = (j155 >>> 26) - 1;
                    long j157 = (appmetrica18 & 268435455) - (j156 & 78101261);
                    long j158 = ((j139 & 268435455) - (j156 & 141809365)) + (j157 >> 28);
                    long j159 = (j142 - (j156 & 175155932)) + (j158 >> 28);
                    long j160 = (j144 - (j156 & 64542499)) + (j159 >> 28);
                    long j161 = ((j143 & 268435455) - (j156 & 158326419)) + (j160 >> 28);
                    long j162 = ((j145 & 268435455) - (j156 & 191173276)) + (j161 >> 28);
                    long j163 = ((j146 & 268435455) - (j156 & 104575268)) + (j162 >> 28);
                    long j164 = ((j147 & 268435455) - (j156 & 137584065)) + (j163 >> 28);
                    long j165 = (j148 & 268435455) + (j164 >> 28);
                    long j166 = (j149 & 268435455) + (j165 >> 28);
                    long j167 = (j150 & 268435455) + (j166 >> 28);
                    long j168 = (j151 & 268435455) + (j167 >> 28);
                    long j169 = (j152 & 268435455) + (j168 >> 28);
                    long j170 = (j153 & 268435455) + (j169 >> 28);
                    long j171 = (j154 & 268435455) + (j170 >> 28);
                    byte[] bArr9 = new byte[57];
                    AbstractC12751e.startapp(0, (j157 & 268435455) | ((j158 & 268435455) << 28), bArr9);
                    AbstractC12751e.startapp(7, ((j160 & 268435455) << 28) | (j159 & 268435455), bArr9);
                    AbstractC12751e.startapp(14, (j161 & 268435455) | ((j162 & 268435455) << 28), bArr9);
                    AbstractC12751e.startapp(21, (j163 & 268435455) | ((j164 & 268435455) << 28), bArr9);
                    AbstractC12751e.startapp(28, (j165 & 268435455) | ((j166 & 268435455) << 28), bArr9);
                    AbstractC12751e.startapp(35, (j167 & 268435455) | ((j168 & 268435455) << 28), bArr9);
                    AbstractC12751e.startapp(42, (j169 & 268435455) | ((j170 & 268435455) << 28), bArr9);
                    AbstractC12751e.startapp(49, (j171 & 268435455) | (((j155 & 67108863) + (j171 >> 28)) << 28), bArr9);
                    AbstractC15118e.vip(bArr9, iArr5);
                    C12894e c12894e = new C12894e(15);
                    subscription();
                    byte[] bArr10 = new byte[450];
                    int i40 = 225;
                    byte[] bArr11 = new byte[225];
                    byte[] bArr12 = new byte[225];
                    AbstractC10681e.ad(7, bArr10, iArr5);
                    AbstractC10681e.ad(5, bArr11, iArr);
                    AbstractC10681e.ad(5, bArr12, iArr2);
                    C12894e[] c12894eArr = new C12894e[8];
                    C12894e[] c12894eArr2 = new C12894e[8];
                    C8221e c8221e = new C8221e();
                    int i41 = 0;
                    admob(c18540e, c12894eArr, 0, 8, c8221e);
                    admob(c18540e2, c12894eArr2, 0, 8, c8221e);
                    int[] iArr34 = (int[]) c12894e.f25751e;
                    int i42 = i4;
                    for (int i43 = 0; i43 < i42; i43++) {
                        iArr34[i43] = 0;
                    }
                    int[] iArr35 = (int[]) c12894e.f25750e;
                    iArr35[0] = 1;
                    for (int i44 = 1; i44 < i42; i44++) {
                        iArr35[i44] = 0;
                    }
                    int[] iArr36 = (int[]) c12894e.f25752e;
                    iArr36[0] = 1;
                    int i45 = 1;
                    while (i45 < i42) {
                        iArr36[i45] = i41;
                        i45++;
                        i41 = 0;
                        i42 = 16;
                    }
                    while (true) {
                        i3 = i40 - 1;
                        if (i3 < 0) {
                            break;
                        }
                        if ((bArr10[i40 + 224] | bArr10[i3] | bArr11[i3] | bArr12[i3]) != 0) {
                            break;
                        }
                        i40 = i3;
                    }
                    while (i3 >= 0) {
                        byte b3 = bArr10[i3];
                        if (b3 != 0) {
                            advert(b3 < 0, yandex[(b3 >> 1) ^ (b3 >> 31)], c12894e, c8221e);
                        }
                        byte b4 = bArr10[i3 + 225];
                        if (b4 != 0) {
                            advert(b4 < 0, startapp[(b4 >> 1) ^ (b4 >> 31)], c12894e, c8221e);
                        }
                        byte b5 = bArr11[i3];
                        if (b5 != 0) {
                            smaato(b5 < 0, c12894eArr[(b5 >> 1) ^ (b5 >> 31)], c12894e, c8221e);
                        }
                        byte b6 = bArr12[i3];
                        if (b6 != 0) {
                            smaato(b6 < 0, c12894eArr2[(b6 >> 1) ^ (b6 >> 31)], c12894e, c8221e);
                        }
                        Signature(c12894e, c8221e);
                        i3--;
                    }
                    Signature(c12894e, c8221e);
                    int[] iArr37 = (int[]) c12894e.f25751e;
                    AbstractC14410e.admob(iArr37, 1);
                    AbstractC14410e.admob(iArr37, -1);
                    int[] iArr38 = (int[]) c12894e.f25750e;
                    AbstractC14410e.admob(iArr38, 1);
                    AbstractC14410e.admob(iArr38, -1);
                    int[] iArr39 = (int[]) c12894e.f25752e;
                    AbstractC14410e.admob(iArr39, 1);
                    AbstractC14410e.admob(iArr39, -1);
                    if (AbstractC14410e.amazon((int[]) c12894e.f25751e) != 0) {
                        if (!(AbstractC14410e.amazon(iArr38) != 0)) {
                            int i46 = 0;
                            for (int i47 = 0; i47 < 16; i47++) {
                                i46 |= iArr38[i47] ^ iArr39[i47];
                            }
                            if (((((i46 & 1) | (i46 >>> 1)) - 1) >> 31) != 0) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public float billing(View view) {
        if (mopub) {
            try {
                return AbstractC14204e.isPro(view);
            } catch (NoSuchMethodError unused) {
                mopub = false;
            }
        }
        return view.getAlpha();
    }

    public void signatures(View view, float f) {
        if (mopub) {
            try {
                AbstractC14204e.m3779protected(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                mopub = false;
            }
        }
        view.setAlpha(f);
    }

    public void tapsense(View view, int i) {
        if (!smaato) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                advert = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            smaato = true;
        }
        Field field = advert;
        if (field != null) {
            try {
                advert.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
