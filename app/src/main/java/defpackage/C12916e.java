package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.Window;
import androidx.car.app.model.CarIcon;
import androidx.car.app.navigation.model.Maneuver;
import androidx.core.graphics.drawable.IconCompat;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.KeyAgreement;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۨؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12916e implements InterfaceC16567e, InterfaceC17386e, InterfaceC3608e, InterfaceC6610e, InterfaceC17818e, InterfaceC12523e, InterfaceC7696e, InterfaceC5714e, InterfaceC3934e, InterfaceC3182e, InterfaceC16718e, InterfaceC7264e, InterfaceC17556e, InterfaceC2276e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C12916e f25781e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C12916e f25782e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f25784e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25785e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final byte[] f25780e = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32};

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final byte[] f25783e = {48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};

    static {
        int i = 1;
        f25781e = new C12916e(i, new int[]{1, 2, 4});
        f25782e = new C12916e(i, new int[]{1, 2});
    }

    public C12916e(int i) {
        this.f25785e = i;
        switch (i) {
            case 10:
                this.f25784e = new C12344e(8);
                return;
            case 21:
                this.f25784e = new Object();
                return;
            case 23:
                this.f25784e = new Object();
                return;
            default:
                this.f25784e = new AtomicReference(null);
                return;
        }
    }

    public /* synthetic */ C12916e(int i, Object obj) {
        this.f25785e = i;
        this.f25784e = obj;
    }

    public /* synthetic */ C12916e(int i, boolean z) {
        this.f25785e = i;
    }

    public C12916e(C1209e c1209e, C16417e c16417e, C12398e c12398e) {
        this.f25785e = 27;
        this.f25784e = c1209e;
        new C5363e(new C5671e(27, this));
    }

    public C12916e(C6831e c6831e) {
        this.f25785e = 20;
        int i = c6831e.purchase;
        this.f25784e = new C18478e[i];
        for (int i2 = 0; i2 < i; i2++) {
            ((C18478e[]) this.f25784e)[i2] = new C18478e(c6831e);
        }
    }

    public C12916e(long[] jArr) {
        C2805e c2805e;
        this.f25785e = 25;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            c2805e = new C2805e(copyOf.length);
            int i = c2805e.vip;
            if (i < 0) {
                AbstractC14783e.yandex(BuildConfig.FLAVOR);
                throw null;
            }
            if (copyOf.length != 0) {
                int length = copyOf.length + i;
                long[] jArr2 = c2805e.ad;
                if (jArr2.length < length) {
                    c2805e.ad = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                }
                long[] jArr3 = c2805e.ad;
                int i2 = c2805e.vip;
                if (i != i2) {
                    AbstractC1660e.adcel(copyOf.length + i, i, i2, jArr3, jArr3);
                }
                System.arraycopy(copyOf, 0, jArr3, i, copyOf.length);
                c2805e.vip += copyOf.length;
            }
        } else {
            c2805e = new C2805e();
        }
        this.f25784e = c2805e;
    }

    public C0056e Signature() {
        if (((ArrayList) this.f25784e) == null) {
            return C0056e.metrica;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", (ArrayList) this.f25784e);
        return new C0056e(bundle, (ArrayList) this.f25784e);
    }

    @Override // defpackage.InterfaceC7696e
    public InterfaceC1908e ad() {
        return (C8763e) this.f25784e;
    }

    public void adcel(C12916e c12916e) {
        int i = 0;
        while (true) {
            C18478e[] c18478eArr = (C18478e[]) this.f25784e;
            if (i >= c18478eArr.length) {
                return;
            }
            C18478e c18478e = c18478eArr[i];
            C18478e c18478e2 = ((C18478e[]) c12916e.f25784e)[i];
            for (int i2 = 0; i2 < 256; i2++) {
                int[] iArr = (int[]) c18478e.f36228e;
                iArr[i2] = iArr[i2] + ((int[]) c18478e2.f36228e)[i2];
            }
            c18478e.getClass();
            i++;
        }
    }

    public void admob() {
        int i = 0;
        while (true) {
            C18478e[] c18478eArr = (C18478e[]) this.f25784e;
            if (i >= c18478eArr.length) {
                return;
            }
            C18478e c18478e = c18478eArr[i];
            for (int i2 = 0; i2 < 256; i2++) {
                int[] iArr = (int[]) c18478e.f36228e;
                int i3 = iArr[i2];
                iArr[i2] = i3 + ((i3 >> 31) & 8380417);
            }
            c18478e.getClass();
            i++;
        }
    }

    public void ads() {
        int i = 0;
        while (true) {
            C18478e[] c18478eArr = (C18478e[]) this.f25784e;
            if (i >= c18478eArr.length) {
                return;
            }
            c18478eArr[i].m4543implements();
            i++;
        }
    }

    public void advert(String str, String str2, boolean z) {
        if (z) {
            String[] strArr = AbstractC16404e.ad;
            for (int i = 0; i < 2; i++) {
                if (AbstractC6507e.loadAd(strArr[i], str, true)) {
                    throw new C15001e(str);
                }
            }
        }
        AbstractC16404e.ad(str);
        AbstractC16404e.vip(str2);
        ((C6582e) this.f25784e).f13574e.mo859e(str, str2);
    }

    @Override // defpackage.InterfaceC12523e
    public Object amazon(C7169e c7169e) {
        C6907e c6907e = (C6907e) this.f25784e;
        AbstractC4265e.yandex("The result can only set once!", c6907e.f14160e == null);
        c6907e.f14160e = c7169e;
        return "ListFuture[" + this + "]";
    }

    public void applovin(String str, String str2) {
        C12402e c12402e = (C12402e) this.f25784e;
        AbstractC1266e.purchase(c12402e, str, str.length(), 8);
        AbstractC1266e.purchase(c12402e, ": ", 2, 8);
        AbstractC13083e.ad(c12402e, str2);
        c12402e.m3339goto((byte) 13);
        c12402e.m3339goto((byte) 10);
    }

    @Override // defpackage.InterfaceC16567e
    public C2873e appmetrica() {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("XDH", (Provider) this.f25784e);
        keyPairGenerator.initialize(255);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        byte[] encoded = generateKeyPair.getPrivate().getEncoded();
        if (encoded.length != 48) {
            throw new GeneralSecurityException("Invalid encoded private key length");
        }
        if (!AbstractC6336e.vip(f25780e, encoded)) {
            throw new GeneralSecurityException("Invalid encoded private key prefix");
        }
        byte[] copyOfRange = Arrays.copyOfRange(encoded, 16, encoded.length);
        byte[] encoded2 = generateKeyPair.getPublic().getEncoded();
        if (encoded2.length != 44) {
            throw new GeneralSecurityException("Invalid encoded public key length");
        }
        if (AbstractC6336e.vip(f25783e, encoded2)) {
            return new C2873e(copyOfRange, Arrays.copyOfRange(encoded2, 12, encoded2.length));
        }
        throw new GeneralSecurityException("Invalid encoded public key prefix");
    }

    @Override // defpackage.InterfaceC6610e
    /* renamed from: appmetrica, reason: collision with other method in class */
    public C17424e mo3419appmetrica() {
        BigInteger bigInteger = AbstractC3211e.ad;
        C6794e c6794e = (C6794e) this.f25784e;
        C3236e c3236e = c6794e.f14002e;
        BigInteger ad = AbstractC3211e.ad(c3236e, (SecureRandom) c6794e.f26878e);
        return new C17424e(new C2149e(c3236e.f7369e.modPow(ad, c3236e.f7367e), c3236e), new C4025e(ad, c3236e), false, 5);
    }

    @Override // defpackage.InterfaceC17818e
    public C18070e billing(C10739e c10739e) {
        return ((C12344e) this.f25784e).premium(c10739e);
    }

    /* renamed from: class, reason: not valid java name */
    public void m3414class() {
        int i = 0;
        while (true) {
            C18478e[] c18478eArr = (C18478e[]) this.f25784e;
            if (i >= c18478eArr.length) {
                return;
            }
            c18478eArr[i].m4556synchronized();
            i++;
        }
    }

    public void crashlytics() {
        int i = 0;
        while (true) {
            C18478e[] c18478eArr = (C18478e[]) this.f25784e;
            if (i >= c18478eArr.length) {
                return;
            }
            c18478eArr[i].m4559transient();
            i++;
        }
    }

    public void firebase(C12916e c12916e) {
        int i = 0;
        while (true) {
            C18478e[] c18478eArr = (C18478e[]) this.f25784e;
            if (i >= c18478eArr.length) {
                return;
            }
            C18478e c18478e = c18478eArr[i];
            C18478e c18478e2 = ((C18478e[]) c12916e.f25784e)[i];
            int[] iArr = (int[]) c18478e.f36228e;
            int[] iArr2 = (int[]) c18478e2.f36228e;
            for (int i2 = 0; i2 < 256; i2++) {
                int i3 = iArr[i2];
                int i4 = i3 + 4095;
                iArr[i2] = i4 >> 13;
                iArr2[i2] = i3 - (i4 & (-8192));
            }
            i++;
        }
    }

    /* renamed from: goto, reason: not valid java name */
    public void m3415goto(String str, CharSequence charSequence, int i) {
        C12402e c12402e = (C12402e) this.f25784e;
        AbstractC1266e.purchase(c12402e, str, 0, 14);
        c12402e.m3339goto((byte) 32);
        AbstractC1266e.purchase(c12402e, String.valueOf(i), 0, 14);
        c12402e.m3339goto((byte) 32);
        AbstractC1266e.purchase(c12402e, charSequence, 0, 14);
        c12402e.m3339goto((byte) 13);
        c12402e.m3339goto((byte) 10);
    }

    public String inmobi(String str) {
        List mo856e = ((C6582e) this.f25784e).f13574e.mo856e(str);
        if (mo856e == null) {
            mo856e = C13664e.f27089e;
        }
        return (String) AbstractC13480e.m3604this(mo856e);
    }

    /* renamed from: interface, reason: not valid java name */
    public InterfaceC5052e m3416interface(C17070e c17070e) {
        C3646e c3646e;
        C12816e vip = c17070e.vip();
        Class<?> declaringClass = c17070e.ad.getDeclaringClass();
        C17070e c17070e2 = declaringClass != null ? new C17070e(declaringClass) : null;
        if (c17070e2 != null) {
            InterfaceC5052e m3416interface = m3416interface(c17070e2);
            InterfaceC8528e mo1730e = m3416interface != null ? m3416interface.mo1730e() : null;
            InterfaceC4077e appmetrica = mo1730e != null ? mo1730e.appmetrica(c17070e.appmetrica(), EnumC2192e.f5575e) : null;
            if (appmetrica instanceof InterfaceC5052e) {
                return (InterfaceC5052e) appmetrica;
            }
        } else if (vip != null && (c3646e = (C3646e) AbstractC13480e.m3604this(((C9252e) this.f25784e).ad(vip.vip()))) != null) {
            C5218e c5218e = c3646e.f8204e.license;
            c5218e.getClass();
            return c5218e.tapsense(c17070e.appmetrica(), c17070e);
        }
        return null;
    }

    public synchronized C17424e isPro() {
        return C17424e.isVip((C3599e) ((C18074e) this.f25784e).ad());
    }

    public void isVip(long j) {
        long j2 = 63 & j;
        if (Long.compare(Long.MIN_VALUE ^ j2, -9223372036854775792L) >= 0) {
            j = (j & (-64)) | (j2 - 1);
        }
        ((Parcel) this.f25784e).writeLong(j);
    }

    @Override // defpackage.InterfaceC3608e
    public void license(MenuC8939e menuC8939e, MenuItem menuItem) {
        ((ViewOnKeyListenerC8330e) this.f25784e).f17051e.removeCallbacksAndMessages(menuC8939e);
    }

    @Override // defpackage.InterfaceC6610e
    public void loadAd(C13572e c13572e) {
        C6794e c6794e = (C6794e) c13572e;
        this.f25784e = c6794e;
        AbstractC0259e.vip(c6794e.f14002e.f7367e);
        C3236e c3236e = ((C6794e) this.f25784e).f14002e;
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    @Override // defpackage.InterfaceC16718e
    public C0177e metrica() {
        InterfaceC1753e vip;
        IOException iOException = null;
        while (!((C0309e) this.f25784e).mopub.f9921e) {
            try {
                vip = ((C0309e) this.f25784e).vip();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    AbstractC13362e.license(iOException, e);
                }
                if (!((C0309e) this.f25784e).ad(null)) {
                    throw iOException;
                }
            }
            if (!vip.license()) {
                C10972e billing = vip.billing();
                if (billing.vip == null && billing.metrica == null) {
                    billing = vip.yandex();
                }
                InterfaceC1753e interfaceC1753e = billing.vip;
                Throwable th = billing.metrica;
                if (th != null) {
                    throw th;
                }
                if (interfaceC1753e != null) {
                    ((C0309e) this.f25784e).Signature.addFirst(interfaceC1753e);
                }
            }
            return vip.purchase();
        }
        throw new IOException("Canceled");
    }

    @Override // defpackage.InterfaceC3608e
    public void mopub(MenuC8939e menuC8939e, C9995e c9995e) {
        ViewOnKeyListenerC8330e viewOnKeyListenerC8330e = (ViewOnKeyListenerC8330e) this.f25784e;
        Handler handler = viewOnKeyListenerC8330e.f17051e;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC8330e.f17040e;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC8939e == ((C6712e) arrayList.get(i)).vip) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC11327e(this, i2 < arrayList.size() ? (C6712e) arrayList.get(i2) : null, c9995e, menuC8939e, 0), menuC8939e, SystemClock.uptimeMillis() + 200);
    }

    /* renamed from: native, reason: not valid java name */
    public void m3417native(CarIcon carIcon) {
        if (carIcon == null || carIcon.getType() != 1) {
            return;
        }
        IconCompat icon = carIcon.getIcon();
        if (icon == null) {
            throw new IllegalStateException("Custom icon does not have a backing IconCompat");
        }
        int billing = icon.billing();
        for (int i : (int[]) this.f25784e) {
            if (billing == i) {
                if (billing != 4 || "content".equalsIgnoreCase(icon.yandex().getScheme())) {
                    return;
                }
                throw new IllegalArgumentException("Unsupported URI scheme for: " + icon);
            }
        }
        throw new IllegalArgumentException(AbstractC1786e.admob(billing, "Custom icon type is not allowed: "));
    }

    public void premium(C6831e c6831e, byte[] bArr, int i) {
        int i2 = 0;
        while (true) {
            C18478e[] c18478eArr = (C18478e[]) this.f25784e;
            if (i2 >= c18478eArr.length) {
                return;
            }
            C18478e c18478e = c18478eArr[i2];
            int i3 = (c6831e.license * i2) + i;
            int i4 = ((C6831e) c18478e.f36227e).advert;
            if (i4 == 95232) {
                for (int i5 = 0; i5 < 64; i5++) {
                    int i6 = (i5 * 3) + i3;
                    int i7 = i5 * 4;
                    int[] iArr = (int[]) c18478e.f36228e;
                    byte b = (byte) iArr[i7];
                    int i8 = iArr[i7 + 1];
                    bArr[i6] = (byte) (b | (i8 << 6));
                    int i9 = iArr[i7 + 2];
                    bArr[i6 + 1] = (byte) (((byte) (i8 >> 2)) | (i9 << 4));
                    bArr[i6 + 2] = (byte) ((iArr[i7 + 3] << 2) | ((byte) (i9 >> 4)));
                }
            } else if (i4 == 261888) {
                for (int i10 = 0; i10 < 128; i10++) {
                    int i11 = i10 * 2;
                    int[] iArr2 = (int[]) c18478e.f36228e;
                    bArr[i3 + i10] = (byte) ((iArr2[i11 + 1] << 4) | iArr2[i11]);
                }
            }
            i2++;
        }
    }

    @Override // defpackage.InterfaceC3934e
    public C17985e pro(C17985e c17985e, float f, C7695e c7695e) {
        ((C14590e) this.f25784e).pro(c17985e, f, c7695e);
        return c17985e;
    }

    @Override // defpackage.InterfaceC16718e
    public C0309e purchase() {
        return (C0309e) this.f25784e;
    }

    public void remoteconfig(byte b) {
        ((Parcel) this.f25784e).writeByte(b);
    }

    public void signatures(float f) {
        ((Parcel) this.f25784e).writeFloat(f);
    }

    @Override // defpackage.InterfaceC17386e
    public boolean smaato(MenuC8939e menuC8939e) {
        Window.Callback callback = ((LayoutInflaterFactory2C8158e) this.f25784e).f16563e.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, menuC8939e);
        return true;
    }

    @Override // defpackage.InterfaceC16567e
    public byte[] startapp(byte[] bArr, byte[] bArr2) {
        Provider provider = (Provider) this.f25784e;
        KeyFactory keyFactory = KeyFactory.getInstance("XDH", provider);
        if (bArr.length != 32) {
            throw new InvalidKeyException("Invalid X25519 private key");
        }
        PrivateKey generatePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(AbstractC7640e.ad(f25780e, bArr)));
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Invalid X25519 public key");
        }
        PublicKey generatePublic = keyFactory.generatePublic(new X509EncodedKeySpec(AbstractC7640e.ad(f25783e, bArr2)));
        KeyAgreement keyAgreement = KeyAgreement.getInstance("XDH", provider);
        keyAgreement.init(generatePrivate);
        keyAgreement.doPhase(generatePublic, true);
        return keyAgreement.generateSecret();
    }

    public void subs(C18478e c18478e, C12916e c12916e) {
        int i = 0;
        while (true) {
            C18478e[] c18478eArr = (C18478e[]) this.f25784e;
            if (i >= c18478eArr.length) {
                return;
            }
            c18478eArr[i].m4553strictfp(c18478e, ((C18478e[]) c12916e.f25784e)[i]);
            i++;
        }
    }

    public void subscription() {
        C12402e c12402e = (C12402e) this.f25784e;
        c12402e.m3339goto((byte) 13);
        c12402e.m3339goto((byte) 10);
    }

    public void tapsense(long j) {
        long vip = C12973e.vip(j);
        byte b = 0;
        if (!C4616e.ad(vip, 0L)) {
            if (C4616e.ad(vip, 4294967296L)) {
                b = 1;
            } else if (C4616e.ad(vip, 8589934592L)) {
                b = 2;
            }
        }
        remoteconfig(b);
        if (C4616e.ad(C12973e.vip(j), 0L)) {
            return;
        }
        signatures(C12973e.metrica(j));
    }

    /* renamed from: this, reason: not valid java name */
    public void m3418this(C12916e c12916e) {
        int i = 0;
        while (true) {
            C18478e[] c18478eArr = (C18478e[]) this.f25784e;
            if (i >= c18478eArr.length) {
                return;
            }
            C18478e c18478e = c18478eArr[i];
            C18478e c18478e2 = ((C18478e[]) c12916e.f25784e)[i];
            for (int i2 = 0; i2 < 256; i2++) {
                int[] iArr = (int[]) c18478e.f36228e;
                iArr[i2] = iArr[i2] - ((int[]) c18478e2.f36228e)[i2];
            }
            c18478e.getClass();
            i++;
        }
    }

    public String toString() {
        switch (this.f25785e) {
            case 20:
                C18478e[] c18478eArr = (C18478e[]) this.f25784e;
                String str = "[";
                for (int i = 0; i < c18478eArr.length; i++) {
                    str = str + i + " " + c18478eArr[i].toString();
                    if (i != c18478eArr.length - 1) {
                        str = AbstractC10257e.adcel(str, ",\n");
                    }
                }
                return AbstractC10257e.adcel(str, "]");
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return "return " + ((InterfaceC7004e) this.f25784e) + ";";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC17386e
    public void vip(MenuC8939e menuC8939e, boolean z) {
        ((LayoutInflaterFactory2C8158e) this.f25784e).pro(menuC8939e);
    }

    @Override // defpackage.InterfaceC2276e
    public InterfaceC11216e yandex(C5609e c5609e) {
        Context context = (Context) this.f25784e;
        String str = (String) c5609e.f11964e;
        C5891e c5891e = (C5891e) c5609e.f11961e;
        if (c5891e == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        C5609e c5609e2 = new C5609e(context, str, c5891e, true);
        return new C3416e((Context) c5609e2.f11962e, (String) c5609e2.f11964e, (C5891e) c5609e2.f11961e, c5609e2.f11963e);
    }
}
