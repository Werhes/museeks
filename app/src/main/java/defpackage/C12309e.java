package defpackage;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.car.app.navigation.model.Maneuver;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘّۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C12309e implements InterfaceC8668e, InterfaceC3696e, InterfaceC2295e, InterfaceC14309e, InterfaceC15558e, InterfaceC16256e, InterfaceC18191e, InterfaceC17556e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C12309e f24692e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f24693e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f24694e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f24695e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24696e;

    static {
        Object obj = null;
        f24692e = new C12309e(true, obj, obj, 0);
    }

    public C12309e(int i) {
        this.f24696e = i;
        switch (i) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                this.f24693e = new Object();
                return;
            default:
                this.f24693e = new ArrayList();
                this.f24695e = new HashMap();
                this.f24694e = false;
                return;
        }
    }

    public /* synthetic */ C12309e(int i, boolean z) {
        this.f24696e = i;
    }

    public C12309e(PointF pointF, C1326e c1326e) {
        this.f24696e = 4;
        this.f24694e = false;
        this.f24695e = new Object();
        this.f24693e = c1326e;
    }

    public C12309e(ImageReader imageReader) {
        this.f24696e = 1;
        this.f24695e = new Object();
        this.f24694e = true;
        this.f24693e = imageReader;
    }

    public C12309e(InterfaceC2531e interfaceC2531e) {
        this.f24696e = 7;
        this.f24693e = interfaceC2531e;
        int[] iArr = (int[]) ((C9000e) interfaceC2531e).metrica(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        this.f24694e = iArr != null ? AbstractC1660e.startapp(iArr, 18) : false;
        this.f24695e = AbstractC14380e.appmetrica(interfaceC2531e);
    }

    public C12309e(C6584e c6584e, C18424e c18424e, boolean z, C5298e c5298e) {
        this.f24696e = 13;
        this.f24695e = c6584e;
        this.f24693e = c18424e;
        this.f24694e = z;
    }

    public C12309e(C12237e c12237e, C12237e c12237e2) {
        this.f24696e = 2;
        this.f24693e = c12237e;
        this.f24695e = c12237e2;
        this.f24694e = true;
    }

    public C12309e(C15860e c15860e) {
        this.f24696e = 14;
        this.f24695e = c15860e;
        this.f24694e = true;
    }

    public C12309e(C17907e c17907e, C17877e c17877e) {
        this.f24696e = 11;
        this.f24693e = c17907e;
        this.f24695e = c17877e;
        this.f24694e = c17907e.metrica || c17877e.invoke(AbstractC3674e.ad) == EnumC10949e.f21680e;
    }

    public /* synthetic */ C12309e(Object obj, Object obj2, int i) {
        this.f24696e = i;
        this.f24693e = obj;
        this.f24695e = obj2;
    }

    public /* synthetic */ C12309e(Object obj, Object obj2, boolean z, int i) {
        this.f24696e = i;
        this.f24695e = obj;
        this.f24693e = obj2;
        this.f24694e = z;
    }

    public C12309e(String str, C8167e c8167e, int i) {
        this.f24696e = 16;
        boolean z = (i & 4) == 0;
        this.f24693e = str;
        this.f24695e = c8167e;
        this.f24694e = z;
    }

    public /* synthetic */ C12309e(boolean z, Object obj, Object obj2, int i) {
        this.f24696e = i;
        this.f24694e = z;
        this.f24693e = obj;
        this.f24695e = obj2;
    }

    public static boolean Signature(C14677e c14677e, C14677e c14677e2) {
        boolean vip = c14677e2.vip();
        int i = c14677e2.ad;
        if (!vip) {
            throw new IllegalStateException(("Fully specified range " + c14677e2 + " not actually fully specified.").toString());
        }
        int i2 = c14677e.ad;
        if (i2 == 2 && i == 1) {
            return false;
        }
        if (i2 != 2 && i2 != 0 && i2 != i) {
            return false;
        }
        int i3 = c14677e.vip;
        return i3 == 0 || i3 == c14677e2.vip;
    }

    public static boolean admob(C14677e c14677e, C14677e c14677e2, Set set) {
        if (set.contains(c14677e2)) {
            return Signature(c14677e, c14677e2);
        }
        if (!AbstractC9464e.smaato("CXCP")) {
            return false;
        }
        Log.d("CXCP", "DynamicRangeResolver: Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + c14677e + "\nCandidate dynamic range:\n  " + c14677e2);
        return false;
    }

    public static void ads(Set set, C14677e c14677e, C2691e c2691e) {
        Set set2 = set;
        AbstractC4265e.yandex("Cannot update already-empty constraints.", !set2.isEmpty());
        Set metrica = ((InterfaceC2489e) c2691e.f6570e).metrica(c14677e);
        Set set3 = metrica;
        if (set3.isEmpty()) {
            return;
        }
        Set m3582e = AbstractC13480e.m3582e(set);
        set.retainAll(set3);
        if (set2.isEmpty()) {
            throw new IllegalArgumentException(("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + c14677e + "\nConstraints:\n  " + metrica + "\nExisting constraints:\n  " + m3582e).toString());
        }
    }

    /* renamed from: class, reason: not valid java name */
    public static C12309e m3336class(String str) {
        return new C12309e(false, (Object) str, (Object) null, 0);
    }

    /* renamed from: interface, reason: not valid java name */
    public static C12309e m3337interface(String str, Exception exc) {
        return new C12309e(false, (Object) str, (Object) exc, 0);
    }

    public static C14677e signatures(C14677e c14677e, LinkedHashSet linkedHashSet, Set set) {
        if (c14677e.ad == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            C14677e c14677e2 = (C14677e) it.next();
            int i = c14677e2.ad;
            if (!c14677e2.vip()) {
                throw new IllegalStateException("Fully specified DynamicRange must have fully defined encoding.");
            }
            if (i != 1 && admob(c14677e, c14677e2, set)) {
                return c14677e2;
            }
        }
        return null;
    }

    private final void subscription() {
        synchronized (this.f24695e) {
            ((ImageReader) this.f24693e).close();
        }
    }

    @Override // defpackage.InterfaceC18191e
    public boolean ad(long j) {
        C7911e c7911e;
        C15860e c15860e = (C15860e) this.f24695e;
        if (!c15860e.mopub() || c15860e.amazon().ad.f20850e.length() == 0 || (c7911e = c15860e.license) == null || c7911e.license() == null) {
            return false;
        }
        premium(c15860e.amazon(), j, false, C5107e.f10953e);
        return true;
    }

    @Override // defpackage.InterfaceC18191e
    public void adcel() {
        if (this.f24694e) {
            C15860e.vip((C15860e) this.f24695e, (C12347e) this.f24693e);
        }
    }

    @Override // defpackage.InterfaceC18191e
    public boolean advert(long j, C16658e c16658e, int i) {
        C7911e c7911e;
        C15860e c15860e = (C15860e) this.f24695e;
        if (!c15860e.mopub() || c15860e.amazon().ad.f20850e.length() == 0 || (c7911e = c15860e.license) == null || c7911e.license() == null) {
            return false;
        }
        C6260e c6260e = c15860e.mopub;
        if (c6260e != null) {
            C6260e.vip(c6260e);
        }
        c15860e.amazon = j;
        c15860e.remoteconfig = -1;
        c15860e.yandex(true);
        long premium = premium(c15860e.amazon(), c15860e.amazon, true, c16658e);
        if (i >= 2) {
            this.f24694e = true;
            this.f24693e = new C12347e(premium);
        }
        return true;
    }

    @Override // defpackage.InterfaceC18191e
    public boolean amazon(long j) {
        C15860e c15860e = (C15860e) this.f24695e;
        C7911e c7911e = c15860e.license;
        if (c7911e == null || c7911e.license() == null || !c15860e.mopub()) {
            return false;
        }
        c15860e.remoteconfig = -1;
        C6260e c6260e = c15860e.mopub;
        if (c6260e != null) {
            C6260e.vip(c6260e);
        }
        premium(c15860e.amazon(), j, false, C5107e.f10953e);
        return true;
    }

    public void applovin(InterfaceC8614e interfaceC8614e, Object obj) {
        ((SharedPreferences) this.f24695e).edit().putBoolean((String) this.f24693e, ((Boolean) obj).booleanValue()).apply();
    }

    @Override // defpackage.InterfaceC8668e
    public int appmetrica() {
        int imageFormat;
        synchronized (this.f24695e) {
            imageFormat = ((ImageReader) this.f24693e).getImageFormat();
        }
        return imageFormat;
    }

    @Override // defpackage.InterfaceC8668e
    public void billing() {
        synchronized (this.f24695e) {
            this.f24694e = true;
            ((ImageReader) this.f24693e).setOnImageAvailableListener(null, null);
        }
    }

    @Override // defpackage.InterfaceC8668e
    public void close() {
        switch (this.f24696e) {
            case 1:
                subscription();
                return;
            default:
                synchronized (this.f24695e) {
                    this.f24694e = true;
                }
                return;
        }
    }

    public void crashlytics(InterfaceC1381e interfaceC1381e) {
        synchronized (this.f24693e) {
            try {
                if (((ArrayDeque) this.f24695e) == null) {
                    this.f24695e = new ArrayDeque();
                }
                ((ArrayDeque) this.f24695e).add(interfaceC1381e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void firebase(C0560e c0560e) {
        InterfaceC1381e interfaceC1381e;
        Object obj = this.f24693e;
        synchronized (obj) {
            if (((ArrayDeque) this.f24695e) != null && !this.f24694e) {
                this.f24694e = true;
                while (true) {
                    synchronized (obj) {
                        try {
                            interfaceC1381e = (InterfaceC1381e) ((ArrayDeque) this.f24695e).poll();
                            if (interfaceC1381e == null) {
                                this.f24694e = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    interfaceC1381e.ad(c0560e);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC16256e
    public BigInteger getOrder() {
        return ((AbstractC3903e) this.f24693e).f8719e.f32974e;
    }

    @Override // defpackage.InterfaceC8668e
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f24695e) {
            surface = ((ImageReader) this.f24693e).getSurface();
        }
        return surface;
    }

    @Override // defpackage.InterfaceC8668e
    public int getWidth() {
        int width;
        synchronized (this.f24695e) {
            width = ((ImageReader) this.f24693e).getWidth();
        }
        return width;
    }

    @Override // defpackage.InterfaceC16256e
    public void init(boolean z, InterfaceC3894e interfaceC3894e) {
        this.f24694e = z;
        SecureRandom secureRandom = null;
        if (z) {
            if (interfaceC3894e instanceof C12219e) {
                C12219e c12219e = (C12219e) interfaceC3894e;
                secureRandom = c12219e.f24538e;
                interfaceC3894e = c12219e.f24537e;
            }
            this.f24693e = (C6988e) interfaceC3894e;
            if (secureRandom == null) {
                secureRandom = AbstractC9915e.vip();
            } else {
                ThreadLocal threadLocal = AbstractC9915e.ad;
            }
        } else {
            this.f24693e = (C2964e) interfaceC3894e;
        }
        this.f24695e = secureRandom;
        AbstractC7711e.vip("ECNR", (AbstractC3903e) this.f24693e, z);
        AbstractC9915e.ad();
    }

    @Override // defpackage.InterfaceC8668e
    public InterfaceC12385e inmobi() {
        Image image;
        synchronized (this.f24695e) {
            try {
                image = ((ImageReader) this.f24693e).acquireNextImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new C4507e(image);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x024a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.LinkedHashMap isPro(java.util.ArrayList r18, java.util.List r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12309e.isPro(java.util.ArrayList, java.util.List, java.util.List):java.util.LinkedHashMap");
    }

    @Override // defpackage.InterfaceC8668e
    public int isVip() {
        int maxImages;
        synchronized (this.f24695e) {
            maxImages = ((ImageReader) this.f24693e).getMaxImages();
        }
        return maxImages;
    }

    @Override // defpackage.InterfaceC2295e
    public void license(Object obj) {
        int i;
        switch (this.f24696e) {
            case 4:
                C8915e c8915e = (C8915e) obj;
                synchronized (this.f24695e) {
                    try {
                        if (this.f24694e) {
                            return;
                        }
                        if (c8915e == null) {
                            return;
                        }
                        AbstractC9464e.yandex("CameraController", "Tap-to-focus onSuccess: " + c8915e.ad);
                        ((C1326e) this.f24693e).adcel(new C16360e(c8915e.ad ? 2 : 3));
                        return;
                    } finally {
                    }
                }
            case 5:
                Bitmap bitmap = (Bitmap) obj;
                C11389e c11389e = (C11389e) this.f24693e;
                if (this.f24694e) {
                    return;
                }
                c11389e.purchase(bitmap);
                C17825e c17825e = (C17825e) this.f24695e;
                C15816e c15816e = new C15816e(c11389e.vip());
                C11165e c11165e = (C11165e) c17825e.f34932e;
                c11165e.f22408e.execute(new RunnableC1459e(c17825e.f34933e, 2, c11165e, (C4748e) c17825e.f34931e, c15816e));
                return;
            case 13:
                C6584e c6584e = (C6584e) this.f24695e;
                C18424e c18424e = (C18424e) this.f24693e;
                boolean z = this.f24694e;
                AbstractC1008e.purchase(c6584e.pro, (C9035e) obj);
                AbstractC9413e.m2551extends(c6584e.pro);
                if (z) {
                    c6584e.ads(c18424e);
                    return;
                }
                return;
            default:
                C9689e c9689e = (C9689e) this.f24693e;
                C16864e c16864e = (C16864e) this.f24695e;
                if (c9689e != c16864e.isVip || (i = c16864e.isPro) == 3) {
                    return;
                }
                int i2 = this.f24694e ? 1 : 2;
                if (i2 != i) {
                    c16864e.isPro = i2;
                    c16864e.m4192protected().license(i2);
                    return;
                }
                return;
        }
    }

    public boolean loadAd(long j) {
        Object obj;
        List list = (List) ((C11883e) this.f24695e).f23815e;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (AbstractC17751e.vip(((C13567e) obj).ad, j)) {
                break;
            }
            i++;
        }
        C13567e c13567e = (C13567e) obj;
        if (c13567e != null) {
            return c13567e.yandex;
        }
        return false;
    }

    @Override // defpackage.InterfaceC8668e
    public InterfaceC12385e metrica() {
        Image image;
        synchronized (this.f24695e) {
            try {
                image = ((ImageReader) this.f24693e).acquireLatestImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new C4507e(image);
        }
    }

    @Override // defpackage.InterfaceC16256e
    public boolean mopub(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        if (this.f24694e) {
            throw new IllegalStateException("not initialised for verifying");
        }
        C2964e c2964e = (C2964e) ((AbstractC3903e) this.f24693e);
        C16833e c16833e = c2964e.f8719e;
        BigInteger bigInteger3 = c16833e.f32974e;
        int bitLength = bigInteger3.bitLength();
        BigInteger bigInteger4 = new BigInteger(1, bArr);
        if (bigInteger4.bitLength() > bitLength) {
            throw new RuntimeException("input too large for ECNR key.");
        }
        BigInteger bigInteger5 = c16833e.f32974e;
        BigInteger bigInteger6 = null;
        if (bigInteger.compareTo(InterfaceC4563e.Signature) >= 0 && bigInteger.compareTo(bigInteger5) < 0 && bigInteger2.compareTo(InterfaceC4563e.loadAd) >= 0 && bigInteger2.compareTo(bigInteger5) < 0) {
            AbstractC9932e Signature = AbstractC0853e.adcel(c16833e.f32972e, bigInteger2, c2964e.f7010e, bigInteger).Signature();
            if (!Signature.advert()) {
                Signature.vip();
                bigInteger6 = bigInteger.subtract(Signature.vip.firebase()).mod(bigInteger5);
            }
        }
        return bigInteger6 != null && bigInteger6.equals(bigInteger4.mod(bigInteger3));
    }

    public long premium(C0398e c0398e, long j, boolean z, C16658e c16658e) {
        C15860e c15860e = (C15860e) this.f24695e;
        long metrica = C15860e.metrica(c15860e, c0398e, j, z, false, c16658e, false, null);
        if (!C12347e.vip(metrica, (C12347e) this.f24693e)) {
            this.f24694e = false;
        }
        c15860e.admob(C12347e.license(metrica) ? EnumC13262e.f26308e : EnumC13262e.f26309e);
        return metrica;
    }

    @Override // defpackage.InterfaceC8668e
    public void pro(final InterfaceC14599e interfaceC14599e, final Executor executor) {
        synchronized (this.f24695e) {
            this.f24694e = false;
            ((ImageReader) this.f24693e).setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: eؔٗۨ
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    C12309e c12309e = C12309e.this;
                    Executor executor2 = executor;
                    InterfaceC14599e interfaceC14599e2 = interfaceC14599e;
                    synchronized (c12309e.f24695e) {
                        try {
                            if (!c12309e.f24694e) {
                                executor2.execute(new RunnableC16019e(c12309e, interfaceC14599e2, 3));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, AbstractC14533e.yandex());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC16256e
    public BigInteger[] purchase(byte[] bArr) {
        BigInteger metrica;
        C17424e c17424e;
        BigInteger mod;
        if (!this.f24694e) {
            throw new IllegalStateException("not initialised for signing");
        }
        BigInteger order = getOrder();
        BigInteger bigInteger = new BigInteger(1, bArr);
        C6988e c6988e = (C6988e) ((AbstractC3903e) this.f24693e);
        if (bigInteger.compareTo(order) >= 0) {
            throw new RuntimeException("input too large for ECNR key");
        }
        do {
            C16833e c16833e = c6988e.f8719e;
            SecureRandom secureRandom = (SecureRandom) this.f24695e;
            c16833e.f32974e.bitLength();
            if (secureRandom == null) {
                secureRandom = AbstractC9915e.vip();
            } else {
                ThreadLocal threadLocal = AbstractC9915e.ad;
            }
            AbstractC0259e.ad(c16833e.f32975e);
            ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
            BigInteger bigInteger2 = c16833e.f32974e;
            int bitLength = bigInteger2.bitLength();
            int i = bitLength >>> 2;
            while (true) {
                metrica = AbstractC5907e.metrica(bitLength, secureRandom);
                if (metrica.compareTo(InterfaceC4563e.Signature) >= 0 && metrica.compareTo(bigInteger2) < 0 && AbstractC0903e.appmetrica(metrica) >= i) {
                    break;
                }
            }
            c17424e = new C17424e(new C2964e(new C4630e(0).license(c16833e.f32972e, metrica), c16833e), new C6988e(metrica, c16833e), 0 == true ? 1 : 0, 5);
            AbstractC9932e abstractC9932e = ((C2964e) ((AbstractC9027e) c17424e.f34142e)).f7010e;
            abstractC9932e.vip();
            mod = abstractC9932e.vip.firebase().add(bigInteger).mod(order);
        } while (mod.equals(InterfaceC4563e.loadAd));
        return new BigInteger[]{mod, ((C6988e) ((AbstractC9027e) c17424e.f34141e)).f14315e.subtract(mod.multiply(c6988e.f14315e)).mod(order)};
    }

    @Override // defpackage.InterfaceC3696e
    /* renamed from: remoteconfig, reason: merged with bridge method [inline-methods] */
    public C10382e mo821package(C2532e c2532e) {
        MediaCodec mediaCodec;
        InterfaceC11483e c0986e;
        int i;
        C10382e c10382e;
        String str = ((C10643e) c2532e.f6388e).ad;
        C10382e c10382e2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                if (!this.f24694e || Build.VERSION.SDK_INT < 36) {
                    c0986e = new C0986e(mediaCodec, (HandlerThread) ((C12237e) this.f24695e).get());
                    i = 0;
                } else {
                    c0986e = new C13935e(mediaCodec);
                    i = 4;
                }
                c10382e = new C10382e(mediaCodec, (HandlerThread) ((C12237e) this.f24693e).get(), c0986e, (C2559e) c2532e.f6389e);
            } catch (Exception e) {
                e = e;
            }
            try {
                Trace.endSection();
                Surface surface = (Surface) c2532e.f6387e;
                if (surface == null && ((C10643e) c2532e.f6388e).yandex && Build.VERSION.SDK_INT >= 35) {
                    i |= 8;
                }
                C10382e.metrica(c10382e, (MediaFormat) c2532e.f6386e, surface, (MediaCrypto) c2532e.f6384e, i);
                return c10382e;
            } catch (Exception e2) {
                e = e2;
                c10382e2 = c10382e;
                if (c10382e2 != null) {
                    c10382e2.release();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodec = null;
        }
    }

    @Override // defpackage.InterfaceC18191e
    public boolean smaato(long j, C16658e c16658e) {
        C7911e c7911e;
        C15860e c15860e = (C15860e) this.f24695e;
        if (!c15860e.mopub() || c15860e.amazon().ad.f20850e.length() == 0 || (c7911e = c15860e.license) == null || c7911e.license() == null) {
            return false;
        }
        premium(c15860e.amazon(), j, false, c16658e);
        return true;
    }

    @Override // defpackage.InterfaceC15558e
    public boolean startapp(InterfaceC5021e interfaceC5021e, InterfaceC5021e interfaceC5021e2) {
        boolean z = this.f24694e;
        InterfaceC6647e interfaceC6647e = (InterfaceC6647e) this.f24693e;
        InterfaceC6647e interfaceC6647e2 = (InterfaceC6647e) this.f24695e;
        if (interfaceC5021e.equals(interfaceC5021e2)) {
            return true;
        }
        InterfaceC4077e advert = interfaceC5021e.advert();
        InterfaceC4077e advert2 = interfaceC5021e2.advert();
        if ((advert instanceof InterfaceC16046e) && (advert2 instanceof InterfaceC16046e)) {
            return C5438e.f11673e.loadAd((InterfaceC16046e) advert, (InterfaceC16046e) advert2, z, new C2077e(interfaceC6647e, interfaceC6647e2, 4));
        }
        return false;
    }

    public String subs() {
        return (String) this.f24693e;
    }

    public Object tapsense(Object obj) {
        return Boolean.valueOf(((SharedPreferences) this.f24695e).getBoolean((String) this.f24693e, this.f24694e));
    }

    public String toString() {
        switch (this.f24696e) {
            case 11:
                return "JavaTypeEnhancementState(jsr305=" + ((C17907e) this.f24693e) + ", getReportLevelForAnnotation=" + ((C17877e) this.f24695e) + ')';
            case 16:
                C8167e c8167e = (C8167e) this.f24695e;
                String str = (String) this.f24693e;
                if (this.f24694e) {
                    return "API." + str + "({" + c8167e + "});";
                }
                return "API." + str + "({" + c8167e + "})";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC8668e
    public int vip() {
        int height;
        synchronized (this.f24695e) {
            height = ((ImageReader) this.f24693e).getHeight();
        }
        return height;
    }

    @Override // defpackage.InterfaceC2295e
    public void yandex(Throwable th) {
        switch (this.f24696e) {
            case 4:
                synchronized (this.f24695e) {
                    try {
                        if (this.f24694e) {
                            return;
                        }
                        if (!(th instanceof C6193e)) {
                            AbstractC9464e.startapp("CameraController", "Tap-to-focus failed.", th);
                            ((C1326e) this.f24693e).adcel(new C16360e(4));
                            return;
                        } else {
                            AbstractC9464e.startapp("CameraController", "Tap-to-focus canceled", th);
                            ((C1326e) this.f24693e).adcel(new C16360e(0));
                            close();
                            return;
                        }
                    } finally {
                    }
                }
            case 5:
                if (this.f24694e) {
                    return;
                }
                AbstractC2803e.smaato("NotificationProvider", "Failed to load bitmap: " + th.getMessage());
                return;
            case 13:
                C6584e c6584e = (C6584e) this.f24695e;
                if (th instanceof UnsupportedOperationException) {
                    AbstractC2803e.amazon("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
                } else {
                    AbstractC2803e.billing("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
                }
                AbstractC9413e.m2551extends(c6584e.pro);
                if (this.f24694e) {
                    c6584e.ads((C18424e) this.f24693e);
                    return;
                }
                return;
            default:
                if (th instanceof CancellationException) {
                    return;
                }
                AbstractC9464e.mopub("VideoCapture", "Surface update completed with unexpected exception", th);
                return;
        }
    }
}
