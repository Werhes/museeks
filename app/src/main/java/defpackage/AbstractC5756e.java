package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.EOFException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٜٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5756e {
    public static final C2892e ad = new C2892e(1584251493, false, new C9375e(0));

    public static final String ad(C12402e c12402e, long j) {
        if (j == 0) {
            return BuildConfig.FLAVOR;
        }
        C0378e c0378e = c12402e.f24834e;
        if (c0378e == null) {
            throw new IllegalStateException("Unreacheable");
        }
        if (c0378e.vip() < j) {
            byte[] metrica = AbstractC12731e.metrica(c12402e, (int) j);
            return AbstractC12751e.metrica(0, metrica.length, metrica);
        }
        byte[] bArr = c0378e.ad;
        int i = c0378e.vip;
        String metrica2 = AbstractC12751e.metrica(i, Math.min(c0378e.metrica, ((int) j) + i), bArr);
        c12402e.skip(j);
        return metrica2;
    }

    public static final long appmetrica(float f, long j) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public static final void billing(int i, int i2, InterfaceC9998e interfaceC9998e) {
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(interfaceC9998e.billing(i4));
            }
            i3 >>>= 1;
        }
        throw new C15691e(interfaceC9998e.ad(), arrayList);
    }

    public static final String license(InterfaceC17430e interfaceC17430e) {
        interfaceC17430e.request(Long.MAX_VALUE);
        return ad(interfaceC17430e.metrica(), interfaceC17430e.metrica().f24832e);
    }

    public static Handler metrica(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC17305e.startapp(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final void purchase(int[] iArr, int[] iArr2, InterfaceC9998e interfaceC9998e) {
        ArrayList arrayList = new ArrayList();
        int length = iArr2.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr2[i] & (~iArr[i]);
            if (i2 != 0) {
                for (int i3 = 0; i3 < 32; i3++) {
                    if ((i2 & 1) != 0) {
                        arrayList.add(interfaceC9998e.billing((i * 32) + i3));
                    }
                    i2 >>>= 1;
                }
            }
        }
        throw new C15691e(interfaceC9998e.ad(), arrayList);
    }

    public static final void startapp(C12402e c12402e, String str, int i, int i2) {
        char charAt;
        int i3;
        AbstractC8913e.vip(str.length(), i, i2);
        c12402e.metrica();
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                C0378e subs = c12402e.subs(1);
                byte[] bArr = subs.ad;
                int i4 = -i;
                int min = Math.min(i2, subs.ad() + i);
                int i5 = i + 1;
                bArr[subs.metrica + i + i4] = (byte) charAt2;
                while (true) {
                    i = i5;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i5 = i + 1;
                    bArr[subs.metrica + i + i4] = (byte) charAt;
                }
                int i6 = i4 + i;
                if (i6 == 1) {
                    subs.metrica += i6;
                    c12402e.f24832e += i6;
                } else {
                    if (i6 < 0 || i6 > subs.ad()) {
                        StringBuilder premium = AbstractC4653e.premium("Invalid number of bytes written: ", i6, ". Should be in 0..");
                        premium.append(subs.ad());
                        throw new IllegalStateException(premium.toString().toString());
                    }
                    if (i6 != 0) {
                        subs.metrica += i6;
                        c12402e.f24832e += i6;
                    } else if (AbstractC10432e.license(subs)) {
                        c12402e.Signature();
                    }
                }
            } else {
                if (charAt2 < 2048) {
                    i3 = 2;
                    C0378e subs2 = c12402e.subs(2);
                    byte[] bArr2 = subs2.ad;
                    int i7 = subs2.metrica;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    subs2.metrica = i7 + 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    i3 = 3;
                    C0378e subs3 = c12402e.subs(3);
                    byte[] bArr3 = subs3.ad;
                    int i8 = subs3.metrica;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    subs3.metrica = i8 + 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        c12402e.m3339goto((byte) 63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        C0378e subs4 = c12402e.subs(4);
                        byte[] bArr4 = subs4.ad;
                        int i11 = subs4.metrica;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        subs4.metrica = i11 + 4;
                        c12402e.f24832e += 4;
                        i += 2;
                    }
                }
                c12402e.f24832e += i3;
                i++;
            }
        }
        c12402e.purchase();
    }

    public static final int vip(C12402e c12402e) {
        int i;
        int i2;
        int i3;
        c12402e.admob(1L);
        byte license = c12402e.license(0L);
        if ((license & 128) == 0) {
            i = license & Byte.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((license & 224) == 192) {
            i = license & 31;
            i2 = 2;
            i3 = 128;
        } else if ((license & 240) == 224) {
            i = license & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((license & 248) != 240) {
                c12402e.skip(1L);
                return 65533;
            }
            i = license & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (c12402e.f24832e < j) {
            StringBuilder premium = AbstractC4653e.premium("size < ", i2, ": ");
            premium.append(c12402e.f24832e);
            premium.append(" (to read code point prefixed 0x");
            char[] cArr = AbstractC8913e.billing;
            premium.append(new String(new char[]{cArr[(license >> 4) & 15], cArr[license & 15]}));
            premium.append(')');
            throw new EOFException(premium.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte license2 = c12402e.license(j2);
            if ((license2 & 192) != 128) {
                c12402e.skip(j2);
                return 65533;
            }
            i = (i << 6) | (license2 & 63);
        }
        c12402e.skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    public static final void yandex(C12402e c12402e, int i) {
        String str;
        if (i < 0 || i > 1114111) {
            StringBuilder sb = new StringBuilder("Code point value is out of Unicode codespace 0..0x10ffff: 0x");
            if (i != 0) {
                char[] cArr = AbstractC8913e.billing;
                int i2 = 0;
                char c = cArr[0];
                char[] cArr2 = {c, c, c, c, c, c, cArr[(i >> 4) & 15], cArr[i & 15]};
                while (i2 < 8 && cArr2[i2] == '0') {
                    i2++;
                }
                str = AbstractC6507e.startapp(cArr2, i2, 8);
            } else {
                str = "0";
            }
            sb.append(str);
            sb.append(" (");
            sb.append(i);
            sb.append(')');
            throw new IllegalArgumentException(sb.toString());
        }
        if (i < 128) {
            c12402e.m3339goto((byte) i);
            return;
        }
        if (i < 2048) {
            C0378e subs = c12402e.subs(2);
            byte[] bArr = subs.ad;
            int i3 = subs.metrica;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[i3 + 1] = (byte) ((i & 63) | 128);
            subs.metrica = i3 + 2;
            c12402e.f24832e += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            c12402e.m3339goto((byte) 63);
            return;
        }
        if (i < 65536) {
            C0378e subs2 = c12402e.subs(3);
            byte[] bArr2 = subs2.ad;
            int i4 = subs2.metrica;
            bArr2[i4] = (byte) 224;
            bArr2[i4 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i4 + 2] = (byte) ((i & 63) | 128);
            subs2.metrica = i4 + 3;
            c12402e.f24832e += 3;
            return;
        }
        C0378e subs3 = c12402e.subs(4);
        byte[] bArr3 = subs3.ad;
        int i5 = subs3.metrica;
        bArr3[i5] = (byte) 240;
        bArr3[i5 + 1] = (byte) 128;
        bArr3[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i5 + 3] = (byte) ((i & 63) | 128);
        subs3.metrica = i5 + 4;
        c12402e.f24832e += 4;
    }
}
