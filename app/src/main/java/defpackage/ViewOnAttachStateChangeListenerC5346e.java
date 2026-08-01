package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؐۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC5346e implements InterfaceC13619e, View.OnAttachStateChangeListener {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public boolean f11458e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public C8929e f11459e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public InterfaceC18037e f11460e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public long f11461e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final RunnableC17584e f11462e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Cvolatile f11463e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C3123e f11465e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C3123e f11467e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC5014e f11468e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final ArrayList f11466e = new ArrayList();

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final long f11457e = 100;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f11470e = 1;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f11469e = true;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C14137e f11464e = AbstractC12501e.ad(1, 0, null, 6);

    public ViewOnAttachStateChangeListenerC5346e(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, Cvolatile cvolatile) {
        this.f11468e = viewTreeObserverOnGlobalLayoutListenerC5014e;
        this.f11463e = cvolatile;
        new Handler(Looper.getMainLooper());
        C3123e c3123e = AbstractC12146e.ad;
        this.f11467e = c3123e;
        this.f11465e = new C3123e();
        this.f11459e = new C8929e(viewTreeObserverOnGlobalLayoutListenerC5014e.getSemanticsOwner().ad(), c3123e);
        this.f11462e = new RunnableC17584e(3, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r8 != r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (defpackage.AbstractC16481e.vip(r7.f11457e, r0) == r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:11:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.AbstractC10731e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.C17939e
            if (r0 == 0) goto L13
            r0 = r8
            e٘ۖ۠ r0 = (defpackage.C17939e) r0
            int r1 = r0.f35187e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35187e = r1
            goto L18
        L13:
            e٘ۖ۠ r0 = new e٘ۖ۠
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f35185e
            int r1 = r0.f35187e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            eٜؐ r1 = r0.f35186e
            defpackage.AbstractC2003e.purchase(r8)
            goto L47
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            eٜؐ r1 = r0.f35186e
            defpackage.AbstractC2003e.purchase(r8)
            goto L52
        L3a:
            defpackage.AbstractC2003e.purchase(r8)
            eٖٓٞ r8 = r7.f11464e
            r8.getClass()
            eٜؐ r1 = new eٜؐ
            r1.<init>(r8)
        L47:
            r0.f35186e = r1
            r0.f35187e = r3
            java.lang.Object r8 = r1.ad(r0)
            if (r8 != r4) goto L52
            goto L85
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L86
            r1.vip()
            boolean r8 = r7.license()
            if (r8 == 0) goto L66
            r7.appmetrica()
        L66:
            eٜؗؗ r8 = r7.f11468e
            android.os.Handler r8 = r8.getHandler()
            boolean r5 = r7.f11458e
            if (r5 != 0) goto L79
            if (r8 == 0) goto L79
            r7.f11458e = r3
            eؘٟ٘ r5 = r7.f11462e
            r8.post(r5)
        L79:
            r0.f35186e = r1
            r0.f35187e = r2
            long r5 = r7.f11457e
            java.lang.Object r8 = defpackage.AbstractC16481e.vip(r5, r0)
            if (r8 != r4) goto L47
        L85:
            return r4
        L86:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnAttachStateChangeListenerC5346e.ad(eُؑ۠):java.lang.Object");
    }

    public final void adcel(C6071e c6071e) {
        if (license()) {
            this.f11466e.add(new C18250e(c6071e.purchase, this.f11461e, 2, null));
            List adcel = C6071e.adcel(4, c6071e);
            int size = adcel.size();
            for (int i = 0; i < size; i++) {
                adcel((C6071e) adcel.get(i));
            }
        }
    }

    public final void appmetrica() {
        InterfaceC18037e interfaceC18037e = this.f11460e;
        if (interfaceC18037e != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f11466e;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C18250e c18250e = (C18250e) arrayList.get(i);
                int m2467class = AbstractC8703e.m2467class(c18250e.metrica);
                if (m2467class == 0) {
                    C5389e c5389e = c18250e.license;
                    if (c5389e != null) {
                        ((C2311e) interfaceC18037e).license((ViewStructure) c5389e.f11540e);
                    }
                } else {
                    if (m2467class != 1) {
                        throw new C14803e(10);
                    }
                    C2311e c2311e = (C2311e) interfaceC18037e;
                    AutofillId vip = c2311e.vip(c18250e.ad);
                    if (vip != null) {
                        c2311e.appmetrica(vip);
                    }
                }
            }
            ((C2311e) interfaceC18037e).ad();
            arrayList.clear();
        }
    }

    public final void billing(C6071e c6071e, C8929e c8929e) {
        C3660e c3660e = new C3660e(c8929e, this, 0);
        c6071e.getClass();
        List adcel = C6071e.adcel(4, c6071e);
        int size = adcel.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = adcel.get(i2);
            if (metrica().ad(((C6071e) obj).purchase)) {
                c3660e.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
        List adcel2 = C6071e.adcel(4, c6071e);
        int size2 = adcel2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C6071e c6071e2 = (C6071e) adcel2.get(i3);
            AbstractC16167e metrica = metrica();
            int i4 = c6071e2.purchase;
            if (metrica.ad(i4)) {
                C3123e c3123e = this.f11465e;
                if (c3123e.ad(i4)) {
                    Object vip = c3123e.vip(i4);
                    if (vip == null) {
                        throw AbstractC8703e.Signature("node not present in pruned tree before this change");
                    }
                    billing(c6071e2, (C8929e) vip);
                } else {
                    continue;
                }
            }
        }
    }

    public final boolean license() {
        return this.f11460e != null;
    }

    public final AbstractC16167e metrica() {
        if (this.f11469e) {
            this.f11469e = false;
            this.f11467e = AbstractC0421e.vip(this.f11468e.getSemanticsOwner(), C5430e.f11658e);
            this.f11461e = System.currentTimeMillis();
        }
        return this.f11467e;
    }

    public final void mopub() {
        C3123e c3123e = this.f11465e;
        c3123e.metrica();
        AbstractC16167e metrica = metrica();
        int[] iArr = metrica.vip;
        Object[] objArr = metrica.metrica;
        long[] jArr = metrica.ad;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            c3123e.startapp(iArr[i4], new C8929e(((C3993e) objArr[i4]).ad, metrica()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f11459e = new C8929e(this.f11468e.getSemanticsOwner().ad(), metrica());
    }

    @Override // defpackage.InterfaceC13619e
    public final /* synthetic */ void onDestroy(InterfaceC16400e interfaceC16400e) {
    }

    @Override // defpackage.InterfaceC13619e
    public final /* synthetic */ void onPause(InterfaceC16400e interfaceC16400e) {
    }

    @Override // defpackage.InterfaceC13619e
    public final /* synthetic */ void onResume(InterfaceC16400e interfaceC16400e) {
    }

    @Override // defpackage.InterfaceC13619e
    public final void onStart(InterfaceC16400e interfaceC16400e) {
        this.f11460e = (InterfaceC18037e) this.f11463e.invoke();
        startapp(-1, this.f11468e.getSemanticsOwner().ad());
        appmetrica();
    }

    @Override // defpackage.InterfaceC13619e
    public final void onStop(InterfaceC16400e interfaceC16400e) {
        adcel(this.f11468e.getSemanticsOwner().ad());
        appmetrica();
        this.f11460e = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f11468e.getHandler().removeCallbacks(this.f11462e);
        this.f11460e = null;
    }

    @Override // defpackage.InterfaceC13619e
    public final /* synthetic */ void purchase() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v20 android.view.autofill.AutofillId, still in use, count: 2, list:
          (r5v20 android.view.autofill.AutofillId) from 0x0098: IF  (r5v20 android.view.autofill.AutofillId) == (null android.view.autofill.AutofillId)  -> B:22:0x0073 A[HIDDEN]
          (r5v20 android.view.autofill.AutofillId) from 0x009f: PHI (r5v7 android.view.autofill.AutofillId) = (r5v6 android.view.autofill.AutofillId), (r5v20 android.view.autofill.AutofillId) binds: [B:100:0x009b, B:42:0x0098] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:24:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startapp(int r17, defpackage.C6071e r18) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnAttachStateChangeListenerC5346e.startapp(int, eٌؘۧ):void");
    }

    public final void vip(AbstractC16167e abstractC16167e) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        long[] jArr3;
        long[] jArr4;
        long j3;
        long j4;
        AbstractC16167e abstractC16167e2 = abstractC16167e;
        int[] iArr3 = abstractC16167e2.vip;
        long[] jArr5 = abstractC16167e2.ad;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j5 = jArr5[i2];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j5 & 255) < 128) {
                        int i6 = iArr3[(i2 << 3) + i5];
                        c = c2;
                        C8929e c8929e = (C8929e) this.f11465e.vip(i6);
                        C3993e c3993e = (C3993e) abstractC16167e2.vip(i6);
                        C6071e c6071e = c3993e != null ? c3993e.ad : null;
                        if (c6071e == null) {
                            throw AbstractC8703e.Signature("no value for specified key");
                        }
                        j2 = j6;
                        int i7 = c6071e.purchase;
                        C0500e c0500e = c6071e.license;
                        if (c8929e == null) {
                            C0583e c0583e = c0500e.f2578e;
                            Object[] objArr = c0583e.vip;
                            long[] jArr6 = c0583e.ad;
                            int length2 = jArr6.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i8 = i3;
                                int i9 = 0;
                                while (true) {
                                    long j7 = jArr6[i9];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                        for (int i11 = 0; i11 < i10; i11++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                C16591e c16591e = (C16591e) objArr[(i9 << 3) + i11];
                                                C16591e c16591e2 = AbstractC9058e.ad;
                                                C16591e c16591e3 = AbstractC9058e.subs;
                                                if (AbstractC7890e.billing(c16591e, c16591e3)) {
                                                    List list = (List) AbstractC0259e.appmetrica(c0500e, c16591e3);
                                                    yandex(i7, String.valueOf(list != null ? (C10566e) AbstractC13480e.m3604this(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i8;
                                        }
                                        if (i10 != i8) {
                                            break;
                                        }
                                    }
                                    if (i9 == length2) {
                                        break;
                                    }
                                    i9++;
                                    j5 = j;
                                    i8 = 8;
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            C0583e c0583e2 = c0500e.f2578e;
                            Object[] objArr2 = c0583e2.vip;
                            long[] jArr7 = c0583e2.ad;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                Object[] objArr3 = objArr2;
                                jArr2 = jArr5;
                                int i12 = 0;
                                while (true) {
                                    long j8 = jArr7[i12];
                                    Object[] objArr4 = objArr3;
                                    i = i5;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        int i14 = 0;
                                        while (i14 < i13) {
                                            if ((j8 & 255) < 128) {
                                                jArr4 = jArr7;
                                                C16591e c16591e4 = (C16591e) objArr4[(i12 << 3) + i14];
                                                C16591e c16591e5 = AbstractC9058e.ad;
                                                j3 = j8;
                                                C16591e c16591e6 = AbstractC9058e.subs;
                                                if (AbstractC7890e.billing(c16591e4, c16591e6)) {
                                                    List list2 = (List) AbstractC0259e.appmetrica(c8929e.ad, c16591e6);
                                                    C10566e c10566e = list2 != null ? (C10566e) AbstractC13480e.m3604this(list2) : null;
                                                    List list3 = (List) AbstractC0259e.appmetrica(c0500e, c16591e6);
                                                    C10566e c10566e2 = list3 != null ? (C10566e) AbstractC13480e.m3604this(list3) : null;
                                                    if (!AbstractC7890e.billing(c10566e, c10566e2)) {
                                                        yandex(i7, String.valueOf(c10566e2));
                                                    }
                                                }
                                            } else {
                                                jArr4 = jArr7;
                                                j3 = j8;
                                            }
                                            j8 = j3 >> 8;
                                            i14++;
                                            jArr7 = jArr4;
                                        }
                                        jArr3 = jArr7;
                                        if (i13 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr7;
                                    }
                                    if (i12 == length3) {
                                        break;
                                    }
                                    i12++;
                                    i5 = i;
                                    objArr3 = objArr4;
                                    jArr7 = jArr3;
                                }
                                j5 = j >> 8;
                                i5 = i + 1;
                                jArr5 = jArr2;
                                c2 = c;
                                j6 = j2;
                                iArr3 = iArr2;
                                i3 = 8;
                                abstractC16167e2 = abstractC16167e;
                            }
                        }
                        jArr2 = jArr5;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr5;
                        j = j5;
                        c = c2;
                        j2 = j6;
                    }
                    i = i5;
                    j5 = j >> 8;
                    i5 = i + 1;
                    jArr5 = jArr2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    i3 = 8;
                    abstractC16167e2 = abstractC16167e;
                }
                iArr = iArr3;
                int i15 = i3;
                jArr = jArr5;
                if (i4 != i15) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr5;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            abstractC16167e2 = abstractC16167e;
            jArr5 = jArr;
            iArr3 = iArr;
        }
    }

    public final void yandex(int i, String str) {
        InterfaceC18037e interfaceC18037e;
        if (Build.VERSION.SDK_INT >= 29 && (interfaceC18037e = this.f11460e) != null) {
            C2311e c2311e = (C2311e) interfaceC18037e;
            AutofillId vip = c2311e.vip(i);
            if (vip == null) {
                throw AbstractC8703e.Signature("Invalid content capture ID");
            }
            c2311e.purchase(vip, str);
        }
    }
}
