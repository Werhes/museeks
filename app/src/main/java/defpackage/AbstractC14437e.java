package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import java.lang.annotation.Annotation;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؐۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14437e {
    public static final C0110e[] ad = new C0110e[0];

    public static byte[] adcel(byte[] bArr) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return metrica(bArr, bArr2);
    }

    public static final InterfaceC7227e appmetrica(Annotation annotation) {
        return AbstractC3820e.ad.vip(annotation.annotationType());
    }

    public static final Class billing(InterfaceC7227e interfaceC7227e) {
        Class subs = ((InterfaceC18155e) interfaceC7227e).subs();
        if (subs.isPrimitive()) {
            return subs;
        }
        String name = subs.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static byte[] license() {
        byte[] ad2 = AbstractC10461e.ad(32);
        ad2[0] = (byte) (ad2[0] | 7);
        byte b = (byte) (ad2[31] & 63);
        ad2[31] = b;
        ad2[31] = (byte) (b | 128);
        return ad2;
    }

    public static byte[] metrica(byte[] bArr, byte[] bArr2) {
        int i = 32;
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] copyOf = Arrays.copyOf(bArr, 32);
        int i2 = 0;
        copyOf[0] = (byte) (copyOf[0] & 248);
        byte b = (byte) (copyOf[31] & Byte.MAX_VALUE);
        copyOf[31] = b;
        copyOf[31] = (byte) (b | 64);
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] copyOf2 = Arrays.copyOf(bArr2, bArr2.length);
        copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
        for (int i3 = 0; i3 < 7; i3++) {
            byte[][] bArr3 = AbstractC5458e.ad;
            if (MessageDigest.isEqual(bArr3[i3], copyOf2)) {
                throw new InvalidKeyException("Banned public key: " + AbstractC5706e.license(bArr3[i3]));
            }
        }
        int i4 = 10;
        long[] jArr2 = new long[10];
        for (int i5 = 0; i5 < 10; i5++) {
            int i6 = AbstractC8178e.ad[i5];
            jArr2[i5] = ((((copyOf2[i6 + 3] & 255) << 24) | (((copyOf2[i6] & 255) | ((copyOf2[i6 + 1] & 255) << 8)) | ((copyOf2[i6 + 2] & 255) << 16))) >> AbstractC8178e.vip[i5]) & AbstractC8178e.metrica[i5 & 1];
        }
        long[] jArr3 = new long[19];
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        jArr5[0] = 1;
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        long[] jArr8 = new long[19];
        jArr8[0] = 1;
        long[] jArr9 = new long[19];
        long[] jArr10 = new long[19];
        jArr10[0] = 1;
        System.arraycopy(jArr2, 0, jArr3, 0, 10);
        while (i2 < i) {
            int i7 = copyOf[31 - i2] & 255;
            int i8 = 0;
            while (i8 < 8) {
                int i9 = (i7 >> (7 - i8)) & 1;
                AbstractC5458e.purchase(i9, jArr5, jArr3);
                AbstractC5458e.purchase(i9, jArr6, jArr4);
                byte[] bArr4 = copyOf;
                long[] copyOf3 = Arrays.copyOf(jArr5, 10);
                int i10 = i7;
                long[] jArr11 = new long[19];
                int i11 = i2;
                long[] jArr12 = new long[19];
                int i12 = i8;
                long[] jArr13 = new long[19];
                long[] jArr14 = jArr;
                long[] jArr15 = new long[19];
                long[] jArr16 = new long[19];
                long[] jArr17 = jArr10;
                long[] jArr18 = new long[19];
                long[] jArr19 = new long[19];
                AbstractC8178e.advert(jArr5, jArr5, jArr6);
                AbstractC8178e.mopub(jArr6, copyOf3, jArr6);
                long[] copyOf4 = Arrays.copyOf(jArr3, 10);
                AbstractC8178e.advert(jArr3, jArr3, jArr4);
                AbstractC8178e.mopub(jArr4, copyOf4, jArr4);
                AbstractC8178e.billing(jArr15, jArr3, jArr6);
                AbstractC8178e.billing(jArr16, jArr5, jArr4);
                AbstractC8178e.startapp(jArr15);
                AbstractC8178e.yandex(jArr15);
                AbstractC8178e.startapp(jArr16);
                AbstractC8178e.yandex(jArr16);
                long[] jArr20 = jArr3;
                System.arraycopy(jArr15, 0, copyOf4, 0, 10);
                AbstractC8178e.advert(jArr15, jArr15, jArr16);
                AbstractC8178e.mopub(jArr16, copyOf4, jArr16);
                AbstractC8178e.adcel(jArr19, jArr15);
                AbstractC8178e.adcel(jArr18, jArr16);
                AbstractC8178e.billing(jArr16, jArr18, jArr2);
                AbstractC8178e.startapp(jArr16);
                AbstractC8178e.yandex(jArr16);
                System.arraycopy(jArr19, 0, jArr7, 0, 10);
                System.arraycopy(jArr16, 0, jArr8, 0, 10);
                AbstractC8178e.adcel(jArr12, jArr5);
                AbstractC8178e.adcel(jArr13, jArr6);
                AbstractC8178e.billing(jArr9, jArr12, jArr13);
                AbstractC8178e.startapp(jArr9);
                AbstractC8178e.yandex(jArr9);
                AbstractC8178e.mopub(jArr13, jArr12, jArr13);
                Arrays.fill(jArr11, 10, 18, 0L);
                int i13 = 0;
                for (int i14 = 10; i13 < i14; i14 = 10) {
                    jArr11[i13] = jArr13[i13] * 121665;
                    i13++;
                }
                AbstractC8178e.yandex(jArr11);
                AbstractC8178e.advert(jArr11, jArr11, jArr12);
                AbstractC8178e.billing(jArr17, jArr13, jArr11);
                AbstractC8178e.startapp(jArr17);
                AbstractC8178e.yandex(jArr17);
                AbstractC5458e.purchase(i9, jArr9, jArr7);
                AbstractC5458e.purchase(i9, jArr17, jArr8);
                i8 = i12 + 1;
                long[] jArr21 = jArr5;
                jArr5 = jArr9;
                jArr9 = jArr21;
                long[] jArr22 = jArr6;
                jArr6 = jArr17;
                jArr10 = jArr22;
                long[] jArr23 = jArr8;
                jArr8 = jArr4;
                jArr4 = jArr23;
                i7 = i10;
                jArr3 = jArr7;
                copyOf = bArr4;
                i2 = i11;
                jArr = jArr14;
                jArr7 = jArr20;
            }
            i2++;
            i = 32;
            i4 = 10;
        }
        long[] jArr24 = jArr;
        int i15 = i4;
        long[] jArr25 = new long[i15];
        long[] jArr26 = new long[i15];
        long[] jArr27 = new long[i15];
        long[] jArr28 = new long[i15];
        long[] jArr29 = new long[i15];
        long[] jArr30 = new long[i15];
        long[] jArr31 = new long[i15];
        long[] jArr32 = new long[i15];
        long[] jArr33 = new long[i15];
        long[] jArr34 = new long[i15];
        long[] jArr35 = jArr3;
        long[] jArr36 = new long[i15];
        AbstractC8178e.adcel(jArr26, jArr6);
        AbstractC8178e.adcel(jArr36, jArr26);
        AbstractC8178e.adcel(jArr34, jArr36);
        AbstractC8178e.purchase(jArr27, jArr34, jArr6);
        AbstractC8178e.purchase(jArr28, jArr27, jArr26);
        AbstractC8178e.adcel(jArr34, jArr28);
        AbstractC8178e.purchase(jArr29, jArr34, jArr27);
        AbstractC8178e.adcel(jArr34, jArr29);
        AbstractC8178e.adcel(jArr36, jArr34);
        AbstractC8178e.adcel(jArr34, jArr36);
        AbstractC8178e.adcel(jArr36, jArr34);
        AbstractC8178e.adcel(jArr34, jArr36);
        AbstractC8178e.purchase(jArr30, jArr34, jArr29);
        AbstractC8178e.adcel(jArr34, jArr30);
        AbstractC8178e.adcel(jArr36, jArr34);
        for (int i16 = 2; i16 < 10; i16 += 2) {
            AbstractC8178e.adcel(jArr34, jArr36);
            AbstractC8178e.adcel(jArr36, jArr34);
        }
        AbstractC8178e.purchase(jArr31, jArr36, jArr30);
        AbstractC8178e.adcel(jArr34, jArr31);
        AbstractC8178e.adcel(jArr36, jArr34);
        for (int i17 = 2; i17 < 20; i17 += 2) {
            AbstractC8178e.adcel(jArr34, jArr36);
            AbstractC8178e.adcel(jArr36, jArr34);
        }
        AbstractC8178e.purchase(jArr34, jArr36, jArr31);
        AbstractC8178e.adcel(jArr36, jArr34);
        AbstractC8178e.adcel(jArr34, jArr36);
        for (int i18 = 2; i18 < 10; i18 += 2) {
            AbstractC8178e.adcel(jArr36, jArr34);
            AbstractC8178e.adcel(jArr34, jArr36);
        }
        AbstractC8178e.purchase(jArr32, jArr34, jArr30);
        AbstractC8178e.adcel(jArr34, jArr32);
        AbstractC8178e.adcel(jArr36, jArr34);
        for (int i19 = 2; i19 < 50; i19 += 2) {
            AbstractC8178e.adcel(jArr34, jArr36);
            AbstractC8178e.adcel(jArr36, jArr34);
        }
        AbstractC8178e.purchase(jArr33, jArr36, jArr32);
        AbstractC8178e.adcel(jArr36, jArr33);
        AbstractC8178e.adcel(jArr34, jArr36);
        for (int i20 = 2; i20 < 100; i20 += 2) {
            AbstractC8178e.adcel(jArr36, jArr34);
            AbstractC8178e.adcel(jArr34, jArr36);
        }
        AbstractC8178e.purchase(jArr36, jArr34, jArr33);
        AbstractC8178e.adcel(jArr34, jArr36);
        AbstractC8178e.adcel(jArr36, jArr34);
        for (int i21 = 2; i21 < 50; i21 += 2) {
            AbstractC8178e.adcel(jArr34, jArr36);
            AbstractC8178e.adcel(jArr36, jArr34);
        }
        AbstractC8178e.purchase(jArr34, jArr36, jArr32);
        AbstractC8178e.adcel(jArr36, jArr34);
        AbstractC8178e.adcel(jArr34, jArr36);
        AbstractC8178e.adcel(jArr36, jArr34);
        AbstractC8178e.adcel(jArr34, jArr36);
        AbstractC8178e.adcel(jArr36, jArr34);
        AbstractC8178e.purchase(jArr25, jArr36, jArr28);
        AbstractC8178e.purchase(jArr24, jArr5, jArr25);
        long[] jArr37 = new long[10];
        long[] jArr38 = new long[10];
        long[] jArr39 = new long[11];
        long[] jArr40 = new long[11];
        long[] jArr41 = new long[11];
        AbstractC8178e.purchase(jArr37, jArr2, jArr24);
        AbstractC8178e.advert(jArr38, jArr2, jArr24);
        long[] jArr42 = new long[10];
        jArr42[0] = 486662;
        AbstractC8178e.advert(jArr40, jArr38, jArr42);
        AbstractC8178e.purchase(jArr40, jArr40, jArr4);
        AbstractC8178e.advert(jArr40, jArr40, jArr35);
        AbstractC8178e.purchase(jArr40, jArr40, jArr37);
        AbstractC8178e.purchase(jArr40, jArr40, jArr35);
        for (int i22 = 0; i22 < 10; i22++) {
            jArr39[i22] = jArr40[i22] * 4;
        }
        AbstractC8178e.yandex(jArr39);
        AbstractC8178e.purchase(jArr40, jArr37, jArr4);
        AbstractC8178e.mopub(jArr40, jArr40, jArr4);
        AbstractC8178e.purchase(jArr41, jArr38, jArr35);
        AbstractC8178e.advert(jArr40, jArr40, jArr41);
        AbstractC8178e.adcel(jArr40, jArr40);
        if (MessageDigest.isEqual(AbstractC8178e.vip(jArr39), AbstractC8178e.vip(jArr40))) {
            return AbstractC8178e.vip(jArr24);
        }
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: " + AbstractC5706e.license(bArr2));
    }

    public static final Class purchase(InterfaceC7227e interfaceC7227e) {
        Class subs = ((InterfaceC18155e) interfaceC7227e).subs();
        if (!subs.isPrimitive()) {
            return subs;
        }
        String name = subs.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? subs : Double.class;
            case 104431:
                return !name.equals("int") ? subs : Integer.class;
            case 3039496:
                return !name.equals("byte") ? subs : Byte.class;
            case 3052374:
                return !name.equals("char") ? subs : Character.class;
            case 3327612:
                return !name.equals("long") ? subs : Long.class;
            case 3625364:
                return !name.equals("void") ? subs : Void.class;
            case 64711720:
                return !name.equals("boolean") ? subs : Boolean.class;
            case 97526364:
                return !name.equals("float") ? subs : Float.class;
            case 109413500:
                return !name.equals("short") ? subs : Short.class;
            default:
                return subs;
        }
    }

    public static final C5609e vip(InterfaceC7224e interfaceC7224e, C9424e c9424e, InterfaceC5372e interfaceC5372e, Function0 function0, boolean z, Function2 function2) {
        int i = 0;
        return AbstractC5357e.vip(interfaceC7224e, c9424e, "DefaultChildStack", new C1319e(i, function0), new C10739e(i, new C11881e(interfaceC5372e, 2)), new C10739e(1, new C11881e(interfaceC5372e, 3)), new C8171e(10), new C8171e(11), new C9868e(12), new C7317e(z, 0), function2);
    }

    public void ad(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableC9766e(this, i, 9));
    }

    public abstract void startapp(Typeface typeface);

    public abstract void yandex(int i);
}
