package defpackage;

import java.util.Arrays;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۢؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5981e extends AbstractC12078e implements InterfaceC3542e, InterfaceC1108e, InterfaceC10455e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f12584e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f12585e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public long f12586e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object[] f12587e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f12588e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public long f12589e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f12590e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f12591e;

    public C5981e(int i, int i2, int i3) {
        this.f12584e = i;
        this.f12591e = i2;
        this.f12590e = i3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(7:(2:3|(10:5|6|7|(2:9|(1:(1:(7:13|14|15|16|17|(3:18|19|(10:28|(2:33|34)|36|(1:38)|15|16|17|18|19|(0)(1:21))(0))|25)(2:39|40))(5:41|42|17|(3:18|19|(0)(0))|25))(4:43|44|45|46))(1:57)|47|48|16|17|(3:18|19|(0)(0))|25))|47|48|16|17|(3:18|19|(0)(0))|25)|59|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0036, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x002f, B:18:0x0075, B:21:0x007f, B:30:0x0092, B:33:0x0099, B:34:0x009d, B:36:0x009e, B:42:0x0049), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r4v1, types: [eُِۤ] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [eؘۢؕ] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [eؘۥؒ] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [eؚؚْ] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [eٍِۧ] */
    /* JADX WARN: Type inference failed for: r9v8, types: [eٍِۧ] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ac -> B:15:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void smaato(defpackage.C5981e r8, defpackage.InterfaceC6034e r9, defpackage.InterfaceC5083e r10) {
        /*
            boolean r0 = r10 instanceof defpackage.C13082e
            if (r0 == 0) goto L13
            r0 = r10
            eؘْؖ r0 = (defpackage.C13082e) r0
            int r1 = r0.f26013e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26013e = r1
            goto L18
        L13:
            eؘْؖ r0 = new eؘْؖ
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f26014e
            int r1 = r0.f26013e
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5c
            r8 = 1
            if (r1 == r8) goto L4d
            if (r1 == r3) goto L41
            if (r1 != r2) goto L39
            eَٟۙ r8 = r0.f26017e
            eٍِۧ r9 = r0.f26018e
            eؘۥؒ r1 = r0.f26012e
            eؘۢؕ r4 = r0.f26015e
            defpackage.AbstractC2003e.purchase(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L72
        L36:
            r8 = move-exception
            goto Lb2
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            eَٟۙ r8 = r0.f26017e
            eٍِۧ r9 = r0.f26018e
            eؘۥؒ r1 = r0.f26012e
            eؘۢؕ r4 = r0.f26015e
            defpackage.AbstractC2003e.purchase(r10)     // Catch: java.lang.Throwable -> L36
            goto L75
        L4d:
            eٍِۧ r9 = r0.f26018e
            eؘۥؒ r8 = r0.f26012e
            eؘۢؕ r1 = r0.f26015e
            defpackage.AbstractC2003e.purchase(r10)     // Catch: java.lang.Throwable -> L59
            r10 = r8
            r8 = r1
            goto L68
        L59:
            r8 = move-exception
            r4 = r1
            goto Lb2
        L5c:
            defpackage.AbstractC2003e.purchase(r10)
            eؚؚْ r10 = r8.metrica()
            eٍِۧ r10 = (defpackage.C12131e) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L68:
            eٌِٞ r1 = r0.f21135e     // Catch: java.lang.Throwable -> Laf
            eْؖۧ r4 = defpackage.C4524e.f9798e     // Catch: java.lang.Throwable -> Laf
            eؗؒۚ r1 = r1.mo397public(r4)     // Catch: java.lang.Throwable -> Laf
            eَٟۙ r1 = (defpackage.InterfaceC10500e) r1     // Catch: java.lang.Throwable -> Laf
        L72:
            r4 = r8
            r8 = r1
            r1 = r10
        L75:
            java.lang.Object r10 = r4.signatures(r9)     // Catch: java.lang.Throwable -> L36
            eًؚؔ r5 = defpackage.AbstractC6959e.f14258e     // Catch: java.lang.Throwable -> L36
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r10 != r5) goto L90
            r0.f26015e = r4     // Catch: java.lang.Throwable -> L36
            r0.f26012e = r1     // Catch: java.lang.Throwable -> L36
            r0.f26018e = r9     // Catch: java.lang.Throwable -> L36
            r0.f26017e = r8     // Catch: java.lang.Throwable -> L36
            r0.f26013e = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.mopub(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L75
            goto Lae
        L90:
            if (r8 == 0) goto L9e
            boolean r5 = r8.purchase()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L99
            goto L9e
        L99:
            java.util.concurrent.CancellationException r8 = r8.mo695implements()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        L9e:
            r0.f26015e = r4     // Catch: java.lang.Throwable -> L36
            r0.f26012e = r1     // Catch: java.lang.Throwable -> L36
            r0.f26018e = r9     // Catch: java.lang.Throwable -> L36
            r0.f26017e = r8     // Catch: java.lang.Throwable -> L36
            r0.f26013e = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.startapp(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Lae:
            return
        Laf:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb2:
            r4.yandex(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5981e.smaato(eؘۢؕ, eؘۥؒ, eًؗۖ):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC5083e[] Signature(InterfaceC5083e[] interfaceC5083eArr) {
        AbstractC13118e[] abstractC13118eArr;
        C12131e c12131e;
        C13578e c13578e;
        int length = interfaceC5083eArr.length;
        if (this.f24209e != 0 && (abstractC13118eArr = this.f24211e) != null) {
            int length2 = abstractC13118eArr.length;
            int i = 0;
            interfaceC5083eArr = interfaceC5083eArr;
            while (i < length2) {
                AbstractC13118e abstractC13118e = abstractC13118eArr[i];
                if (abstractC13118e != null && (c13578e = (c12131e = (C12131e) abstractC13118e).vip) != null && pro(c12131e) >= 0) {
                    int length3 = interfaceC5083eArr.length;
                    interfaceC5083eArr = interfaceC5083eArr;
                    if (length >= length3) {
                        interfaceC5083eArr = Arrays.copyOf(interfaceC5083eArr, Math.max(2, interfaceC5083eArr.length * 2));
                    }
                    interfaceC5083eArr[length] = c13578e;
                    c12131e.vip = null;
                    length++;
                }
                i++;
                interfaceC5083eArr = interfaceC5083eArr;
            }
        }
        return interfaceC5083eArr;
    }

    @Override // defpackage.InterfaceC1108e
    public final Object ad(InterfaceC6034e interfaceC6034e, InterfaceC5083e interfaceC5083e) {
        smaato(this, interfaceC6034e, interfaceC5083e);
        return EnumC2821e.f6782e;
    }

    public final long admob() {
        return Math.min(this.f12586e, this.f12589e);
    }

    public final void advert() {
        if (this.f12591e != 0 || this.f12585e > 1) {
            Object[] objArr = this.f12587e;
            while (this.f12585e > 0 && AbstractC6959e.license(objArr, (admob() + (this.f12588e + this.f12585e)) - 1) == AbstractC6959e.f14258e) {
                this.f12585e--;
                AbstractC6959e.appmetrica(objArr, admob() + this.f12588e + this.f12585e, null);
            }
        }
    }

    public final void amazon() {
        AbstractC13118e[] abstractC13118eArr;
        AbstractC6959e.appmetrica(this.f12587e, admob(), null);
        this.f12588e--;
        long admob = admob() + 1;
        if (this.f12589e < admob) {
            this.f12589e = admob;
        }
        if (this.f12586e < admob) {
            if (this.f24209e != 0 && (abstractC13118eArr = this.f24211e) != null) {
                for (AbstractC13118e abstractC13118e : abstractC13118eArr) {
                    if (abstractC13118e != null) {
                        C12131e c12131e = (C12131e) abstractC13118e;
                        long j = c12131e.ad;
                        if (j >= 0 && j < admob) {
                            c12131e.ad = admob;
                        }
                    }
                }
            }
            this.f12586e = admob;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍِۧ, java.lang.Object, eؚؚْ] */
    @Override // defpackage.AbstractC12078e
    public final AbstractC13118e appmetrica() {
        ?? obj = new Object();
        obj.ad = -1L;
        return obj;
    }

    @Override // defpackage.AbstractC12078e
    public final AbstractC13118e[] billing() {
        return new C12131e[2];
    }

    public final InterfaceC5083e[] isVip(long j) {
        long j2;
        long j3;
        long j4;
        InterfaceC5083e[] interfaceC5083eArr;
        InterfaceC5083e[] interfaceC5083eArr2;
        AbstractC13118e[] abstractC13118eArr;
        InterfaceC5083e[] interfaceC5083eArr3 = AbstractC9743e.ad;
        if (j <= this.f12586e) {
            long admob = admob();
            long j5 = this.f12588e + admob;
            int i = this.f12591e;
            if (i == 0 && this.f12585e > 0) {
                j5++;
            }
            int i2 = 0;
            if (this.f24209e != 0 && (abstractC13118eArr = this.f24211e) != null) {
                for (AbstractC13118e abstractC13118e : abstractC13118eArr) {
                    if (abstractC13118e != null) {
                        long j6 = ((C12131e) abstractC13118e).ad;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.f12586e) {
                long admob2 = admob() + this.f12588e;
                int min = this.f24209e > 0 ? Math.min(this.f12585e, i - ((int) (admob2 - j5))) : this.f12585e;
                long j7 = this.f12585e + admob2;
                C2443e c2443e = AbstractC6959e.f14258e;
                if (min > 0) {
                    j4 = 1;
                    Object[] objArr = this.f12587e;
                    j2 = admob;
                    InterfaceC5083e[] interfaceC5083eArr4 = new InterfaceC5083e[min];
                    long j8 = admob2;
                    while (true) {
                        if (admob2 >= j7) {
                            interfaceC5083eArr2 = interfaceC5083eArr4;
                            j3 = j5;
                            break;
                        }
                        Object license = AbstractC6959e.license(objArr, admob2);
                        if (license != c2443e) {
                            C17061e c17061e = (C17061e) license;
                            interfaceC5083eArr2 = interfaceC5083eArr4;
                            int i3 = i2 + 1;
                            j3 = j5;
                            interfaceC5083eArr2[i2] = c17061e.f33402e;
                            AbstractC6959e.appmetrica(objArr, admob2, c2443e);
                            AbstractC6959e.appmetrica(objArr, j8, c17061e.f33400e);
                            j8++;
                            if (i3 >= min) {
                                break;
                            }
                            i2 = i3;
                        } else {
                            interfaceC5083eArr2 = interfaceC5083eArr4;
                            j3 = j5;
                        }
                        admob2++;
                        interfaceC5083eArr4 = interfaceC5083eArr2;
                        j5 = j3;
                    }
                    admob2 = j8;
                    interfaceC5083eArr = interfaceC5083eArr2;
                } else {
                    j2 = admob;
                    j3 = j5;
                    j4 = 1;
                    interfaceC5083eArr = interfaceC5083eArr3;
                }
                int i4 = (int) (admob2 - j2);
                long j9 = this.f24209e == 0 ? admob2 : j3;
                long max = Math.max(this.f12589e, admob2 - Math.min(this.f12584e, i4));
                if (i == 0 && max < j7 && AbstractC7890e.billing(AbstractC6959e.license(this.f12587e, max), c2443e)) {
                    admob2 += j4;
                    max += j4;
                }
                tapsense(max, j9, admob2, j7);
                advert();
                return interfaceC5083eArr.length == 0 ? interfaceC5083eArr : Signature(interfaceC5083eArr);
            }
        }
        return interfaceC5083eArr3;
    }

    @Override // defpackage.InterfaceC3542e
    public final void license() {
        synchronized (this) {
            try {
                try {
                    tapsense(admob() + this.f12588e, this.f12586e, admob() + this.f12588e, admob() + this.f12588e + this.f12585e);
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void loadAd(Object obj) {
        int i = this.f12588e + this.f12585e;
        Object[] objArr = this.f12587e;
        if (objArr == null) {
            objArr = subscription(0, 2, null);
        } else if (i >= objArr.length) {
            objArr = subscription(i, objArr.length * 2, objArr);
        }
        AbstractC6959e.appmetrica(objArr, admob() + i, obj);
    }

    public final Object mopub(C12131e c12131e, C13082e c13082e) {
        C13578e c13578e = new C13578e(1, AbstractC10558e.startapp(c13082e));
        c13578e.tapsense();
        synchronized (this) {
            try {
                if (pro(c12131e) < 0) {
                    c12131e.vip = c13578e;
                } else {
                    c13578e.billing(Unit.INSTANCE);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object signatures = c13578e.signatures();
        return signatures == EnumC2821e.f6782e ? signatures : Unit.INSTANCE;
    }

    public final long pro(C12131e c12131e) {
        long j = c12131e.ad;
        if (j < admob() + this.f12588e) {
            return j;
        }
        if (this.f12591e <= 0 && j <= admob() && this.f12585e != 0) {
            return j;
        }
        return -1L;
    }

    @Override // defpackage.InterfaceC3542e
    public final boolean purchase(Object obj) {
        int i;
        boolean z;
        InterfaceC5083e[] interfaceC5083eArr = AbstractC9743e.ad;
        synchronized (this) {
            if (remoteconfig(obj)) {
                interfaceC5083eArr = Signature(interfaceC5083eArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (InterfaceC5083e interfaceC5083e : interfaceC5083eArr) {
            if (interfaceC5083e != null) {
                interfaceC5083e.billing(Unit.INSTANCE);
            }
        }
        return z;
    }

    public final boolean remoteconfig(Object obj) {
        int i = this.f24209e;
        int i2 = this.f12584e;
        if (i != 0) {
            int i3 = this.f12588e;
            int i4 = this.f12591e;
            if (i3 >= i4 && this.f12586e <= this.f12589e) {
                int m2467class = AbstractC8703e.m2467class(this.f12590e);
                if (m2467class == 0) {
                    return false;
                }
                if (m2467class != 1) {
                    if (m2467class != 2) {
                        throw new C14803e(10);
                    }
                }
            }
            loadAd(obj);
            int i5 = this.f12588e + 1;
            this.f12588e = i5;
            if (i5 > i4) {
                amazon();
            }
            long admob = admob() + this.f12588e;
            long j = this.f12589e;
            if (((int) (admob - j)) > i2) {
                tapsense(1 + j, this.f12586e, admob() + this.f12588e, admob() + this.f12588e + this.f12585e);
            }
        } else if (i2 != 0) {
            loadAd(obj);
            int i6 = this.f12588e + 1;
            this.f12588e = i6;
            if (i6 > i2) {
                amazon();
            }
            this.f12586e = admob() + this.f12588e;
            return true;
        }
        return true;
    }

    public final Object signatures(C12131e c12131e) {
        Object obj;
        InterfaceC5083e[] interfaceC5083eArr = AbstractC9743e.ad;
        synchronized (this) {
            try {
                long pro = pro(c12131e);
                if (pro < 0) {
                    obj = AbstractC6959e.f14258e;
                } else {
                    long j = c12131e.ad;
                    Object license = AbstractC6959e.license(this.f12587e, pro);
                    if (license instanceof C17061e) {
                        license = ((C17061e) license).f33400e;
                    }
                    c12131e.ad = pro + 1;
                    Object obj2 = license;
                    interfaceC5083eArr = isVip(j);
                    obj = obj2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC5083e interfaceC5083e : interfaceC5083eArr) {
            if (interfaceC5083e != null) {
                interfaceC5083e.billing(Unit.INSTANCE);
            }
        }
        return obj;
    }

    @Override // defpackage.InterfaceC6034e
    public final Object startapp(Object obj, InterfaceC5083e interfaceC5083e) {
        Throwable th;
        InterfaceC5083e[] Signature;
        C17061e c17061e;
        if (purchase(obj)) {
            return Unit.INSTANCE;
        }
        C13578e c13578e = new C13578e(1, AbstractC10558e.startapp(interfaceC5083e));
        c13578e.tapsense();
        InterfaceC5083e[] interfaceC5083eArr = AbstractC9743e.ad;
        synchronized (this) {
            try {
                if (remoteconfig(obj)) {
                    try {
                        c13578e.billing(Unit.INSTANCE);
                        Signature = Signature(interfaceC5083eArr);
                        c17061e = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        C17061e c17061e2 = new C17061e(this, admob() + this.f12588e + this.f12585e, obj, c13578e);
                        loadAd(c17061e2);
                        this.f12585e++;
                        if (this.f12591e == 0) {
                            interfaceC5083eArr = Signature(interfaceC5083eArr);
                        }
                        Signature = interfaceC5083eArr;
                        c17061e = c17061e2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (c17061e != null) {
                    c13578e.isPro(new C7394e(2, c17061e));
                }
                for (InterfaceC5083e interfaceC5083e2 : Signature) {
                    if (interfaceC5083e2 != null) {
                        interfaceC5083e2.billing(Unit.INSTANCE);
                    }
                }
                Object signatures = c13578e.signatures();
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                if (signatures != enumC2821e) {
                    signatures = Unit.INSTANCE;
                }
                return signatures == enumC2821e ? signatures : Unit.INSTANCE;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final Object[] subscription(int i, int i2, Object[] objArr) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.f12587e = objArr2;
        if (objArr != null) {
            long admob = admob();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + admob;
                AbstractC6959e.appmetrica(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final void tapsense(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long admob = admob(); admob < min; admob++) {
            AbstractC6959e.appmetrica(this.f12587e, admob, null);
        }
        this.f12589e = j;
        this.f12586e = j2;
        this.f12588e = (int) (j3 - min);
        this.f12585e = (int) (j4 - j3);
    }

    @Override // defpackage.InterfaceC10455e
    public final InterfaceC1108e vip(InterfaceC8850e interfaceC8850e, int i, int i2) {
        return AbstractC6959e.billing(this, interfaceC8850e, i, i2);
    }
}
