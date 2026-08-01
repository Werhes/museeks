package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6286e {
    public static final int[] ad = {-19, -1, -1, -1, -1, -1, -1, Alert.DURATION_SHOW_INDEFINITELY};
    public static final int[] vip = {1886001095, 1339575613, 1980447930, 258412557, -95215574, -959694548, 2013120334, 2047061138};
    public static final int[] metrica = {-1886001114, -1339575614, -1980447931, -258412558, 95215573, 959694547, -2013120335, 100422509};
    public static final int[] license = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};
    public static final int[] appmetrica = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};
    public static final int[] purchase = {12052516, 1174424, 4087752, 38672185, 20040971, 21899680, 55468344, 20105554, 66708015, 9981791};
    public static final int[] billing = {66430571, 45040722, 4842939, 15895846, 18981244, 46308410, 4697481, 8903007, 53646190, 12474675};
    public static final int[] yandex = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};
    public static final int[] startapp = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};
    public static final int[] adcel = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};
    public static final Object mopub = new Object();
    public static C0909e[] advert = null;
    public static C0909e[] smaato = null;
    public static int[] amazon = null;

    public static void Signature(C18464e c18464e, C11467e c11467e) {
        AbstractC13482e.amazon(0, 0, (int[]) c18464e.f36191e, (int[]) c11467e.f23072e);
        AbstractC13482e.amazon(0, 0, (int[]) c18464e.f36190e, (int[]) c11467e.f23070e);
        AbstractC13482e.amazon(0, 0, (int[]) c18464e.f36192e, (int[]) c11467e.f23069e);
        AbstractC13482e.isPro((int[]) c18464e.f36189e, (int[]) c18464e.f36194e, (int[]) c11467e.f23071e);
    }

    public static boolean ad(byte[] bArr, boolean z, C0085e c0085e) {
        int i = (bArr[31] & 128) >>> 7;
        int[] iArr = c0085e.vip;
        AbstractC13482e.Signature(0, 0, bArr, iArr);
        AbstractC13482e.Signature(16, 5, bArr, iArr);
        iArr[9] = iArr[9] & 16777215;
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        AbstractC13482e.m3611class(iArr, iArr2);
        AbstractC13482e.isPro(yandex, iArr2, iArr3);
        iArr2[0] = iArr2[0] - 1;
        iArr3[0] = iArr3[0] + 1;
        int[] iArr4 = c0085e.ad;
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        AbstractC13482e.isPro(iArr2, iArr3, iArr5);
        AbstractC13482e.m3611class(iArr3, iArr6);
        AbstractC13482e.isPro(iArr5, iArr6, iArr5);
        AbstractC13482e.m3611class(iArr6, iArr6);
        AbstractC13482e.isPro(iArr6, iArr5, iArr6);
        int[] iArr7 = new int[10];
        int[] iArr8 = new int[10];
        AbstractC13482e.m3611class(iArr6, iArr7);
        AbstractC13482e.isPro(iArr6, iArr7, iArr7);
        int[] iArr9 = new int[10];
        AbstractC13482e.m3611class(iArr7, iArr9);
        AbstractC13482e.isPro(iArr6, iArr9, iArr9);
        AbstractC13482e.firebase(2, iArr9, iArr9);
        AbstractC13482e.isPro(iArr7, iArr9, iArr9);
        int[] iArr10 = new int[10];
        AbstractC13482e.firebase(5, iArr9, iArr10);
        AbstractC13482e.isPro(iArr9, iArr10, iArr10);
        int[] iArr11 = new int[10];
        AbstractC13482e.firebase(5, iArr10, iArr11);
        AbstractC13482e.isPro(iArr9, iArr11, iArr11);
        AbstractC13482e.firebase(10, iArr11, iArr9);
        AbstractC13482e.isPro(iArr10, iArr9, iArr9);
        AbstractC13482e.firebase(25, iArr9, iArr10);
        AbstractC13482e.isPro(iArr9, iArr10, iArr10);
        AbstractC13482e.firebase(25, iArr10, iArr11);
        AbstractC13482e.isPro(iArr9, iArr11, iArr11);
        AbstractC13482e.firebase(50, iArr11, iArr9);
        AbstractC13482e.isPro(iArr10, iArr9, iArr9);
        AbstractC13482e.firebase(125, iArr9, iArr10);
        AbstractC13482e.isPro(iArr9, iArr10, iArr10);
        AbstractC13482e.firebase(2, iArr10, iArr9);
        AbstractC13482e.isPro(iArr9, iArr6, iArr8);
        AbstractC13482e.isPro(iArr8, iArr5, iArr8);
        int[] iArr12 = new int[10];
        AbstractC13482e.m3611class(iArr8, iArr12);
        AbstractC13482e.isPro(iArr12, iArr3, iArr12);
        AbstractC13482e.m3612interface(iArr12, iArr2, iArr7);
        AbstractC13482e.ads(iArr7);
        if (AbstractC13482e.isVip(iArr7) != 0) {
            AbstractC13482e.amazon(0, 0, iArr8, iArr4);
        } else {
            AbstractC13482e.yandex(iArr12, iArr2, iArr7);
            AbstractC13482e.ads(iArr7);
            if (AbstractC13482e.isVip(iArr7) == 0) {
                return false;
            }
            AbstractC13482e.isPro(iArr8, AbstractC13482e.inmobi, iArr4);
        }
        AbstractC13482e.ads(iArr4);
        if (i == 1 && AbstractC13482e.isVip(iArr4) != 0) {
            return false;
        }
        if (z ^ (i != (iArr4[0] & 1))) {
            AbstractC13482e.applovin(iArr4, iArr4);
            AbstractC13482e.ads(iArr4);
        }
        return true;
    }

    public static final boolean adcel(C16417e c16417e, String str) {
        if (AbstractC7890e.billing(Build.FINGERPRINT, "robolectric")) {
            if (!AbstractC9464e.smaato("CXCP")) {
                return true;
            }
            Log.d("CXCP", "isBackwardCompatible method returns true because robolectric build detected.");
            return true;
        }
        try {
            C5060e.ad(str);
            int[] iArr = (int[]) ((C9000e) AbstractC17861e.license(c16417e, str)).metrica(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                return AbstractC1660e.startapp(iArr, 0);
            }
            return false;
        } catch (CameraAccessException e) {
            if (AbstractC9464e.amazon()) {
                Log.e("CXCP", "Error while accessing metadata for cameraID: ".concat(str), e);
            }
            throw new Exception(e);
        }
    }

    public static void admob(C18464e c18464e) {
        int[] iArr = (int[]) c18464e.f36191e;
        int[] iArr2 = (int[]) c18464e.f36190e;
        int[] iArr3 = (int[]) c18464e.f36192e;
        int[] iArr4 = (int[]) c18464e.f36189e;
        int[] iArr5 = (int[]) c18464e.f36194e;
        AbstractC13482e.yandex(iArr, iArr2, iArr4);
        AbstractC13482e.m3611class(iArr, iArr);
        AbstractC13482e.m3611class(iArr2, iArr2);
        AbstractC13482e.m3611class(iArr3, iArr3);
        AbstractC13482e.yandex(iArr3, iArr3, iArr3);
        AbstractC13482e.startapp(iArr, iArr2, iArr5, iArr2);
        AbstractC13482e.m3611class(iArr4, iArr4);
        AbstractC13482e.m3612interface(iArr5, iArr4, iArr4);
        AbstractC13482e.yandex(iArr3, iArr2, iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = i3 + (i2 >> 26);
        int i11 = i5 + (i4 >> 26);
        int i12 = i8 + (i7 >> 26);
        int i13 = iArr[9] + (i9 >> 26);
        int i14 = (i4 & 67108863) + (i10 >> 25);
        int i15 = i6 + (i11 >> 25);
        int i16 = (i9 & 67108863) + (i12 >> 25);
        int i17 = ((i13 >> 25) * 38) + i;
        int i18 = (i2 & 67108863) + (i17 >> 26);
        int i19 = (i7 & 67108863) + (i15 >> 26);
        iArr[0] = i17 & 67108863;
        iArr[1] = i18 & 67108863;
        iArr[2] = (i10 & 33554431) + (i18 >> 26);
        iArr[3] = i14 & 67108863;
        iArr[4] = (i11 & 33554431) + (i14 >> 26);
        iArr[5] = i15 & 67108863;
        iArr[6] = i19 & 67108863;
        iArr[7] = (i12 & 33554431) + (i19 >> 26);
        iArr[8] = i16 & 67108863;
        iArr[9] = (i13 & 33554431) + (i16 >> 26);
        AbstractC13482e.isPro(iArr, iArr2, iArr3);
        AbstractC13482e.isPro(iArr, iArr4, iArr);
        AbstractC13482e.isPro(iArr2, iArr5, iArr2);
    }

    public static PorterDuff.Mode advert(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void amazon(boolean z, C0909e c0909e, C18464e c18464e, C2408e c2408e) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = (int[]) c18464e.f36191e;
        int[] iArr4 = (int[]) c18464e.f36192e;
        int[] iArr5 = (int[]) c18464e.f36190e;
        int[] iArr6 = c2408e.f6147e;
        int[] iArr7 = (int[]) c18464e.f36189e;
        int[] iArr8 = (int[]) c18464e.f36194e;
        if (z) {
            iArr2 = iArr3;
            iArr = iArr5;
        } else {
            iArr = iArr3;
            iArr2 = iArr5;
        }
        AbstractC13482e.startapp(iArr5, iArr3, iArr5, iArr3);
        AbstractC13482e.isPro(iArr, (int[]) c0909e.f3323e, iArr);
        AbstractC13482e.isPro(iArr2, (int[]) c0909e.f3322e, iArr2);
        AbstractC13482e.isPro(iArr7, iArr8, iArr6);
        AbstractC13482e.isPro(iArr6, (int[]) c0909e.f3321e, iArr6);
        AbstractC13482e.startapp(iArr5, iArr3, iArr8, iArr7);
        AbstractC13482e.startapp(iArr4, iArr6, iArr2, iArr);
        AbstractC13482e.isPro(iArr3, iArr5, iArr4);
        AbstractC13482e.isPro(iArr3, iArr7, iArr3);
        AbstractC13482e.isPro(iArr5, iArr8, iArr5);
    }

    public static final void appmetrica(C2573e c2573e, int i, int i2) {
        C12347e c12347e = c2573e.f6435e;
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        c2573e.license(min, max, BuildConfig.FLAVOR, 0, 0);
        if (c12347e != null) {
            long vip2 = AbstractC16377e.vip(min, max, 0, c12347e.ad);
            if (C12347e.license(vip2)) {
                c2573e.purchase(null);
            } else {
                c2573e.appmetrica(C12347e.billing(vip2), C12347e.purchase(vip2), null);
            }
        }
    }

    public static void billing(byte[] bArr, byte[] bArr2, byte b, byte[] bArr3, int i, byte[] bArr4) {
        if (b != 0) {
            throw new IllegalArgumentException("ctx");
        }
        C15708e c15708e = new C15708e();
        byte[] bArr5 = new byte[64];
        c15708e.update(bArr, 0, 32);
        c15708e.doFinal(bArr5, 0);
        byte[] bArr6 = new byte[32];
        pro(bArr5, bArr6);
        c15708e.update(bArr5, 32, 32);
        c15708e.update(bArr3, 0, i);
        c15708e.doFinal(bArr5, 0);
        byte[] purchase2 = AbstractC0259e.purchase(bArr5);
        byte[] bArr7 = new byte[32];
        C18464e c18464e = new C18464e(10);
        signatures(purchase2, c18464e);
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        AbstractC13482e.tapsense((int[]) c18464e.f36192e, iArr2);
        AbstractC13482e.isPro(iArr2, (int[]) c18464e.f36191e, iArr);
        AbstractC13482e.isPro(iArr2, (int[]) c18464e.f36190e, iArr2);
        AbstractC13482e.ads(iArr);
        AbstractC13482e.ads(iArr2);
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        AbstractC13482e.m3611class(iArr, iArr4);
        AbstractC13482e.m3611class(iArr2, iArr5);
        AbstractC13482e.isPro(iArr4, iArr5, iArr3);
        AbstractC13482e.m3612interface(iArr4, iArr5, iArr4);
        AbstractC13482e.isPro(iArr3, yandex, iArr3);
        iArr3[0] = iArr3[0] + 1;
        AbstractC13482e.yandex(iArr3, iArr4, iArr3);
        AbstractC13482e.ads(iArr3);
        AbstractC13482e.ads(iArr5);
        int isVip = AbstractC13482e.isVip(iArr3) & (~AbstractC13482e.isVip(iArr5));
        AbstractC13482e.remoteconfig(0, 0, bArr7, iArr2);
        AbstractC13482e.remoteconfig(5, 16, bArr7, iArr2);
        bArr7[31] = (byte) (((iArr[0] & 1) << 7) | bArr7[31]);
        if (isVip == 0) {
            throw new IllegalStateException();
        }
        c15708e.update(bArr7, 0, 32);
        c15708e.update(bArr2, 0, 32);
        c15708e.update(bArr3, 0, i);
        c15708e.doFinal(bArr5, 0);
        byte[] purchase3 = AbstractC0259e.purchase(bArr5);
        int[] iArr6 = new int[16];
        AbstractC0259e.metrica(purchase2, iArr6);
        int[] iArr7 = new int[8];
        AbstractC0259e.metrica(purchase3, iArr7);
        int[] iArr8 = new int[8];
        AbstractC0259e.metrica(bArr6, iArr8);
        AbstractC10077e.applovin(iArr7, iArr8, iArr6);
        byte[] bArr8 = new byte[64];
        AbstractC12751e.yandex(16, bArr8, iArr6);
        byte[] purchase4 = AbstractC0259e.purchase(bArr8);
        System.arraycopy(bArr7, 0, bArr4, 0, 32);
        System.arraycopy(purchase4, 0, bArr4, 32, 32);
    }

    public static void isVip(int i, int i2, C13875e[][] c13875eArr) {
        int i3;
        int length = c13875eArr.length;
        int i4 = -1;
        while (true) {
            int i5 = -1;
            while (true) {
                int i6 = i4 + i;
                if (i6 >= 0 && i6 < length && (i3 = i5 + i2) >= 0 && i3 < length) {
                    c13875eArr[i6][i3] = new C13875e((i5 >= 0 && i5 < 7 && (i4 == 0 || i4 == 6)) || (i4 >= 0 && i4 < 7 && (i5 == 0 || i5 == 6)) || (2 <= i4 && i4 < 5 && 2 <= i5 && i5 <= 4), 5);
                }
                if (i5 == 7) {
                    break;
                } else {
                    i5++;
                }
            }
            if (i4 == 7) {
                return;
            } else {
                i4++;
            }
        }
    }

    public static C7850e license(byte[] bArr) {
        C15708e c15708e = new C15708e();
        byte[] bArr2 = new byte[64];
        c15708e.update(bArr, 0, 32);
        c15708e.doFinal(bArr2, 0);
        byte[] bArr3 = new byte[32];
        pro(bArr2, bArr3);
        C18464e c18464e = new C18464e(10);
        signatures(bArr3, c18464e);
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        AbstractC13482e.tapsense((int[]) c18464e.f36192e, iArr2);
        AbstractC13482e.isPro(iArr2, (int[]) c18464e.f36191e, iArr);
        AbstractC13482e.isPro(iArr2, (int[]) c18464e.f36190e, iArr2);
        AbstractC13482e.ads(iArr);
        AbstractC13482e.ads(iArr2);
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        AbstractC13482e.m3611class(iArr, iArr4);
        AbstractC13482e.m3611class(iArr2, iArr5);
        AbstractC13482e.isPro(iArr4, iArr5, iArr3);
        AbstractC13482e.m3612interface(iArr4, iArr5, iArr4);
        AbstractC13482e.isPro(iArr3, yandex, iArr3);
        iArr3[0] = iArr3[0] + 1;
        AbstractC13482e.yandex(iArr3, iArr4, iArr3);
        AbstractC13482e.ads(iArr3);
        AbstractC13482e.ads(iArr5);
        if ((AbstractC13482e.isVip(iArr3) & (~AbstractC13482e.isVip(iArr5))) == 0) {
            throw new IllegalStateException();
        }
        int[] iArr6 = new int[20];
        AbstractC13482e.amazon(0, 0, iArr, iArr6);
        AbstractC13482e.amazon(0, 10, iArr2, iArr6);
        return new C7850e(9, iArr6);
    }

    public static void loadAd(boolean z, C11106e c11106e, C18464e c18464e, C2408e c2408e) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = (int[]) c18464e.f36191e;
        int[] iArr4 = (int[]) c18464e.f36190e;
        int[] iArr5 = c2408e.f6147e;
        int[] iArr6 = (int[]) c18464e.f36192e;
        int[] iArr7 = (int[]) c18464e.f36189e;
        int[] iArr8 = (int[]) c18464e.f36194e;
        if (z) {
            iArr2 = iArr3;
            iArr = iArr4;
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
        }
        AbstractC13482e.startapp(iArr4, iArr3, iArr4, iArr3);
        AbstractC13482e.isPro(iArr, (int[]) c11106e.f22008e, iArr);
        AbstractC13482e.isPro(iArr2, (int[]) c11106e.f22007e, iArr2);
        AbstractC13482e.isPro(iArr7, iArr8, iArr5);
        AbstractC13482e.isPro(iArr5, (int[]) c11106e.f22009e, iArr5);
        AbstractC13482e.isPro(iArr6, (int[]) c11106e.f22006e, iArr6);
        AbstractC13482e.startapp(iArr4, iArr3, iArr8, iArr7);
        AbstractC13482e.startapp(iArr6, iArr5, iArr2, iArr);
        AbstractC13482e.isPro(iArr3, iArr4, iArr6);
        AbstractC13482e.isPro(iArr3, iArr7, iArr3);
        AbstractC13482e.isPro(iArr4, iArr8, iArr4);
    }

    public static void metrica(C7850e c7850e, byte[] bArr, int i) {
        int[] iArr = (int[]) c7850e.f15896e;
        AbstractC13482e.remoteconfig(10, i, bArr, iArr);
        AbstractC13482e.remoteconfig(15, i + 16, bArr, iArr);
        int i2 = i + 31;
        bArr[i2] = (byte) (((((int[]) c7850e.f15896e)[0] & 1) << 7) | bArr[i2]);
    }

    public static boolean mopub(View view) {
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        return view.getLayoutDirection() == 1;
    }

    public static void pro(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        byte b = (byte) (bArr2[31] & Byte.MAX_VALUE);
        bArr2[31] = b;
        bArr2[31] = (byte) (b | 64);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r8 == r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        r6.purchase(null);
        r6.f6431e = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void purchase(defpackage.C2573e r6, int r7, int r8, java.lang.CharSequence r9) {
        /*
            int r0 = java.lang.Math.min(r7, r8)
            int r7 = java.lang.Math.max(r7, r8)
            r8 = 0
            r1 = r0
        La:
            if (r1 >= r7) goto L23
            int r2 = r9.length()
            if (r8 >= r2) goto L23
            char r2 = r9.charAt(r8)
            eْؗۥ r3 = r6.f6429e
            char r3 = r3.charAt(r1)
            if (r2 != r3) goto L23
            int r8 = r8 + 1
            int r1 = r1 + 1
            goto La
        L23:
            int r2 = r9.length()
        L27:
            if (r7 <= r1) goto L40
            if (r2 <= r8) goto L40
            int r3 = r2 + (-1)
            char r3 = r9.charAt(r3)
            eْؗۥ r4 = r6.f6429e
            int r5 = r7 + (-1)
            char r4 = r4.charAt(r5)
            if (r3 != r4) goto L40
            int r2 = r2 + (-1)
            int r7 = r7 + (-1)
            goto L27
        L40:
            if (r1 != r7) goto L4c
            if (r8 == r2) goto L45
            goto L4c
        L45:
            r7 = 0
            r6.purchase(r7)
            r6.f6431e = r7
            goto L53
        L4c:
            java.lang.CharSequence r8 = r9.subSequence(r8, r2)
            r6.metrica(r1, r7, r8)
        L53:
            int r7 = r9.length()
            int r7 = r7 + r0
            long r7 = defpackage.AbstractC9262e.metrica(r7, r7)
            r6.billing(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6286e.purchase(eؔٔؐ, int, int, java.lang.CharSequence):void");
    }

    public static void remoteconfig() {
        synchronized (mopub) {
            try {
                if (amazon != null) {
                    return;
                }
                C11467e[] c11467eArr = new C11467e[96];
                C2408e c2408e = new C2408e(1);
                int[] iArr = new int[10];
                int[] iArr2 = new int[10];
                int[] iArr3 = license;
                int i = 0;
                AbstractC13482e.amazon(0, 0, iArr3, iArr);
                int[] iArr4 = appmetrica;
                AbstractC13482e.amazon(0, 0, iArr4, iArr2);
                C11467e c11467e = new C11467e(9);
                c11467eArr[0] = c11467e;
                AbstractC13482e.amazon(0, 0, iArr, (int[]) c11467e.f23072e);
                AbstractC13482e.amazon(0, 0, iArr2, (int[]) c11467e.f23070e);
                AbstractC13482e.premium((int[]) c11467e.f23069e);
                AbstractC13482e.isPro(iArr, iArr2, (int[]) c11467e.f23071e);
                C11467e c11467e2 = new C11467e(9);
                C11467e c11467e3 = c11467eArr[0];
                smaato(c11467e3, c11467e3, c11467e2, c2408e);
                for (int i2 = 1; i2 < 16; i2++) {
                    int i3 = 0 + i2;
                    C11467e c11467e4 = c11467eArr[i3 - 1];
                    C11467e c11467e5 = new C11467e(9);
                    c11467eArr[i3] = c11467e5;
                    smaato(c11467e4, c11467e2, c11467e5, c2408e);
                }
                int[] iArr5 = new int[10];
                int[] iArr6 = new int[10];
                AbstractC13482e.amazon(0, 0, purchase, iArr5);
                AbstractC13482e.amazon(0, 0, billing, iArr6);
                C11467e c11467e6 = new C11467e(9);
                c11467eArr[16] = c11467e6;
                AbstractC13482e.amazon(0, 0, iArr5, (int[]) c11467e6.f23072e);
                AbstractC13482e.amazon(0, 0, iArr6, (int[]) c11467e6.f23070e);
                AbstractC13482e.premium((int[]) c11467e6.f23069e);
                AbstractC13482e.isPro(iArr5, iArr6, (int[]) c11467e6.f23071e);
                C11467e c11467e7 = new C11467e(9);
                C11467e c11467e8 = c11467eArr[16];
                smaato(c11467e8, c11467e8, c11467e7, c2408e);
                for (int i4 = 1; i4 < 16; i4++) {
                    int i5 = 16 + i4;
                    C11467e c11467e9 = c11467eArr[i5 - 1];
                    C11467e c11467e10 = new C11467e(9);
                    c11467eArr[i5] = c11467e10;
                    smaato(c11467e9, c11467e7, c11467e10, c2408e);
                }
                C18464e c18464e = new C18464e(10);
                AbstractC13482e.amazon(0, 0, iArr3, (int[]) c18464e.f36191e);
                AbstractC13482e.amazon(0, 0, iArr4, (int[]) c18464e.f36190e);
                AbstractC13482e.premium((int[]) c18464e.f36192e);
                AbstractC13482e.amazon(0, 0, (int[]) c18464e.f36191e, (int[]) c18464e.f36189e);
                AbstractC13482e.amazon(0, 0, (int[]) c18464e.f36190e, (int[]) c18464e.f36194e);
                int i6 = 4;
                C11467e[] c11467eArr2 = new C11467e[4];
                for (int i7 = 0; i7 < 4; i7++) {
                    c11467eArr2[i7] = new C11467e(9);
                }
                C11467e c11467e11 = new C11467e(9);
                int i8 = 0;
                int i9 = 32;
                while (i8 < 8) {
                    int i10 = i9 + 1;
                    C11467e c11467e12 = new C11467e(9);
                    c11467eArr[i9] = c11467e12;
                    for (int i11 = i; i11 < i6; i11++) {
                        if (i11 == 0) {
                            Signature(c18464e, c11467e12);
                        } else {
                            Signature(c18464e, c11467e11);
                            smaato(c11467e12, c11467e11, c11467e12, c2408e);
                        }
                        admob(c18464e);
                        Signature(c18464e, c11467eArr2[i11]);
                        if (i8 + i11 != 10) {
                            for (int i12 = 1; i12 < 8; i12++) {
                                admob(c18464e);
                            }
                        }
                    }
                    int[] iArr7 = (int[]) c11467e12.f23072e;
                    AbstractC13482e.applovin(iArr7, iArr7);
                    int[] iArr8 = (int[]) c11467e12.f23071e;
                    AbstractC13482e.applovin(iArr8, iArr8);
                    int i13 = i;
                    i9 = i10;
                    while (i13 < 3) {
                        int i14 = 1 << i13;
                        int i15 = i;
                        while (i15 < i14) {
                            C11467e c11467e13 = new C11467e(9);
                            c11467eArr[i9] = c11467e13;
                            smaato(c11467eArr[i9 - i14], c11467eArr2[i13], c11467e13, c2408e);
                            i15++;
                            i9++;
                        }
                        i13++;
                        i = 0;
                    }
                    i8++;
                    i6 = 4;
                    i = 0;
                }
                startapp(c11467eArr);
                advert = new C0909e[16];
                for (int i16 = 0; i16 < 16; i16++) {
                    C11467e c11467e14 = c11467eArr[i16];
                    C0909e[] c0909eArr = advert;
                    C0909e c0909e = new C0909e(15);
                    c0909eArr[i16] = c0909e;
                    int[] iArr9 = (int[]) c11467e14.f23072e;
                    AbstractC13482e.isPro(iArr9, (int[]) c11467e14.f23069e, iArr9);
                    int[] iArr10 = (int[]) c11467e14.f23070e;
                    AbstractC13482e.isPro(iArr10, (int[]) c11467e14.f23069e, iArr10);
                    AbstractC13482e.startapp((int[]) c11467e14.f23070e, (int[]) c11467e14.f23072e, (int[]) c0909e.f3322e, (int[]) c0909e.f3323e);
                    AbstractC13482e.isPro((int[]) c11467e14.f23072e, (int[]) c11467e14.f23070e, (int[]) c0909e.f3321e);
                    int[] iArr11 = (int[]) c0909e.f3321e;
                    AbstractC13482e.isPro(iArr11, adcel, iArr11);
                    AbstractC13482e.ads((int[]) c0909e.f3323e);
                    AbstractC13482e.ads((int[]) c0909e.f3322e);
                    AbstractC13482e.ads((int[]) c0909e.f3321e);
                }
                smaato = new C0909e[16];
                for (int i17 = 0; i17 < 16; i17++) {
                    C11467e c11467e15 = c11467eArr[16 + i17];
                    C0909e[] c0909eArr2 = smaato;
                    C0909e c0909e2 = new C0909e(15);
                    c0909eArr2[i17] = c0909e2;
                    int[] iArr12 = (int[]) c11467e15.f23072e;
                    AbstractC13482e.isPro(iArr12, (int[]) c11467e15.f23069e, iArr12);
                    int[] iArr13 = (int[]) c11467e15.f23070e;
                    AbstractC13482e.isPro(iArr13, (int[]) c11467e15.f23069e, iArr13);
                    AbstractC13482e.startapp((int[]) c11467e15.f23070e, (int[]) c11467e15.f23072e, (int[]) c0909e2.f3322e, (int[]) c0909e2.f3323e);
                    AbstractC13482e.isPro((int[]) c11467e15.f23072e, (int[]) c11467e15.f23070e, (int[]) c0909e2.f3321e);
                    int[] iArr14 = (int[]) c0909e2.f3321e;
                    AbstractC13482e.isPro(iArr14, adcel, iArr14);
                    AbstractC13482e.ads((int[]) c0909e2.f3323e);
                    AbstractC13482e.ads((int[]) c0909e2.f3322e);
                    AbstractC13482e.ads((int[]) c0909e2.f3321e);
                }
                amazon = new int[1920];
                int[] iArr15 = new int[10];
                int[] iArr16 = new int[10];
                int[] iArr17 = new int[10];
                int i18 = 0;
                for (int i19 = 32; i19 < 96; i19++) {
                    C11467e c11467e16 = c11467eArr[i19];
                    int[] iArr18 = (int[]) c11467e16.f23072e;
                    AbstractC13482e.isPro(iArr18, (int[]) c11467e16.f23069e, iArr18);
                    int[] iArr19 = (int[]) c11467e16.f23070e;
                    AbstractC13482e.isPro(iArr19, (int[]) c11467e16.f23069e, iArr19);
                    AbstractC13482e.startapp((int[]) c11467e16.f23070e, (int[]) c11467e16.f23072e, iArr16, iArr15);
                    AbstractC13482e.isPro((int[]) c11467e16.f23072e, (int[]) c11467e16.f23070e, iArr17);
                    AbstractC13482e.isPro(iArr17, adcel, iArr17);
                    AbstractC13482e.ads(iArr15);
                    AbstractC13482e.ads(iArr16);
                    AbstractC13482e.ads(iArr17);
                    AbstractC13482e.amazon(0, i18, iArr15, amazon);
                    AbstractC13482e.amazon(0, i18 + 10, iArr16, amazon);
                    AbstractC13482e.amazon(0, i18 + 20, iArr17, amazon);
                    i18 += 30;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void signatures(byte[] bArr, C18464e c18464e) {
        char c;
        int[] iArr = (int[]) c18464e.f36194e;
        int[] iArr2 = (int[]) c18464e.f36189e;
        int[] iArr3 = (int[]) c18464e.f36192e;
        int[] iArr4 = (int[]) c18464e.f36190e;
        int[] iArr5 = (int[]) c18464e.f36191e;
        remoteconfig();
        int i = 8;
        int[] iArr6 = new int[8];
        AbstractC0259e.metrica(bArr, iArr6);
        int i2 = 0;
        int i3 = 1;
        long j = 4294967295L;
        long j2 = (-((~iArr6[0]) & 1)) & 4294967295L;
        long j3 = 0;
        int i4 = 0;
        while (i4 < 8) {
            int i5 = i3;
            long j4 = j2;
            long j5 = (iArr6[i4] & j) + (AbstractC0259e.ad[i4] & j4) + j3;
            iArr6[i4] = (int) j5;
            j3 = j5 >>> 32;
            i4++;
            i2 = i2;
            i3 = i5;
            j2 = j4;
            j = 4294967295L;
        }
        int i6 = i2;
        int i7 = 8;
        int i8 = i3;
        while (true) {
            i7--;
            if (i7 < 0) {
                break;
            }
            int i9 = iArr6[i7];
            iArr6[i7] = (i8 << 31) | (i9 >>> 1);
            i8 = i9;
        }
        int i10 = i6;
        while (true) {
            c = 7;
            if (i10 >= 8) {
                break;
            }
            iArr6[i10] = AbstractC14059e.vip(AbstractC14059e.vip(AbstractC14059e.vip(AbstractC14059e.vip(iArr6[i10], 11141290, 7), 52428, 14), 15728880, 4), 65280, 8);
            i10++;
        }
        int[] iArr7 = new int[10];
        int[] iArr8 = new int[10];
        int[] iArr9 = new int[10];
        int[] iArr10 = new int[10];
        for (int i11 = i6; i11 < 10; i11++) {
            iArr5[i11] = i6;
        }
        AbstractC13482e.premium(iArr4);
        AbstractC13482e.premium(iArr3);
        for (int i12 = i6; i12 < 10; i12++) {
            iArr2[i12] = i6;
        }
        AbstractC13482e.premium(iArr);
        int i13 = 28;
        int i14 = i6;
        while (true) {
            int i15 = i6;
            while (i15 < i) {
                int i16 = iArr6[i15] >>> i13;
                char c2 = c;
                int i17 = (i16 >>> 3) & 1;
                int i18 = (i16 ^ (-i17)) & 7;
                int i19 = i15 * 240;
                int[] iArr11 = iArr6;
                for (int i20 = i6; i20 < 8; i20++) {
                    int i21 = ((i20 ^ i18) - 1) >> 31;
                    AbstractC13482e.advert(i21, i19, amazon, iArr7);
                    int i22 = i19;
                    AbstractC13482e.advert(i21, i19 + 10, amazon, iArr8);
                    AbstractC13482e.advert(i21, i22 + 20, amazon, iArr9);
                    i19 = i22 + 30;
                }
                int i23 = i14 ^ i17;
                AbstractC13482e.smaato(iArr5, i23);
                AbstractC13482e.smaato(iArr2, i23);
                AbstractC13482e.startapp(iArr4, iArr5, iArr4, iArr5);
                AbstractC13482e.isPro(iArr5, iArr7, iArr5);
                AbstractC13482e.isPro(iArr4, iArr8, iArr4);
                AbstractC13482e.isPro(iArr2, iArr, iArr10);
                AbstractC13482e.isPro(iArr10, iArr9, iArr10);
                AbstractC13482e.startapp(iArr4, iArr5, iArr, iArr2);
                AbstractC13482e.startapp(iArr3, iArr10, iArr4, iArr5);
                AbstractC13482e.isPro(iArr5, iArr4, iArr3);
                AbstractC13482e.isPro(iArr5, iArr2, iArr5);
                AbstractC13482e.isPro(iArr4, iArr, iArr4);
                i15++;
                i14 = i17;
                iArr6 = iArr11;
                c = c2;
                i = 8;
            }
            int[] iArr12 = iArr6;
            char c3 = c;
            i13 -= 4;
            if (i13 < 0) {
                AbstractC13482e.smaato(iArr5, i14);
                AbstractC13482e.smaato(iArr2, i14);
                return;
            } else {
                admob(c18464e);
                iArr6 = iArr12;
                c = c3;
                i = 8;
            }
        }
    }

    public static void smaato(C11467e c11467e, C11467e c11467e2, C11467e c11467e3, C2408e c2408e) {
        int[] iArr = (int[]) c11467e3.f23072e;
        int[] iArr2 = (int[]) c11467e3.f23070e;
        int[] iArr3 = c2408e.f6147e;
        int[] iArr4 = c2408e.f6146e;
        AbstractC13482e.startapp((int[]) c11467e.f23070e, (int[]) c11467e.f23072e, iArr2, iArr);
        AbstractC13482e.startapp((int[]) c11467e2.f23070e, (int[]) c11467e2.f23072e, iArr4, iArr3);
        AbstractC13482e.isPro(iArr, iArr3, iArr);
        AbstractC13482e.isPro(iArr2, iArr4, iArr2);
        AbstractC13482e.isPro((int[]) c11467e.f23071e, (int[]) c11467e2.f23071e, iArr3);
        AbstractC13482e.isPro(iArr3, startapp, iArr3);
        int[] iArr5 = (int[]) c11467e.f23069e;
        AbstractC13482e.yandex(iArr5, iArr5, iArr4);
        AbstractC13482e.isPro(iArr4, (int[]) c11467e2.f23069e, iArr4);
        AbstractC13482e.startapp(iArr2, iArr, iArr2, iArr);
        AbstractC13482e.startapp(iArr4, iArr3, iArr4, iArr3);
        AbstractC13482e.isPro(iArr, iArr2, (int[]) c11467e3.f23071e);
        AbstractC13482e.isPro(iArr3, iArr4, (int[]) c11467e3.f23069e);
        AbstractC13482e.isPro(iArr, iArr3, iArr);
        AbstractC13482e.isPro(iArr2, iArr4, iArr2);
    }

    public static void startapp(C11467e[] c11467eArr) {
        int length = c11467eArr.length;
        int[] iArr = new int[length * 10];
        int[] iArr2 = new int[10];
        AbstractC13482e.amazon(0, 0, (int[]) c11467eArr[0].f23069e, iArr2);
        AbstractC13482e.amazon(0, 0, iArr2, iArr);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= length) {
                break;
            }
            AbstractC13482e.isPro(iArr2, (int[]) c11467eArr[i2].f23069e, iArr2);
            AbstractC13482e.amazon(0, i2 * 10, iArr2, iArr);
            i = i2;
        }
        AbstractC13482e.yandex(iArr2, iArr2, iArr2);
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[8];
        AbstractC13482e.amazon(0, 0, iArr2, iArr3);
        AbstractC13482e.ads(iArr3);
        AbstractC13482e.pro(0, 0, iArr3, iArr4);
        AbstractC13482e.pro(5, 4, iArr3, iArr4);
        AbstractC6143e.smaato(AbstractC13482e.isVip, iArr4, iArr4);
        AbstractC13482e.admob(0, 0, iArr4, iArr2);
        AbstractC13482e.admob(4, 5, iArr4, iArr2);
        iArr2[9] = iArr2[9] & 16777215;
        int[] iArr5 = new int[10];
        while (i > 0) {
            int i3 = i - 1;
            AbstractC13482e.amazon(i3 * 10, 0, iArr, iArr5);
            AbstractC13482e.isPro(iArr5, iArr2, iArr5);
            AbstractC13482e.isPro(iArr2, (int[]) c11467eArr[i].f23069e, iArr2);
            AbstractC13482e.amazon(0, 0, iArr5, (int[]) c11467eArr[i].f23069e);
            i = i3;
        }
        AbstractC13482e.amazon(0, 0, iArr2, (int[]) c11467eArr[0].f23069e);
    }

    public static void subscription(C0085e c0085e, C11106e[] c11106eArr, C2408e c2408e) {
        C11467e c11467e = new C11467e(9);
        int[] iArr = c0085e.ad;
        int i = 0;
        AbstractC13482e.amazon(0, 0, iArr, (int[]) c11467e.f23072e);
        int[] iArr2 = c0085e.vip;
        AbstractC13482e.amazon(0, 0, iArr2, (int[]) c11467e.f23070e);
        AbstractC13482e.premium((int[]) c11467e.f23069e);
        AbstractC13482e.isPro(iArr, iArr2, (int[]) c11467e.f23071e);
        C11467e c11467e2 = new C11467e(9);
        smaato(c11467e, c11467e, c11467e2, c2408e);
        while (true) {
            C11106e c11106e = new C11106e(9, false);
            int[] iArr3 = new int[10];
            c11106e.f22008e = iArr3;
            int[] iArr4 = new int[10];
            c11106e.f22007e = iArr4;
            int[] iArr5 = new int[10];
            c11106e.f22009e = iArr5;
            int[] iArr6 = new int[10];
            c11106e.f22006e = iArr6;
            c11106eArr[i] = c11106e;
            AbstractC13482e.startapp((int[]) c11467e.f23070e, (int[]) c11467e.f23072e, iArr4, iArr3);
            AbstractC13482e.isPro((int[]) c11467e.f23071e, startapp, iArr5);
            int[] iArr7 = (int[]) c11467e.f23069e;
            AbstractC13482e.yandex(iArr7, iArr7, iArr6);
            i++;
            if (i == 4) {
                return;
            } else {
                smaato(c11467e, c11467e2, c11467e, c2408e);
            }
        }
    }

    public static void tapsense(int i, int i2, boolean z, C13875e[][] c13875eArr) {
        C13875e[] c13875eArr2 = c13875eArr[i];
        C13875e c13875e = c13875eArr2[i2];
        if (c13875e != null) {
            c13875e.f27485e = z;
        } else {
            c13875eArr2[i2] = new C13875e(z, 5);
        }
    }

    public static float vip(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static boolean yandex(byte[] bArr, C7850e c7850e, byte b, byte[] bArr2, int i) {
        boolean z;
        boolean z2;
        int[] iArr;
        int i2;
        int[] iArr2;
        boolean z3;
        if (b != 0) {
            throw new IllegalArgumentException("ctx");
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(bArr, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[32];
        System.arraycopy(bArr, 32, bArr4, 0, 32);
        int appmetrica2 = AbstractC12751e.appmetrica(28, bArr3) & Alert.DURATION_SHOW_INDEFINITELY;
        int[] iArr3 = ad;
        if (appmetrica2 < iArr3[7]) {
            z = true;
        } else {
            int[] iArr4 = new int[8];
            AbstractC12751e.purchase(8, bArr3, iArr4);
            iArr4[7] = Integer.MAX_VALUE & iArr4[7];
            z = !AbstractC10077e.pro(iArr4, iArr3);
        }
        if (z) {
            int[] iArr5 = new int[8];
            AbstractC0259e.metrica(bArr4, iArr5);
            int[] iArr6 = AbstractC0259e.ad;
            if (!AbstractC10077e.pro(iArr5, iArr6)) {
                C0085e c0085e = new C0085e();
                if (ad(bArr3, true, c0085e)) {
                    C0085e c0085e2 = new C0085e();
                    AbstractC13482e.applovin((int[]) c7850e.f15896e, c0085e2.ad);
                    AbstractC13482e.amazon(10, 0, (int[]) c7850e.f15896e, c0085e2.vip);
                    byte[] bArr5 = new byte[32];
                    metrica(c7850e, bArr5, 0);
                    C15708e c15708e = new C15708e();
                    byte[] bArr6 = new byte[64];
                    c15708e.update(bArr3, 0, 32);
                    c15708e.update(bArr5, 0, 32);
                    c15708e.update(bArr2, 0, i);
                    c15708e.doFinal(bArr6, 0);
                    int[] iArr7 = new int[8];
                    AbstractC0259e.metrica(AbstractC0259e.purchase(bArr6), iArr7);
                    int[] iArr8 = new int[4];
                    int[] iArr9 = new int[4];
                    int[] iArr10 = new int[16];
                    System.arraycopy(AbstractC0259e.vip, 0, iArr10, 0, 16);
                    int[] iArr11 = new int[16];
                    AbstractC10077e.premium(iArr7, iArr11);
                    iArr11[0] = iArr11[0] + 1;
                    int[] iArr12 = new int[16];
                    AbstractC10077e.isPro(iArr6, iArr7, iArr12);
                    int[] iArr13 = new int[16];
                    int[] iArr14 = new int[4];
                    System.arraycopy(iArr6, 0, iArr14, 0, 4);
                    int[] iArr15 = new int[4];
                    System.arraycopy(iArr7, 0, iArr15, 0, 4);
                    int[] iArr16 = new int[4];
                    iArr16[0] = 1;
                    int i3 = 15;
                    int i4 = 1016;
                    int[] iArr17 = new int[4];
                    int[] iArr18 = iArr14;
                    int[] iArr19 = iArr16;
                    int[] iArr20 = iArr15;
                    int[] iArr21 = iArr10;
                    int[] iArr22 = iArr11;
                    int appmetrica3 = AbstractC4520e.appmetrica(iArr11, 15);
                    while (true) {
                        if (appmetrica3 <= 254) {
                            System.arraycopy(iArr20, 0, iArr8, 0, 4);
                            System.arraycopy(iArr19, 0, iArr9, 0, 4);
                            z2 = true;
                            break;
                        }
                        int i5 = i4 - 1;
                        if (i5 < 0) {
                            z2 = false;
                            break;
                        }
                        int license2 = AbstractC4520e.license(iArr12, i3) - appmetrica3;
                        int i6 = license2 & (~(license2 >> 31));
                        int i7 = i3;
                        int[] iArr23 = iArr13;
                        int[] iArr24 = iArr12;
                        if (iArr12[i3] < 0) {
                            AbstractC4520e.ad(i7, i6, iArr21, iArr22, iArr24, iArr23);
                            AbstractC4520e.vip(3, i6, iArr18, iArr17, iArr20, iArr19);
                            iArr2 = iArr21;
                        } else {
                            AbstractC4520e.adcel(i7, i6, iArr21, iArr22, iArr24, iArr23);
                            iArr2 = iArr21;
                            AbstractC4520e.mopub(3, i6, iArr18, iArr17, iArr20, iArr19);
                        }
                        int[] iArr25 = iArr20;
                        int[] iArr26 = iArr19;
                        int i8 = i7;
                        do {
                            int i9 = iArr2[i8] + RecyclerView.UNDEFINED_DURATION;
                            int i10 = iArr22[i8] + RecyclerView.UNDEFINED_DURATION;
                            if (i9 < i10) {
                                z3 = true;
                                break;
                            }
                            if (i9 > i10) {
                                break;
                            }
                            i8--;
                        } while (i8 >= 0);
                        z3 = false;
                        if (z3) {
                            int i11 = appmetrica3 >>> 5;
                            i3 = i11;
                            appmetrica3 = AbstractC4520e.appmetrica(iArr2, i11);
                            iArr21 = iArr22;
                            iArr20 = iArr18;
                            iArr19 = iArr17;
                            iArr17 = iArr26;
                            iArr18 = iArr25;
                            iArr22 = iArr2;
                        } else {
                            iArr19 = iArr26;
                            iArr20 = iArr25;
                            iArr21 = iArr2;
                            i3 = i7;
                        }
                        i4 = i5;
                        iArr12 = iArr24;
                        iArr13 = iArr23;
                    }
                    if (!z2) {
                        throw new IllegalStateException();
                    }
                    int[] iArr27 = new int[12];
                    long j = iArr5[0] & 4294967295L;
                    long j2 = iArr5[1] & 4294967295L;
                    long j3 = iArr5[2] & 4294967295L;
                    long j4 = iArr5[3] & 4294967295L;
                    long j5 = iArr5[4] & 4294967295L;
                    long j6 = iArr5[5] & 4294967295L;
                    long j7 = iArr5[6] & 4294967295L;
                    long j8 = iArr5[7] & 4294967295L;
                    long j9 = iArr9[0] & 4294967295L;
                    long j10 = j9 * j;
                    iArr27[0] = (int) j10;
                    long j11 = (j9 * j2) + (j10 >>> 32);
                    iArr27[1] = (int) j11;
                    long j12 = (j9 * j3) + (j11 >>> 32);
                    iArr27[2] = (int) j12;
                    long j13 = (j9 * j4) + (j12 >>> 32);
                    iArr27[3] = (int) j13;
                    long j14 = (j9 * j5) + (j13 >>> 32);
                    iArr27[4] = (int) j14;
                    long j15 = (j9 * j6) + (j14 >>> 32);
                    iArr27[5] = (int) j15;
                    long j16 = (j9 * j7) + (j15 >>> 32);
                    iArr27[6] = (int) j16;
                    long j17 = (j9 * j8) + (j16 >>> 32);
                    iArr27[7] = (int) j17;
                    iArr27[8] = (int) (j17 >>> 32);
                    int i12 = 1;
                    while (i12 < 4) {
                        int i13 = i12;
                        long j18 = iArr9[i12] & 4294967295L;
                        long j19 = (j18 * j) + (iArr27[i13] & 4294967295L);
                        long j20 = j;
                        iArr27[i13] = (int) j19;
                        int i14 = i13 + 1;
                        long j21 = (j18 * j2) + (iArr27[i14] & 4294967295L) + (j19 >>> 32);
                        iArr27[i14] = (int) j21;
                        long j22 = (j18 * j3) + (iArr27[r42] & 4294967295L) + (j21 >>> 32);
                        iArr27[i13 + 2] = (int) j22;
                        long j23 = (j18 * j4) + (iArr27[r42] & 4294967295L) + (j22 >>> 32);
                        iArr27[i13 + 3] = (int) j23;
                        long j24 = (j18 * j5) + (iArr27[r42] & 4294967295L) + (j23 >>> 32);
                        iArr27[i13 + 4] = (int) j24;
                        long j25 = (j18 * j6) + (iArr27[r42] & 4294967295L) + (j24 >>> 32);
                        iArr27[i13 + 5] = (int) j25;
                        long j26 = (j18 * j7) + (iArr27[r42] & 4294967295L) + (j25 >>> 32);
                        iArr27[i13 + 6] = (int) j26;
                        long j27 = (j18 * j8) + (iArr27[r39] & 4294967295L) + (j26 >>> 32);
                        iArr27[i13 + 7] = (int) j27;
                        iArr27[i13 + 8] = (int) (j27 >>> 32);
                        j = j20;
                        i12 = i14;
                    }
                    if (iArr9[3] < 0) {
                        iArr = iArr27;
                        AbstractC10077e.metrica(0, 4, iArr6, iArr, 0);
                        long j28 = ((iArr[4] & 4294967295L) - (iArr5[0] & 4294967295L)) + (0 & 4294967295L);
                        iArr[4] = (int) j28;
                        long j29 = ((iArr[5] & 4294967295L) - (iArr5[1] & 4294967295L)) + (j28 >> 32);
                        iArr[5] = (int) j29;
                        long j30 = ((iArr[6] & 4294967295L) - (iArr5[2] & 4294967295L)) + (j29 >> 32);
                        iArr[6] = (int) j30;
                        long j31 = ((iArr[7] & 4294967295L) - (iArr5[3] & 4294967295L)) + (j30 >> 32);
                        iArr[7] = (int) j31;
                        long j32 = ((iArr[8] & 4294967295L) - (iArr5[4] & 4294967295L)) + (j31 >> 32);
                        iArr[8] = (int) j32;
                        long j33 = ((iArr[9] & 4294967295L) - (iArr5[5] & 4294967295L)) + (j32 >> 32);
                        iArr[9] = (int) j33;
                        long j34 = ((iArr[10] & 4294967295L) - (iArr5[6] & 4294967295L)) + (j33 >> 32);
                        iArr[10] = (int) j34;
                        iArr[11] = (int) (((iArr[11] & 4294967295L) - (iArr5[7] & 4294967295L)) + (j34 >> 32));
                    } else {
                        iArr = iArr27;
                    }
                    byte[] bArr7 = new byte[48];
                    AbstractC12751e.yandex(12, bArr7, iArr);
                    long license3 = AbstractC12751e.license(32, bArr7) << 4;
                    long j35 = license3 & 4294967295L;
                    long appmetrica4 = AbstractC12751e.appmetrica(35, bArr7);
                    long j36 = appmetrica4 & 4294967295L;
                    long license4 = AbstractC12751e.license(39, bArr7) << 4;
                    long j37 = license4 & 4294967295L;
                    long appmetrica5 = AbstractC12751e.appmetrica(42, bArr7);
                    long j38 = (((((bArr7[47] & 255) << 8) | (bArr7[46] & 255)) << 4) & 4294967295L) + ((appmetrica5 & 4294967295L) >> 28);
                    long j39 = (appmetrica5 & 268435455) + (j37 >> 28);
                    long license5 = (((AbstractC12751e.license(25, bArr7) << 4) & 4294967295L) - (j38 * (-6428113))) - (j39 * 5343);
                    long j40 = (license4 & 268435455) + (j36 >> 28);
                    long appmetrica6 = (AbstractC12751e.appmetrica(7, bArr7) & 4294967295L) - (j40 * (-50998291));
                    long license6 = (((AbstractC12751e.license(11, bArr7) << 4) & 4294967295L) - (j39 * (-50998291))) - (j40 * 19280294);
                    long appmetrica7 = (((AbstractC12751e.appmetrica(14, bArr7) & 4294967295L) - (j38 * (-50998291))) - (j39 * 19280294)) - (j40 * 127719000);
                    long license7 = ((((AbstractC12751e.license(18, bArr7) << 4) & 4294967295L) - (j38 * 19280294)) - (j39 * 127719000)) - (j40 * (-6428113));
                    long appmetrica8 = (((AbstractC12751e.appmetrica(21, bArr7) & 4294967295L) - (j38 * 127719000)) - (j39 * (-6428113))) - (j40 * 5343);
                    long j41 = (appmetrica4 & 268435455) + (j35 >> 28);
                    long j42 = license3 & 268435455;
                    long appmetrica9 = ((AbstractC12751e.appmetrica(28, bArr7) & 4294967295L) - (j38 * 5343)) + (license5 >> 28);
                    long j43 = j42 + (appmetrica9 >> 28);
                    long j44 = appmetrica9 & 268435455;
                    long j45 = j44 >>> 27;
                    long j46 = j43 + j45;
                    long appmetrica10 = (AbstractC12751e.appmetrica(0, bArr7) & 4294967295L) - (j46 * (-50998291));
                    long license8 = ((((AbstractC12751e.license(4, bArr7) << 4) & 4294967295L) - (j41 * (-50998291))) - (j46 * 19280294)) + (appmetrica10 >> 28);
                    long j47 = ((appmetrica6 - (j41 * 19280294)) - (j46 * 127719000)) + (license8 >> 28);
                    long j48 = ((license6 - (j41 * 127719000)) - (j46 * (-6428113))) + (j47 >> 28);
                    long j49 = ((appmetrica7 - (j41 * (-6428113))) - (j46 * 5343)) + (j48 >> 28);
                    long j50 = (license7 - (j41 * 5343)) + (j49 >> 28);
                    long j51 = appmetrica8 + (j50 >> 28);
                    long j52 = (license5 & 268435455) + (j51 >> 28);
                    long j53 = j44 + (j52 >> 28);
                    long j54 = (j53 >> 28) - j45;
                    long j55 = (appmetrica10 & 268435455) + (j54 & (-50998291));
                    long j56 = (license8 & 268435455) + (j54 & 19280294) + (j55 >> 28);
                    long j57 = (j47 & 268435455) + (j54 & 127719000) + (j56 >> 28);
                    long j58 = (j48 & 268435455) + (j54 & (-6428113)) + (j57 >> 28);
                    long j59 = (j49 & 268435455) + (j54 & 5343) + (j58 >> 28);
                    long j60 = (j50 & 268435455) + (j59 >> 28);
                    long j61 = (j51 & 268435455) + (j60 >> 28);
                    long j62 = (j52 & 268435455) + (j61 >> 28);
                    byte[] bArr8 = new byte[64];
                    AbstractC12751e.startapp(0, (j55 & 268435455) | ((j56 & 268435455) << 28), bArr8);
                    AbstractC12751e.startapp(7, ((j58 & 268435455) << 28) | (j57 & 268435455), bArr8);
                    AbstractC12751e.startapp(14, ((j60 & 268435455) << 28) | (j59 & 268435455), bArr8);
                    AbstractC12751e.startapp(21, (j61 & 268435455) | ((j62 & 268435455) << 28), bArr8);
                    AbstractC12751e.billing((int) ((j53 & 268435455) + (j62 >> 28)), 28, bArr8);
                    AbstractC0259e.metrica(bArr8, iArr5);
                    C18464e c18464e = new C18464e(10);
                    remoteconfig();
                    byte[] bArr9 = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
                    int i15 = 128;
                    byte[] bArr10 = new byte[128];
                    byte[] bArr11 = new byte[128];
                    AbstractC10681e.ad(6, bArr9, iArr5);
                    AbstractC10681e.ad(4, bArr10, iArr8);
                    AbstractC10681e.ad(4, bArr11, iArr9);
                    C11106e[] c11106eArr = new C11106e[4];
                    C11106e[] c11106eArr2 = new C11106e[4];
                    C2408e c2408e = new C2408e(1);
                    subscription(c0085e2, c11106eArr, c2408e);
                    subscription(c0085e, c11106eArr2, c2408e);
                    int[] iArr28 = (int[]) c18464e.f36191e;
                    int i16 = 0;
                    for (int i17 = 10; i16 < i17; i17 = 10) {
                        iArr28[i16] = 0;
                        i16++;
                    }
                    AbstractC13482e.premium((int[]) c18464e.f36190e);
                    AbstractC13482e.premium((int[]) c18464e.f36192e);
                    int[] iArr29 = (int[]) c18464e.f36189e;
                    for (int i18 = 0; i18 < 10; i18++) {
                        iArr29[i18] = 0;
                    }
                    AbstractC13482e.premium((int[]) c18464e.f36194e);
                    while (true) {
                        i2 = i15 - 1;
                        if (i2 < 0) {
                            break;
                        }
                        if ((bArr9[i15 + 127] | bArr9[i2] | bArr10[i2] | bArr11[i2]) != 0) {
                            break;
                        }
                        i15 = i2;
                    }
                    while (i2 >= 0) {
                        byte b2 = bArr9[i2];
                        if (b2 != 0) {
                            amazon(b2 < 0, advert[(b2 >> 1) ^ (b2 >> 31)], c18464e, c2408e);
                        }
                        byte b3 = bArr9[i2 + 128];
                        if (b3 != 0) {
                            amazon(b3 < 0, smaato[(b3 >> 1) ^ (b3 >> 31)], c18464e, c2408e);
                        }
                        byte b4 = bArr10[i2];
                        if (b4 != 0) {
                            loadAd(b4 < 0, c11106eArr[(b4 >> 1) ^ (b4 >> 31)], c18464e, c2408e);
                        }
                        byte b5 = bArr11[i2];
                        if (b5 != 0) {
                            loadAd(b5 < 0, c11106eArr2[(b5 >> 1) ^ (b5 >> 31)], c18464e, c2408e);
                        }
                        admob(c18464e);
                        i2--;
                    }
                    admob(c18464e);
                    admob(c18464e);
                    AbstractC13482e.ads((int[]) c18464e.f36191e);
                    int[] iArr30 = (int[]) c18464e.f36190e;
                    AbstractC13482e.ads(iArr30);
                    int[] iArr31 = (int[]) c18464e.f36192e;
                    AbstractC13482e.ads(iArr31);
                    if (AbstractC13482e.isVip((int[]) c18464e.f36191e) != 0) {
                        if (!(AbstractC13482e.isVip(iArr30) != 0)) {
                            int i19 = 0;
                            for (int i20 = 0; i20 < 10; i20++) {
                                i19 |= iArr30[i20] ^ iArr31[i20];
                            }
                            if (((((i19 >>> 1) | (i19 & 1)) - 1) >> 31) != 0) {
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
}
