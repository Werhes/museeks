package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Pair;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13400e {
    public static final C15071e adcel;
    public static final C8167e startapp = new C8167e(6);
    public volatile C12344e ad;
    public final boolean appmetrica;
    public final C2691e billing;
    public final String license;
    public final String metrica;
    public final AbstractC12614e purchase;
    public final C13150e vip;
    public final C11493e yandex;

    static {
        C7170e c7170e = C7170e.f14658e;
        int i = AbstractC12614e.f25334e;
        adcel = new C15071e(c7170e, false, C4477e.f9679e);
    }

    public C13400e(C13150e c13150e, C15071e c15071e) {
        this.vip = c13150e;
        Context context = c13150e.vip;
        String str = c15071e.license;
        if (str == null) {
            str = (String) c15071e.ad.apply(context);
            c15071e.license = str;
        }
        this.metrica = str;
        this.license = BuildConfig.FLAVOR;
        this.appmetrica = c15071e.vip;
        this.purchase = c15071e.metrica;
        this.ad = null;
        this.billing = new C2691e(27);
        this.yandex = new C11493e(c13150e, str);
    }

    public final C12344e ad() {
        C12344e c12344e;
        C12344e c12344e2 = this.ad;
        if (c12344e2 != null) {
            return c12344e2;
        }
        synchronized (this) {
            try {
                c12344e = this.ad;
                if (c12344e == null) {
                    StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        C12344e ad = this.yandex.ad();
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        int i = ((C12434e) ad.f24753e).f24873e - 2;
                        if (i != 15 && i != 16) {
                            C13150e c13150e = this.vip;
                            c13150e.billing.ad();
                            if (this.appmetrica || this.yandex.vip() || !((String) ad.f24749e).isEmpty()) {
                                final int i2 = 3;
                                ((C0918e) c13150e.ad()).execute(new Runnable(this) { // from class: eِؒۡ

                                    /* renamed from: eؘٙؓ, reason: contains not printable characters */
                                    public final /* synthetic */ C13400e f4174e;

                                    {
                                        this.f4174e = this;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:37:0x005e A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:27:0x003d, B:30:0x0043, B:31:0x0048, B:33:0x0051, B:37:0x005e, B:38:0x0096, B:39:0x0083, B:41:0x0059, B:42:0x00a8), top: B:26:0x003d }] */
                                    /* JADX WARN: Removed duplicated region for block: B:39:0x0083 A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:27:0x003d, B:30:0x0043, B:31:0x0048, B:33:0x0051, B:37:0x005e, B:38:0x0096, B:39:0x0083, B:41:0x0059, B:42:0x00a8), top: B:26:0x003d }] */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    private final void ad() {
                                        /*
                                            r9 = this;
                                            eًْٞ r0 = r9.f4174e
                                            eٌْۨ r1 = r0.vip
                                            eؘِٞ r1 = r1.startapp
                                            boolean r0 = r0.appmetrica
                                            eؗؐؐ r2 = defpackage.C4548e.ad
                                            eؙۨٔ r3 = r1.metrica
                                            java.lang.Object r3 = r3.get()
                                            eؑ۟ۜ r3 = (defpackage.InterfaceC0590e) r3
                                            if (r3 != 0) goto L19
                                            if (r0 != 0) goto L19
                                            eٓؔ٘ r0 = defpackage.C13747e.f27231e
                                            return
                                        L19:
                                            int r0 = r1.appmetrica
                                            r0 = r0 & 64
                                            if (r0 != 0) goto L36
                                            java.util.concurrent.CopyOnWriteArrayList r0 = r1.purchase
                                            monitor-enter(r0)
                                            int r4 = r1.appmetrica     // Catch: java.lang.Throwable -> L30
                                            r5 = r4 & 64
                                            if (r5 != 0) goto L32
                                            r0.add(r2)     // Catch: java.lang.Throwable -> L30
                                            r2 = r4 | 64
                                            r1.appmetrica = r2     // Catch: java.lang.Throwable -> L30
                                            goto L32
                                        L30:
                                            r1 = move-exception
                                            goto L34
                                        L32:
                                            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
                                            goto L36
                                        L34:
                                            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
                                            throw r1
                                        L36:
                                            eٖٛؑ r0 = r1.yandex
                                            if (r0 != 0) goto Lac
                                            java.lang.Object r0 = r1.billing
                                            monitor-enter(r0)
                                            eٖٛؑ r2 = r1.yandex     // Catch: java.lang.Throwable -> L46
                                            if (r2 != 0) goto La8
                                            if (r3 != 0) goto L48
                                            eٖؐٞ r3 = defpackage.C15901e.ad     // Catch: java.lang.Throwable -> L46
                                            goto L48
                                        L46:
                                            r1 = move-exception
                                            goto Laa
                                        L48:
                                            android.content.Context r2 = r1.ad     // Catch: java.lang.Throwable -> L46
                                            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L46
                                            r5 = 24
                                            r6 = 0
                                            if (r4 < r5) goto L59
                                            boolean r4 = defpackage.AbstractC16603e.metrica(r2)     // Catch: java.lang.Throwable -> L46
                                            if (r4 != 0) goto L5b
                                            r4 = 1
                                            goto L5c
                                        L59:
                                            android.os.UserManager r4 = defpackage.AbstractC16603e.ad     // Catch: java.lang.Throwable -> L46
                                        L5b:
                                            r4 = r6
                                        L5c:
                                            if (r4 == 0) goto L83
                                            eٙ۠ r4 = defpackage.RunnableC18182e.f35604e     // Catch: java.lang.Throwable -> L46
                                            eؙۨٔ r5 = r1.vip     // Catch: java.lang.Throwable -> L46
                                            java.lang.Object r7 = r5.get()     // Catch: java.lang.Throwable -> L46
                                            java.util.concurrent.Executor r7 = (java.util.concurrent.Executor) r7     // Catch: java.lang.Throwable -> L46
                                            r8 = 0
                                            java.util.concurrent.Callable r4 = java.util.concurrent.Executors.callable(r4, r8)     // Catch: java.lang.Throwable -> L46
                                            eؚؑ۟ r2 = defpackage.AbstractC16603e.vip(r2, r4, r7)     // Catch: java.lang.Throwable -> L46
                                            eٖؓۜ r4 = new eٖؓۜ     // Catch: java.lang.Throwable -> L46
                                            r4.<init>(r1, r3, r6)     // Catch: java.lang.Throwable -> L46
                                            java.lang.Object r3 = r5.get()     // Catch: java.lang.Throwable -> L46
                                            java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3     // Catch: java.lang.Throwable -> L46
                                            eّؑ۠ r2 = defpackage.AbstractC2017e.billing(r2, r4, r3)     // Catch: java.lang.Throwable -> L46
                                            r1.yandex = r2     // Catch: java.lang.Throwable -> L46
                                            goto L96
                                        L83:
                                            eؙۨٔ r2 = r1.license     // Catch: java.lang.Throwable -> L46
                                            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L46
                                            eؑ۟ؕ r2 = (defpackage.C0582e) r2     // Catch: java.lang.Throwable -> L46
                                            eًؕٚ r4 = new eًؕٚ     // Catch: java.lang.Throwable -> L46
                                            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L46
                                            eؘؗؕ r2 = r2.ad(r4)     // Catch: java.lang.Throwable -> L46
                                            r1.yandex = r2     // Catch: java.lang.Throwable -> L46
                                        L96:
                                            eٗؒ۠ r3 = new eٗؒ۠     // Catch: java.lang.Throwable -> L46
                                            r4 = 20
                                            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L46
                                            eؙۨٔ r1 = r1.vip     // Catch: java.lang.Throwable -> L46
                                            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L46
                                            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1     // Catch: java.lang.Throwable -> L46
                                            r2.ad(r3, r1)     // Catch: java.lang.Throwable -> L46
                                        La8:
                                            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                                            return
                                        Laa:
                                            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                                            throw r1
                                        Lac:
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC1383e.ad():void");
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Object, eٍٖۢ] */
                                    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, eُۡٔ] */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z;
                                        C13150e c13150e2;
                                        C4842e c4842e;
                                        C1410e c1410e;
                                        C4842e c4842e2;
                                        C5441e vip;
                                        int i3 = 0;
                                        switch (i2) {
                                            case 0:
                                                this.f4174e.vip();
                                                return;
                                            case 1:
                                                C13400e c13400e = this.f4174e;
                                                C13150e c13150e3 = c13400e.vip;
                                                String str = c13400e.metrica;
                                                C11428e c11428e = AbstractC8329e.ad;
                                                Object obj = C17647e.f34584e;
                                                byte b = (byte) (((byte) 2) | 1);
                                                Context context = c13150e3.vip;
                                                Pattern pattern = AbstractC0481e.ad;
                                                C2532e c2532e = new C2532e(context);
                                                c2532e.m917e("phenotype");
                                                c2532e.m901e("all_accounts.pb");
                                                Uri m902e = c2532e.m902e();
                                                if (m902e == null) {
                                                    throw new NullPointerException("Null uri");
                                                }
                                                C4089e tapsense = C4089e.tapsense();
                                                if (tapsense == null) {
                                                    throw new NullPointerException("Null schema");
                                                }
                                                C4842e license = AbstractC9621e.license(AbstractC8329e.ad);
                                                byte b2 = (byte) (b | 2);
                                                C2171e c2171e = AbstractC17475e.f34223e;
                                                C1410e c1410e2 = C1410e.f4222e;
                                                if (b2 != 3) {
                                                    StringBuilder sb = new StringBuilder();
                                                    if ((b2 & 1) == 0) {
                                                        sb.append(" useGeneratedExtensionRegistry");
                                                    }
                                                    if ((b2 & 2) == 0) {
                                                        sb.append(" enableTracing");
                                                    }
                                                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                                                }
                                                C8068e c8068e = new C8068e(m902e, tapsense, license, c1410e2);
                                                C11328e c11328e = AbstractC8329e.metrica;
                                                if (c11328e == null) {
                                                    synchronized (AbstractC8329e.vip) {
                                                        try {
                                                            c11328e = AbstractC8329e.metrica;
                                                            if (c11328e == null) {
                                                                HashMap hashMap = new HashMap();
                                                                InterfaceScheduledExecutorServiceC1678e ad2 = c13150e3.ad();
                                                                C6843e c6843e = (C6843e) c13150e3.purchase.get();
                                                                z = true;
                                                                C5752e c5752e = C5752e.ad;
                                                                c13150e2 = c13150e3;
                                                                c4842e = license;
                                                                AbstractC2301e.startapp(!hashMap.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                hashMap.put("singleproc", c5752e);
                                                                ?? obj2 = new Object();
                                                                obj2.f22774e = new ConcurrentHashMap();
                                                                ad2.getClass();
                                                                obj2.f22772e = ad2;
                                                                c6843e.getClass();
                                                                obj2.f22771e = c6843e;
                                                                obj2.f22770e = hashMap;
                                                                AbstractC2301e.billing(!hashMap.isEmpty());
                                                                obj2.f22773e = C4132e.metrica;
                                                                AbstractC8329e.metrica = obj2;
                                                                c11328e = obj2;
                                                            } else {
                                                                z = true;
                                                                c13150e2 = c13150e3;
                                                                c4842e = license;
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                } else {
                                                    z = true;
                                                    c13150e2 = c13150e3;
                                                    c4842e = license;
                                                }
                                                String str2 = BuildConfig.FLAVOR;
                                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c11328e.f22774e;
                                                Pair pair = (Pair) concurrentHashMap.get(m902e);
                                                if (pair == null) {
                                                    AbstractC2301e.startapp(m902e.isHierarchical(), "Uri must be hierarchical: %s", m902e);
                                                    String lastPathSegment = m902e.getLastPathSegment();
                                                    if (lastPathSegment == null) {
                                                        lastPathSegment = BuildConfig.FLAVOR;
                                                    }
                                                    int lastIndexOf = lastPathSegment.lastIndexOf(46);
                                                    AbstractC2301e.startapp((lastIndexOf == -1 ? BuildConfig.FLAVOR : lastPathSegment.substring(lastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", m902e);
                                                    C5752e c5752e2 = (C5752e) ((HashMap) c11328e.f22770e).get("singleproc");
                                                    AbstractC2301e.startapp(c5752e2 != null ? z : false, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                    String lastPathSegment2 = m902e.getLastPathSegment();
                                                    if (lastPathSegment2 != null) {
                                                        str2 = lastPathSegment2;
                                                    }
                                                    int lastIndexOf2 = str2.lastIndexOf(46);
                                                    if (lastIndexOf2 != -1) {
                                                        str2 = str2.substring(0, lastIndexOf2);
                                                    }
                                                    C12183e billing = AbstractC2017e.billing(AbstractC2017e.license(m902e), (C4132e) c11328e.f22773e, EnumC3320e.f7489e);
                                                    Executor executor = (Executor) c11328e.f22772e;
                                                    C6843e c6843e2 = (C6843e) c11328e.f22771e;
                                                    c5752e2.getClass();
                                                    String str3 = str2;
                                                    c1410e = c1410e2;
                                                    c4842e2 = c4842e;
                                                    C9664e c9664e = new C9664e(new C14742e(str3, AbstractC2017e.license(m902e), new C0492e(tapsense, C17268e.ad()), executor, c6843e2, c4842e, (C9838e) new Object()), billing);
                                                    if (!c1410e.isEmpty()) {
                                                        c9664e.ad(new C2111e(c1410e, executor, z ? 1 : 0));
                                                    }
                                                    pair = Pair.create(c9664e, c8068e);
                                                    Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(m902e, pair);
                                                    if (pair2 != null) {
                                                        pair = pair2;
                                                    }
                                                } else {
                                                    c1410e = c1410e2;
                                                    c4842e2 = c4842e;
                                                }
                                                C9664e c9664e2 = (C9664e) pair.first;
                                                C8068e c8068e2 = (C8068e) pair.second;
                                                if (c8068e.equals(c8068e2)) {
                                                    C9590e vip2 = c9664e2.vip(new C2713e(2, str), c13150e2.ad());
                                                    vip2.ad(new RunnableC1965e(c13400e, vip2, 0), c13150e2.ad());
                                                    return;
                                                }
                                                String adcel2 = AbstractC12992e.adcel("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", C4089e.class.getSimpleName(), m902e);
                                                AbstractC2301e.startapp(m902e.equals(c8068e2.ad), adcel2, "uri");
                                                AbstractC2301e.startapp(tapsense.equals(c8068e2.vip), adcel2, "schema");
                                                AbstractC2301e.startapp(c4842e2.equals(c8068e2.metrica), adcel2, "handler");
                                                AbstractC2301e.startapp(c1410e.equals(c8068e2.license), adcel2, "migrations");
                                                AbstractC2301e.startapp(obj.equals(obj), adcel2, "variantConfig");
                                                throw new IllegalArgumentException(AbstractC12992e.adcel(adcel2, "unknown"));
                                            case 2:
                                                ad();
                                                return;
                                            default:
                                                C13400e c13400e2 = this.f4174e;
                                                C12344e ad3 = c13400e2.ad();
                                                String str4 = (String) ad3.f24749e;
                                                C13150e c13150e4 = c13400e2.vip;
                                                C10040e c10040e = c13150e4.billing;
                                                InterfaceC6823e interfaceC6823e = c13150e4.license;
                                                C3992e vip3 = c10040e.vip();
                                                boolean z2 = vip3.startapp;
                                                if (vip3.adcel) {
                                                    if (AbstractC8433e.license(str4) && !z2) {
                                                        C13747e c13747e = C13747e.f27231e;
                                                        return;
                                                    }
                                                    C9862e tapsense2 = C10315e.tapsense();
                                                    C12434e c12434e = (C12434e) ad3.f24753e;
                                                    int i4 = c12434e.f24874e;
                                                    C7951e signatures = C11013e.signatures();
                                                    signatures.vip();
                                                    ((C11013e) signatures.f12709e).tapsense(i4);
                                                    int i5 = c12434e.f24873e;
                                                    signatures.vip();
                                                    ((C11013e) signatures.f12709e).isVip(i5);
                                                    C11013e c11013e = (C11013e) signatures.appmetrica();
                                                    tapsense2.vip();
                                                    ((C10315e) tapsense2.f12709e).inmobi(c11013e);
                                                    if (!AbstractC8433e.license(str4)) {
                                                        tapsense2.vip();
                                                        ((C10315e) tapsense2.f12709e).isVip(str4);
                                                    }
                                                    if (z2) {
                                                        String str5 = c13400e2.metrica;
                                                        tapsense2.vip();
                                                        ((C10315e) tapsense2.f12709e).isPro(str5);
                                                    }
                                                    C0582e c0582e = (C0582e) interfaceC6823e.get();
                                                    C10315e c10315e = (C10315e) tapsense2.appmetrica();
                                                    C3355e c3355e = c0582e.ad;
                                                    C9321e ad4 = C0381e.ad();
                                                    ad4.ad = new C0047e(c10315e);
                                                    ad4.license = new C1032e[]{AbstractC17540e.license};
                                                    ad4.metrica = true;
                                                    ad4.vip = false;
                                                    vip = C0582e.vip(c3355e.appmetrica(0, ad4.ad()).yandex(EnumC3320e.f7489e, new C9271e(c3355e, c10315e)));
                                                } else {
                                                    if (AbstractC8433e.license(str4)) {
                                                        C13747e c13747e2 = C13747e.f27231e;
                                                        return;
                                                    }
                                                    C0582e c0582e2 = (C0582e) interfaceC6823e.get();
                                                    c0582e2.getClass();
                                                    str4.getClass();
                                                    vip = C0582e.vip(c0582e2.ad.purchase(str4));
                                                }
                                                AbstractC2017e.ad(vip, C4914e.class, new C2169e(i3, c13400e2), c13150e4.ad());
                                                return;
                                        }
                                    }
                                });
                                c13150e.ad.subs((AbstractC7244e) ad.f24751e, this.purchase, this.metrica);
                                if (!this.license.equals(BuildConfig.FLAVOR)) {
                                    final int i3 = 1;
                                    ((C0918e) c13150e.ad()).execute(new Runnable(this) { // from class: eِؒۡ

                                        /* renamed from: eؘٙؓ, reason: contains not printable characters */
                                        public final /* synthetic */ C13400e f4174e;

                                        {
                                            this.f4174e = this;
                                        }

                                        private final void ad() {
                                            /*  JADX ERROR: Method code generation error
                                                java.lang.NullPointerException
                                                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
                                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                */
                                            /*
                                                this = this;
                                                eًْٞ r0 = r9.f4174e
                                                eٌْۨ r1 = r0.vip
                                                eؘِٞ r1 = r1.startapp
                                                boolean r0 = r0.appmetrica
                                                eؗؐؐ r2 = defpackage.C4548e.ad
                                                eؙۨٔ r3 = r1.metrica
                                                java.lang.Object r3 = r3.get()
                                                eؑ۟ۜ r3 = (defpackage.InterfaceC0590e) r3
                                                if (r3 != 0) goto L19
                                                if (r0 != 0) goto L19
                                                eٓؔ٘ r0 = defpackage.C13747e.f27231e
                                                return
                                            L19:
                                                int r0 = r1.appmetrica
                                                r0 = r0 & 64
                                                if (r0 != 0) goto L36
                                                java.util.concurrent.CopyOnWriteArrayList r0 = r1.purchase
                                                monitor-enter(r0)
                                                int r4 = r1.appmetrica     // Catch: java.lang.Throwable -> L30
                                                r5 = r4 & 64
                                                if (r5 != 0) goto L32
                                                r0.add(r2)     // Catch: java.lang.Throwable -> L30
                                                r2 = r4 | 64
                                                r1.appmetrica = r2     // Catch: java.lang.Throwable -> L30
                                                goto L32
                                            L30:
                                                r1 = move-exception
                                                goto L34
                                            L32:
                                                monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
                                                goto L36
                                            L34:
                                                monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
                                                throw r1
                                            L36:
                                                eٖٛؑ r0 = r1.yandex
                                                if (r0 != 0) goto Lac
                                                java.lang.Object r0 = r1.billing
                                                monitor-enter(r0)
                                                eٖٛؑ r2 = r1.yandex     // Catch: java.lang.Throwable -> L46
                                                if (r2 != 0) goto La8
                                                if (r3 != 0) goto L48
                                                eٖؐٞ r3 = defpackage.C15901e.ad     // Catch: java.lang.Throwable -> L46
                                                goto L48
                                            L46:
                                                r1 = move-exception
                                                goto Laa
                                            L48:
                                                android.content.Context r2 = r1.ad     // Catch: java.lang.Throwable -> L46
                                                int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L46
                                                r5 = 24
                                                r6 = 0
                                                if (r4 < r5) goto L59
                                                boolean r4 = defpackage.AbstractC16603e.metrica(r2)     // Catch: java.lang.Throwable -> L46
                                                if (r4 != 0) goto L5b
                                                r4 = 1
                                                goto L5c
                                            L59:
                                                android.os.UserManager r4 = defpackage.AbstractC16603e.ad     // Catch: java.lang.Throwable -> L46
                                            L5b:
                                                r4 = r6
                                            L5c:
                                                if (r4 == 0) goto L83
                                                eٙ۠ r4 = defpackage.RunnableC18182e.f35604e     // Catch: java.lang.Throwable -> L46
                                                eؙۨٔ r5 = r1.vip     // Catch: java.lang.Throwable -> L46
                                                java.lang.Object r7 = r5.get()     // Catch: java.lang.Throwable -> L46
                                                java.util.concurrent.Executor r7 = (java.util.concurrent.Executor) r7     // Catch: java.lang.Throwable -> L46
                                                r8 = 0
                                                java.util.concurrent.Callable r4 = java.util.concurrent.Executors.callable(r4, r8)     // Catch: java.lang.Throwable -> L46
                                                eؚؑ۟ r2 = defpackage.AbstractC16603e.vip(r2, r4, r7)     // Catch: java.lang.Throwable -> L46
                                                eٖؓۜ r4 = new eٖؓۜ     // Catch: java.lang.Throwable -> L46
                                                r4.<init>(r1, r3, r6)     // Catch: java.lang.Throwable -> L46
                                                java.lang.Object r3 = r5.get()     // Catch: java.lang.Throwable -> L46
                                                java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3     // Catch: java.lang.Throwable -> L46
                                                eّؑ۠ r2 = defpackage.AbstractC2017e.billing(r2, r4, r3)     // Catch: java.lang.Throwable -> L46
                                                r1.yandex = r2     // Catch: java.lang.Throwable -> L46
                                                goto L96
                                            L83:
                                                eؙۨٔ r2 = r1.license     // Catch: java.lang.Throwable -> L46
                                                java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L46
                                                eؑ۟ؕ r2 = (defpackage.C0582e) r2     // Catch: java.lang.Throwable -> L46
                                                eًؕٚ r4 = new eًؕٚ     // Catch: java.lang.Throwable -> L46
                                                r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L46
                                                eؘؗؕ r2 = r2.ad(r4)     // Catch: java.lang.Throwable -> L46
                                                r1.yandex = r2     // Catch: java.lang.Throwable -> L46
                                            L96:
                                                eٗؒ۠ r3 = new eٗؒ۠     // Catch: java.lang.Throwable -> L46
                                                r4 = 20
                                                r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L46
                                                eؙۨٔ r1 = r1.vip     // Catch: java.lang.Throwable -> L46
                                                java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L46
                                                java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1     // Catch: java.lang.Throwable -> L46
                                                r2.ad(r3, r1)     // Catch: java.lang.Throwable -> L46
                                            La8:
                                                monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                                                return
                                            Laa:
                                                monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                                                throw r1
                                            Lac:
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC1383e.ad():void");
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Object, eٍٖۢ] */
                                        /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, eُۡٔ] */
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean z;
                                            C13150e c13150e2;
                                            C4842e c4842e;
                                            C1410e c1410e;
                                            C4842e c4842e2;
                                            C5441e vip;
                                            int i32 = 0;
                                            switch (i3) {
                                                case 0:
                                                    this.f4174e.vip();
                                                    return;
                                                case 1:
                                                    C13400e c13400e = this.f4174e;
                                                    C13150e c13150e3 = c13400e.vip;
                                                    String str = c13400e.metrica;
                                                    C11428e c11428e = AbstractC8329e.ad;
                                                    Object obj = C17647e.f34584e;
                                                    byte b = (byte) (((byte) 2) | 1);
                                                    Context context = c13150e3.vip;
                                                    Pattern pattern = AbstractC0481e.ad;
                                                    C2532e c2532e = new C2532e(context);
                                                    c2532e.m917e("phenotype");
                                                    c2532e.m901e("all_accounts.pb");
                                                    Uri m902e = c2532e.m902e();
                                                    if (m902e == null) {
                                                        throw new NullPointerException("Null uri");
                                                    }
                                                    C4089e tapsense = C4089e.tapsense();
                                                    if (tapsense == null) {
                                                        throw new NullPointerException("Null schema");
                                                    }
                                                    C4842e license = AbstractC9621e.license(AbstractC8329e.ad);
                                                    byte b2 = (byte) (b | 2);
                                                    C2171e c2171e = AbstractC17475e.f34223e;
                                                    C1410e c1410e2 = C1410e.f4222e;
                                                    if (b2 != 3) {
                                                        StringBuilder sb = new StringBuilder();
                                                        if ((b2 & 1) == 0) {
                                                            sb.append(" useGeneratedExtensionRegistry");
                                                        }
                                                        if ((b2 & 2) == 0) {
                                                            sb.append(" enableTracing");
                                                        }
                                                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                                                    }
                                                    C8068e c8068e = new C8068e(m902e, tapsense, license, c1410e2);
                                                    C11328e c11328e = AbstractC8329e.metrica;
                                                    if (c11328e == null) {
                                                        synchronized (AbstractC8329e.vip) {
                                                            try {
                                                                c11328e = AbstractC8329e.metrica;
                                                                if (c11328e == null) {
                                                                    HashMap hashMap = new HashMap();
                                                                    InterfaceScheduledExecutorServiceC1678e ad2 = c13150e3.ad();
                                                                    C6843e c6843e = (C6843e) c13150e3.purchase.get();
                                                                    z = true;
                                                                    C5752e c5752e = C5752e.ad;
                                                                    c13150e2 = c13150e3;
                                                                    c4842e = license;
                                                                    AbstractC2301e.startapp(!hashMap.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                    hashMap.put("singleproc", c5752e);
                                                                    ?? obj2 = new Object();
                                                                    obj2.f22774e = new ConcurrentHashMap();
                                                                    ad2.getClass();
                                                                    obj2.f22772e = ad2;
                                                                    c6843e.getClass();
                                                                    obj2.f22771e = c6843e;
                                                                    obj2.f22770e = hashMap;
                                                                    AbstractC2301e.billing(!hashMap.isEmpty());
                                                                    obj2.f22773e = C4132e.metrica;
                                                                    AbstractC8329e.metrica = obj2;
                                                                    c11328e = obj2;
                                                                } else {
                                                                    z = true;
                                                                    c13150e2 = c13150e3;
                                                                    c4842e = license;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    } else {
                                                        z = true;
                                                        c13150e2 = c13150e3;
                                                        c4842e = license;
                                                    }
                                                    String str2 = BuildConfig.FLAVOR;
                                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c11328e.f22774e;
                                                    Pair pair = (Pair) concurrentHashMap.get(m902e);
                                                    if (pair == null) {
                                                        AbstractC2301e.startapp(m902e.isHierarchical(), "Uri must be hierarchical: %s", m902e);
                                                        String lastPathSegment = m902e.getLastPathSegment();
                                                        if (lastPathSegment == null) {
                                                            lastPathSegment = BuildConfig.FLAVOR;
                                                        }
                                                        int lastIndexOf = lastPathSegment.lastIndexOf(46);
                                                        AbstractC2301e.startapp((lastIndexOf == -1 ? BuildConfig.FLAVOR : lastPathSegment.substring(lastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", m902e);
                                                        C5752e c5752e2 = (C5752e) ((HashMap) c11328e.f22770e).get("singleproc");
                                                        AbstractC2301e.startapp(c5752e2 != null ? z : false, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                        String lastPathSegment2 = m902e.getLastPathSegment();
                                                        if (lastPathSegment2 != null) {
                                                            str2 = lastPathSegment2;
                                                        }
                                                        int lastIndexOf2 = str2.lastIndexOf(46);
                                                        if (lastIndexOf2 != -1) {
                                                            str2 = str2.substring(0, lastIndexOf2);
                                                        }
                                                        C12183e billing = AbstractC2017e.billing(AbstractC2017e.license(m902e), (C4132e) c11328e.f22773e, EnumC3320e.f7489e);
                                                        Executor executor = (Executor) c11328e.f22772e;
                                                        C6843e c6843e2 = (C6843e) c11328e.f22771e;
                                                        c5752e2.getClass();
                                                        String str3 = str2;
                                                        c1410e = c1410e2;
                                                        c4842e2 = c4842e;
                                                        C9664e c9664e = new C9664e(new C14742e(str3, AbstractC2017e.license(m902e), new C0492e(tapsense, C17268e.ad()), executor, c6843e2, c4842e, (C9838e) new Object()), billing);
                                                        if (!c1410e.isEmpty()) {
                                                            c9664e.ad(new C2111e(c1410e, executor, z ? 1 : 0));
                                                        }
                                                        pair = Pair.create(c9664e, c8068e);
                                                        Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(m902e, pair);
                                                        if (pair2 != null) {
                                                            pair = pair2;
                                                        }
                                                    } else {
                                                        c1410e = c1410e2;
                                                        c4842e2 = c4842e;
                                                    }
                                                    C9664e c9664e2 = (C9664e) pair.first;
                                                    C8068e c8068e2 = (C8068e) pair.second;
                                                    if (c8068e.equals(c8068e2)) {
                                                        C9590e vip2 = c9664e2.vip(new C2713e(2, str), c13150e2.ad());
                                                        vip2.ad(new RunnableC1965e(c13400e, vip2, 0), c13150e2.ad());
                                                        return;
                                                    }
                                                    String adcel2 = AbstractC12992e.adcel("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", C4089e.class.getSimpleName(), m902e);
                                                    AbstractC2301e.startapp(m902e.equals(c8068e2.ad), adcel2, "uri");
                                                    AbstractC2301e.startapp(tapsense.equals(c8068e2.vip), adcel2, "schema");
                                                    AbstractC2301e.startapp(c4842e2.equals(c8068e2.metrica), adcel2, "handler");
                                                    AbstractC2301e.startapp(c1410e.equals(c8068e2.license), adcel2, "migrations");
                                                    AbstractC2301e.startapp(obj.equals(obj), adcel2, "variantConfig");
                                                    throw new IllegalArgumentException(AbstractC12992e.adcel(adcel2, "unknown"));
                                                case 2:
                                                    ad();
                                                    return;
                                                default:
                                                    C13400e c13400e2 = this.f4174e;
                                                    C12344e ad3 = c13400e2.ad();
                                                    String str4 = (String) ad3.f24749e;
                                                    C13150e c13150e4 = c13400e2.vip;
                                                    C10040e c10040e = c13150e4.billing;
                                                    InterfaceC6823e interfaceC6823e = c13150e4.license;
                                                    C3992e vip3 = c10040e.vip();
                                                    boolean z2 = vip3.startapp;
                                                    if (vip3.adcel) {
                                                        if (AbstractC8433e.license(str4) && !z2) {
                                                            C13747e c13747e = C13747e.f27231e;
                                                            return;
                                                        }
                                                        C9862e tapsense2 = C10315e.tapsense();
                                                        C12434e c12434e = (C12434e) ad3.f24753e;
                                                        int i4 = c12434e.f24874e;
                                                        C7951e signatures = C11013e.signatures();
                                                        signatures.vip();
                                                        ((C11013e) signatures.f12709e).tapsense(i4);
                                                        int i5 = c12434e.f24873e;
                                                        signatures.vip();
                                                        ((C11013e) signatures.f12709e).isVip(i5);
                                                        C11013e c11013e = (C11013e) signatures.appmetrica();
                                                        tapsense2.vip();
                                                        ((C10315e) tapsense2.f12709e).inmobi(c11013e);
                                                        if (!AbstractC8433e.license(str4)) {
                                                            tapsense2.vip();
                                                            ((C10315e) tapsense2.f12709e).isVip(str4);
                                                        }
                                                        if (z2) {
                                                            String str5 = c13400e2.metrica;
                                                            tapsense2.vip();
                                                            ((C10315e) tapsense2.f12709e).isPro(str5);
                                                        }
                                                        C0582e c0582e = (C0582e) interfaceC6823e.get();
                                                        C10315e c10315e = (C10315e) tapsense2.appmetrica();
                                                        C3355e c3355e = c0582e.ad;
                                                        C9321e ad4 = C0381e.ad();
                                                        ad4.ad = new C0047e(c10315e);
                                                        ad4.license = new C1032e[]{AbstractC17540e.license};
                                                        ad4.metrica = true;
                                                        ad4.vip = false;
                                                        vip = C0582e.vip(c3355e.appmetrica(0, ad4.ad()).yandex(EnumC3320e.f7489e, new C9271e(c3355e, c10315e)));
                                                    } else {
                                                        if (AbstractC8433e.license(str4)) {
                                                            C13747e c13747e2 = C13747e.f27231e;
                                                            return;
                                                        }
                                                        C0582e c0582e2 = (C0582e) interfaceC6823e.get();
                                                        c0582e2.getClass();
                                                        str4.getClass();
                                                        vip = C0582e.vip(c0582e2.ad.purchase(str4));
                                                    }
                                                    AbstractC2017e.ad(vip, C4914e.class, new C2169e(i32, c13400e2), c13150e4.ad());
                                                    return;
                                            }
                                        }
                                    });
                                }
                                if (this.yandex.vip()) {
                                    final int i4 = 2;
                                    ((C0918e) c13150e.ad()).execute(new Runnable(this) { // from class: eِؒۡ

                                        /* renamed from: eؘٙؓ, reason: contains not printable characters */
                                        public final /* synthetic */ C13400e f4174e;

                                        {
                                            this.f4174e = this;
                                        }

                                        /*  JADX ERROR: Method code generation error
                                            java.lang.NullPointerException
                                            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                            */
                                        private final void ad() {
                                            /*
                                                r9 = this;
                                                eًْٞ r0 = r9.f4174e
                                                eٌْۨ r1 = r0.vip
                                                eؘِٞ r1 = r1.startapp
                                                boolean r0 = r0.appmetrica
                                                eؗؐؐ r2 = defpackage.C4548e.ad
                                                eؙۨٔ r3 = r1.metrica
                                                java.lang.Object r3 = r3.get()
                                                eؑ۟ۜ r3 = (defpackage.InterfaceC0590e) r3
                                                if (r3 != 0) goto L19
                                                if (r0 != 0) goto L19
                                                eٓؔ٘ r0 = defpackage.C13747e.f27231e
                                                return
                                            L19:
                                                int r0 = r1.appmetrica
                                                r0 = r0 & 64
                                                if (r0 != 0) goto L36
                                                java.util.concurrent.CopyOnWriteArrayList r0 = r1.purchase
                                                monitor-enter(r0)
                                                int r4 = r1.appmetrica     // Catch: java.lang.Throwable -> L30
                                                r5 = r4 & 64
                                                if (r5 != 0) goto L32
                                                r0.add(r2)     // Catch: java.lang.Throwable -> L30
                                                r2 = r4 | 64
                                                r1.appmetrica = r2     // Catch: java.lang.Throwable -> L30
                                                goto L32
                                            L30:
                                                r1 = move-exception
                                                goto L34
                                            L32:
                                                monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
                                                goto L36
                                            L34:
                                                monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
                                                throw r1
                                            L36:
                                                eٖٛؑ r0 = r1.yandex
                                                if (r0 != 0) goto Lac
                                                java.lang.Object r0 = r1.billing
                                                monitor-enter(r0)
                                                eٖٛؑ r2 = r1.yandex     // Catch: java.lang.Throwable -> L46
                                                if (r2 != 0) goto La8
                                                if (r3 != 0) goto L48
                                                eٖؐٞ r3 = defpackage.C15901e.ad     // Catch: java.lang.Throwable -> L46
                                                goto L48
                                            L46:
                                                r1 = move-exception
                                                goto Laa
                                            L48:
                                                android.content.Context r2 = r1.ad     // Catch: java.lang.Throwable -> L46
                                                int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L46
                                                r5 = 24
                                                r6 = 0
                                                if (r4 < r5) goto L59
                                                boolean r4 = defpackage.AbstractC16603e.metrica(r2)     // Catch: java.lang.Throwable -> L46
                                                if (r4 != 0) goto L5b
                                                r4 = 1
                                                goto L5c
                                            L59:
                                                android.os.UserManager r4 = defpackage.AbstractC16603e.ad     // Catch: java.lang.Throwable -> L46
                                            L5b:
                                                r4 = r6
                                            L5c:
                                                if (r4 == 0) goto L83
                                                eٙ۠ r4 = defpackage.RunnableC18182e.f35604e     // Catch: java.lang.Throwable -> L46
                                                eؙۨٔ r5 = r1.vip     // Catch: java.lang.Throwable -> L46
                                                java.lang.Object r7 = r5.get()     // Catch: java.lang.Throwable -> L46
                                                java.util.concurrent.Executor r7 = (java.util.concurrent.Executor) r7     // Catch: java.lang.Throwable -> L46
                                                r8 = 0
                                                java.util.concurrent.Callable r4 = java.util.concurrent.Executors.callable(r4, r8)     // Catch: java.lang.Throwable -> L46
                                                eؚؑ۟ r2 = defpackage.AbstractC16603e.vip(r2, r4, r7)     // Catch: java.lang.Throwable -> L46
                                                eٖؓۜ r4 = new eٖؓۜ     // Catch: java.lang.Throwable -> L46
                                                r4.<init>(r1, r3, r6)     // Catch: java.lang.Throwable -> L46
                                                java.lang.Object r3 = r5.get()     // Catch: java.lang.Throwable -> L46
                                                java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3     // Catch: java.lang.Throwable -> L46
                                                eّؑ۠ r2 = defpackage.AbstractC2017e.billing(r2, r4, r3)     // Catch: java.lang.Throwable -> L46
                                                r1.yandex = r2     // Catch: java.lang.Throwable -> L46
                                                goto L96
                                            L83:
                                                eؙۨٔ r2 = r1.license     // Catch: java.lang.Throwable -> L46
                                                java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L46
                                                eؑ۟ؕ r2 = (defpackage.C0582e) r2     // Catch: java.lang.Throwable -> L46
                                                eًؕٚ r4 = new eًؕٚ     // Catch: java.lang.Throwable -> L46
                                                r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L46
                                                eؘؗؕ r2 = r2.ad(r4)     // Catch: java.lang.Throwable -> L46
                                                r1.yandex = r2     // Catch: java.lang.Throwable -> L46
                                            L96:
                                                eٗؒ۠ r3 = new eٗؒ۠     // Catch: java.lang.Throwable -> L46
                                                r4 = 20
                                                r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L46
                                                eؙۨٔ r1 = r1.vip     // Catch: java.lang.Throwable -> L46
                                                java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L46
                                                java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1     // Catch: java.lang.Throwable -> L46
                                                r2.ad(r3, r1)     // Catch: java.lang.Throwable -> L46
                                            La8:
                                                monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                                                return
                                            Laa:
                                                monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                                                throw r1
                                            Lac:
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC1383e.ad():void");
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Object, eٍٖۢ] */
                                        /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, eُۡٔ] */
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean z;
                                            C13150e c13150e2;
                                            C4842e c4842e;
                                            C1410e c1410e;
                                            C4842e c4842e2;
                                            C5441e vip;
                                            int i32 = 0;
                                            switch (i4) {
                                                case 0:
                                                    this.f4174e.vip();
                                                    return;
                                                case 1:
                                                    C13400e c13400e = this.f4174e;
                                                    C13150e c13150e3 = c13400e.vip;
                                                    String str = c13400e.metrica;
                                                    C11428e c11428e = AbstractC8329e.ad;
                                                    Object obj = C17647e.f34584e;
                                                    byte b = (byte) (((byte) 2) | 1);
                                                    Context context = c13150e3.vip;
                                                    Pattern pattern = AbstractC0481e.ad;
                                                    C2532e c2532e = new C2532e(context);
                                                    c2532e.m917e("phenotype");
                                                    c2532e.m901e("all_accounts.pb");
                                                    Uri m902e = c2532e.m902e();
                                                    if (m902e == null) {
                                                        throw new NullPointerException("Null uri");
                                                    }
                                                    C4089e tapsense = C4089e.tapsense();
                                                    if (tapsense == null) {
                                                        throw new NullPointerException("Null schema");
                                                    }
                                                    C4842e license = AbstractC9621e.license(AbstractC8329e.ad);
                                                    byte b2 = (byte) (b | 2);
                                                    C2171e c2171e = AbstractC17475e.f34223e;
                                                    C1410e c1410e2 = C1410e.f4222e;
                                                    if (b2 != 3) {
                                                        StringBuilder sb = new StringBuilder();
                                                        if ((b2 & 1) == 0) {
                                                            sb.append(" useGeneratedExtensionRegistry");
                                                        }
                                                        if ((b2 & 2) == 0) {
                                                            sb.append(" enableTracing");
                                                        }
                                                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                                                    }
                                                    C8068e c8068e = new C8068e(m902e, tapsense, license, c1410e2);
                                                    C11328e c11328e = AbstractC8329e.metrica;
                                                    if (c11328e == null) {
                                                        synchronized (AbstractC8329e.vip) {
                                                            try {
                                                                c11328e = AbstractC8329e.metrica;
                                                                if (c11328e == null) {
                                                                    HashMap hashMap = new HashMap();
                                                                    InterfaceScheduledExecutorServiceC1678e ad2 = c13150e3.ad();
                                                                    C6843e c6843e = (C6843e) c13150e3.purchase.get();
                                                                    z = true;
                                                                    C5752e c5752e = C5752e.ad;
                                                                    c13150e2 = c13150e3;
                                                                    c4842e = license;
                                                                    AbstractC2301e.startapp(!hashMap.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                    hashMap.put("singleproc", c5752e);
                                                                    ?? obj2 = new Object();
                                                                    obj2.f22774e = new ConcurrentHashMap();
                                                                    ad2.getClass();
                                                                    obj2.f22772e = ad2;
                                                                    c6843e.getClass();
                                                                    obj2.f22771e = c6843e;
                                                                    obj2.f22770e = hashMap;
                                                                    AbstractC2301e.billing(!hashMap.isEmpty());
                                                                    obj2.f22773e = C4132e.metrica;
                                                                    AbstractC8329e.metrica = obj2;
                                                                    c11328e = obj2;
                                                                } else {
                                                                    z = true;
                                                                    c13150e2 = c13150e3;
                                                                    c4842e = license;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    } else {
                                                        z = true;
                                                        c13150e2 = c13150e3;
                                                        c4842e = license;
                                                    }
                                                    String str2 = BuildConfig.FLAVOR;
                                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c11328e.f22774e;
                                                    Pair pair = (Pair) concurrentHashMap.get(m902e);
                                                    if (pair == null) {
                                                        AbstractC2301e.startapp(m902e.isHierarchical(), "Uri must be hierarchical: %s", m902e);
                                                        String lastPathSegment = m902e.getLastPathSegment();
                                                        if (lastPathSegment == null) {
                                                            lastPathSegment = BuildConfig.FLAVOR;
                                                        }
                                                        int lastIndexOf = lastPathSegment.lastIndexOf(46);
                                                        AbstractC2301e.startapp((lastIndexOf == -1 ? BuildConfig.FLAVOR : lastPathSegment.substring(lastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", m902e);
                                                        C5752e c5752e2 = (C5752e) ((HashMap) c11328e.f22770e).get("singleproc");
                                                        AbstractC2301e.startapp(c5752e2 != null ? z : false, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                        String lastPathSegment2 = m902e.getLastPathSegment();
                                                        if (lastPathSegment2 != null) {
                                                            str2 = lastPathSegment2;
                                                        }
                                                        int lastIndexOf2 = str2.lastIndexOf(46);
                                                        if (lastIndexOf2 != -1) {
                                                            str2 = str2.substring(0, lastIndexOf2);
                                                        }
                                                        C12183e billing = AbstractC2017e.billing(AbstractC2017e.license(m902e), (C4132e) c11328e.f22773e, EnumC3320e.f7489e);
                                                        Executor executor = (Executor) c11328e.f22772e;
                                                        C6843e c6843e2 = (C6843e) c11328e.f22771e;
                                                        c5752e2.getClass();
                                                        String str3 = str2;
                                                        c1410e = c1410e2;
                                                        c4842e2 = c4842e;
                                                        C9664e c9664e = new C9664e(new C14742e(str3, AbstractC2017e.license(m902e), new C0492e(tapsense, C17268e.ad()), executor, c6843e2, c4842e, (C9838e) new Object()), billing);
                                                        if (!c1410e.isEmpty()) {
                                                            c9664e.ad(new C2111e(c1410e, executor, z ? 1 : 0));
                                                        }
                                                        pair = Pair.create(c9664e, c8068e);
                                                        Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(m902e, pair);
                                                        if (pair2 != null) {
                                                            pair = pair2;
                                                        }
                                                    } else {
                                                        c1410e = c1410e2;
                                                        c4842e2 = c4842e;
                                                    }
                                                    C9664e c9664e2 = (C9664e) pair.first;
                                                    C8068e c8068e2 = (C8068e) pair.second;
                                                    if (c8068e.equals(c8068e2)) {
                                                        C9590e vip2 = c9664e2.vip(new C2713e(2, str), c13150e2.ad());
                                                        vip2.ad(new RunnableC1965e(c13400e, vip2, 0), c13150e2.ad());
                                                        return;
                                                    }
                                                    String adcel2 = AbstractC12992e.adcel("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", C4089e.class.getSimpleName(), m902e);
                                                    AbstractC2301e.startapp(m902e.equals(c8068e2.ad), adcel2, "uri");
                                                    AbstractC2301e.startapp(tapsense.equals(c8068e2.vip), adcel2, "schema");
                                                    AbstractC2301e.startapp(c4842e2.equals(c8068e2.metrica), adcel2, "handler");
                                                    AbstractC2301e.startapp(c1410e.equals(c8068e2.license), adcel2, "migrations");
                                                    AbstractC2301e.startapp(obj.equals(obj), adcel2, "variantConfig");
                                                    throw new IllegalArgumentException(AbstractC12992e.adcel(adcel2, "unknown"));
                                                case 2:
                                                    ad();
                                                    return;
                                                default:
                                                    C13400e c13400e2 = this.f4174e;
                                                    C12344e ad3 = c13400e2.ad();
                                                    String str4 = (String) ad3.f24749e;
                                                    C13150e c13150e4 = c13400e2.vip;
                                                    C10040e c10040e = c13150e4.billing;
                                                    InterfaceC6823e interfaceC6823e = c13150e4.license;
                                                    C3992e vip3 = c10040e.vip();
                                                    boolean z2 = vip3.startapp;
                                                    if (vip3.adcel) {
                                                        if (AbstractC8433e.license(str4) && !z2) {
                                                            C13747e c13747e = C13747e.f27231e;
                                                            return;
                                                        }
                                                        C9862e tapsense2 = C10315e.tapsense();
                                                        C12434e c12434e = (C12434e) ad3.f24753e;
                                                        int i42 = c12434e.f24874e;
                                                        C7951e signatures = C11013e.signatures();
                                                        signatures.vip();
                                                        ((C11013e) signatures.f12709e).tapsense(i42);
                                                        int i5 = c12434e.f24873e;
                                                        signatures.vip();
                                                        ((C11013e) signatures.f12709e).isVip(i5);
                                                        C11013e c11013e = (C11013e) signatures.appmetrica();
                                                        tapsense2.vip();
                                                        ((C10315e) tapsense2.f12709e).inmobi(c11013e);
                                                        if (!AbstractC8433e.license(str4)) {
                                                            tapsense2.vip();
                                                            ((C10315e) tapsense2.f12709e).isVip(str4);
                                                        }
                                                        if (z2) {
                                                            String str5 = c13400e2.metrica;
                                                            tapsense2.vip();
                                                            ((C10315e) tapsense2.f12709e).isPro(str5);
                                                        }
                                                        C0582e c0582e = (C0582e) interfaceC6823e.get();
                                                        C10315e c10315e = (C10315e) tapsense2.appmetrica();
                                                        C3355e c3355e = c0582e.ad;
                                                        C9321e ad4 = C0381e.ad();
                                                        ad4.ad = new C0047e(c10315e);
                                                        ad4.license = new C1032e[]{AbstractC17540e.license};
                                                        ad4.metrica = true;
                                                        ad4.vip = false;
                                                        vip = C0582e.vip(c3355e.appmetrica(0, ad4.ad()).yandex(EnumC3320e.f7489e, new C9271e(c3355e, c10315e)));
                                                    } else {
                                                        if (AbstractC8433e.license(str4)) {
                                                            C13747e c13747e2 = C13747e.f27231e;
                                                            return;
                                                        }
                                                        C0582e c0582e2 = (C0582e) interfaceC6823e.get();
                                                        c0582e2.getClass();
                                                        str4.getClass();
                                                        vip = C0582e.vip(c0582e2.ad.purchase(str4));
                                                    }
                                                    AbstractC2017e.ad(vip, C4914e.class, new C2169e(i32, c13400e2), c13150e4.ad());
                                                    return;
                                            }
                                        }
                                    });
                                }
                            } else {
                                final int i5 = 0;
                                ((C0918e) c13150e.ad()).execute(new Runnable(this) { // from class: eِؒۡ

                                    /* renamed from: eؘٙؓ, reason: contains not printable characters */
                                    public final /* synthetic */ C13400e f4174e;

                                    {
                                        this.f4174e = this;
                                    }

                                    /*  JADX ERROR: Method code generation error
                                        java.lang.NullPointerException
                                        	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                        */
                                    private final void ad() {
                                        /*
                                            r9 = this;
                                            eًْٞ r0 = r9.f4174e
                                            eٌْۨ r1 = r0.vip
                                            eؘِٞ r1 = r1.startapp
                                            boolean r0 = r0.appmetrica
                                            eؗؐؐ r2 = defpackage.C4548e.ad
                                            eؙۨٔ r3 = r1.metrica
                                            java.lang.Object r3 = r3.get()
                                            eؑ۟ۜ r3 = (defpackage.InterfaceC0590e) r3
                                            if (r3 != 0) goto L19
                                            if (r0 != 0) goto L19
                                            eٓؔ٘ r0 = defpackage.C13747e.f27231e
                                            return
                                        L19:
                                            int r0 = r1.appmetrica
                                            r0 = r0 & 64
                                            if (r0 != 0) goto L36
                                            java.util.concurrent.CopyOnWriteArrayList r0 = r1.purchase
                                            monitor-enter(r0)
                                            int r4 = r1.appmetrica     // Catch: java.lang.Throwable -> L30
                                            r5 = r4 & 64
                                            if (r5 != 0) goto L32
                                            r0.add(r2)     // Catch: java.lang.Throwable -> L30
                                            r2 = r4 | 64
                                            r1.appmetrica = r2     // Catch: java.lang.Throwable -> L30
                                            goto L32
                                        L30:
                                            r1 = move-exception
                                            goto L34
                                        L32:
                                            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
                                            goto L36
                                        L34:
                                            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
                                            throw r1
                                        L36:
                                            eٖٛؑ r0 = r1.yandex
                                            if (r0 != 0) goto Lac
                                            java.lang.Object r0 = r1.billing
                                            monitor-enter(r0)
                                            eٖٛؑ r2 = r1.yandex     // Catch: java.lang.Throwable -> L46
                                            if (r2 != 0) goto La8
                                            if (r3 != 0) goto L48
                                            eٖؐٞ r3 = defpackage.C15901e.ad     // Catch: java.lang.Throwable -> L46
                                            goto L48
                                        L46:
                                            r1 = move-exception
                                            goto Laa
                                        L48:
                                            android.content.Context r2 = r1.ad     // Catch: java.lang.Throwable -> L46
                                            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L46
                                            r5 = 24
                                            r6 = 0
                                            if (r4 < r5) goto L59
                                            boolean r4 = defpackage.AbstractC16603e.metrica(r2)     // Catch: java.lang.Throwable -> L46
                                            if (r4 != 0) goto L5b
                                            r4 = 1
                                            goto L5c
                                        L59:
                                            android.os.UserManager r4 = defpackage.AbstractC16603e.ad     // Catch: java.lang.Throwable -> L46
                                        L5b:
                                            r4 = r6
                                        L5c:
                                            if (r4 == 0) goto L83
                                            eٙ۠ r4 = defpackage.RunnableC18182e.f35604e     // Catch: java.lang.Throwable -> L46
                                            eؙۨٔ r5 = r1.vip     // Catch: java.lang.Throwable -> L46
                                            java.lang.Object r7 = r5.get()     // Catch: java.lang.Throwable -> L46
                                            java.util.concurrent.Executor r7 = (java.util.concurrent.Executor) r7     // Catch: java.lang.Throwable -> L46
                                            r8 = 0
                                            java.util.concurrent.Callable r4 = java.util.concurrent.Executors.callable(r4, r8)     // Catch: java.lang.Throwable -> L46
                                            eؚؑ۟ r2 = defpackage.AbstractC16603e.vip(r2, r4, r7)     // Catch: java.lang.Throwable -> L46
                                            eٖؓۜ r4 = new eٖؓۜ     // Catch: java.lang.Throwable -> L46
                                            r4.<init>(r1, r3, r6)     // Catch: java.lang.Throwable -> L46
                                            java.lang.Object r3 = r5.get()     // Catch: java.lang.Throwable -> L46
                                            java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3     // Catch: java.lang.Throwable -> L46
                                            eّؑ۠ r2 = defpackage.AbstractC2017e.billing(r2, r4, r3)     // Catch: java.lang.Throwable -> L46
                                            r1.yandex = r2     // Catch: java.lang.Throwable -> L46
                                            goto L96
                                        L83:
                                            eؙۨٔ r2 = r1.license     // Catch: java.lang.Throwable -> L46
                                            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L46
                                            eؑ۟ؕ r2 = (defpackage.C0582e) r2     // Catch: java.lang.Throwable -> L46
                                            eًؕٚ r4 = new eًؕٚ     // Catch: java.lang.Throwable -> L46
                                            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L46
                                            eؘؗؕ r2 = r2.ad(r4)     // Catch: java.lang.Throwable -> L46
                                            r1.yandex = r2     // Catch: java.lang.Throwable -> L46
                                        L96:
                                            eٗؒ۠ r3 = new eٗؒ۠     // Catch: java.lang.Throwable -> L46
                                            r4 = 20
                                            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L46
                                            eؙۨٔ r1 = r1.vip     // Catch: java.lang.Throwable -> L46
                                            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L46
                                            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1     // Catch: java.lang.Throwable -> L46
                                            r2.ad(r3, r1)     // Catch: java.lang.Throwable -> L46
                                        La8:
                                            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                                            return
                                        Laa:
                                            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                                            throw r1
                                        Lac:
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC1383e.ad():void");
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Object, eٍٖۢ] */
                                    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, eُۡٔ] */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z;
                                        C13150e c13150e2;
                                        C4842e c4842e;
                                        C1410e c1410e;
                                        C4842e c4842e2;
                                        C5441e vip;
                                        int i32 = 0;
                                        switch (i5) {
                                            case 0:
                                                this.f4174e.vip();
                                                return;
                                            case 1:
                                                C13400e c13400e = this.f4174e;
                                                C13150e c13150e3 = c13400e.vip;
                                                String str = c13400e.metrica;
                                                C11428e c11428e = AbstractC8329e.ad;
                                                Object obj = C17647e.f34584e;
                                                byte b = (byte) (((byte) 2) | 1);
                                                Context context = c13150e3.vip;
                                                Pattern pattern = AbstractC0481e.ad;
                                                C2532e c2532e = new C2532e(context);
                                                c2532e.m917e("phenotype");
                                                c2532e.m901e("all_accounts.pb");
                                                Uri m902e = c2532e.m902e();
                                                if (m902e == null) {
                                                    throw new NullPointerException("Null uri");
                                                }
                                                C4089e tapsense = C4089e.tapsense();
                                                if (tapsense == null) {
                                                    throw new NullPointerException("Null schema");
                                                }
                                                C4842e license = AbstractC9621e.license(AbstractC8329e.ad);
                                                byte b2 = (byte) (b | 2);
                                                C2171e c2171e = AbstractC17475e.f34223e;
                                                C1410e c1410e2 = C1410e.f4222e;
                                                if (b2 != 3) {
                                                    StringBuilder sb = new StringBuilder();
                                                    if ((b2 & 1) == 0) {
                                                        sb.append(" useGeneratedExtensionRegistry");
                                                    }
                                                    if ((b2 & 2) == 0) {
                                                        sb.append(" enableTracing");
                                                    }
                                                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                                                }
                                                C8068e c8068e = new C8068e(m902e, tapsense, license, c1410e2);
                                                C11328e c11328e = AbstractC8329e.metrica;
                                                if (c11328e == null) {
                                                    synchronized (AbstractC8329e.vip) {
                                                        try {
                                                            c11328e = AbstractC8329e.metrica;
                                                            if (c11328e == null) {
                                                                HashMap hashMap = new HashMap();
                                                                InterfaceScheduledExecutorServiceC1678e ad2 = c13150e3.ad();
                                                                C6843e c6843e = (C6843e) c13150e3.purchase.get();
                                                                z = true;
                                                                C5752e c5752e = C5752e.ad;
                                                                c13150e2 = c13150e3;
                                                                c4842e = license;
                                                                AbstractC2301e.startapp(!hashMap.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                hashMap.put("singleproc", c5752e);
                                                                ?? obj2 = new Object();
                                                                obj2.f22774e = new ConcurrentHashMap();
                                                                ad2.getClass();
                                                                obj2.f22772e = ad2;
                                                                c6843e.getClass();
                                                                obj2.f22771e = c6843e;
                                                                obj2.f22770e = hashMap;
                                                                AbstractC2301e.billing(!hashMap.isEmpty());
                                                                obj2.f22773e = C4132e.metrica;
                                                                AbstractC8329e.metrica = obj2;
                                                                c11328e = obj2;
                                                            } else {
                                                                z = true;
                                                                c13150e2 = c13150e3;
                                                                c4842e = license;
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                } else {
                                                    z = true;
                                                    c13150e2 = c13150e3;
                                                    c4842e = license;
                                                }
                                                String str2 = BuildConfig.FLAVOR;
                                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c11328e.f22774e;
                                                Pair pair = (Pair) concurrentHashMap.get(m902e);
                                                if (pair == null) {
                                                    AbstractC2301e.startapp(m902e.isHierarchical(), "Uri must be hierarchical: %s", m902e);
                                                    String lastPathSegment = m902e.getLastPathSegment();
                                                    if (lastPathSegment == null) {
                                                        lastPathSegment = BuildConfig.FLAVOR;
                                                    }
                                                    int lastIndexOf = lastPathSegment.lastIndexOf(46);
                                                    AbstractC2301e.startapp((lastIndexOf == -1 ? BuildConfig.FLAVOR : lastPathSegment.substring(lastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", m902e);
                                                    C5752e c5752e2 = (C5752e) ((HashMap) c11328e.f22770e).get("singleproc");
                                                    AbstractC2301e.startapp(c5752e2 != null ? z : false, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                    String lastPathSegment2 = m902e.getLastPathSegment();
                                                    if (lastPathSegment2 != null) {
                                                        str2 = lastPathSegment2;
                                                    }
                                                    int lastIndexOf2 = str2.lastIndexOf(46);
                                                    if (lastIndexOf2 != -1) {
                                                        str2 = str2.substring(0, lastIndexOf2);
                                                    }
                                                    C12183e billing = AbstractC2017e.billing(AbstractC2017e.license(m902e), (C4132e) c11328e.f22773e, EnumC3320e.f7489e);
                                                    Executor executor = (Executor) c11328e.f22772e;
                                                    C6843e c6843e2 = (C6843e) c11328e.f22771e;
                                                    c5752e2.getClass();
                                                    String str3 = str2;
                                                    c1410e = c1410e2;
                                                    c4842e2 = c4842e;
                                                    C9664e c9664e = new C9664e(new C14742e(str3, AbstractC2017e.license(m902e), new C0492e(tapsense, C17268e.ad()), executor, c6843e2, c4842e, (C9838e) new Object()), billing);
                                                    if (!c1410e.isEmpty()) {
                                                        c9664e.ad(new C2111e(c1410e, executor, z ? 1 : 0));
                                                    }
                                                    pair = Pair.create(c9664e, c8068e);
                                                    Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(m902e, pair);
                                                    if (pair2 != null) {
                                                        pair = pair2;
                                                    }
                                                } else {
                                                    c1410e = c1410e2;
                                                    c4842e2 = c4842e;
                                                }
                                                C9664e c9664e2 = (C9664e) pair.first;
                                                C8068e c8068e2 = (C8068e) pair.second;
                                                if (c8068e.equals(c8068e2)) {
                                                    C9590e vip2 = c9664e2.vip(new C2713e(2, str), c13150e2.ad());
                                                    vip2.ad(new RunnableC1965e(c13400e, vip2, 0), c13150e2.ad());
                                                    return;
                                                }
                                                String adcel2 = AbstractC12992e.adcel("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", C4089e.class.getSimpleName(), m902e);
                                                AbstractC2301e.startapp(m902e.equals(c8068e2.ad), adcel2, "uri");
                                                AbstractC2301e.startapp(tapsense.equals(c8068e2.vip), adcel2, "schema");
                                                AbstractC2301e.startapp(c4842e2.equals(c8068e2.metrica), adcel2, "handler");
                                                AbstractC2301e.startapp(c1410e.equals(c8068e2.license), adcel2, "migrations");
                                                AbstractC2301e.startapp(obj.equals(obj), adcel2, "variantConfig");
                                                throw new IllegalArgumentException(AbstractC12992e.adcel(adcel2, "unknown"));
                                            case 2:
                                                ad();
                                                return;
                                            default:
                                                C13400e c13400e2 = this.f4174e;
                                                C12344e ad3 = c13400e2.ad();
                                                String str4 = (String) ad3.f24749e;
                                                C13150e c13150e4 = c13400e2.vip;
                                                C10040e c10040e = c13150e4.billing;
                                                InterfaceC6823e interfaceC6823e = c13150e4.license;
                                                C3992e vip3 = c10040e.vip();
                                                boolean z2 = vip3.startapp;
                                                if (vip3.adcel) {
                                                    if (AbstractC8433e.license(str4) && !z2) {
                                                        C13747e c13747e = C13747e.f27231e;
                                                        return;
                                                    }
                                                    C9862e tapsense2 = C10315e.tapsense();
                                                    C12434e c12434e = (C12434e) ad3.f24753e;
                                                    int i42 = c12434e.f24874e;
                                                    C7951e signatures = C11013e.signatures();
                                                    signatures.vip();
                                                    ((C11013e) signatures.f12709e).tapsense(i42);
                                                    int i52 = c12434e.f24873e;
                                                    signatures.vip();
                                                    ((C11013e) signatures.f12709e).isVip(i52);
                                                    C11013e c11013e = (C11013e) signatures.appmetrica();
                                                    tapsense2.vip();
                                                    ((C10315e) tapsense2.f12709e).inmobi(c11013e);
                                                    if (!AbstractC8433e.license(str4)) {
                                                        tapsense2.vip();
                                                        ((C10315e) tapsense2.f12709e).isVip(str4);
                                                    }
                                                    if (z2) {
                                                        String str5 = c13400e2.metrica;
                                                        tapsense2.vip();
                                                        ((C10315e) tapsense2.f12709e).isPro(str5);
                                                    }
                                                    C0582e c0582e = (C0582e) interfaceC6823e.get();
                                                    C10315e c10315e = (C10315e) tapsense2.appmetrica();
                                                    C3355e c3355e = c0582e.ad;
                                                    C9321e ad4 = C0381e.ad();
                                                    ad4.ad = new C0047e(c10315e);
                                                    ad4.license = new C1032e[]{AbstractC17540e.license};
                                                    ad4.metrica = true;
                                                    ad4.vip = false;
                                                    vip = C0582e.vip(c3355e.appmetrica(0, ad4.ad()).yandex(EnumC3320e.f7489e, new C9271e(c3355e, c10315e)));
                                                } else {
                                                    if (AbstractC8433e.license(str4)) {
                                                        C13747e c13747e2 = C13747e.f27231e;
                                                        return;
                                                    }
                                                    C0582e c0582e2 = (C0582e) interfaceC6823e.get();
                                                    c0582e2.getClass();
                                                    str4.getClass();
                                                    vip = C0582e.vip(c0582e2.ad.purchase(str4));
                                                }
                                                AbstractC2017e.ad(vip, C4914e.class, new C2169e(i32, c13400e2), c13150e4.ad());
                                                return;
                                        }
                                    }
                                });
                                c12344e = new C12344e(C10228e.premium(), (C12434e) ad.f24753e);
                                if (this.appmetrica || ((C12434e) c12344e.f24753e).f24873e != 17) {
                                    this.ad = c12344e;
                                }
                            }
                        }
                        c12344e = ad;
                        if (this.appmetrica) {
                        }
                        this.ad = c12344e;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        throw th;
                    }
                }
            } finally {
            }
        }
        return c12344e;
    }

    public final void vip() {
        C11493e c11493e = this.yandex;
        C13150e c13150e = c11493e.ad;
        C0582e c0582e = (C0582e) c13150e.license.get();
        String str = c11493e.metrica;
        c0582e.getClass();
        str.getClass();
        C3355e c3355e = c0582e.ad;
        C9321e ad = C0381e.ad();
        ad.ad = new C11594e(str, 1);
        C9590e purchase = AbstractC2017e.purchase(C0582e.vip(c3355e.appmetrica(0, ad.ad()).billing(EnumC3320e.f7489e, new C7249e(23))), C7170e.f14660e, c13150e.ad());
        C2169e c2169e = new C2169e(1, c11493e);
        C13150e c13150e2 = this.vip;
        AbstractC2017e.billing(purchase, c2169e, c13150e2.ad()).ad(new RunnableC1965e(this, purchase, 1), c13150e2.ad());
    }
}
