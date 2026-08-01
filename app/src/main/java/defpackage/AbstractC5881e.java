package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۙۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5881e extends AbstractC6126e implements InterfaceC4890e, InterfaceC1946e, InterfaceC1683e, InterfaceC2998e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public C5943e f12411e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public Function1 f12412e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public AbstractC9947e f12414e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public EnumC17426e f12415e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public C3643e f12417e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public C1077e f12418e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public C12287e f12419e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public boolean f12420e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public C14137e f12421e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public C0731e f12422e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public C1460e f12423e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public C5724e f12424e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean f12425e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public C3318e f12426e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public C3877e f12427e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public boolean f12428e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public C15274e f12429e;

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public long f12413e = 9205357640488583168L;

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public long f12416e = 0;

    public AbstractC5881e(Function1 function1, boolean z, C15274e c15274e, EnumC17426e enumC17426e) {
        this.f12415e = enumC17426e;
        this.f12412e = function1;
        this.f12425e = z;
        this.f12429e = c15274e;
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, eؘْٚ] */
    /* renamed from: eِؕٛ, reason: contains not printable characters */
    public static void m1974e(AbstractC5881e abstractC5881e, C2401e c2401e, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        C5724e c5724e = abstractC5881e.f12424e;
        C5724e c5724e2 = c5724e;
        if (c5724e == null) {
            ?? obj = new Object();
            obj.license = null;
            obj.appmetrica = Long.MAX_VALUE;
            obj.purchase = false;
            abstractC5881e.f12424e = obj;
            c5724e2 = obj;
        }
        c5724e2.license = c2401e;
        c5724e2.appmetrica = j;
        C3318e c3318e = abstractC5881e.f12426e;
        if (c3318e == null) {
            abstractC5881e.f12426e = new C3318e(abstractC5881e.f12415e, 2);
        } else {
            c3318e.f7485e = abstractC5881e.f12415e;
            c3318e.f7486e = j2;
        }
        c5724e2.purchase = false;
        abstractC5881e.f12414e = c5724e2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r1.ad(r5, r0) == r4) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v4, types: [eْٚ۟, java.lang.Object, eؖؕۜ] */
    /* renamed from: eؚٜ۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1975e(defpackage.AbstractC5881e r6, defpackage.C7325e r7, defpackage.AbstractC10731e r8) {
        /*
            boolean r0 = r8 instanceof defpackage.C0857e
            if (r0 == 0) goto L13
            r0 = r8
            eؒؗؑ r0 = (defpackage.C0857e) r0
            int r1 = r0.f3263e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3263e = r1
            goto L18
        L13:
            eؒؗؑ r0 = new eؒؗؑ
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f3266e
            int r1 = r0.f3263e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            eؖؕۜ r7 = r0.f3262e
            eؚٕٞ r0 = r0.f3264e
            defpackage.AbstractC2003e.purchase(r8)
            goto L6f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            eؚٕٞ r7 = r0.f3264e
            defpackage.AbstractC2003e.purchase(r8)
            goto L57
        L3c:
            defpackage.AbstractC2003e.purchase(r8)
            eؖؕۜ r8 = r6.f12427e
            if (r8 == 0) goto L57
            eؘٕؕ r1 = r6.f12429e
            if (r1 == 0) goto L57
            eؔۧؑ r5 = new eؔۧؑ
            r5.<init>(r8)
            r0.f3264e = r7
            r0.f3263e = r3
            java.lang.Object r8 = r1.ad(r5, r0)
            if (r8 != r4) goto L57
            goto L6c
        L57:
            eؖؕۜ r8 = new eؖؕۜ
            r8.<init>()
            eؘٕؕ r1 = r6.f12429e
            if (r1 == 0) goto L71
            r0.f3264e = r7
            r0.f3262e = r8
            r0.f3263e = r2
            java.lang.Object r0 = r1.ad(r8, r0)
            if (r0 != r4) goto L6d
        L6c:
            return r4
        L6d:
            r0 = r7
            r7 = r8
        L6f:
            r8 = r7
            r7 = r0
        L71:
            r6.f12427e = r8
            long r7 = r7.ad
            r6.mo1631e(r7)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5881e.m1975e(eؘۙۢ, eؚٕٞ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: eًْٕ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1976e(defpackage.AbstractC5881e r4, defpackage.C15208e r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C3651e
            if (r0 == 0) goto L13
            r0 = r6
            eؕۜۢ r0 = (defpackage.C3651e) r0
            int r1 = r0.f8210e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8210e = r1
            goto L18
        L13:
            eؕۜۢ r0 = new eؕۜۢ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f8208e
            int r1 = r0.f8210e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eٕٖؔ r5 = r0.f8209e
            defpackage.AbstractC2003e.purchase(r6)
            goto L4c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.AbstractC2003e.purchase(r6)
            eؖؕۜ r6 = r4.f12427e
            if (r6 == 0) goto L4f
            eؘٕؕ r1 = r4.f12429e
            if (r1 == 0) goto L4c
            eٌَؚ r3 = new eٌَؚ
            r3.<init>(r6)
            r0.f8209e = r5
            r0.f8210e = r2
            java.lang.Object r6 = r1.ad(r3, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r6 != r0) goto L4c
            return r0
        L4c:
            r6 = 0
            r4.f12427e = r6
        L4f:
            r4.mo1629e(r5)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5881e.m1976e(eؘۙۢ, eٕٖؔ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: eٖٔۧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1977e(defpackage.AbstractC5881e r4, defpackage.AbstractC10731e r5) {
        /*
            boolean r0 = r5 instanceof defpackage.C14526e
            if (r0 == 0) goto L13
            r0 = r5
            eٔؗٓ r0 = (defpackage.C14526e) r0
            int r1 = r0.f28721e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28721e = r1
            goto L18
        L13:
            eٔؗٓ r0 = new eٔؗٓ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f28720e
            int r1 = r0.f28721e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r5)
            goto L48
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            defpackage.AbstractC2003e.purchase(r5)
            eؖؕۜ r5 = r4.f12427e
            if (r5 == 0) goto L4b
            eؘٕؕ r1 = r4.f12429e
            if (r1 == 0) goto L48
            eؔۧؑ r3 = new eؔۧؑ
            r3.<init>(r5)
            r0.f28721e = r2
            java.lang.Object r5 = r1.ad(r3, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L48
            return r0
        L48:
            r5 = 0
            r4.f12427e = r5
        L4b:
            eٕٖؔ r5 = new eٕٖؔ
            r0 = 0
            r2 = 0
            r5.<init>(r0, r2)
            r4.mo1629e(r5)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5881e.m1977e(eؘۙۢ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: catch */
    public final /* synthetic */ void mo708catch() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [eؔۦۗ, eؙؒؐ, eؘۙۢ, eًؓۖ] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, eّؗۗ] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, eّؗۗ] */
    /* JADX WARN: Type inference failed for: r4v18, types: [eٕؒۜ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object] */
    @Override // defpackage.InterfaceC4890e
    public void crashlytics(C2561e c2561e, EnumC13456e enumC13456e, long j) {
        Object obj;
        Object obj2;
        EnumC13456e enumC13456e2;
        Object obj3;
        C2401e c2401e;
        C2401e c2401e2;
        boolean z = true;
        this.f12420e = true;
        if (this.f12411e == null) {
            C5943e c5943e = new C5943e(this);
            m2050e(c5943e);
            this.f12411e = c5943e;
        }
        if (this.f12425e) {
            if (this.f12414e == null) {
                C1077e c1077e = this.f12418e;
                C1077e c1077e2 = c1077e;
                if (c1077e == null) {
                    ?? obj4 = new Object();
                    obj4.license = 3;
                    obj4.appmetrica = false;
                    this.f12418e = obj4;
                    c1077e2 = obj4;
                }
                this.f12414e = c1077e2;
            }
            AbstractC9947e abstractC9947e = this.f12414e;
            if (abstractC9947e == null) {
                throw new IllegalArgumentException("currentDragState should not be null");
            }
            boolean z2 = abstractC9947e instanceof C1077e;
            EnumC13456e enumC13456e3 = EnumC13456e.f26729e;
            EnumC13456e enumC13456e4 = EnumC13456e.f26727e;
            if (z2) {
                C1077e c1077e3 = (C1077e) abstractC9947e;
                if (!c2561e.ad.isEmpty() && AbstractC9939e.purchase(c2561e, false, false)) {
                    C2401e c2401e3 = (C2401e) AbstractC13480e.m3591interface(c2561e.ad);
                    int i = AbstractC2418e.ad[AbstractC8703e.m2467class(c1077e3.license)] == 1 ? !mo1630e() ? 1 : 2 : c1077e3.license;
                    c1077e3.license = i;
                    if (enumC13456e == enumC13456e3 && i == 2) {
                        c2401e3.ad();
                        c1077e3.appmetrica = true;
                    }
                    if (enumC13456e == enumC13456e4) {
                        if (i == 1) {
                            m1974e(this, c2401e3, c2401e3.ad, 0L, 12);
                            return;
                        }
                        if (c1077e3.appmetrica) {
                            m1984e(c2401e3, c2401e3, 0L);
                            m1979e(0L, c2401e3);
                            long j2 = c2401e3.ad;
                            C12287e c12287e = this.f12419e;
                            C12287e c12287e2 = c12287e;
                            if (c12287e == null) {
                                ?? obj5 = new Object();
                                obj5.license = Long.MAX_VALUE;
                                this.f12419e = obj5;
                                c12287e2 = obj5;
                            }
                            c12287e2.license = j2;
                            this.f12414e = c12287e2;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z3 = abstractC9947e instanceof C5724e;
            EnumC13456e enumC13456e5 = EnumC13456e.f26726e;
            if (!z3) {
                if (abstractC9947e instanceof C3643e) {
                    C3643e c3643e = (C3643e) abstractC9947e;
                    if (enumC13456e != enumC13456e5) {
                        return;
                    }
                    ?? r1 = c2561e.ad;
                    int size = r1.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        if (((C2401e) r1.get(i2)).vip()) {
                            z = false;
                            break;
                        }
                        i2++;
                    }
                    int size2 = r1.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            break;
                        }
                        if (!((C2401e) r1.get(i3)).license) {
                            i3++;
                        } else if (!r1.isEmpty()) {
                            if (z) {
                                long yandex = C2152e.yandex(((C2401e) AbstractC13480e.m3591interface(r1)).metrica, c3643e.license.metrica);
                                C2401e c2401e4 = c3643e.license;
                                if (c2401e4 == null) {
                                    throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                                }
                                m1974e(this, c2401e4, c3643e.appmetrica, yandex, 8);
                                return;
                            }
                            return;
                        }
                    }
                    m1982e();
                    return;
                }
                if (!(abstractC9947e instanceof C12287e)) {
                    throw new C14803e(10);
                }
                C12287e c12287e3 = (C12287e) abstractC9947e;
                if (enumC13456e != enumC13456e4) {
                    return;
                }
                long j3 = c12287e3.license;
                ?? r2 = c2561e.ad;
                int size3 = r2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = r2.get(i4);
                    if (AbstractC17751e.vip(((C2401e) obj).ad, j3)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                C2401e c2401e5 = (C2401e) obj;
                if (c2401e5 == null) {
                    return;
                }
                boolean appmetrica = AbstractC17957e.appmetrica(c2401e5);
                C16146e c16146e = C16146e.ad;
                if (!appmetrica) {
                    if (c2401e5.vip()) {
                        m1987e().amazon(c16146e);
                        return;
                    } else {
                        if (C2152e.metrica(AbstractC17957e.startapp(c2401e5, true)) == 0.0f) {
                            return;
                        }
                        m1979e(AbstractC17957e.startapp(c2401e5, false), c2401e5);
                        c2401e5.ad();
                        return;
                    }
                }
                ?? r12 = c2561e.ad;
                int size4 = r12.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj2 = null;
                        break;
                    }
                    obj2 = r12.get(i5);
                    if (((C2401e) obj2).license) {
                        break;
                    } else {
                        i5++;
                    }
                }
                C2401e c2401e6 = (C2401e) obj2;
                if (c2401e6 != null) {
                    c12287e3.license = c2401e6.ad;
                    return;
                }
                if (c2401e5.vip() || !AbstractC17957e.appmetrica(c2401e5)) {
                    m1987e().amazon(c16146e);
                } else {
                    AbstractC15710e.license(m1986e(), c2401e5, 0L);
                    float appmetrica2 = ((InterfaceC11678e) AbstractC10432e.vip(this, AbstractC11473e.pro)).appmetrica();
                    long vip = m1986e().vip(AbstractC5458e.ad(appmetrica2, appmetrica2));
                    C7699e c7699e = (C7699e) m1986e().f3025e;
                    C1756e c1756e = (C1756e) c7699e.f15624e;
                    AbstractC1660e.inmobi(null, c1756e.license);
                    c1756e.appmetrica = 0;
                    C1756e c1756e2 = (C1756e) c7699e.f15623e;
                    AbstractC1660e.inmobi(null, c1756e2.license);
                    c1756e2.appmetrica = 0;
                    c7699e.f15625e = 0L;
                    m1987e().amazon(new C15208e(AbstractC6367e.metrica(vip), false));
                    this.f12420e = false;
                }
                m1982e();
                return;
            }
            C5724e c5724e = (C5724e) abstractC9947e;
            if (enumC13456e == enumC13456e3) {
                return;
            }
            ?? r13 = c2561e.ad;
            int size5 = r13.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    enumC13456e2 = enumC13456e5;
                    obj3 = null;
                    break;
                }
                obj3 = r13.get(i6);
                int i7 = size5;
                enumC13456e2 = enumC13456e5;
                if (AbstractC17751e.vip(((C2401e) obj3).ad, c5724e.appmetrica)) {
                    break;
                }
                i6++;
                size5 = i7;
                enumC13456e5 = enumC13456e2;
            }
            C2401e c2401e7 = (C2401e) obj3;
            if (c2401e7 == null) {
                int size6 = r13.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size6) {
                        c2401e2 = 0;
                        break;
                    }
                    c2401e2 = r13.get(i8);
                    if (((C2401e) c2401e2).license) {
                        break;
                    } else {
                        i8++;
                    }
                }
                c2401e7 = c2401e2;
                if (c2401e7 == null) {
                    m1982e();
                    return;
                }
                c5724e.appmetrica = c2401e7.ad;
            }
            if (enumC13456e == enumC13456e4) {
                if (c2401e7.vip()) {
                    C2401e c2401e8 = c5724e.license;
                    if (c2401e8 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                    }
                    long j4 = c5724e.appmetrica;
                    C3318e c3318e = this.f12426e;
                    if (c3318e == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                    m1983e(c2401e8, j4, c3318e);
                } else if (AbstractC17957e.appmetrica(c2401e7)) {
                    int size7 = r13.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size7) {
                            c2401e = null;
                            break;
                        }
                        ?? r8 = r13.get(i9);
                        if (((C2401e) r8).license) {
                            c2401e = r8;
                            break;
                        }
                        i9++;
                    }
                    C2401e c2401e9 = c2401e;
                    if (c2401e9 == null) {
                        m1982e();
                    } else {
                        c5724e.appmetrica = c2401e9.ad;
                    }
                } else {
                    float yandex2 = AbstractC11454e.yandex((InterfaceC11678e) AbstractC10432e.vip(this, AbstractC11473e.pro), c2401e7.startapp);
                    C3318e c3318e2 = this.f12426e;
                    if (c3318e2 == null) {
                        throw new IllegalArgumentException("Touch slop detector not initialized.");
                    }
                    long tapsense = c3318e2.tapsense(yandex2, AbstractC17957e.startapp(c2401e7, true), true);
                    if ((9223372034707292159L & tapsense) != 9205357640488583168L) {
                        boolean mo1227strictfp = mo1227strictfp(c2401e7);
                        InterfaceC2998e billing = AbstractC0718e.billing(this);
                        boolean z4 = billing != null && billing.mo1227strictfp(c2401e7);
                        if (mo1227strictfp || !z4) {
                            c2401e7.ad();
                            m1984e(c5724e.license, c2401e7, tapsense);
                            m1979e(tapsense, c2401e7);
                            long j5 = c2401e7.ad;
                            C12287e c12287e4 = this.f12419e;
                            C12287e c12287e5 = c12287e4;
                            if (c12287e4 == null) {
                                ?? obj6 = new Object();
                                obj6.license = Long.MAX_VALUE;
                                this.f12419e = obj6;
                                c12287e5 = obj6;
                            }
                            c12287e5.license = j5;
                            this.f12414e = c12287e5;
                        } else {
                            c5724e.purchase = true;
                        }
                    } else {
                        c5724e.purchase = true;
                    }
                }
            }
            if (enumC13456e == enumC13456e2 && c5724e.purchase) {
                if (!c2401e7.vip()) {
                    c5724e.purchase = false;
                    return;
                }
                C2401e c2401e10 = c5724e.license;
                if (c2401e10 == null) {
                    throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                }
                long j6 = c5724e.appmetrica;
                C3318e c3318e3 = this.f12426e;
                if (c3318e3 == null) {
                    throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
                m1983e(c2401e10, j6, c3318e3);
            }
        }
    }

    /* renamed from: eۣؑۡ, reason: contains not printable characters */
    public final void m1978e() {
        this.f12428e = true;
        if (this.f12421e == null) {
            this.f12421e = AbstractC12501e.ad(Alert.DURATION_SHOW_INDEFINITELY, 0, null, 6);
        }
        AbstractC5336e.purchase(m3623e(), null, 0, new C13750e(this, null), 3);
    }

    /* renamed from: eؒ٘ؗ, reason: contains not printable characters */
    public final void m1979e(long j, C2401e c2401e) {
        long Signature = AbstractC5851e.adcel(this.f27022e).Signature(0L);
        if (!C2152e.vip(this.f12413e, 9205357640488583168L) && !C2152e.vip(Signature, this.f12413e)) {
            this.f12416e = C2152e.startapp(this.f12416e, C2152e.yandex(Signature, this.f12413e));
        }
        this.f12413e = Signature;
        AbstractC15710e.license(m1986e(), c2401e, this.f12416e);
        m1987e().amazon(new C0119e(j, false));
    }

    /* renamed from: eّؔٞ */
    public abstract void mo1629e(C15208e c15208e);

    @Override // defpackage.InterfaceC4890e
    /* renamed from: eؘُٔ */
    public final void mo709e() {
        mo720protected();
    }

    /* renamed from: eؙؙٝ */
    public abstract boolean mo1630e();

    /* renamed from: eٍؙّ */
    public abstract void mo1631e(long j);

    /* renamed from: eٌؙٞ, reason: contains not printable characters */
    public final void m1980e(AbstractC10918e abstractC10918e) {
        if ((abstractC10918e instanceof C7325e) && !this.f12428e) {
            this.f12428e = true;
            m1978e();
        }
        m1987e().amazon(abstractC10918e);
    }

    /* renamed from: eٌۘۤ */
    public abstract Object mo1632e(C13750e c13750e, C13750e c13750e2);

    /* renamed from: eٌۡٔ, reason: contains not printable characters */
    public final void m1981e(Function1 function1, boolean z, C15274e c15274e, EnumC17426e enumC17426e, boolean z2) {
        this.f12412e = function1;
        boolean z3 = true;
        if (this.f12425e != z) {
            this.f12425e = z;
            if (!z) {
                m1985e();
                this.f12423e = null;
            }
            z2 = true;
        }
        if (!AbstractC7890e.billing(this.f12429e, c15274e)) {
            m1985e();
            this.f12429e = c15274e;
        }
        if (this.f12415e != enumC17426e) {
            this.f12415e = enumC17426e;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.f12420e;
            C16146e c16146e = C16146e.ad;
            if (z4) {
                m1982e();
                if (this.f12428e) {
                    m1987e().amazon(c16146e);
                }
                this.f12422e = null;
            }
            C1460e c1460e = this.f12423e;
            if (c1460e != null) {
                c1460e.ad();
                AbstractC5881e abstractC5881e = c1460e.ad;
                if (abstractC5881e.f12428e) {
                    abstractC5881e.m1980e(c16146e);
                }
                c1460e.billing = null;
                C13572e c13572e = c1460e.mopub;
                c13572e.f26879e = 0;
                ((C2805e) c13572e.f26878e).vip = 0;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eٕؒۜ, java.lang.Object] */
    /* renamed from: eٍؓۙ, reason: contains not printable characters */
    public final void m1982e() {
        C1077e c1077e = this.f12418e;
        C1077e c1077e2 = c1077e;
        if (c1077e == null) {
            ?? obj = new Object();
            obj.license = 3;
            obj.appmetrica = false;
            this.f12418e = obj;
            c1077e2 = obj;
        }
        c1077e2.license = 3;
        c1077e2.appmetrica = false;
        this.f12414e = c1077e2;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eُۘٙ */
    public void mo713e() {
        mo720protected();
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        this.f12428e = false;
        m1985e();
        this.f12416e = 0L;
        C5943e c5943e = this.f12411e;
        if (c5943e != null) {
            m2042e(c5943e);
        }
        this.f12411e = null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eِؕۜ, java.lang.Object] */
    /* renamed from: eٔؖۘ, reason: contains not printable characters */
    public final void m1983e(C2401e c2401e, long j, C3318e c3318e) {
        C3643e c3643e = this.f12417e;
        C3643e c3643e2 = c3643e;
        if (c3643e == null) {
            ?? obj = new Object();
            obj.license = null;
            obj.appmetrica = Long.MAX_VALUE;
            this.f12417e = obj;
            c3643e2 = obj;
        }
        c3643e2.license = c2401e;
        c3643e2.appmetrica = j;
        c3318e.f7486e = 0L;
        this.f12414e = c3643e2;
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: eّٔؖ */
    public final /* synthetic */ boolean mo716e() {
        return false;
    }

    /* renamed from: eّٔؗ, reason: contains not printable characters */
    public final void m1984e(C2401e c2401e, C2401e c2401e2, long j) {
        if (this.f12422e == null) {
            this.f12422e = new C0731e(1);
        }
        AbstractC15710e.license(m1986e(), c2401e, 0L);
        long yandex = C2152e.yandex(c2401e2.metrica, j);
        this.f12416e = 0L;
        if (((Boolean) this.f12412e.invoke(new C15991e(c2401e.startapp))).booleanValue()) {
            if (!this.f12428e) {
                if (this.f12421e == null) {
                    this.f12421e = AbstractC12501e.ad(Alert.DURATION_SHOW_INDEFINITELY, 0, null, 6);
                }
                m1978e();
            }
            this.f12413e = AbstractC5851e.adcel(this).Signature(0L);
            m1987e().amazon(new C7325e(yandex));
        }
    }

    /* renamed from: eٕٙؗ, reason: contains not printable characters */
    public final void m1985e() {
        C3877e c3877e = this.f12427e;
        if (c3877e != null) {
            C15274e c15274e = this.f12429e;
            if (c15274e != null) {
                c15274e.vip(new C3005e(c3877e));
            }
            this.f12427e = null;
        }
    }

    /* renamed from: eٕٗٛ, reason: contains not printable characters */
    public final C0731e m1986e() {
        C0731e c0731e = this.f12422e;
        if (c0731e != null) {
            return c0731e;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    /* renamed from: e۠۟, reason: contains not printable characters */
    public final InterfaceC0888e m1987e() {
        C14137e c14137e = this.f12421e;
        if (c14137e != null) {
            return c14137e;
        }
        throw new IllegalArgumentException("Events channel not initialized.");
    }

    @Override // defpackage.InterfaceC2998e
    /* renamed from: interface */
    public final boolean mo1226interface(C3189e c3189e) {
        return AbstractC7291e.license(c3189e) && this.f12425e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v0, types: [eؔۦۗ, eؙؒؐ, eؘۙۢ] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, eؓؕؐ] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, eؓؕؐ] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, eٖٓۛ] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object] */
    @Override // defpackage.InterfaceC1946e
    public final void isVip(Csuper csuper, EnumC13456e enumC13456e) {
        Object obj;
        Object obj2;
        Object obj3;
        C3189e c3189e;
        C15309e c15309e;
        C3189e c3189e2;
        C3189e c3189e3;
        int i = csuper.f36470e;
        ArrayList arrayList = (ArrayList) csuper.f36469e;
        if (this.f12411e == null) {
            C5943e c5943e = new C5943e(this);
            m2050e(c5943e);
            this.f12411e = c5943e;
        }
        if (this.f12425e) {
            if (this.f12423e == null) {
                this.f12423e = new C1460e(this);
            }
            C1460e c1460e = this.f12423e;
            if (c1460e != null) {
                AbstractC5881e abstractC5881e = c1460e.ad;
                if (c1460e.purchase == null) {
                    C14236e c14236e = c1460e.vip;
                    C14236e c14236e2 = c14236e;
                    if (c14236e == null) {
                        ?? obj4 = new Object();
                        obj4.vip = 3;
                        obj4.metrica = false;
                        c1460e.vip = obj4;
                        c14236e2 = obj4;
                    }
                    c1460e.purchase = c14236e2;
                }
                AbstractC17680e abstractC17680e = c1460e.purchase;
                if (abstractC17680e == null) {
                    throw new IllegalArgumentException("currentDragState should not be null");
                }
                boolean z = abstractC17680e instanceof C14236e;
                boolean z2 = true;
                EnumC13456e enumC13456e2 = EnumC13456e.f26729e;
                EnumC13456e enumC13456e3 = EnumC13456e.f26727e;
                if (z) {
                    C14236e c14236e3 = (C14236e) abstractC17680e;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!AbstractC7291e.license((C3189e) arrayList.get(i2))) {
                            return;
                        }
                    }
                    C3189e c3189e4 = (C3189e) AbstractC13480e.m3591interface(arrayList);
                    int i3 = AbstractC8616e.ad[AbstractC8703e.m2467class(c14236e3.vip)] == 1 ? !abstractC5881e.mo1630e() ? 1 : 2 : c14236e3.vip;
                    c14236e3.vip = i3;
                    if (enumC13456e == enumC13456e2 && i3 == 2) {
                        c3189e4.startapp = true;
                        c14236e3.metrica = true;
                    }
                    if (enumC13456e == enumC13456e3) {
                        if (i3 == 1) {
                            C1460e.metrica(c1460e, c3189e4, c3189e4.ad, 0L, 12);
                            return;
                        }
                        if (c14236e3.metrica) {
                            c1460e.purchase(c3189e4, c3189e4, new C7180e(i), 0L);
                            c1460e.appmetrica(c3189e4, new C7180e(i), 0L);
                            long j = c3189e4.ad;
                            C1578e c1578e = c1460e.metrica;
                            C1578e c1578e2 = c1578e;
                            if (c1578e == null) {
                                ?? obj5 = new Object();
                                obj5.vip = Long.MAX_VALUE;
                                c1460e.metrica = obj5;
                                c1578e2 = obj5;
                            }
                            c1578e2.vip = j;
                            c1460e.purchase = c1578e2;
                            return;
                        }
                        return;
                    }
                    return;
                }
                boolean z3 = abstractC17680e instanceof C15309e;
                EnumC13456e enumC13456e4 = EnumC13456e.f26726e;
                if (!z3) {
                    if (abstractC17680e instanceof C9218e) {
                        C9218e c9218e = (C9218e) abstractC17680e;
                        if (enumC13456e != enumC13456e4) {
                            return;
                        }
                        int size2 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                break;
                            }
                            if (((C3189e) arrayList.get(i4)).startapp) {
                                z2 = false;
                                break;
                            }
                            i4++;
                        }
                        int size3 = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size3) {
                                break;
                            }
                            if (!((C3189e) arrayList.get(i5)).license) {
                                i5++;
                            } else if (!arrayList.isEmpty()) {
                                if (z2) {
                                    long yandex = C2152e.yandex(AbstractC7291e.billing((C3189e) AbstractC13480e.m3591interface(arrayList), abstractC5881e.f12415e, new C7180e(i)), AbstractC7291e.billing(c9218e.vip, abstractC5881e.f12415e, new C7180e(i)));
                                    C3189e c3189e5 = c9218e.vip;
                                    if (c3189e5 == null) {
                                        throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                                    }
                                    C1460e.metrica(c1460e, c3189e5, c9218e.metrica, yandex, 8);
                                    return;
                                }
                                return;
                            }
                        }
                        c1460e.ad();
                        return;
                    }
                    if (!(abstractC17680e instanceof C1578e)) {
                        throw new C14803e(10);
                    }
                    C1578e c1578e3 = (C1578e) abstractC17680e;
                    if (enumC13456e != enumC13456e3) {
                        return;
                    }
                    long j2 = c1578e3.vip;
                    int size4 = arrayList.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size4) {
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i6);
                        if (AbstractC17751e.vip(((C3189e) obj).ad, j2)) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    C3189e c3189e6 = (C3189e) obj;
                    if (c3189e6 == null) {
                        return;
                    }
                    boolean vip = AbstractC7291e.vip(c3189e6);
                    C16146e c16146e = C16146e.ad;
                    if (!vip) {
                        if (c3189e6.startapp) {
                            abstractC5881e.m1980e(c16146e);
                            return;
                        } else {
                            if (C2152e.metrica(AbstractC7291e.purchase(c3189e6, abstractC5881e.f12415e, new C7180e(i), true)) == 0.0f) {
                                return;
                            }
                            c1460e.appmetrica(c3189e6, new C7180e(i), AbstractC7291e.purchase(c3189e6, abstractC5881e.f12415e, new C7180e(i), false));
                            c3189e6.startapp = true;
                            return;
                        }
                    }
                    int size5 = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size5) {
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i7);
                        if (((C3189e) obj2).license) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    C3189e c3189e7 = (C3189e) obj2;
                    if (c3189e7 != null) {
                        c1578e3.vip = c3189e7.ad;
                        return;
                    }
                    if (c3189e6.startapp || !AbstractC7291e.vip(c3189e6)) {
                        abstractC5881e.m1980e(c16146e);
                    } else {
                        AbstractC7291e.ad(c1460e.license(), c3189e6, abstractC5881e.f12415e, new C7180e(i), c1460e.adcel, c1460e.advert);
                        float appmetrica = ((InterfaceC11678e) AbstractC10432e.vip(abstractC5881e, AbstractC11473e.pro)).appmetrica();
                        long vip2 = c1460e.license().vip(AbstractC5458e.ad(appmetrica, appmetrica));
                        C7699e c7699e = (C7699e) c1460e.license().f3025e;
                        C1756e c1756e = (C1756e) c7699e.f15624e;
                        AbstractC1660e.inmobi(null, c1756e.license);
                        c1756e.appmetrica = 0;
                        C1756e c1756e2 = (C1756e) c7699e.f15623e;
                        AbstractC1660e.inmobi(null, c1756e2.license);
                        c1756e2.appmetrica = 0;
                        c7699e.f15625e = 0L;
                        abstractC5881e.m1980e(new C15208e(AbstractC6367e.metrica(vip2), true));
                    }
                    c1460e.ad();
                    return;
                }
                C15309e c15309e2 = (C15309e) abstractC17680e;
                if (enumC13456e == enumC13456e2) {
                    return;
                }
                int size6 = arrayList.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size6) {
                        obj3 = null;
                        break;
                    }
                    obj3 = arrayList.get(i8);
                    if (AbstractC17751e.vip(((C3189e) obj3).ad, c15309e2.metrica)) {
                        break;
                    } else {
                        i8++;
                    }
                }
                C3189e c3189e8 = (C3189e) obj3;
                if (c3189e8 == null) {
                    int size7 = arrayList.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size7) {
                            c3189e3 = 0;
                            break;
                        }
                        c3189e3 = arrayList.get(i9);
                        if (((C3189e) c3189e3).license) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    c3189e = c3189e3;
                    if (c3189e == null) {
                        c1460e.ad();
                        return;
                    }
                    c15309e2.metrica = c3189e.ad;
                } else {
                    c3189e = c3189e8;
                }
                if (enumC13456e == enumC13456e3) {
                    if (c3189e.startapp) {
                        c15309e = c15309e2;
                        C3189e c3189e9 = c15309e.vip;
                        if (c3189e9 == null) {
                            throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                        }
                        long j3 = c15309e.metrica;
                        C3318e c3318e = c1460e.startapp;
                        if (c3318e == null) {
                            throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                        }
                        c1460e.vip(c3189e9, j3, c3318e);
                    } else if (AbstractC7291e.vip(c3189e)) {
                        int size8 = arrayList.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size8) {
                                c3189e2 = null;
                                break;
                            }
                            ?? r8 = arrayList.get(i10);
                            if (((C3189e) r8).license) {
                                c3189e2 = r8;
                                break;
                            }
                            i10++;
                        }
                        C3189e c3189e10 = c3189e2;
                        if (c3189e10 == null) {
                            c1460e.ad();
                        } else {
                            c15309e2.metrica = c3189e10.ad;
                        }
                    } else {
                        InterfaceC11678e interfaceC11678e = (InterfaceC11678e) AbstractC10432e.vip(abstractC5881e, AbstractC11473e.pro);
                        float f = AbstractC11454e.ad;
                        float purchase = interfaceC11678e.purchase();
                        C3318e c3318e2 = c1460e.startapp;
                        if (c3318e2 == null) {
                            throw new IllegalArgumentException("Touch slop detector not initialized.");
                        }
                        long tapsense = c3318e2.tapsense(purchase, AbstractC7291e.purchase(c3189e, abstractC5881e.f12415e, new C7180e(i), true), true);
                        if ((9223372034707292159L & tapsense) != 9205357640488583168L) {
                            c3189e.startapp = true;
                            c15309e = c15309e2;
                            c1460e.purchase(c15309e.vip, c3189e, new C7180e(i), tapsense);
                            c1460e.appmetrica(c3189e, new C7180e(i), tapsense);
                            long j4 = c3189e.ad;
                            C1578e c1578e4 = c1460e.metrica;
                            C1578e c1578e5 = c1578e4;
                            if (c1578e4 == null) {
                                ?? obj6 = new Object();
                                obj6.vip = Long.MAX_VALUE;
                                c1460e.metrica = obj6;
                                c1578e5 = obj6;
                            }
                            c1578e5.vip = j4;
                            c1460e.purchase = c1578e5;
                        } else {
                            c15309e = c15309e2;
                            c15309e.license = true;
                        }
                    }
                    if (enumC13456e == enumC13456e4 || !c15309e.license) {
                    }
                    if (!c3189e.startapp) {
                        c15309e.license = false;
                        return;
                    }
                    C3189e c3189e11 = c15309e.vip;
                    if (c3189e11 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                    }
                    long j5 = c15309e.metrica;
                    C3318e c3318e3 = c1460e.startapp;
                    if (c3318e3 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                    c1460e.vip(c3189e11, j5, c3318e3);
                    return;
                }
                c15309e = c15309e2;
                if (enumC13456e == enumC13456e4) {
                }
            }
        }
    }

    @Override // defpackage.InterfaceC4890e
    public final long pro() {
        return AbstractC15287e.ad;
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: protected */
    public final void mo720protected() {
        if (this.f12420e) {
            m1982e();
            if (this.f12428e) {
                m1987e().amazon(C16146e.ad);
            }
            this.f12422e = null;
        }
        this.f12420e = false;
    }

    @Override // defpackage.InterfaceC2998e
    /* renamed from: strictfp */
    public final boolean mo1227strictfp(C2401e c2401e) {
        if (AbstractC17957e.metrica(c2401e)) {
            return this.f12425e;
        }
        if (!AbstractC17957e.appmetrica(c2401e)) {
            if (this.f12426e == null) {
                this.f12426e = new C3318e(this.f12415e, 2);
            }
            float purchase = ((InterfaceC11678e) AbstractC10432e.vip(this, AbstractC11473e.pro)).purchase();
            long startapp = AbstractC17957e.startapp(c2401e, false);
            C3318e c3318e = this.f12426e;
            if (c3318e == null) {
                throw new IllegalArgumentException("Touch slop detector not initialized.");
            }
            if (!C2152e.vip(c3318e.tapsense(purchase, startapp, false), 9205357640488583168L)) {
                long startapp2 = C2152e.startapp(c3318e.f7486e, startapp);
                double atan2 = (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (startapp2 & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (startapp2 >> 32))))) * 180) / 3.141592653589793d;
                EnumC17426e enumC17426e = (EnumC17426e) c3318e.f7485e;
                int i = enumC17426e == null ? -1 : AbstractC15323e.ad[enumC17426e.ordinal()];
                if (i == 1 ? atan2 < 30.0d : !(i != 2 || atan2 <= 30.0d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC1946e
    /* renamed from: switch */
    public final void mo733switch() {
        C1460e c1460e = this.f12423e;
        if (c1460e != null) {
            c1460e.ad();
            AbstractC5881e abstractC5881e = c1460e.ad;
            if (abstractC5881e.f12428e) {
                abstractC5881e.m1980e(C16146e.ad);
            }
            c1460e.billing = null;
            C13572e c13572e = c1460e.mopub;
            c13572e.f26879e = 0;
            ((C2805e) c13572e.f26878e).vip = 0;
        }
    }
}
