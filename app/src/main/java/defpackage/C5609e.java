package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.firebase.messaging.FirebaseMessaging;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: eؘْؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5609e implements InterfaceC17128e, InterfaceC6045e, InterfaceC5483e, InterfaceC9307e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final byte[] f11960e = {-90, 89, 89, -90};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f11961e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f11962e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f11963e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f11964e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11965e;

    public C5609e(int i) {
        this.f11965e = i;
        switch (i) {
            case 6:
                this.f11962e = new Object();
                this.f11964e = new ArrayList();
                this.f11961e = new ArrayList();
                this.f11963e = true;
                return;
            case 12:
                this.f11962e = new Object();
                this.f11964e = new ArrayDeque();
                this.f11961e = new AtomicReference();
                return;
            default:
                this.f11962e = new C15236e(1);
                return;
        }
    }

    public C5609e(Context context, Looper looper, Looper looper2, SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e, C17381e c17381e) {
        this.f11965e = 1;
        this.f11962e = context.getApplicationContext();
        this.f11961e = c17381e.ad(looper, null);
        this.f11964e = new C5153e(this, c17381e.ad(looper2, null), surfaceHolderCallbackC0960e);
    }

    public C5609e(Context context, String str, C5891e c5891e, boolean z) {
        this.f11965e = 11;
        this.f11962e = context;
        this.f11964e = str;
        this.f11961e = c5891e;
        this.f11963e = z;
    }

    public C5609e(FirebaseMessaging firebaseMessaging, InterfaceC13242e interfaceC13242e) {
        this.f11965e = 4;
        this.f11961e = firebaseMessaging;
        this.f11962e = interfaceC13242e;
    }

    public C5609e(C1195e c1195e, String str) {
        this.f11965e = 15;
        this.f11961e = c1195e;
        AbstractC9528e.purchase(str);
        this.f11962e = str;
    }

    public C5609e(InterfaceC2227e interfaceC2227e, int i) {
        this.f11965e = i;
        switch (i) {
            case 9:
                this.f11962e = new C8011e(interfaceC2227e);
                return;
            default:
                this.f11964e = new byte[4];
                this.f11961e = null;
                this.f11963e = true;
                this.f11962e = interfaceC2227e;
                return;
        }
    }

    public C5609e(InterfaceC5483e interfaceC5483e, InterfaceC7854e interfaceC7854e) {
        this.f11965e = 10;
        this.f11962e = interfaceC5483e;
        this.f11964e = interfaceC7854e;
        this.f11961e = new SparseArray();
    }

    public C5609e(C8839e c8839e, C4016e c4016e) {
        this.f11965e = 2;
        this.f11961e = c8839e;
        this.f11962e = c4016e;
        this.f11964e = new boolean[2];
    }

    public C5609e(C10017e c10017e, boolean z) {
        this.f11965e = 13;
        this.f11961e = c10017e;
        this.f11964e = new AtomicReference(null);
        this.f11963e = z;
        this.f11962e = new AtomicMarkableReference(new C0620e(z ? 8192 : 1024), false);
    }

    public C5609e(C10350e c10350e, C15533e c15533e, InterfaceC6357e interfaceC6357e) {
        this.f11965e = 8;
        this.f11962e = c10350e;
        this.f11964e = c15533e;
        this.f11961e = interfaceC6357e;
        this.f11963e = true;
    }

    public C5609e(C18381e c18381e, C8130e c8130e, C9364e c9364e, boolean z) {
        this.f11965e = 14;
        this.f11962e = c8130e;
        this.f11964e = c9364e;
        this.f11963e = z;
        this.f11961e = c18381e;
    }

    public C5609e(Object obj) {
        this.f11965e = 7;
        this.f11962e = new C11993e(4);
        this.f11964e = obj;
        this.f11961e = C9139e.f18290e;
    }

    public C5609e(String str, boolean z, C10629e c10629e) {
        this.f11965e = 5;
        AbstractC2301e.billing((z && TextUtils.isEmpty(str)) ? false : true);
        this.f11962e = c10629e;
        this.f11964e = str;
        this.f11963e = z;
        this.f11961e = new HashMap();
    }

    public static final void ad(C5609e c5609e) {
        Object obj;
        Map map;
        while (true) {
            synchronized (((C11993e) c5609e.f11962e)) {
                obj = c5609e.f11964e;
                map = (Map) c5609e.f11961e;
                Unit unit = Unit.INSTANCE;
            }
            for (Map.Entry entry : map.entrySet()) {
                Function1 function1 = (Function1) entry.getKey();
                if (((Boolean) entry.getValue()).booleanValue()) {
                    function1.invoke(obj);
                }
            }
            synchronized (((C11993e) c5609e.f11962e)) {
                if (obj == c5609e.f11964e) {
                    c5609e.f11963e = false;
                    return;
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    @Override // defpackage.InterfaceC5483e
    public InterfaceC18147e Signature(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.f11961e;
        InterfaceC5483e interfaceC5483e = (InterfaceC5483e) this.f11962e;
        if (i2 != 3 && i2 != 5) {
            this.f11963e = true;
        }
        if (i2 != 3) {
            return interfaceC5483e.Signature(i, i2);
        }
        C12727e c12727e = (C12727e) sparseArray.get(i);
        if (c12727e != null) {
            return c12727e;
        }
        C12727e c12727e2 = new C12727e(interfaceC5483e.Signature(i, i2), (InterfaceC7854e) this.f11964e);
        sparseArray.put(i, c12727e2);
        return c12727e2;
    }

    @Override // defpackage.InterfaceC6045e
    public byte[] adcel() {
        C1694e c1694e;
        if (!this.f11963e || (c1694e = (C1694e) this.f11964e) == null) {
            throw new IllegalStateException("Ed25519Signer not initialised for signature generation.");
        }
        return ((C15236e) this.f11962e).license(c1694e);
    }

    public void admob(boolean z) {
        C2399e c2399e = (C2399e) this.f11961e;
        if (z == this.f11963e) {
            return;
        }
        if (z) {
            final int i = 0;
            c2399e.license(new Runnable(this) { // from class: eًِؖ

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ C5609e f8865e;

                {
                    this.f8865e = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            C5609e c5609e = this.f8865e;
                            ((Context) c5609e.f11962e).registerReceiver((C5153e) c5609e.f11964e, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                            return;
                        default:
                            C5609e c5609e2 = this.f8865e;
                            ((Context) c5609e2.f11962e).unregisterReceiver((C5153e) c5609e2.f11964e);
                            return;
                    }
                }
            });
            this.f11963e = true;
        } else {
            final int i2 = 1;
            c2399e.license(new Runnable(this) { // from class: eًِؖ

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ C5609e f8865e;

                {
                    this.f8865e = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            C5609e c5609e = this.f8865e;
                            ((Context) c5609e.f11962e).registerReceiver((C5153e) c5609e.f11964e, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                            return;
                        default:
                            C5609e c5609e2 = this.f8865e;
                            ((Context) c5609e2.f11962e).unregisterReceiver((C5153e) c5609e2.f11964e);
                            return;
                    }
                }
            });
            this.f11963e = false;
        }
    }

    public synchronized void advert() {
        try {
            if (this.f11963e) {
                return;
            }
            Boolean loadAd = loadAd();
            this.f11964e = loadAd;
            if (loadAd == null) {
                C12582e c12582e = new C12582e(18);
                C18395e c18395e = (C18395e) ((InterfaceC13242e) this.f11962e);
                c18395e.ad(c18395e.metrica, c12582e);
            }
            this.f11963e = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean amazon() {
        boolean z;
        synchronized (this.f11962e) {
            z = this.f11963e;
        }
        return z;
    }

    public C2414e appmetrica(UUID uuid, C17344e c17344e) {
        String str = c17344e.vip;
        if (this.f11963e || TextUtils.isEmpty(str)) {
            str = (String) this.f11964e;
        }
        if (TextUtils.isEmpty(str)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            AbstractC2301e.amazon(uri, "The uri must be set.");
            throw new C4456e(new C2435e(uri, 0L, 1, null, map, 0L, -1L, null, 0, null), uri, C0409e.f2448e, 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = AbstractC18394e.purchase;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : AbstractC18394e.license.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.f11961e)) {
            hashMap.putAll((HashMap) this.f11961e);
        }
        return AbstractC2413e.metrica(((C10629e) this.f11962e).remoteconfig(), str, c17344e.ad, hashMap);
    }

    @Override // defpackage.InterfaceC17128e
    public byte[] billing(int i, byte[] bArr) {
        byte[] bArr2;
        switch (this.f11965e) {
            case 0:
                InterfaceC2227e interfaceC2227e = (InterfaceC2227e) this.f11962e;
                if (this.f11963e) {
                    throw new IllegalStateException("not set for unwrapping");
                }
                int i2 = i / 8;
                if (i2 * 8 != i) {
                    throw new Exception("unwrap data must be a multiple of 8 bytes");
                }
                int i3 = 1;
                if (i2 <= 1) {
                    throw new Exception("unwrap data must be at least 16 bytes");
                }
                byte[] bArr3 = new byte[i];
                System.arraycopy(bArr, 0, bArr3, 0, i);
                byte[] bArr4 = new byte[i];
                byte[] bArr5 = new byte[8];
                if (i2 == 2) {
                    interfaceC2227e.init(false, (C14915e) this.f11961e);
                    int isPro = interfaceC2227e.isPro();
                    for (int i4 = 0; i4 < i; i4 += isPro) {
                        interfaceC2227e.tapsense(i4, i4, bArr3, bArr4);
                    }
                    System.arraycopy(bArr4, 0, bArr5, 0, 8);
                    int i5 = i - 8;
                    bArr2 = new byte[i5];
                    System.arraycopy(bArr4, 8, bArr2, 0, i5);
                } else {
                    int i6 = i - 8;
                    byte[] bArr6 = new byte[i6];
                    byte[] bArr7 = new byte[16];
                    System.arraycopy(bArr, 0, bArr7, 0, 8);
                    System.arraycopy(bArr, 8, bArr6, 0, i6);
                    interfaceC2227e.init(false, (C14915e) this.f11961e);
                    int i7 = i2 - 1;
                    for (int i8 = 5; i8 >= 0; i8--) {
                        for (int i9 = i7; i9 >= i3; i9--) {
                            int i10 = (i9 - 1) * 8;
                            System.arraycopy(bArr6, i10, bArr7, 8, 8);
                            int i11 = (i7 * i8) + i9;
                            int i12 = i3;
                            while (i11 != 0) {
                                int i13 = 8 - i12;
                                bArr7[i13] = (byte) (((byte) i11) ^ bArr7[i13]);
                                i11 >>>= 8;
                                i12++;
                                i3 = i3;
                            }
                            interfaceC2227e.tapsense(0, 0, bArr7, bArr7);
                            System.arraycopy(bArr7, 8, bArr6, i10, 8);
                        }
                    }
                    System.arraycopy(bArr7, 0, bArr5, 0, 8);
                    bArr2 = bArr6;
                }
                int i14 = 4;
                byte[] bArr8 = new byte[4];
                System.arraycopy(bArr5, 0, bArr8, 0, 4);
                int metrica = AbstractC3628e.metrica(4, bArr5);
                boolean loadAd = AbstractC12442e.loadAd(bArr8, (byte[]) this.f11964e);
                int length = bArr2.length;
                if (metrica <= length - 8) {
                    loadAd = false;
                }
                if (metrica > length) {
                    loadAd = false;
                }
                int i15 = length - metrica;
                if (i15 >= 8 || i15 < 0) {
                    loadAd = false;
                } else {
                    i14 = i15;
                }
                byte[] bArr9 = new byte[i14];
                System.arraycopy(bArr2, bArr2.length - i14, bArr9, 0, i14);
                if (!AbstractC12442e.loadAd(bArr9, new byte[i14])) {
                    loadAd = false;
                }
                if (!loadAd) {
                    throw new Exception("checksum failed");
                }
                byte[] bArr10 = new byte[metrica];
                System.arraycopy(bArr2, 0, bArr10, 0, metrica);
                return bArr10;
            default:
                C8011e c8011e = (C8011e) this.f11962e;
                if (this.f11963e) {
                    throw new IllegalStateException("not set for unwrapping");
                }
                int isPro2 = c8011e.f16252e.isPro();
                if (i < isPro2 * 2) {
                    throw new Exception("input too short");
                }
                byte[] bArr11 = new byte[i];
                byte[] bArr12 = new byte[isPro2];
                System.arraycopy(bArr, 0, bArr11, 0, i);
                System.arraycopy(bArr, 0, bArr12, 0, isPro2);
                c8011e.init(false, new C11494e(((C11494e) this.f11964e).f23094e, bArr12, 0, isPro2));
                for (int i16 = isPro2; i16 < i; i16 += isPro2) {
                    c8011e.tapsense(i16, i16, bArr11, bArr11);
                }
                System.arraycopy(bArr11, i - isPro2, bArr12, 0, isPro2);
                c8011e.init(false, new C11494e(((C11494e) this.f11964e).f23094e, bArr12, 0, isPro2));
                c8011e.tapsense(0, 0, bArr11, bArr11);
                c8011e.init(false, (C11494e) this.f11964e);
                for (int i17 = 0; i17 < i; i17 += isPro2) {
                    c8011e.tapsense(i17, i17, bArr11, bArr11);
                }
                int i18 = bArr11[0] & 255;
                int i19 = i - 4;
                boolean z = i18 > i19;
                byte[] bArr13 = z ? new byte[i19] : new byte[i18];
                System.arraycopy(bArr11, 4, bArr13, 0, bArr13.length);
                int i20 = 0;
                int i21 = 0;
                while (i20 != 3) {
                    int i22 = i20 + 1;
                    i21 |= bArr11[i20 + 4] ^ ((byte) (~bArr11[i22]));
                    i20 = i22;
                }
                Arrays.fill(bArr11, (byte) 0);
                if (!(i21 != 0) && !z) {
                    return bArr13;
                }
                throw new Exception("wrapped key corrupted");
        }
    }

    @Override // defpackage.InterfaceC9307e
    /* renamed from: eؘؕۥ */
    public void mo268e(Exception exc) {
        int i;
        synchronized (((C18381e) this.f11961e)) {
            try {
                if ((exc instanceof C10427e) && ((i = ((C10427e) exc).f20605e.f733e) == 8001 || i == 8002)) {
                    if (this.f11963e) {
                        ((C18381e) this.f11961e).vip.remove((C9364e) this.f11964e);
                    }
                }
                ((C18381e) this.f11961e).license((C8130e) this.f11962e, (C9364e) this.f11964e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC17128e
    public String getAlgorithmName() {
        switch (this.f11965e) {
            case 0:
                return ((InterfaceC2227e) this.f11962e).getAlgorithmName();
            default:
                return ((C8011e) this.f11962e).f16252e.getAlgorithmName() + "/RFC3211Wrap";
        }
    }

    @Override // defpackage.InterfaceC17128e
    public void init(boolean z, InterfaceC3894e interfaceC3894e) {
        switch (this.f11965e) {
            case 0:
                byte[] bArr = (byte[]) this.f11964e;
                this.f11963e = z;
                if (interfaceC3894e instanceof C12219e) {
                    interfaceC3894e = ((C12219e) interfaceC3894e).f24537e;
                }
                if (interfaceC3894e instanceof C14915e) {
                    this.f11961e = (C14915e) interfaceC3894e;
                    System.arraycopy(f11960e, 0, bArr, 0, 4);
                    return;
                } else {
                    if (interfaceC3894e instanceof C11494e) {
                        C11494e c11494e = (C11494e) interfaceC3894e;
                        byte[] bArr2 = c11494e.f23095e;
                        if (bArr2.length != 4) {
                            throw new IllegalArgumentException("IV length not equal to 4");
                        }
                        this.f11961e = (C14915e) c11494e.f23094e;
                        System.arraycopy(bArr2, 0, bArr, 0, 4);
                        return;
                    }
                    return;
                }
            case 3:
                this.f11963e = z;
                if (interfaceC3894e instanceof C12219e) {
                    interfaceC3894e = ((C12219e) interfaceC3894e).f24537e;
                }
                if (z) {
                    this.f11964e = (C1694e) interfaceC3894e;
                    this.f11961e = null;
                } else {
                    this.f11964e = null;
                    this.f11961e = (C5249e) interfaceC3894e;
                }
                if (interfaceC3894e instanceof EnumC0300e) {
                    throw new IllegalArgumentException("params should not be CryptoServicePurpose");
                }
                AbstractC9915e.ad();
                ((C15236e) this.f11962e).reset();
                return;
            default:
                this.f11963e = z;
                if (!(interfaceC3894e instanceof C12219e)) {
                    if (z) {
                        this.f11961e = AbstractC9915e.vip();
                    }
                    if (!(interfaceC3894e instanceof C11494e)) {
                        throw new IllegalArgumentException("RFC3211Wrap requires an IV");
                    }
                    this.f11964e = (C11494e) interfaceC3894e;
                    return;
                }
                C12219e c12219e = (C12219e) interfaceC3894e;
                this.f11961e = c12219e.f24538e;
                InterfaceC3894e interfaceC3894e2 = c12219e.f24537e;
                if (!(interfaceC3894e2 instanceof C11494e)) {
                    throw new IllegalArgumentException("RFC3211Wrap requires an IV");
                }
                this.f11964e = (C11494e) interfaceC3894e2;
                return;
        }
    }

    public void inmobi() {
        synchronized (this.f11962e) {
            try {
                if (((ArrayDeque) this.f11964e).isEmpty()) {
                    this.f11963e = false;
                    return;
                }
                C13890e c13890e = (C13890e) ((ArrayDeque) this.f11964e).remove();
                isPro(c13890e.vip, c13890e.ad);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void isPro(Runnable runnable, Executor executor) {
        try {
            executor.execute(new RunnableC12554e(this, runnable, 26));
        } catch (RejectedExecutionException unused) {
            inmobi();
        }
    }

    public void isVip(String str) {
        SharedPreferences.Editor edit = ((C1195e) this.f11961e).m490e().edit();
        edit.putString((String) this.f11962e, str);
        edit.apply();
        this.f11964e = str;
    }

    @Override // defpackage.InterfaceC17128e
    public byte[] license(int i, byte[] bArr) {
        switch (this.f11965e) {
            case 0:
                InterfaceC2227e interfaceC2227e = (InterfaceC2227e) this.f11962e;
                if (!this.f11963e) {
                    throw new IllegalStateException("not set for wrapping");
                }
                byte[] bArr2 = new byte[8];
                System.arraycopy((byte[]) this.f11964e, 0, bArr2, 0, 4);
                AbstractC3628e.billing(i, 4, bArr2);
                byte[] bArr3 = new byte[i];
                System.arraycopy(bArr, 0, bArr3, 0, i);
                int i2 = (8 - (i % 8)) % 8;
                int i3 = i + i2;
                byte[] bArr4 = new byte[i3];
                System.arraycopy(bArr3, 0, bArr4, 0, i);
                if (i2 != 0) {
                    System.arraycopy(new byte[i2], 0, bArr4, i, i2);
                }
                if (i3 != 8) {
                    C6613e c6613e = new C6613e(interfaceC2227e);
                    c6613e.init(true, new C11494e((C14915e) this.f11961e, bArr2, 0, 8));
                    return c6613e.license(i3, bArr4);
                }
                int i4 = i3 + 8;
                byte[] bArr5 = new byte[i4];
                System.arraycopy(bArr2, 0, bArr5, 0, 8);
                System.arraycopy(bArr4, 0, bArr5, 8, i3);
                interfaceC2227e.init(true, (C14915e) this.f11961e);
                int isPro = interfaceC2227e.isPro();
                for (int i5 = 0; i5 < i4; i5 += isPro) {
                    interfaceC2227e.tapsense(i5, i5, bArr5, bArr5);
                }
                return bArr5;
            default:
                C8011e c8011e = (C8011e) this.f11962e;
                if (!this.f11963e) {
                    throw new IllegalStateException("not set for wrapping");
                }
                if (i > 255 || i < 0) {
                    throw new IllegalArgumentException("input must be from 0 to 255 bytes");
                }
                c8011e.init(true, (C11494e) this.f11964e);
                int isPro2 = c8011e.f16252e.isPro();
                int i6 = i + 4;
                int i7 = isPro2 * 2;
                if (i6 >= i7) {
                    i7 = i6 % isPro2 == 0 ? i6 : ((i6 / isPro2) + 1) * isPro2;
                }
                byte[] bArr6 = new byte[i7];
                bArr6[0] = (byte) i;
                System.arraycopy(bArr, 0, bArr6, 4, i);
                int length = bArr6.length - i6;
                byte[] bArr7 = new byte[length];
                ((SecureRandom) this.f11961e).nextBytes(bArr7);
                System.arraycopy(bArr7, 0, bArr6, i6, length);
                bArr6[1] = (byte) (~bArr6[4]);
                bArr6[2] = (byte) (~bArr6[5]);
                bArr6[3] = (byte) (~bArr6[6]);
                for (int i8 = 0; i8 < bArr6.length; i8 += isPro2) {
                    c8011e.tapsense(i8, i8, bArr6, bArr6);
                }
                for (int i9 = 0; i9 < bArr6.length; i9 += isPro2) {
                    c8011e.tapsense(i9, i9, bArr6, bArr6);
                }
                return bArr6;
        }
    }

    public Boolean loadAd() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        C14679e c14679e = ((FirebaseMessaging) this.f11961e).ad;
        c14679e.ad();
        Context context = c14679e.ad;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public void metrica(boolean z) {
        C8839e c8839e = (C8839e) this.f11961e;
        synchronized (c8839e.f17753e) {
            try {
                if (this.f11963e) {
                    throw new IllegalStateException("editor is closed");
                }
                if (AbstractC7890e.billing(((C4016e) this.f11962e).billing, this)) {
                    C8839e.ad(c8839e, this, z);
                }
                this.f11963e = true;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC5483e
    public void mopub() {
        SparseArray sparseArray = (SparseArray) this.f11961e;
        ((InterfaceC5483e) this.f11962e).mopub();
        if (this.f11963e) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((C12727e) sparseArray.valueAt(i)).startapp = true;
            }
        }
    }

    @Override // defpackage.InterfaceC5483e
    public void pro(InterfaceC6347e interfaceC6347e) {
        ((InterfaceC5483e) this.f11962e).pro(interfaceC6347e);
    }

    public C2414e purchase(C18053e c18053e) {
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), c18053e.ad, "\"}".getBytes(charset)};
        long j = 0;
        for (int i = 0; i < 3; i++) {
            j += bArr[i].length;
        }
        int i2 = (int) j;
        AbstractC2301e.appmetrica(j, "the total number of elements (%s) in the arrays must fit in an int", j == ((long) i2));
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            byte[] bArr3 = bArr[i4];
            System.arraycopy(bArr3, 0, bArr2, i3, bArr3.length);
            i3 += bArr3.length;
        }
        InterfaceC9660e remoteconfig = ((C10629e) this.f11962e).remoteconfig();
        String str = c18053e.vip;
        String c0793e = C0793e.startapp.toString();
        String valueOf = String.valueOf(i2);
        AbstractC17595e.vip("Content-Type", c0793e);
        AbstractC17595e.vip("Content-Length", valueOf);
        return AbstractC2413e.metrica(remoteconfig, str, bArr2, C0409e.yandex(2, new Object[]{"Content-Type", c0793e, "Content-Length", valueOf}, null));
    }

    public void remoteconfig(Runnable runnable, Executor executor) {
        synchronized (this.f11962e) {
            try {
                if (this.f11963e) {
                    ((ArrayDeque) this.f11964e).add(new C13890e(runnable, executor));
                } else {
                    this.f11963e = true;
                    isPro(runnable, executor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        r1 = (java.util.Map) r4.f11961e;
        r2 = java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        if (r1.isEmpty() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r1 = java.util.Collections.singletonMap(r5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        r4.f11961e = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
    
        r3 = new java.util.LinkedHashMap(r1);
        r3.put(r5, r2);
        r1 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.C18070e signatures(kotlin.jvm.functions.Function1 r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f11962e
            eِۛۖ r0 = (defpackage.C11993e) r0
            monitor-enter(r0)
            java.lang.Object r1 = r4.f11961e     // Catch: java.lang.Throwable -> L80
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L80
            boolean r1 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L11
            monitor-exit(r0)
            goto L6d
        L11:
            java.lang.Object r1 = r4.f11961e     // Catch: java.lang.Throwable -> L80
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L80
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L80
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L22
            java.util.Map r1 = java.util.Collections.singletonMap(r5, r2)     // Catch: java.lang.Throwable -> L80
            goto L2b
        L22:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L80
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L80
            r3.put(r5, r2)     // Catch: java.lang.Throwable -> L80
            r1 = r3
        L2b:
            r4.f11961e = r1     // Catch: java.lang.Throwable -> L80
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L80
            monitor-exit(r0)
        L30:
            java.lang.Object r0 = r4.f11962e
            eِۛۖ r0 = (defpackage.C11993e) r0
            monitor-enter(r0)
            java.lang.Object r1 = r4.f11964e     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r0)
            r5.invoke(r1)
            java.lang.Object r0 = r4.f11962e
            eِۛۖ r0 = (defpackage.C11993e) r0
            monitor-enter(r0)
            java.lang.Object r2 = r4.f11961e     // Catch: java.lang.Throwable -> L75
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L75
            boolean r2 = r2.containsKey(r5)     // Catch: java.lang.Throwable -> L75
            if (r2 != 0) goto L4c
            monitor-exit(r0)
            goto L6d
        L4c:
            java.lang.Object r2 = r4.f11964e     // Catch: java.lang.Throwable -> L75
            if (r1 != r2) goto L77
            java.lang.Object r1 = r4.f11961e     // Catch: java.lang.Throwable -> L75
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L75
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L75
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r3 == 0) goto L61
            java.util.Map r1 = java.util.Collections.singletonMap(r5, r2)     // Catch: java.lang.Throwable -> L75
            goto L6a
        L61:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L75
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L75
            r3.put(r5, r2)     // Catch: java.lang.Throwable -> L75
            r1 = r3
        L6a:
            r4.f11961e = r1     // Catch: java.lang.Throwable -> L75
            monitor-exit(r0)
        L6d:
            e٘ۡۢ r0 = new e٘ۡۢ
            r1 = 14
            r0.<init>(r4, r5, r1)
            return r0
        L75:
            r5 = move-exception
            goto L7b
        L77:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L75
            monitor-exit(r0)
            goto L30
        L7b:
            monitor-exit(r0)
            throw r5
        L7d:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L80:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5609e.signatures(kotlin.jvm.functions.Function1):e٘ۡۢ");
    }

    public synchronized boolean smaato() {
        Boolean bool;
        try {
            advert();
            bool = (Boolean) this.f11964e;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.f11961e).ad.yandex();
    }

    public Object startapp() {
        Object obj;
        synchronized (((C11993e) this.f11962e)) {
            obj = this.f11964e;
        }
        return obj;
    }

    public void subscription(Object obj) {
        synchronized (((C11993e) this.f11962e)) {
            this.f11964e = obj;
            if (this.f11963e) {
                return;
            }
            this.f11963e = true;
            Unit unit = Unit.INSTANCE;
            ad(this);
        }
    }

    public String tapsense() {
        if (!this.f11963e) {
            this.f11963e = true;
            C1195e c1195e = (C1195e) this.f11961e;
            this.f11964e = c1195e.m490e().getString((String) this.f11962e, null);
        }
        return (String) this.f11964e;
    }

    @Override // defpackage.InterfaceC6045e
    public void update(byte b) {
        ((C15236e) this.f11962e).write(b);
    }

    @Override // defpackage.InterfaceC6045e
    public void update(byte[] bArr, int i, int i2) {
        ((C15236e) this.f11962e).write(bArr, i, i2);
    }

    @Override // defpackage.InterfaceC6045e
    public boolean vip(byte[] bArr) {
        C5249e c5249e;
        if (this.f11963e || (c5249e = (C5249e) this.f11961e) == null) {
            throw new IllegalStateException("Ed25519Signer not initialised for verification");
        }
        return ((C15236e) this.f11962e).isVip(c5249e, bArr);
    }

    public C10675e yandex(int i) {
        C10675e c10675e;
        C8839e c8839e = (C8839e) this.f11961e;
        synchronized (c8839e.f17753e) {
            if (this.f11963e) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f11964e)[i] = true;
            Object obj = ((C4016e) this.f11962e).license.get(i);
            AbstractC12110e.ad(c8839e.f17750e, (C10675e) obj);
            c10675e = (C10675e) obj;
        }
        return c10675e;
    }
}
