package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٓٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C14137e implements InterfaceC0888e {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C6599e f27962e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Function1 f27963e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f27964e;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f27958e = AtomicLongFieldUpdater.newUpdater(C14137e.class, "sendersAndCloseStatus$volatile");

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f27953e = AtomicLongFieldUpdater.newUpdater(C14137e.class, "receivers$volatile");

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f27961e = AtomicLongFieldUpdater.newUpdater(C14137e.class, "bufferEnd$volatile");

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f27960e = AtomicLongFieldUpdater.newUpdater(C14137e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f27956e = AtomicReferenceFieldUpdater.newUpdater(C14137e.class, Object.class, "sendSegment$volatile");

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f27959e = AtomicReferenceFieldUpdater.newUpdater(C14137e.class, Object.class, "receiveSegment$volatile");

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f27955e = AtomicReferenceFieldUpdater.newUpdater(C14137e.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f27957e = AtomicReferenceFieldUpdater.newUpdater(C14137e.class, Object.class, "_closeCause$volatile");

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f27954e = AtomicReferenceFieldUpdater.newUpdater(C14137e.class, Object.class, "closeHandler$volatile");

    public C14137e(int i, Function1 function1) {
        this.f27964e = i;
        this.f27963e = function1;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("Invalid channel capacity: ", i, ", should be >=0").toString());
        }
        C0922e c0922e = AbstractC11295e.ad;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f27961e.get(this);
        C0922e c0922e2 = new C0922e(0L, null, this, 3);
        this.sendSegment$volatile = c0922e2;
        this.receiveSegment$volatile = c0922e2;
        this.bufferEndSegment$volatile = firebase() ? AbstractC11295e.ad : c0922e2;
        this.f27962e = function1 != null ? new C6599e(9, this) : null;
        this._closeCause$volatile = AbstractC11295e.remoteconfig;
    }

    public static final C0922e ad(C14137e c14137e, long j, C0922e c0922e) {
        Object purchase;
        C14137e c14137e2;
        C0922e c0922e2 = AbstractC11295e.ad;
        C18492e c18492e = C18492e.f36251e;
        loop0: while (true) {
            purchase = AbstractC2251e.purchase(c0922e, j, c18492e);
            if (!AbstractC1101e.purchase(purchase)) {
                AbstractC12466e appmetrica = AbstractC1101e.appmetrica(purchase);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27956e;
                    AbstractC12466e abstractC12466e = (AbstractC12466e) atomicReferenceFieldUpdater.get(c14137e);
                    if (abstractC12466e.f24956e >= appmetrica.f24956e) {
                        break loop0;
                    }
                    if (!appmetrica.adcel()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c14137e, abstractC12466e, appmetrica)) {
                        if (atomicReferenceFieldUpdater.get(c14137e) != abstractC12466e) {
                            if (appmetrica.purchase()) {
                                appmetrica.appmetrica();
                            }
                        }
                    }
                    if (abstractC12466e.purchase()) {
                        abstractC12466e.appmetrica();
                    }
                }
            } else {
                break;
            }
        }
        boolean purchase2 = AbstractC1101e.purchase(purchase);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27953e;
        if (purchase2) {
            c14137e.subs();
            if (c0922e.f24956e * AbstractC11295e.vip < atomicLongFieldUpdater.get(c14137e)) {
                c0922e.vip();
                return null;
            }
        } else {
            C0922e c0922e3 = (C0922e) AbstractC1101e.appmetrica(purchase);
            long j2 = c0922e3.f24956e;
            if (j2 <= j) {
                return c0922e3;
            }
            long j3 = AbstractC11295e.vip * j2;
            while (true) {
                long j4 = f27958e.get(c14137e);
                long j5 = 1152921504606846975L & j4;
                if (j5 >= j3) {
                    c14137e2 = c14137e;
                    break;
                }
                c14137e2 = c14137e;
                if (f27958e.compareAndSet(c14137e2, j4, (((int) (j4 >> 60)) << 60) + j5)) {
                    break;
                }
                c14137e = c14137e2;
            }
            if (j2 * AbstractC11295e.vip < atomicLongFieldUpdater.get(c14137e2)) {
                c0922e3.vip();
            }
        }
        return null;
    }

    public static void applovin(C14137e c14137e) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27960e;
        if ((atomicLongFieldUpdater.addAndGet(c14137e, 1L) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((atomicLongFieldUpdater.get(c14137e) & 4611686018427387904L) != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: goto, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m3754goto(defpackage.C14137e r13, defpackage.AbstractC10731e r14) {
        /*
            boolean r0 = r14 instanceof defpackage.C5807e
            if (r0 == 0) goto L14
            r0 = r14
            eؘٟٞ r0 = (defpackage.C5807e) r0
            int r1 = r0.f12259e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f12259e = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            eؘٟٞ r0 = new eؘٟٞ
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f12258e
            int r0 = r6.f12259e
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            defpackage.AbstractC2003e.purchase(r14)
            eًُؑ r14 = (defpackage.C0183e) r14
            java.lang.Object r13 = r14.ad
            return r13
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            defpackage.AbstractC2003e.purchase(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = defpackage.C14137e.f27959e
            java.lang.Object r14 = r14.get(r13)
            eؚؒۧ r14 = (defpackage.C0922e) r14
        L3e:
            boolean r0 = r13.premium()
            if (r0 == 0) goto L4e
            java.lang.Throwable r13 = r13.signatures()
            eٓۧٓ r14 = new eٓۧٓ
            r14.<init>(r13)
            return r14
        L4e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.C14137e.f27953e
            long r4 = r0.getAndIncrement(r13)
            int r0 = defpackage.AbstractC11295e.vip
            long r2 = (long) r0
            long r7 = r4 / r2
            long r2 = r4 % r2
            int r3 = (int) r2
            long r9 = r14.f24956e
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L6b
            eؚؒۧ r0 = r13.pro(r7, r14)
            if (r0 != 0) goto L69
            goto L3e
        L69:
            r2 = r0
            goto L6c
        L6b:
            r2 = r14
        L6c:
            r12 = 0
            r7 = r13
            r8 = r2
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.m3763while(r8, r9, r10, r12)
            eًؚؔ r14 = defpackage.AbstractC11295e.smaato
            if (r13 == r14) goto La0
            eًؚؔ r14 = defpackage.AbstractC11295e.loadAd
            if (r13 != r14) goto L8b
            long r13 = r7.isPro()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L88
            r2.vip()
        L88:
            r14 = r2
            r13 = r7
            goto L3e
        L8b:
            eًؚؔ r14 = defpackage.AbstractC11295e.amazon
            if (r13 != r14) goto L9c
            r6.f12259e = r1
            r1 = r7
            java.lang.Object r13 = r1.m3760this(r2, r3, r4, r6)
            eٟؔۙ r14 = defpackage.EnumC2821e.f6782e
            if (r13 != r14) goto L9b
            return r14
        L9b:
            return r13
        L9c:
            r2.vip()
            return r13
        La0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14137e.m3754goto(eٖٓٞ, eُؑ۠):java.lang.Object");
    }

    public static final void license(C14137e c14137e, InterfaceC11221e interfaceC11221e) {
        C0922e c0922e;
        C14137e c14137e2;
        InterfaceC11221e interfaceC11221e2;
        int i;
        c14137e.getClass();
        C0922e c0922e2 = (C0922e) f27959e.get(c14137e);
        while (!c14137e.premium()) {
            long andIncrement = f27953e.getAndIncrement(c14137e);
            long j = AbstractC11295e.vip;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (c0922e2.f24956e != j2) {
                C0922e pro = c14137e.pro(j2, c0922e2);
                if (pro == null) {
                    continue;
                } else {
                    c0922e = pro;
                    interfaceC11221e2 = interfaceC11221e;
                    i = i2;
                    c14137e2 = c14137e;
                }
            } else {
                c0922e = c0922e2;
                c14137e2 = c14137e;
                interfaceC11221e2 = interfaceC11221e;
                i = i2;
            }
            Object m3763while = c14137e2.m3763while(c0922e, i, andIncrement, interfaceC11221e2);
            c0922e2 = c0922e;
            if (m3763while == AbstractC11295e.smaato) {
                InterfaceC5634e interfaceC5634e = interfaceC11221e2 instanceof InterfaceC5634e ? (InterfaceC5634e) interfaceC11221e2 : null;
                if (interfaceC5634e != null) {
                    interfaceC5634e.metrica(c0922e2, i);
                    return;
                }
                return;
            }
            if (m3763while != AbstractC11295e.loadAd) {
                if (m3763while == AbstractC11295e.amazon) {
                    throw new IllegalStateException("unexpected");
                }
                c0922e2.vip();
                ((C16259e) interfaceC11221e2).f31935e = m3763while;
                return;
            }
            if (andIncrement < c14137e2.isPro()) {
                c0922e2.vip();
            }
            c14137e = c14137e2;
            interfaceC11221e = interfaceC11221e2;
        }
        ((C16259e) interfaceC11221e).f31935e = AbstractC11295e.advert;
    }

    public static final int purchase(C14137e c14137e, C0922e c0922e, int i, Object obj, long j, Object obj2, boolean z) {
        c0922e.amazon(i, obj);
        if (z) {
            return c14137e.m3762try(c0922e, i, obj, j, obj2, z);
        }
        Object advert = c0922e.advert(i);
        if (advert == null) {
            if (c14137e.advert(j)) {
                if (c0922e.mopub(i, null, AbstractC11295e.license)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c0922e.mopub(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (advert instanceof InterfaceC5634e) {
            c0922e.amazon(i, null);
            if (c14137e.m3756extends(advert, obj)) {
                c0922e.loadAd(i, AbstractC11295e.startapp);
                return 0;
            }
            C2443e c2443e = AbstractC11295e.mopub;
            if (c0922e.f3344e.getAndSet((i * 2) + 1, c2443e) == c2443e) {
                return 5;
            }
            c0922e.smaato(i, true);
            return 5;
        }
        return c14137e.m3762try(c0922e, i, obj, j, obj2, z);
    }

    public static final void vip(C14137e c14137e, Object obj, C13578e c13578e) {
        Function1 function1 = c14137e.f27963e;
        if (function1 != null) {
            AbstractC6401e.license(function1, obj, c13578e.f26926e);
        }
        c13578e.billing(new C12763e(c14137e.inmobi()));
    }

    @Override // defpackage.InterfaceC10441e
    public final void Signature(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        smaato(cancellationException, true);
    }

    public final C9335e adcel() {
        return new C9335e(3, this, C14137e.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 0, 2);
    }

    public final void admob(long j) {
        C14803e appmetrica;
        C0922e c0922e = (C0922e) f27959e.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f27953e;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.f27964e + j2, f27961e.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                long j3 = AbstractC11295e.vip;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (c0922e.f24956e != j4) {
                    C0922e pro = pro(j4, c0922e);
                    if (pro == null) {
                        continue;
                    } else {
                        c0922e = pro;
                    }
                }
                C0922e c0922e2 = c0922e;
                Object m3763while = m3763while(c0922e2, i, j2, null);
                if (m3763while != AbstractC11295e.loadAd) {
                    c0922e2.vip();
                    Function1 function1 = this.f27963e;
                    if (function1 != null && (appmetrica = AbstractC6401e.appmetrica(function1, m3763while, null)) != null) {
                        throw appmetrica;
                    }
                } else if (j2 < isPro()) {
                    c0922e2.vip();
                }
                c0922e = c0922e2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cf, code lost:
    
        r9 = r9 - 1;
        r7 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0063, code lost:
    
        r16 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ads(long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14137e.ads(long, boolean):boolean");
    }

    public final boolean advert(long j) {
        return j < f27961e.get(this) || j < f27953e.get(this) + ((long) this.f27964e);
    }

    @Override // defpackage.InterfaceC15080e
    public Object amazon(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27958e;
        boolean z = false;
        long j = 1152921504606846975L;
        boolean z2 = ads(atomicLongFieldUpdater.get(this), false) ? false : !advert(r1 & 1152921504606846975L);
        C8870e c8870e = C0183e.vip;
        if (z2) {
            return c8870e;
        }
        InterfaceC7004e interfaceC7004e = AbstractC11295e.adcel;
        C0922e c0922e = (C0922e) f27956e.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & j;
            boolean ads = ads(andIncrement, z);
            int i = AbstractC11295e.vip;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (c0922e.f24956e != j4) {
                C0922e ad = ad(this, j4, c0922e);
                if (ad != null) {
                    c0922e = ad;
                } else {
                    if (ads) {
                        return new C14395e(inmobi());
                    }
                    z = false;
                    j = 1152921504606846975L;
                }
            }
            int purchase = purchase(this, c0922e, i2, obj, j2, interfaceC7004e, ads);
            if (purchase == 0) {
                c0922e.vip();
                return Unit.INSTANCE;
            }
            if (purchase == 1) {
                return Unit.INSTANCE;
            }
            if (purchase == 2) {
                if (ads) {
                    c0922e.startapp();
                    return new C14395e(inmobi());
                }
                InterfaceC5634e interfaceC5634e = interfaceC7004e instanceof InterfaceC5634e ? (InterfaceC5634e) interfaceC7004e : null;
                if (interfaceC5634e != null) {
                    interfaceC5634e.metrica(c0922e, i2 + i);
                }
                c0922e.startapp();
                return c8870e;
            }
            if (purchase == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (purchase == 4) {
                if (j2 < f27953e.get(this)) {
                    c0922e.vip();
                }
                return new C14395e(inmobi());
            }
            if (purchase == 5) {
                c0922e.vip();
            }
            z = false;
            j = 1152921504606846975L;
        }
    }

    @Override // defpackage.InterfaceC10441e
    public final C11106e appmetrica() {
        C10834e c10834e = C10834e.f21468e;
        AbstractC9476e.purchase(3, c10834e);
        C13374e c13374e = C13374e.f26634e;
        AbstractC9476e.purchase(3, c13374e);
        return new C11106e(this, c10834e, c13374e, this.f27962e, 17);
    }

    public final C9335e billing() {
        return new C9335e(3, this, C14137e.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 0, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /* renamed from: class, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3755class(long r5, defpackage.C0922e r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f24956e
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            eؗٓٚ r0 = r7.metrica()
            eؚؒۧ r0 = (defpackage.C0922e) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.license()
            if (r5 == 0) goto L22
            eؗٓٚ r5 = r7.metrica()
            eؚؒۧ r5 = (defpackage.C0922e) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.C14137e.f27955e
            java.lang.Object r6 = r5.get(r4)
            eّٓۛ r6 = (defpackage.AbstractC12466e) r6
            long r0 = r6.f24956e
            long r2 = r7.f24956e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.adcel()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.purchase()
            if (r5 == 0) goto L49
            r6.appmetrica()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.purchase()
            if (r5 == 0) goto L22
            r7.appmetrica()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14137e.m3755class(long, eؚؒۧ):void");
    }

    public boolean crashlytics() {
        return false;
    }

    /* renamed from: extends, reason: not valid java name */
    public final boolean m3756extends(Object obj, Object obj2) {
        if (obj instanceof InterfaceC11221e) {
            return ((C16259e) ((InterfaceC11221e) obj)).yandex(this, obj2);
        }
        boolean z = obj instanceof C5290e;
        Function1 function1 = this.f27963e;
        if (z) {
            return AbstractC11295e.ad(((C5290e) obj).f11377e, new C0183e(obj2), function1 != null ? adcel() : null);
        }
        if (!(obj instanceof C18221e)) {
            if (obj instanceof InterfaceC1148e) {
                return AbstractC11295e.ad((InterfaceC1148e) obj, obj2, function1 != null ? billing() : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        C18221e c18221e = (C18221e) obj;
        C13578e c13578e = c18221e.f35683e;
        c18221e.f35683e = null;
        c18221e.f35684e = obj2;
        Boolean bool = Boolean.TRUE;
        Function1 function12 = c18221e.f35682e.f27963e;
        return AbstractC11295e.ad(c13578e, bool, function12 != null ? new C17630e(function12, obj2, 0) : null);
    }

    public final boolean firebase() {
        long j = f27961e.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    public final Throwable inmobi() {
        Throwable signatures = signatures();
        return signatures == null ? new C9442e("Channel was closed", 1) : signatures;
    }

    /* renamed from: interface, reason: not valid java name */
    public final Object m3757interface(InterfaceC5083e interfaceC5083e, Object obj) {
        C14803e appmetrica;
        C13578e c13578e = new C13578e(1, AbstractC10558e.startapp(interfaceC5083e));
        c13578e.tapsense();
        Function1 function1 = this.f27963e;
        if (function1 == null || (appmetrica = AbstractC6401e.appmetrica(function1, obj, null)) == null) {
            c13578e.billing(new C12763e(inmobi()));
        } else {
            AbstractC13362e.license(appmetrica, inmobi());
            c13578e.billing(new C12763e(appmetrica));
        }
        Object signatures = c13578e.signatures();
        return signatures == EnumC2821e.f6782e ? signatures : Unit.INSTANCE;
    }

    public final long isPro() {
        return f27958e.get(this) & 1152921504606846975L;
    }

    public final Throwable isVip() {
        Throwable signatures = signatures();
        return signatures == null ? new NoSuchElementException("Channel was closed") : signatures;
    }

    @Override // defpackage.InterfaceC10441e
    public final C18221e iterator() {
        return new C18221e(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (defpackage.C0922e) ((defpackage.AbstractC4874e) defpackage.AbstractC4874e.f10344e.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C0922e loadAd(long r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14137e.loadAd(long):eؚؒۧ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0189, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00c2, code lost:
    
        vip(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016f A[RETURN] */
    @Override // defpackage.InterfaceC15080e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object metrica(defpackage.InterfaceC5083e r24, java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14137e.metrica(eًؗۖ, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f2, code lost:
    
        r1 = billing();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00df, code lost:
    
        r8.smaato(r14, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00f0, code lost:
    
        if (r12 != null) goto L74;
     */
    @Override // defpackage.InterfaceC10441e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mopub(defpackage.InterfaceC5083e r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14137e.mopub(eًؗۖ):java.lang.Object");
    }

    /* renamed from: native, reason: not valid java name */
    public final void m3758native(InterfaceC5634e interfaceC5634e, boolean z) {
        if (interfaceC5634e instanceof InterfaceC1148e) {
            ((InterfaceC5083e) interfaceC5634e).billing(new C12763e(z ? isVip() : inmobi()));
            return;
        }
        if (interfaceC5634e instanceof C5290e) {
            ((C5290e) interfaceC5634e).f11377e.billing(new C0183e(new C14395e(signatures())));
            return;
        }
        if (!(interfaceC5634e instanceof C18221e)) {
            if (interfaceC5634e instanceof InterfaceC11221e) {
                ((C16259e) ((InterfaceC11221e) interfaceC5634e)).yandex(this, AbstractC11295e.advert);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + interfaceC5634e).toString());
            }
        }
        C18221e c18221e = (C18221e) interfaceC5634e;
        C13578e c13578e = c18221e.f35683e;
        c18221e.f35683e = null;
        c18221e.f35684e = AbstractC11295e.advert;
        Throwable signatures = c18221e.f35682e.signatures();
        if (signatures == null) {
            c13578e.billing(Boolean.FALSE);
        } else {
            c13578e.billing(new C12763e(signatures));
        }
    }

    public final boolean premium() {
        return ads(f27958e.get(this), true);
    }

    public final C0922e pro(long j, C0922e c0922e) {
        Object purchase;
        long j2;
        C0922e c0922e2 = AbstractC11295e.ad;
        C18492e c18492e = C18492e.f36251e;
        loop0: while (true) {
            purchase = AbstractC2251e.purchase(c0922e, j, c18492e);
            if (!AbstractC1101e.purchase(purchase)) {
                AbstractC12466e appmetrica = AbstractC1101e.appmetrica(purchase);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27959e;
                    AbstractC12466e abstractC12466e = (AbstractC12466e) atomicReferenceFieldUpdater.get(this);
                    if (abstractC12466e.f24956e >= appmetrica.f24956e) {
                        break loop0;
                    }
                    if (!appmetrica.adcel()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC12466e, appmetrica)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC12466e) {
                            if (appmetrica.purchase()) {
                                appmetrica.appmetrica();
                            }
                        }
                    }
                    if (abstractC12466e.purchase()) {
                        abstractC12466e.appmetrica();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC1101e.purchase(purchase)) {
            subs();
            if (c0922e.f24956e * AbstractC11295e.vip < isPro()) {
                c0922e.vip();
                return null;
            }
        } else {
            C0922e c0922e3 = (C0922e) AbstractC1101e.appmetrica(purchase);
            long j3 = c0922e3.f24956e;
            if (!firebase() && j <= f27961e.get(this) / AbstractC11295e.vip) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f27955e;
                    AbstractC12466e abstractC12466e2 = (AbstractC12466e) atomicReferenceFieldUpdater2.get(this);
                    if (abstractC12466e2.f24956e >= j3) {
                        break;
                    }
                    if (!c0922e3.adcel()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, abstractC12466e2, c0922e3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != abstractC12466e2) {
                            if (c0922e3.purchase()) {
                                c0922e3.appmetrica();
                            }
                        }
                    }
                    if (abstractC12466e2.purchase()) {
                        abstractC12466e2.appmetrica();
                    }
                }
            }
            if (j3 <= j) {
                return c0922e3;
            }
            long j4 = j3 * AbstractC11295e.vip;
            do {
                j2 = f27953e.get(this);
                if (j2 >= j4) {
                    break;
                }
            } while (!f27953e.compareAndSet(this, j2, j4));
            if (j3 * AbstractC11295e.vip < isPro()) {
                c0922e3.vip();
            }
        }
        return null;
    }

    /* renamed from: protected, reason: not valid java name */
    public final void m3759protected(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        C14137e c14137e = this;
        if (c14137e.firebase()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f27961e;
            if (atomicLongFieldUpdater.get(c14137e) > j) {
                break;
            } else {
                c14137e = this;
            }
        }
        int i = AbstractC11295e.metrica;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f27960e;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(c14137e);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(c14137e)) && j2 == atomicLongFieldUpdater.get(c14137e)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(c14137e);
                    if (atomicLongFieldUpdater2.compareAndSet(c14137e, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        c14137e = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(c14137e);
                    long j5 = atomicLongFieldUpdater2.get(c14137e);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(c14137e)) {
                        break;
                    }
                    if (z) {
                        c14137e = this;
                    } else {
                        c14137e = this;
                        atomicLongFieldUpdater2.compareAndSet(c14137e, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(c14137e);
                    if (atomicLongFieldUpdater2.compareAndSet(c14137e, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        c14137e = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00bf, code lost:
    
        if ((r0.addAndGet(r15, (r11 * r13) - r8) & 4611686018427387904L) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00c8, code lost:
    
        if ((r0.get(r15) & 4611686018427387904L) == 0) goto L144;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void remoteconfig() {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14137e.remoteconfig():void");
    }

    public final Throwable signatures() {
        return (Throwable) f27957e.get(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r6.compareAndSet(r12, r5, r13) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r6.get(r12) == r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r14 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r5 = r3.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r3.compareAndSet(r4, r5, (3 << 60) + (r5 & 1152921504606846975L)) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        subs();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r10 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r13 = defpackage.C14137e.f27954e;
        r14 = r13.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r0 = defpackage.AbstractC11295e.admob;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r13.compareAndSet(r12, r14, r0) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (r13.get(r12) == r14) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000a, code lost:
    
        if (r14 != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r14 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        defpackage.AbstractC9476e.purchase(1, r14);
        ((kotlin.jvm.functions.Function1) r14).invoke(signatures());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        r0 = defpackage.AbstractC11295e.subscription;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r5 = r3.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004c, code lost:
    
        r5 = r3.get(r12);
        r13 = (int) (r5 >> 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0053, code lost:
    
        if (r13 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        if (r13 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0058, code lost:
    
        r13 = r5 & 1152921504606846975L;
        r7 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0067, code lost:
    
        if (r3.compareAndSet(r4, r5, (r7 << 60) + r13) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (((int) (r5 >> 60)) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005e, code lost:
    
        r13 = r5 & 1152921504606846975L;
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x002f, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0024, code lost:
    
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = defpackage.AbstractC11295e.ad;
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r3.compareAndSet(r4, r5, (r5 & 1152921504606846975L) + (1 << 60)) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        r5 = defpackage.AbstractC11295e.remoteconfig;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r6 = defpackage.C14137e.f27957e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean smaato(java.lang.Throwable r13, boolean r14) {
        /*
            r12 = this;
            r0 = 60
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.C14137e.f27958e
            r9 = 1
            if (r14 == 0) goto L24
        Lc:
            long r5 = r3.get(r12)
            long r7 = r5 >> r0
            int r4 = (int) r7
            if (r4 != 0) goto L24
            long r7 = r5 & r1
            eؚؒۧ r4 = defpackage.AbstractC11295e.ad
            long r10 = (long) r9
            long r10 = r10 << r0
            long r7 = r7 + r10
            r4 = r12
            boolean r5 = r3.compareAndSet(r4, r5, r7)
            if (r5 == 0) goto Lc
            goto L25
        L24:
            r4 = r12
        L25:
            eًؚؔ r5 = defpackage.AbstractC11295e.remoteconfig
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = defpackage.C14137e.f27957e
            boolean r7 = r6.compareAndSet(r12, r5, r13)
            if (r7 == 0) goto L31
            r10 = r9
            goto L39
        L31:
            java.lang.Object r6 = r6.get(r12)
            if (r6 == r5) goto L27
            r13 = 0
            r10 = r13
        L39:
            r11 = 3
            if (r14 == 0) goto L4c
        L3c:
            long r5 = r3.get(r12)
            long r13 = r5 & r1
            long r7 = (long) r11
            long r7 = r7 << r0
            long r7 = r7 + r13
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L3c
            goto L69
        L4c:
            long r5 = r3.get(r12)
            long r13 = r5 >> r0
            int r13 = (int) r13
            if (r13 == 0) goto L5e
            if (r13 == r9) goto L58
            goto L69
        L58:
            long r13 = r5 & r1
            long r7 = (long) r11
        L5b:
            long r7 = r7 << r0
            long r7 = r7 + r13
            goto L63
        L5e:
            long r13 = r5 & r1
            r7 = 2
            long r7 = (long) r7
            goto L5b
        L63:
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L4c
        L69:
            r12.subs()
            if (r10 == 0) goto L98
        L6e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = defpackage.C14137e.f27954e
            java.lang.Object r14 = r13.get(r12)
            if (r14 != 0) goto L79
            eًؚؔ r0 = defpackage.AbstractC11295e.admob
            goto L7b
        L79:
            eًؚؔ r0 = defpackage.AbstractC11295e.subscription
        L7b:
            boolean r1 = r13.compareAndSet(r12, r14, r0)
            if (r1 == 0) goto L91
            if (r14 != 0) goto L84
            goto L98
        L84:
            defpackage.AbstractC9476e.purchase(r9, r14)
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            java.lang.Throwable r13 = r12.signatures()
            r14.invoke(r13)
            return r10
        L91:
            java.lang.Object r1 = r13.get(r12)
            if (r1 == r14) goto L7b
            goto L6e
        L98:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14137e.smaato(java.lang.Throwable, boolean):boolean");
    }

    @Override // defpackage.InterfaceC15080e
    public final boolean startapp(Throwable th) {
        return smaato(th, false);
    }

    public final boolean subs() {
        return ads(f27958e.get(this), false);
    }

    @Override // defpackage.InterfaceC10441e
    public final Object subscription(AbstractC7185e abstractC7185e) {
        return m3754goto(this, abstractC7185e);
    }

    public final C11106e tapsense() {
        C11346e c11346e = C11346e.f22825e;
        AbstractC9476e.purchase(3, c11346e);
        C2767e c2767e = C2767e.f6673e;
        AbstractC9476e.purchase(3, c2767e);
        return new C11106e(this, c11346e, c2767e, this.f27962e, 17);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: this, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3760this(defpackage.C0922e r15, int r16, long r17, defpackage.AbstractC10731e r19) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14137e.m3760this(eؚؒۧ, int, long, eُؑ۠):java.lang.Object");
    }

    /* renamed from: throw, reason: not valid java name */
    public final boolean m3761throw(Object obj, C0922e c0922e, int i) {
        char c;
        if (obj instanceof InterfaceC1148e) {
            return AbstractC11295e.ad((InterfaceC1148e) obj, Unit.INSTANCE, null);
        }
        if (!(obj instanceof InterfaceC11221e)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        int startapp = ((C16259e) obj).startapp(this, Unit.INSTANCE);
        if (startapp == 0) {
            c = 1;
        } else if (startapp != 1) {
            c = 3;
            if (startapp != 2) {
                if (startapp != 3) {
                    throw new IllegalStateException(("Unexpected internal result: " + startapp).toString());
                }
                c = 4;
            }
        } else {
            c = 2;
        }
        if (c == 2) {
            c0922e.amazon(i, null);
        }
        return c == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b7, code lost:
    
        r16 = r7;
        r3 = (defpackage.C0922e) r3.metrica();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c0, code lost:
    
        if (r3 != null) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14137e.toString():java.lang.String");
    }

    /* renamed from: try, reason: not valid java name */
    public final int m3762try(C0922e c0922e, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object advert = c0922e.advert(i);
            if (advert == null) {
                if (!advert(j) || z) {
                    if (z) {
                        if (c0922e.mopub(i, null, AbstractC11295e.adcel)) {
                            c0922e.startapp();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c0922e.mopub(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c0922e.mopub(i, null, AbstractC11295e.license)) {
                    break;
                }
            } else {
                if (advert != AbstractC11295e.appmetrica) {
                    C2443e c2443e = AbstractC11295e.mopub;
                    if (advert == c2443e) {
                        c0922e.amazon(i, null);
                        return 5;
                    }
                    if (advert == AbstractC11295e.yandex) {
                        c0922e.amazon(i, null);
                        return 5;
                    }
                    if (advert == AbstractC11295e.advert) {
                        c0922e.amazon(i, null);
                        subs();
                        return 4;
                    }
                    c0922e.amazon(i, null);
                    if (advert instanceof C6908e) {
                        advert = ((C6908e) advert).ad;
                    }
                    if (m3756extends(advert, obj)) {
                        c0922e.loadAd(i, AbstractC11295e.startapp);
                        return 0;
                    }
                    if (c0922e.f3344e.getAndSet((i * 2) + 1, c2443e) != c2443e) {
                        c0922e.smaato(i, true);
                    }
                    return 5;
                }
                if (c0922e.mopub(i, advert, AbstractC11295e.license)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* renamed from: while, reason: not valid java name */
    public final Object m3763while(C0922e c0922e, int i, long j, Object obj) {
        Object advert = c0922e.advert(i);
        AtomicReferenceArray atomicReferenceArray = c0922e.f3344e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27958e;
        if (advert == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC11295e.amazon;
                }
                if (c0922e.mopub(i, advert, obj)) {
                    remoteconfig();
                    return AbstractC11295e.smaato;
                }
            }
        } else if (advert == AbstractC11295e.license && c0922e.mopub(i, advert, AbstractC11295e.startapp)) {
            remoteconfig();
            Object obj2 = atomicReferenceArray.get(i * 2);
            c0922e.amazon(i, null);
            return obj2;
        }
        while (true) {
            Object advert2 = c0922e.advert(i);
            if (advert2 == null || advert2 == AbstractC11295e.appmetrica) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c0922e.mopub(i, advert2, AbstractC11295e.yandex)) {
                        remoteconfig();
                        return AbstractC11295e.loadAd;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC11295e.amazon;
                    }
                    if (c0922e.mopub(i, advert2, obj)) {
                        remoteconfig();
                        return AbstractC11295e.smaato;
                    }
                }
            } else {
                if (advert2 != AbstractC11295e.license) {
                    C2443e c2443e = AbstractC11295e.adcel;
                    if (advert2 != c2443e && advert2 != AbstractC11295e.yandex) {
                        if (advert2 == AbstractC11295e.advert) {
                            remoteconfig();
                            return AbstractC11295e.loadAd;
                        }
                        if (advert2 != AbstractC11295e.billing && c0922e.mopub(i, advert2, AbstractC11295e.purchase)) {
                            boolean z = advert2 instanceof C6908e;
                            if (z) {
                                advert2 = ((C6908e) advert2).ad;
                            }
                            if (m3761throw(advert2, c0922e, i)) {
                                c0922e.loadAd(i, AbstractC11295e.startapp);
                                remoteconfig();
                                Object obj3 = atomicReferenceArray.get(i * 2);
                                c0922e.amazon(i, null);
                                return obj3;
                            }
                            c0922e.loadAd(i, c2443e);
                            c0922e.startapp();
                            if (z) {
                                remoteconfig();
                            }
                            return AbstractC11295e.loadAd;
                        }
                    }
                    return AbstractC11295e.loadAd;
                }
                if (c0922e.mopub(i, advert2, AbstractC11295e.startapp)) {
                    remoteconfig();
                    Object obj4 = atomicReferenceArray.get(i * 2);
                    c0922e.amazon(i, null);
                    return obj4;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC10441e
    public final Object yandex() {
        C0922e c0922e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27953e;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = f27958e.get(this);
        if (ads(j2, true)) {
            return new C14395e(signatures());
        }
        long j3 = j2 & 1152921504606846975L;
        C8870e c8870e = C0183e.vip;
        if (j >= j3) {
            return c8870e;
        }
        Object obj = AbstractC11295e.mopub;
        C0922e c0922e2 = (C0922e) f27959e.get(this);
        while (!premium()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = AbstractC11295e.vip;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (c0922e2.f24956e != j5) {
                C0922e pro = pro(j5, c0922e2);
                if (pro == null) {
                    continue;
                } else {
                    c0922e = pro;
                }
            } else {
                c0922e = c0922e2;
            }
            Object m3763while = m3763while(c0922e, i, andIncrement, obj);
            C0922e c0922e3 = c0922e;
            if (m3763while == AbstractC11295e.smaato) {
                InterfaceC5634e interfaceC5634e = obj instanceof InterfaceC5634e ? (InterfaceC5634e) obj : null;
                if (interfaceC5634e != null) {
                    interfaceC5634e.metrica(c0922e3, i);
                }
                m3759protected(andIncrement);
                c0922e3.startapp();
                return c8870e;
            }
            if (m3763while != AbstractC11295e.loadAd) {
                if (m3763while == AbstractC11295e.amazon) {
                    throw new IllegalStateException("unexpected");
                }
                c0922e3.vip();
                return m3763while;
            }
            if (andIncrement < isPro()) {
                c0922e3.vip();
            }
            c0922e2 = c0922e3;
        }
        return new C14395e(signatures());
    }
}
