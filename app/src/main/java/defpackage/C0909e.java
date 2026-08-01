package defpackage;

import android.content.ClipDescription;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0909e implements InterfaceC13464e, InterfaceC4629e, InterfaceC1620e, InterfaceC14746e, InterfaceC16256e, InterfaceC16970e, InterfaceC17357e, InterfaceC4716e, InterfaceC4876e, InterfaceC5283e, InterfaceC2295e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f3321e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f3322e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object f3323e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C11984e f3319e = new C11984e(0);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C6575e f3318e = new C6575e(4);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C11373e f3320e = new C11373e(3);

    public C0909e(int i) {
        int i2 = 10;
        switch (i) {
            case 6:
                this.f3323e = new C4662e(16);
                long[] jArr = AbstractC12981e.ad;
                this.f3322e = new C0583e();
                this.f3321e = new C14595e(i2);
                return;
            case 12:
                this.f3323e = new Object();
                return;
            case 15:
                this.f3323e = new int[10];
                this.f3322e = new int[10];
                this.f3321e = new int[10];
                return;
            default:
                this.f3323e = new HashMap();
                this.f3322e = new HashMap();
                this.f3321e = f3320e;
                return;
        }
    }

    public /* synthetic */ C0909e(Object obj) {
        this.f3323e = obj;
    }

    public /* synthetic */ C0909e(Object obj, Object obj2, Object obj3) {
        this.f3323e = obj;
        this.f3322e = obj2;
        this.f3321e = obj3;
    }

    public C0909e(Runnable runnable) {
        this.f3322e = new CopyOnWriteArrayList();
        this.f3321e = new HashMap();
        this.f3323e = runnable;
    }

    public C0909e(String str) {
        C11445e c11445e = new C11445e();
        c11445e.smaato = AbstractC8542e.amazon("video/mp2t");
        c11445e.amazon = AbstractC8542e.amazon(str);
        this.f3323e = new C16975e(c11445e);
    }

    public C0909e(String str, Function0 function0, Function1 function1) {
        InterfaceC13984e interfaceC13984e;
        this.f3323e = function0;
        this.f3322e = function1;
        C12232e c12232e = AbstractC3820e.ad;
        InterfaceC7227e vip = c12232e.vip(C9589e.class);
        try {
            C5538e c5538e = C5538e.metrica;
            InterfaceC12635e amazon = c12232e.amazon(c12232e.vip(C0909e.class));
            c12232e.advert(amazon, Collections.singletonList(AbstractC3820e.ad(Object.class)));
            interfaceC13984e = AbstractC3820e.vip(C9589e.class, AbstractC16704e.license(c12232e.smaato(amazon, Collections.EMPTY_LIST, false)));
        } catch (Throwable unused) {
            interfaceC13984e = null;
        }
        this.f3321e = new C8208e(str, new C12025e(vip, interfaceC13984e));
    }

    public C0909e(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f3322e = arrayDeque;
        this.f3323e = bufferedReader;
    }

    /* renamed from: extends, reason: not valid java name */
    public static void m415extends(C14461e c14461e, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            c14461e.yandex(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e);
        }
    }

    public static BigInteger inmobi(BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new BigInteger(1, bArr);
        }
        int bitLength = bigInteger.bitLength() / 8;
        byte[] bArr2 = new byte[bitLength];
        System.arraycopy(bArr, 0, bArr2, 0, bitLength);
        return new BigInteger(1, bArr2);
    }

    /* renamed from: throw, reason: not valid java name */
    public static void m416throw(C0909e c0909e, C10761e c10761e, C17214e c17214e, Object obj) {
        c0909e.getClass();
        c17214e.getClass();
        C14971e c14971e = new C14971e(c10761e);
        synchronized (((C14595e) c0909e.f3321e)) {
            try {
                if (obj == null) {
                    ((C0583e) c0909e.f3322e).amazon(c14971e, new C8772e(null));
                    Unit unit = Unit.INSTANCE;
                } else {
                    ((C4662e) c0909e.f3323e).metrica(c14971e, new C8772e(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC16970e
    public synchronized C10919e Signature() {
        C10919e Signature;
        Signature = ((C2734e) this.f3321e).metrica.Signature();
        ((HashMap) this.f3323e).put(Signature, (C5350e) this.f3322e);
        C16937e c16937e = (C16937e) ((C2734e) this.f3321e).admob.get((C5350e) this.f3322e);
        if (c16937e != null) {
            c16937e.ad();
        }
        return Signature;
    }

    /* renamed from: abstract, reason: not valid java name */
    public void m417abstract(int i) {
        if (i < 10 || 16 < i) {
            throw new GeneralSecurityException(AbstractC1786e.admob(i, "Invalid tag size for AesCmacParameters: "));
        }
        this.f3322e = Integer.valueOf(i);
    }

    @Override // defpackage.InterfaceC5283e
    public void ad(C1292e c1292e) {
        long license;
        ((C8010e) this.f3322e).getClass();
        String str = AbstractC9413e.ad;
        C8010e c8010e = (C8010e) this.f3322e;
        synchronized (c8010e) {
            try {
                long j = c8010e.metrica;
                license = j != -9223372036854775807L ? j + c8010e.vip : c8010e.license();
            } finally {
            }
        }
        long appmetrica = ((C8010e) this.f3322e).appmetrica();
        if (license == -9223372036854775807L || appmetrica == -9223372036854775807L) {
            return;
        }
        C16975e c16975e = (C16975e) this.f3323e;
        if (appmetrica != c16975e.pro) {
            C11445e ad = c16975e.ad();
            ad.remoteconfig = appmetrica;
            C16975e c16975e2 = new C16975e(ad);
            this.f3323e = c16975e2;
            ((InterfaceC18147e) this.f3321e).billing(c16975e2);
        }
        int ad2 = c1292e.ad();
        ((InterfaceC18147e) this.f3321e).appmetrica(ad2, c1292e);
        ((InterfaceC18147e) this.f3321e).ad(license, 1, ad2, 0, null);
    }

    @Override // defpackage.InterfaceC17357e
    public InterfaceC2537e adcel() {
        return (C4878e) this.f3322e;
    }

    @Override // defpackage.InterfaceC16970e
    public synchronized void admob() {
        ((C2734e) this.f3321e).metrica.admob();
    }

    public InterfaceC16989e ads(PublicKey publicKey) {
        String str = (String) this.f3322e;
        AbstractC0827e abstractC0827e = (AbstractC0827e) this.f3321e;
        if (!(publicKey instanceof ECPublicKey)) {
            throw new IllegalStateException("Check failed.");
        }
        String name = ((ECGenParameterSpec) abstractC0827e.ad(((ECPublicKey) publicKey).getParams()).getParameterSpec(ECGenParameterSpec.class)).getName();
        if (AbstractC7890e.billing(str, name)) {
            return abstractC0827e.vip(publicKey);
        }
        throw new IllegalStateException(AbstractC17861e.admob("Key curve ", name, " is not equal to expected curve ", str).toString());
    }

    @Override // defpackage.InterfaceC4876e
    public Uri advert() {
        return (Uri) this.f3323e;
    }

    @Override // defpackage.InterfaceC4876e
    public Uri amazon() {
        return (Uri) this.f3321e;
    }

    public void applovin() {
        C12894e c12894e = (C12894e) this.f3323e;
        if (c12894e != null) {
            int i = ((C14090e) this.f3321e).amazon.f22462e;
            C15944e c15944e = (C15944e) c12894e.f25751e;
            c15944e.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            c15944e.ad.setPlaybackToLocal(builder.build());
            this.f3322e = null;
        }
    }

    @Override // defpackage.InterfaceC16970e
    public synchronized void appmetrica(C18524e c18524e) {
        ((C2734e) this.f3321e).metrica.appmetrica(c18524e);
        while (c18524e != null) {
            C10919e c10919e = (C10919e) c18524e.f36317e;
            c10919e.getClass();
            m428while(c10919e);
            c18524e = (C18524e) c18524e.f36316e;
            if (c18524e == null || ((C10919e) c18524e.f36317e) == null) {
                c18524e = null;
            }
        }
    }

    @Override // defpackage.InterfaceC5283e
    public void billing(C8010e c8010e, InterfaceC5483e interfaceC5483e, C18316e c18316e) {
        this.f3322e = c8010e;
        c18316e.ad();
        c18316e.vip();
        InterfaceC18147e Signature = interfaceC5483e.Signature(c18316e.license, 5);
        this.f3321e = Signature;
        Signature.billing((C16975e) this.f3323e);
    }

    /* renamed from: break, reason: not valid java name */
    public void m418break(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.f3323e = Integer.valueOf(i);
    }

    @Override // defpackage.InterfaceC17357e
    public void cancel() {
        ((InterfaceC8246e) ((C6613e) this.f3321e).f13645e).cancel();
    }

    /* renamed from: class, reason: not valid java name */
    public ArrayList m419class() {
        ArrayList arrayList = ((C0408e) this.f3321e).ad;
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC10306e interfaceC10306e = (InterfaceC10306e) it.next();
            Object ad = interfaceC10306e.ad();
            arrayList2.add(ad != null ? new C1631e(interfaceC10306e.metrica(), ad, interfaceC10306e.getKey()) : new C14962e(interfaceC10306e.metrica(), interfaceC10306e.getKey()));
        }
        return arrayList2;
    }

    @Override // defpackage.InterfaceC14746e
    public void crashlytics(Bundle bundle) {
        synchronized (this.f3322e) {
            try {
                C5438e c5438e = C5438e.f11671e;
                c5438e.signatures("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f3321e = new CountDownLatch(1);
                ((C0444e) this.f3323e).crashlytics(bundle);
                c5438e.signatures("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f3321e).await(500, TimeUnit.MILLISECONDS)) {
                        c5438e.signatures("App exception callback received from Analytics listener.");
                    } else {
                        c5438e.isVip("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f3321e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: default, reason: not valid java name */
    public void mo420default() {
    }

    public InterfaceC16989e firebase(byte[] bArr) {
        ECPoint eCPoint;
        AbstractC0827e abstractC0827e = (AbstractC0827e) this.f3321e;
        if (bArr.length == 0) {
            throw new IllegalStateException("Encoded key is empty!");
        }
        ECParameterSpec eCParameterSpec = (ECParameterSpec) abstractC0827e.ad(new ECGenParameterSpec((String) this.f3322e)).getParameterSpec(ECParameterSpec.class);
        int fieldSize = (eCParameterSpec.getCurve().getField().getFieldSize() + 7) / 8;
        byte b = bArr[0];
        if (b == 2 || b == 3) {
            if (bArr.length != fieldSize + 1) {
                throw new IllegalStateException(("Wrong compressed key size " + bArr.length).toString());
            }
            BigInteger p = ((ECFieldFp) eCParameterSpec.getCurve().getField()).getP();
            BigInteger a = eCParameterSpec.getCurve().getA();
            BigInteger b2 = eCParameterSpec.getCurve().getB();
            BigInteger bigInteger = new BigInteger(1, AbstractC1660e.remoteconfig(1, bArr.length, bArr));
            BigInteger mod = bigInteger.multiply(bigInteger).add(a).multiply(bigInteger).add(b2).mod(p);
            if (!p.testBit(0) || !p.testBit(1)) {
                throw new IllegalStateException("Unsupported curve modulus");
            }
            BigInteger modPow = mod.modPow(p.add(BigInteger.ONE).shiftRight(2), p);
            if (modPow.testBit(0) != (bArr[0] == 3)) {
                modPow = p.subtract(modPow);
            }
            eCPoint = new ECPoint(bigInteger, modPow);
        } else {
            if (b != 4) {
                throw new IllegalStateException(("Unsupported key type " + ((int) bArr[0])).toString());
            }
            if (bArr.length != (fieldSize * 2) + 1) {
                throw new IllegalStateException(("Wrong uncompressed key size " + bArr.length).toString());
            }
            int i = fieldSize + 1;
            eCPoint = new ECPoint(new BigInteger(1, AbstractC1660e.remoteconfig(1, i, bArr)), new BigInteger(1, AbstractC1660e.remoteconfig(i, fieldSize + i, bArr)));
        }
        AbstractC10732e abstractC10732e = (AbstractC10732e) this.f3323e;
        Object ad = abstractC10732e.ad();
        try {
            PublicKey generatePublic = ((KeyFactory) ad).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
            abstractC10732e.vip(ad);
            return ads(generatePublic);
        } catch (Throwable th) {
            abstractC10732e.vip(ad);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC13464e
    public C8208e getKey() {
        return (C8208e) this.f3321e;
    }

    @Override // defpackage.InterfaceC16256e
    public BigInteger getOrder() {
        return ((C6818e) ((AbstractC0821e) this.f3322e).f3209e).f14047e;
    }

    /* renamed from: goto, reason: not valid java name */
    public boolean m421goto() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f3322e;
        if (((String) this.f3321e) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f3321e = str;
                return true;
            }
            do {
                String readLine = ((BufferedReader) this.f3323e).readLine();
                this.f3321e = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f3321e = trim;
            } while (trim.isEmpty());
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v7, types: [eَٗؕ] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [eًٍؐ] */
    /* renamed from: implements, reason: not valid java name */
    public void m422implements(List list) {
        C6571e c6571e;
        C6571e c6571e2;
        EnumC10668e enumC10668e = EnumC10668e.f21011e;
        EnumC10668e enumC10668e2 = EnumC10668e.f21008e;
        LinkedHashMap metrica = AbstractC16275e.metrica(list, C1014e.f3464e);
        C3266e c3266e = C3266e.metrica;
        C3266e.metrica.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((C12432e) it.next()).ad);
        }
        if (hashSet.size() != list.size()) {
            StringBuilder sb = new StringBuilder("Configurations must be unique: ");
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C12432e) it2.next()).ad);
            }
            sb.append(arrayList);
            sb.append('.');
            throw new IllegalStateException(sb.toString().toString());
        }
        LinkedHashMap metrica2 = AbstractC16275e.metrica(((C0408e) this.f3321e).ad, C7059e.f14488e);
        ArrayList arrayList2 = new ArrayList(metrica.size());
        for (Map.Entry entry : metrica.entrySet()) {
            C11523e c11523e = (C11523e) entry.getKey();
            C12432e c12432e = (C12432e) entry.getValue();
            InterfaceC10306e interfaceC10306e = (InterfaceC10306e) metrica2.get(c11523e);
            if (interfaceC10306e instanceof C7826e) {
                c6571e = new C6571e(interfaceC10306e, c12432e.vip);
            } else if (interfaceC10306e instanceof C1531e) {
                int ordinal = c12432e.vip.ordinal();
                if (ordinal == 0) {
                    c6571e = new C6571e(interfaceC10306e, c12432e.vip);
                } else {
                    if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                        throw new C14803e(10);
                    }
                    C1531e c1531e = (C1531e) interfaceC10306e;
                    C7826e vip = AbstractC18127e.vip((C11106e) this.f3323e, c12432e.ad, c1531e.vip, c1531e.metrica, 8);
                    AbstractC14520e.metrica(vip.license);
                    c6571e2 = new C6571e(vip, c12432e.vip);
                    c6571e = c6571e2;
                }
            } else {
                if (interfaceC10306e != null) {
                    throw new C14803e(10);
                }
                int ordinal2 = c12432e.vip.ordinal();
                if (ordinal2 == 0) {
                    c6571e = new C6571e(new C1531e(c12432e.ad, AbstractC11263e.Signature().toString(), null), c12432e.vip);
                } else {
                    if (ordinal2 != 1 && ordinal2 != 2 && ordinal2 != 3) {
                        throw new C14803e(10);
                    }
                    C7826e vip2 = AbstractC18127e.vip((C11106e) this.f3323e, c12432e.ad, AbstractC11263e.Signature().toString(), null, 12);
                    AbstractC14520e.metrica(vip2.license);
                    c6571e2 = new C6571e(vip2, c12432e.vip);
                    c6571e = c6571e2;
                }
            }
            arrayList2.add(c6571e);
        }
        Set keySet = metrica.keySet();
        for (Map.Entry entry2 : metrica2.entrySet()) {
            C11523e c11523e2 = (C11523e) entry2.getKey();
            InterfaceC10306e interfaceC10306e2 = (InterfaceC10306e) entry2.getValue();
            C7826e c7826e = interfaceC10306e2 instanceof C7826e ? (C7826e) interfaceC10306e2 : null;
            if (c7826e != null && !keySet.contains(c11523e2)) {
                c7826e.billing.appmetrica();
                AbstractC14520e.license(c7826e.license);
                c7826e.purchase.billing();
            }
        }
        C0408e c0408e = (C0408e) this.f3321e;
        c0408e.ad.clear();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C6571e c6571e3 = (C6571e) it3.next();
            ?? r4 = (InterfaceC10306e) c6571e3.f13544e;
            EnumC10854e enumC10854e = (EnumC10854e) c6571e3.f13543e;
            ArrayList arrayList3 = c0408e.ad;
            if (r4 instanceof C7826e) {
                r4 = (C7826e) r4;
                C6156e c6156e = r4.billing;
                C11898e c11898e = r4.license;
                int ordinal3 = enumC10854e.ordinal();
                if (ordinal3 == 0) {
                    C8633e admob = r4.appmetrica.admob();
                    r4.billing.appmetrica();
                    AbstractC14520e.license(r4.license);
                    r4.purchase.billing();
                    r4 = new C1531e(r4.ad, r4.vip, admob);
                } else if (ordinal3 != 1) {
                    if (ordinal3 != 2) {
                        if (ordinal3 != 3) {
                            throw new C14803e(10);
                        }
                        if (((EnumC10668e) c11898e.f23835e) != enumC10668e2) {
                            c6156e.license();
                            AbstractC14520e.billing(c11898e);
                            if (((EnumC10668e) c11898e.f23835e) == enumC10668e) {
                                c11898e.vip();
                            }
                        }
                    } else if (((EnumC10668e) c11898e.f23835e).compareTo(enumC10668e) < 0) {
                        c6156e.license();
                        AbstractC14520e.billing(c11898e);
                    } else if (((EnumC10668e) c11898e.f23835e).compareTo(enumC10668e) > 0 && ((EnumC10668e) c11898e.f23835e) == enumC10668e2) {
                        c11898e.metrica();
                    }
                } else if (((EnumC10668e) c11898e.f23835e) != EnumC10668e.f21009e) {
                    c6156e.appmetrica();
                    if (((EnumC10668e) c11898e.f23835e) == enumC10668e2) {
                        c11898e.metrica();
                    }
                    if (((EnumC10668e) c11898e.f23835e) == enumC10668e) {
                        c11898e.ad();
                    }
                }
            } else if (!(r4 instanceof C1531e)) {
                throw new C14803e(10);
            }
            arrayList3.add(r4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    @Override // defpackage.InterfaceC16256e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(boolean r3, defpackage.InterfaceC3894e r4) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L17
            boolean r1 = r4 instanceof defpackage.C12219e
            if (r1 == 0) goto L12
            eّؓۖ r4 = (defpackage.C12219e) r4
            eٟؖؖ r1 = r4.f24537e
            eؕۘۧ r1 = (defpackage.C3592e) r1
            r2.f3322e = r1
            java.security.SecureRandom r4 = r4.f24538e
            goto L1b
        L12:
            eؕۘۧ r4 = (defpackage.C3592e) r4
        L14:
            r2.f3322e = r4
            goto L1a
        L17:
            eؘُٔ r4 = (defpackage.C5574e) r4
            goto L14
        L1a:
            r4 = r0
        L1b:
            java.lang.Object r1 = r2.f3322e
            eؒؔۙ r1 = (defpackage.AbstractC0821e) r1
            java.lang.Object r1 = r1.f3209e
            eؙۧۨ r1 = (defpackage.C6818e) r1
            java.math.BigInteger r1 = r1.f14046e
            defpackage.AbstractC0259e.vip(r1)
            java.util.concurrent.atomic.AtomicReference r1 = defpackage.AbstractC9915e.appmetrica
            java.lang.Object r1 = r1.get()
            eْٓۦ r1 = (defpackage.C13246e) r1
            r1.getClass()
            if (r3 == 0) goto L47
            java.lang.Object r3 = r2.f3323e
            eًۣ۟ r3 = (defpackage.InterfaceC8251e) r3
            boolean r3 = r3.amazon()
            if (r3 != 0) goto L47
            if (r4 != 0) goto L46
            java.security.SecureRandom r0 = defpackage.AbstractC9915e.vip()
            goto L47
        L46:
            r0 = r4
        L47:
            r2.f3321e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0909e.init(boolean, eٟؖؖ):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v1, types: [package, eؘؖٝ] */
    /* renamed from: interface, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m423interface() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0909e.m423interface():boolean");
    }

    @Override // defpackage.InterfaceC13464e
    public Object isPro(Function1 function1) {
        Object invoke = ((Function0) this.f3323e).invoke();
        function1.invoke(invoke);
        return new C9589e((C8208e) this.f3321e, invoke, (Function1) this.f3322e);
    }

    public C4076e isVip() {
        C17974e c17974e;
        C15768e vip;
        C2428e c2428e = (C2428e) this.f3323e;
        if (c2428e == null || (c17974e = (C17974e) this.f3322e) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c2428e.ad != ((C15768e) c17974e.f35233e).ad.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c2428e.ad() && ((Integer) this.f3321e) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C2428e) this.f3323e).ad() && ((Integer) this.f3321e) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C15780e c15780e = ((C2428e) this.f3323e).vip;
        if (c15780e == C15780e.f31085e) {
            vip = AbstractC16176e.ad;
        } else if (c15780e == C15780e.f31087e) {
            vip = AbstractC16176e.ad(((Integer) this.f3321e).intValue());
        } else {
            if (c15780e != C15780e.f31086e) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + ((C2428e) this.f3323e).vip);
            }
            vip = AbstractC16176e.vip(((Integer) this.f3321e).intValue());
        }
        return new C4076e((C2428e) this.f3323e, (C17974e) this.f3322e, vip, (Integer) this.f3321e);
    }

    @Override // defpackage.InterfaceC2295e
    public void license(Object obj) {
        ((C16255e) this.f3321e).appmetrica = null;
    }

    @Override // defpackage.InterfaceC16970e
    public synchronized void loadAd(C10919e c10919e) {
        ((C2734e) this.f3321e).metrica.loadAd(c10919e);
        m428while(c10919e);
    }

    @Override // defpackage.InterfaceC13464e
    public void metrica(C9398e c9398e, Object obj) {
        C9589e c9589e = (C9589e) obj;
        C8208e c8208e = c9589e.f19026e;
        C7145e c7145e = new C7145e(c9398e, c9589e.f19024e);
        c9589e.f19023e.invoke(c7145e);
        c9589e.f19025e = c7145e.license;
        Iterator it = c7145e.metrica.iterator();
        while (it.hasNext()) {
            C0601e c0601e = (C0601e) it.next();
            c0601e.ad.mo400e(c9398e, c0601e.vip);
        }
    }

    @Override // defpackage.InterfaceC16256e
    public boolean mopub(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        C6818e c6818e = (C6818e) ((AbstractC0821e) this.f3322e).f3209e;
        BigInteger bigInteger3 = c6818e.f14047e;
        BigInteger inmobi = inmobi(bigInteger3, bArr);
        BigInteger valueOf = BigInteger.valueOf(0L);
        if (valueOf.compareTo(bigInteger) >= 0 || bigInteger3.compareTo(bigInteger) <= 0 || valueOf.compareTo(bigInteger2) >= 0 || bigInteger3.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger adcel = AbstractC5907e.adcel(bigInteger3, bigInteger2);
        BigInteger mod = inmobi.multiply(adcel).mod(bigInteger3);
        BigInteger mod2 = bigInteger.multiply(adcel).mod(bigInteger3);
        BigInteger bigInteger4 = c6818e.f14046e;
        return c6818e.f14049e.modPow(mod, bigInteger4).multiply(((C5574e) ((AbstractC0821e) this.f3322e)).f11922e.modPow(mod2, bigInteger4)).mod(bigInteger4).mod(bigInteger3).equals(bigInteger);
    }

    /* renamed from: native, reason: not valid java name */
    public boolean m424native() {
        Iterator it = ((CopyOnWriteArrayList) this.f3322e).iterator();
        while (it.hasNext()) {
            if (((C17982e) it.next()).ad.Signature()) {
                return true;
            }
        }
        return false;
    }

    public InterfaceC16989e premium(byte[] bArr) {
        AbstractC10732e abstractC10732e = (AbstractC10732e) this.f3323e;
        Object ad = abstractC10732e.ad();
        try {
            PublicKey generatePublic = ((KeyFactory) ad).generatePublic(new X509EncodedKeySpec(bArr));
            abstractC10732e.vip(ad);
            return ads(generatePublic);
        } catch (Throwable th) {
            abstractC10732e.vip(ad);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC16970e
    public synchronized int pro() {
        return ((C2734e) this.f3321e).metrica.f23455e;
    }

    /* renamed from: protected, reason: not valid java name */
    public void mo425protected(KeyEvent keyEvent) {
        BaseInputConnection baseInputConnection = (BaseInputConnection) this.f3321e;
        if (baseInputConnection == null) {
            baseInputConnection = new BaseInputConnection((View) this.f3323e, false);
            this.f3321e = baseInputConnection;
        }
        baseInputConnection.sendKeyEvent(keyEvent);
    }

    @Override // defpackage.InterfaceC16256e
    public BigInteger[] purchase(byte[] bArr) {
        C6818e c6818e = (C6818e) ((AbstractC0821e) this.f3322e).f3209e;
        BigInteger bigInteger = c6818e.f14047e;
        BigInteger inmobi = inmobi(bigInteger, bArr);
        BigInteger bigInteger2 = ((C3592e) ((AbstractC0821e) this.f3322e)).f8124e;
        InterfaceC8251e interfaceC8251e = (InterfaceC8251e) this.f3323e;
        if (interfaceC8251e.amazon()) {
            interfaceC8251e.mo2394this(bigInteger, bigInteger2, bArr);
        } else {
            interfaceC8251e.mo2393interface(bigInteger, (SecureRandom) this.f3321e);
        }
        BigInteger billing = interfaceC8251e.billing();
        BigInteger bigInteger3 = c6818e.f14049e;
        SecureRandom secureRandom = (SecureRandom) this.f3321e;
        if (secureRandom == null) {
            secureRandom = AbstractC9915e.vip();
        } else {
            ThreadLocal threadLocal = AbstractC9915e.ad;
        }
        BigInteger mod = bigInteger3.modPow(billing.add(AbstractC5907e.metrica(7, secureRandom).add(BigInteger.valueOf(128L)).multiply(bigInteger)), c6818e.f14046e).mod(bigInteger);
        return new BigInteger[]{mod, AbstractC5907e.startapp(bigInteger, billing).multiply(inmobi.add(bigInteger2.multiply(mod))).mod(bigInteger)};
    }

    @Override // defpackage.InterfaceC1620e
    public void remoteconfig(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f3321e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [eٍٚؐ, java.lang.Object] */
    @Override // defpackage.InterfaceC4716e
    public boolean signatures(C11469e c11469e) {
        C8928e c8928e = new C8928e();
        C3154e c3154e = new C3154e();
        InterfaceC2531e interfaceC2531e = (InterfaceC2531e) this.f3323e;
        C6140e c6140e = new C6140e(((C9000e) interfaceC2531e).f18066e, 1);
        C1209e c1209e = (C1209e) this.f3321e;
        C6714e c6714e = new C6714e(c8928e, c3154e, c6140e, c1209e, new Object(), new C3613e(c1209e.ad()), interfaceC2531e, null, null);
        C9139e c9139e = C9139e.f18290e;
        return ((Boolean) AbstractC5336e.yandex(C2693e.f6576e, new C6626e(this, c6714e.ad(0, c11469e, true, null, null, c9139e, c9139e), null, 11))).booleanValue();
    }

    @Override // defpackage.InterfaceC4876e
    public void smaato() {
    }

    @Override // defpackage.InterfaceC4629e
    public /* bridge */ /* synthetic */ InterfaceC4629e startapp(Class cls, InterfaceC1848e interfaceC1848e) {
        ((HashMap) this.f3323e).put(cls, interfaceC1848e);
        ((HashMap) this.f3322e).remove(cls);
        return this;
    }

    @Override // defpackage.InterfaceC17357e
    public InterfaceC0274e subs() {
        return (C8254e) this.f3323e;
    }

    @Override // defpackage.InterfaceC4876e
    public Object subscription() {
        return null;
    }

    public C0834e tapsense() {
        Integer num = (Integer) this.f3323e;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f3322e) == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (((C6594e) this.f3321e) != null) {
            return new C0834e(num.intValue(), ((Integer) this.f3322e).intValue(), (C6594e) this.f3321e);
        }
        throw new GeneralSecurityException("variant not set");
    }

    /* renamed from: this, reason: not valid java name */
    public String m426this() {
        if (!m421goto()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f3321e;
        this.f3321e = null;
        return str;
    }

    /* renamed from: try, reason: not valid java name */
    public InputMethodManager m427try() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f3322e;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        InputMethodManager inputMethodManager2 = (InputMethodManager) ((View) this.f3323e).getContext().getSystemService("input_method");
        this.f3322e = inputMethodManager2;
        return inputMethodManager2;
    }

    @Override // defpackage.InterfaceC4876e
    public ClipDescription vip() {
        return (ClipDescription) this.f3322e;
    }

    /* renamed from: while, reason: not valid java name */
    public void m428while(C10919e c10919e) {
        C5350e c5350e = (C5350e) ((HashMap) this.f3323e).remove(c10919e);
        c5350e.getClass();
        C16937e c16937e = (C16937e) ((C2734e) this.f3321e).admob.get(c5350e);
        if (c16937e != null) {
            synchronized (c16937e) {
                c16937e.license--;
            }
        }
    }

    @Override // defpackage.InterfaceC2295e
    public void yandex(Throwable th) {
        ((C16255e) this.f3321e).appmetrica = null;
        ArrayList arrayList = (ArrayList) this.f3323e;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC12424e) this.f3322e).mo3345throw((AbstractC1037e) it.next());
        }
        arrayList.clear();
    }
}
