package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؔٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5401e implements InterfaceC17063e, InterfaceC18515e, InterfaceC11207e, InterfaceC10459e, InterfaceC3581e, InterfaceC0566e, InterfaceC7004e, InterfaceC2868e, InterfaceC11716e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static C5401e f11578e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C5401e f11579e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f11581e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11582e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final float[] f11577e = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 9.9999998E10f, 1.0E12f, 9.9999998E12f, 1.0E14f, 9.9999999E14f, 1.00000003E16f, 9.9999998E16f, 9.9999998E17f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final float[] f11580e = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    static {
        byte b = 0;
        f11579e = new C5401e(b, 1, b);
    }

    public /* synthetic */ C5401e(byte b, int i) {
        this.f11582e = i;
    }

    public C5401e(int i) {
        this.f11582e = 3;
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(AbstractC1786e.admob(i, "Unsupported key length: "));
        }
        this.f11581e = i;
    }

    public C5401e(int i, int i2) {
        this.f11582e = 5;
        this.f11581e = i;
    }

    public /* synthetic */ C5401e(int i, int i2, byte b) {
        this.f11582e = i2;
        this.f11581e = i;
    }

    public C5401e(C0849e c0849e) {
        this.f11582e = 23;
        this.f11581e = c0849e.f3231e;
    }

    public C5401e(C15694e c15694e) {
        this.f11582e = 7;
        if (c15694e.vip != 12) {
            throw new GeneralSecurityException("invalid IV size");
        }
        if (c15694e.metrica != 16) {
            throw new GeneralSecurityException("invalid tag size");
        }
        if (c15694e.license != C16372e.f32165e) {
            throw new GeneralSecurityException("invalid variant");
        }
        this.f11581e = c15694e.ad;
    }

    public static String crashlytics(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static synchronized C5401e loadAd() {
        C5401e c5401e;
        synchronized (C5401e.class) {
            try {
                if (f11578e == null) {
                    f11578e = new C5401e(3, 0, (byte) 0);
                }
                c5401e = f11578e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5401e;
    }

    @Override // defpackage.InterfaceC0566e
    public int Signature() {
        return this.f11581e;
    }

    @Override // defpackage.InterfaceC17717e
    public /* synthetic */ boolean ad() {
        return false;
    }

    @Override // defpackage.InterfaceC17717e
    public AbstractC3424e adcel(long j, AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        return abstractC3424e3;
    }

    @Override // defpackage.InterfaceC0566e
    public int admob() {
        return 0;
    }

    public Object ads(Object obj) {
        return ((AbstractC13933e) obj).f27639e.get(this.f11581e);
    }

    @Override // defpackage.InterfaceC18515e
    public byte[] advert(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2.length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (bArr.length != this.f11581e) {
            throw new GeneralSecurityException("invalid key size");
        }
        SecretKeySpec vip = AbstractC0613e.vip(bArr);
        int i2 = i + 12;
        if (bArr2.length < i + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec ad = AbstractC0613e.ad(i, 12, bArr2);
        Cipher metrica = AbstractC0613e.metrica();
        metrica.init(2, vip, ad);
        return metrica.doFinal(bArr2, i2, (bArr2.length - i) - 12);
    }

    public void amazon(String str, String str2, Throwable... thArr) {
        if (this.f11581e <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    public long applovin(C13572e c13572e) {
        for (Throwable th = (IOException) c13572e.f26878e; th != null; th = th.getCause()) {
            if ((th instanceof C15125e) || (th instanceof FileNotFoundException) || (th instanceof C15585e) || (th instanceof C11705e)) {
                return -9223372036854775807L;
            }
            if ((th instanceof C18297e) && ((C18297e) th).f35943e == 2008) {
                return -9223372036854775807L;
            }
        }
        return Math.min((c13572e.f26879e - 1) * 1000, 5000);
    }

    @Override // defpackage.InterfaceC2868e
    public InterfaceC6396e appmetrica(InterfaceC6396e interfaceC6396e) {
        C15664e c15664e = interfaceC6396e instanceof C15664e ? (C15664e) interfaceC6396e : null;
        if (c15664e != null && c15664e.vip == this.f11581e) {
            c15664e.ad = 0;
            return c15664e;
        }
        C15664e c15664e2 = new C15664e();
        c15664e2.ad = 0;
        c15664e2.vip = this.f11581e;
        if (c15664e != null) {
            c15664e2.metrica = c15664e.metrica;
            c15664e2.license = c15664e.license;
            c15664e2.appmetrica = c15664e.appmetrica;
            c15664e2.purchase = c15664e.purchase;
        }
        return c15664e2;
    }

    @Override // defpackage.InterfaceC17063e
    public byte[] billing(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) {
        if (bArr.length != this.f11581e) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: " + bArr.length);
        }
        if (!AbstractC1786e.adcel(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKeySpec vip = AbstractC0613e.vip(bArr);
        if (bArr2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr3.length < i + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec ad = AbstractC0613e.ad(0, bArr2.length, bArr2);
        Cipher metrica = AbstractC0613e.metrica();
        metrica.init(2, vip, ad);
        if (bArr4.length != 0) {
            metrica.updateAAD(bArr4);
        }
        return metrica.doFinal(bArr3, i, bArr3.length - i);
    }

    /* renamed from: class, reason: not valid java name */
    public boolean m1901class(int i) {
        return (this.f11581e & i) == i;
    }

    public void firebase(String str, String str2, Throwable... thArr) {
        if (this.f11581e <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    /* renamed from: goto, reason: not valid java name */
    public boolean m1902goto() {
        return m1903interface() || m1901class(128);
    }

    @Override // defpackage.InterfaceC17717e
    public long inmobi(AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        return Signature() * 1000000;
    }

    /* renamed from: interface, reason: not valid java name */
    public boolean m1903interface() {
        return !(!m1901class(32) || m1901class(64) || m1901class(128)) || m1901class(64);
    }

    public int isPro(int i) {
        int i2 = this.f11581e;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    @Override // defpackage.InterfaceC17063e
    public byte[] isVip() {
        int i = this.f11581e;
        if (i == 16) {
            return AbstractC0097e.startapp;
        }
        if (i == 32) {
            return AbstractC0097e.adcel;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // defpackage.InterfaceC3581e
    public int license() {
        switch (this.f11582e) {
            case 13:
                return this.f11581e;
            case 14:
                return this.f11581e;
            default:
                return this.f11581e;
        }
    }

    @Override // defpackage.InterfaceC18515e
    public byte[] metrica(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length != this.f11581e) {
            throw new GeneralSecurityException("invalid key size");
        }
        SecretKeySpec vip = AbstractC0613e.vip(bArr);
        byte[] ad = AbstractC10461e.ad(12);
        AlgorithmParameterSpec ad2 = AbstractC0613e.ad(0, ad.length, ad);
        Cipher metrica = AbstractC0613e.metrica();
        metrica.init(1, vip, ad2);
        int outputSize = metrica.getOutputSize(bArr4.length);
        int length = bArr2.length + bArr3.length;
        if (outputSize > 2147483635 - length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i = length + 12;
        byte[] copyOf = Arrays.copyOf(bArr2, i + outputSize);
        System.arraycopy(bArr3, 0, copyOf, bArr2.length, bArr3.length);
        System.arraycopy(ad, 0, copyOf, length, 12);
        if (metrica.doFinal(bArr4, 0, bArr4.length, copyOf, i) == outputSize) {
            return copyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // defpackage.InterfaceC18515e
    public int mopub() {
        return this.f11581e;
    }

    public void premium(String str, String str2, Throwable... thArr) {
        if (this.f11581e <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    @Override // defpackage.InterfaceC17717e
    public AbstractC3424e pro(long j, AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        return j < ((long) this.f11581e) * 1000000 ? abstractC3424e : abstractC3424e2;
    }

    @Override // defpackage.InterfaceC11716e
    public int purchase(Context context, String str, boolean z) {
        return 0;
    }

    public C9436e remoteconfig(C6008e c6008e, C13572e c13572e) {
        IOException iOException = (IOException) c13572e.f26878e;
        if (!(iOException instanceof C16254e)) {
            return null;
        }
        int i = ((C16254e) iOException).f31932e;
        if (i != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503) {
            return null;
        }
        if (c6008e.ad - c6008e.vip > 1) {
            return new C9436e(1, 300000L);
        }
        if (c6008e.metrica - c6008e.license > 1) {
            return new C9436e(2, 60000L);
        }
        return null;
    }

    @Override // defpackage.InterfaceC10459e
    public String signatures() {
        switch (this.f11582e) {
            case 11:
                return AbstractC17861e.smaato(this.f11581e, " digits", new StringBuilder("expected at least "));
            default:
                return AbstractC17861e.smaato(this.f11581e, " digits", new StringBuilder("expected at most "));
        }
    }

    public void smaato(String str, String str2, Throwable... thArr) {
        if (this.f11581e <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    @Override // defpackage.InterfaceC17063e
    public byte[] startapp(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) {
        if (bArr.length == this.f11581e) {
            return new C6325e(bArr).crashlytics(i, bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + bArr.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x008a A[EDGE_INSN: B:117:0x008a->B:47:0x008a BREAK  A[LOOP:0: B:10:0x0034->B:17:0x0083], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float subs(int r24, int r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5401e.subs(int, int, java.lang.String):float");
    }

    @Override // defpackage.InterfaceC17063e
    public int subscription() {
        return this.f11581e;
    }

    @Override // defpackage.InterfaceC17717e
    public AbstractC3424e tapsense(AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        return abstractC3424e3;
    }

    public String toString() {
        switch (this.f11582e) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return String.valueOf(this.f11581e);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC11207e
    public ByteBuffer vip() {
        return ByteBuffer.allocate(this.f11581e);
    }

    @Override // defpackage.InterfaceC11716e
    public int yandex(Context context, String str) {
        return this.f11581e;
    }
}
