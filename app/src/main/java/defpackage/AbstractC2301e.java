package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؑؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2301e {
    public static final C2892e ad = new C2892e(-2141596450, false, new C11789e(22));
    public static final C2892e vip = new C2892e(-1723293697, false, new C11789e(23));
    public static final C2892e metrica = new C2892e(1637199121, false, new C11789e(24));
    public static final C2892e license = new C2892e(-1182242163, false, new C11789e(25));
    public static final C2892e appmetrica = new C2892e(-961638225, false, new C8580e(1));
    public static final C2892e purchase = new C2892e(1650826572, false, new C8580e(2));
    public static final C2892e billing = new C2892e(-902497526, false, new C8580e(3));
    public static final C2892e yandex = new C2892e(-31675927, false, new C8580e(4));
    public static final C2892e startapp = new C2892e(839145672, false, new C8580e(5));
    public static final C2892e adcel = new C2892e(1426510125, false, new C8580e(0));

    public static void Signature(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? ad(i, i3, "start index") : (i2 < 0 || i2 > i3) ? ad(i2, i3, "end index") : AbstractC12992e.adcel("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String ad(int i, int i2, String str) {
        if (i < 0) {
            return AbstractC12992e.adcel("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return AbstractC12992e.adcel("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(AbstractC1786e.admob(i2, "negative size: "));
    }

    public static void adcel(boolean z, String str, Object obj, Comparable comparable) {
        if (!z) {
            throw new IllegalArgumentException(AbstractC12992e.adcel(str, obj, comparable));
        }
    }

    public static void admob(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void advert(C0313e c0313e) {
        c0313e.getClass();
    }

    public static void amazon(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void appmetrica(long j, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(AbstractC12992e.adcel(str, Long.valueOf(j)));
        }
    }

    public static void billing(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void license(long j, long j2, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(AbstractC12992e.adcel(str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    public static void loadAd(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(ad(i, i2, "index"));
        }
    }

    public static void metrica(int i, int i2, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(AbstractC12992e.adcel(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void mopub(int i, int i2) {
        String adcel2;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                adcel2 = AbstractC12992e.adcel("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(AbstractC1786e.admob(i2, "negative size: "));
                }
                adcel2 = AbstractC12992e.adcel("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(adcel2);
        }
    }

    public static final int pro(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static void purchase(String str, boolean z, int i) {
        if (!z) {
            throw new IllegalArgumentException(AbstractC12992e.adcel(str, Integer.valueOf(i)));
        }
    }

    public static byte[] remoteconfig(int i, String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i2 = 1;
        byte[] ad2 = AbstractC7640e.ad(bArr, bArr2);
        Mac mac = (Mac) C7174e.metrica.ad.isPro(str);
        if (i > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr3 == null || bArr3.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr3, str));
        }
        byte[] bArr4 = new byte[i];
        mac.init(new SecretKeySpec(mac.doFinal(ad2), str));
        byte[] bArr5 = new byte[0];
        int i3 = 0;
        while (true) {
            mac.update(bArr5);
            mac.update((byte[]) null);
            mac.update((byte) i2);
            bArr5 = mac.doFinal();
            if (bArr5.length + i3 >= i) {
                System.arraycopy(bArr5, 0, bArr4, i3, i - i3);
                return bArr4;
            }
            System.arraycopy(bArr5, 0, bArr4, i3, bArr5.length);
            i3 += bArr5.length;
            i2++;
        }
    }

    public static void smaato(ListenableFuture listenableFuture, String str, Object obj) {
        if (listenableFuture == null) {
            throw new NullPointerException(AbstractC12992e.adcel(str, obj));
        }
    }

    public static void startapp(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(AbstractC12992e.adcel(str, obj));
        }
    }

    public static void subscription(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static final Bundle vip(C6571e... c6571eArr) {
        Bundle bundle = new Bundle(c6571eArr.length);
        for (C6571e c6571e : c6571eArr) {
            String str = (String) c6571e.f13544e;
            Object obj = c6571e.f13543e;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void yandex(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }
}
