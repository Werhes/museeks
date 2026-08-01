package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۙؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15682e {
    public final C16760e ad;
    public final C18464e appmetrica;
    public final ArrayList billing;
    public final InterfaceC18435e license;
    public final C14328e metrica;
    public final LinkedHashSet purchase;
    public final C4893e vip;

    public C15682e(C16760e c16760e, C4893e c4893e, C14328e c14328e, C17280e c17280e) {
        this.ad = c16760e;
        this.vip = c4893e;
        this.metrica = c14328e;
        InterfaceC18435e interfaceC18435e = c17280e.ad;
        this.license = interfaceC18435e;
        C11476e c11476e = new C11476e(1, this, C15682e.class, "prune", "prune$camera_camera2_pipe(Ljava/util/List;)V", 0, 0, 28);
        InterfaceC5083e interfaceC5083e = null;
        C18464e c18464e = new C18464e(c11476e, new C8086e(this, interfaceC5083e, 21));
        if (!((C2673e) c18464e.f36192e).ad()) {
            throw new IllegalStateException("PruningProcessingQueue cannot be re-started!");
        }
        if (AbstractC5336e.purchase(interfaceC18435e, null, 0, new C7236e(c18464e, interfaceC5083e, 9), 3).isCancelled()) {
            C18464e.m4484throw(c18464e, null);
        }
        this.appmetrica = c18464e;
        this.purchase = new LinkedHashSet();
        this.billing = new ArrayList();
    }

    public final C8823e ad(String str) {
        C14088e c14088e = new C14088e(str);
        boolean z = ((C14137e) this.appmetrica.f36189e).amazon(c14088e) instanceof C8870e;
        C8823e c8823e = c14088e.vip;
        if (z) {
            Log.e("CXCP", "Camera close by ID request failed for " + ((Object) C5060e.vip(str)) + '!');
            c8823e.m2175import(Unit.INSTANCE);
        }
        return c8823e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        if (r9.vip(r0) != r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        if (metrica(r1) == r4) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object appmetrica(defpackage.C2795e r9, defpackage.AbstractC10731e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.C11065e
            if (r0 == 0) goto L13
            r0 = r10
            eُ٘ۙ r0 = (defpackage.C11065e) r0
            int r1 = r0.f21958e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21958e = r1
            goto L18
        L13:
            eُ٘ۙ r0 = new eُ٘ۙ
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f21956e
            int r1 = r0.f21958e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            defpackage.AbstractC2003e.purchase(r10)
            goto Lab
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            eؔۗٛ r9 = r0.f21957e
            defpackage.AbstractC2003e.purchase(r10)
            goto L98
        L39:
            defpackage.AbstractC2003e.purchase(r10)
            eٕٓۦ r10 = r9.ad
            eّؑ۠ r1 = r10.ad
            java.lang.String r1 = r1.ad
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "PruningCamera2DeviceManager#processRequestClose("
            r5.<init>(r6)
            java.lang.String r1 = defpackage.C5060e.vip(r1)
            r5.append(r1)
            r1 = 41
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r5 = "CXCP"
            android.util.Log.i(r5, r1)
            java.util.LinkedHashSet r1 = r8.purchase
            boolean r5 = r1.contains(r10)
            if (r5 == 0) goto L69
            r1.remove(r10)
        L69:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r5 = r8.billing
            java.util.Iterator r5 = r5.iterator()
        L74:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8d
            java.lang.Object r6 = r5.next()
            r7 = r6
            e٘ۦۖ r7 = (defpackage.C18144e) r7
            eٕٓۦ r7 = r7.vip
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L74
            r1.add(r6)
            goto L74
        L8d:
            r0.f21957e = r9
            r0.f21958e = r3
            kotlin.Unit r10 = r8.metrica(r1)
            if (r10 != r4) goto L98
            goto Laa
        L98:
            eٕٓۦ r10 = r9.ad
            r10.metrica()
            eٕٓۦ r9 = r9.ad
            r10 = 0
            r0.f21957e = r10
            r0.f21958e = r2
            java.lang.Object r9 = r9.vip(r0)
            if (r9 != r4) goto Lab
        Laa:
            return r4
        Lab:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15682e.appmetrica(eؔۗٛ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object billing(defpackage.C14088e r9, defpackage.AbstractC10731e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.C13860e
            if (r0 == 0) goto L13
            r0 = r10
            eٌٓؑ r0 = (defpackage.C13860e) r0
            int r1 = r0.f27453e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27453e = r1
            goto L18
        L13:
            eٌٓؑ r0 = new eٌٓؑ
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f27456e
            int r1 = r0.f27453e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            eٓٛؕ r9 = r0.f27454e
            defpackage.AbstractC2003e.purchase(r10)
            goto Lcf
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.String r9 = r0.f27452e
            eٓٛؕ r1 = r0.f27454e
            defpackage.AbstractC2003e.purchase(r10)
            goto L97
        L3d:
            defpackage.AbstractC2003e.purchase(r10)
            java.lang.String r10 = r9.ad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "PruningCamera2DeviceManager#processRequestCloseById("
            r1.<init>(r5)
            java.lang.String r5 = r9.ad
            java.lang.String r5 = defpackage.C5060e.vip(r5)
            r1.append(r5)
            r5 = 41
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "CXCP"
            android.util.Log.i(r5, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r5 = r8.billing
            java.util.Iterator r5 = r5.iterator()
        L6b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L88
            java.lang.Object r6 = r5.next()
            r7 = r6
            e٘ۦۖ r7 = (defpackage.C18144e) r7
            eؙٛٞ r7 = r7.ad
            eٍؑۙ r7 = r7.ad
            java.lang.String r7 = r7.ad
            boolean r7 = defpackage.AbstractC7890e.billing(r7, r10)
            if (r7 == 0) goto L6b
            r1.add(r6)
            goto L6b
        L88:
            r0.f27454e = r9
            r0.f27452e = r10
            r0.f27453e = r3
            kotlin.Unit r1 = r8.metrica(r1)
            if (r1 != r4) goto L95
            goto Lcd
        L95:
            r1 = r9
            r9 = r10
        L97:
            java.util.LinkedHashSet r10 = r8.purchase
            java.util.Iterator r3 = r10.iterator()
        L9d:
            boolean r5 = r3.hasNext()
            r6 = 0
            if (r5 == 0) goto Lb6
            java.lang.Object r5 = r3.next()
            r7 = r5
            eٕٓۦ r7 = (defpackage.C15458e) r7
            eّؑ۠ r7 = r7.ad
            java.lang.String r7 = r7.ad
            boolean r7 = defpackage.AbstractC7890e.billing(r7, r9)
            if (r7 == 0) goto L9d
            goto Lb7
        Lb6:
            r5 = r6
        Lb7:
            eٕٓۦ r5 = (defpackage.C15458e) r5
            if (r5 == 0) goto Ld0
            r10.remove(r5)
            r5.metrica()
            r0.f27454e = r1
            r0.f27452e = r6
            r0.f27453e = r2
            java.lang.Object r9 = r5.vip(r0)
            if (r9 != r4) goto Lce
        Lcd:
            return r4
        Lce:
            r9 = r1
        Lcf:
            r1 = r9
        Ld0:
            eٌٝؐ r9 = r1.vip
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            r9.m2175import(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15682e.billing(eٓٛؕ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(java.lang.String r5, java.util.List r6, defpackage.C17933e r7, defpackage.InterfaceC18435e r8, defpackage.AbstractC10731e r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.C14036e
            if (r0 == 0) goto L13
            r0 = r9
            eٓ٘ؑ r0 = (defpackage.C14036e) r0
            int r1 = r0.f27763e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27763e = r1
            goto L18
        L13:
            eٓ٘ؑ r0 = new eٓ٘ؑ
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.f27764e
            int r1 = r0.f27763e
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            eۡۦ r8 = r0.f27765e
            java.util.List r6 = r0.f27760e
            java.lang.String r5 = r0.f27762e
            defpackage.AbstractC2003e.purchase(r9)
            goto L67
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.AbstractC2003e.purchase(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "Opening "
            r9.<init>(r1)
            java.lang.String r1 = defpackage.C5060e.vip(r5)
            r9.append(r1)
            java.lang.String r1 = " with retries..."
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.String r1 = "CXCP"
            android.util.Log.d(r1, r9)
            r0.f27762e = r5
            r0.f27760e = r6
            r0.f27765e = r8
            r0.f27763e = r2
            eٗؕؒ r9 = r4.ad
            eؗٔۗ r1 = r4.vip
            java.lang.Object r9 = r9.vip(r5, r1, r7, r0)
            eٟؔۙ r7 = defpackage.EnumC2821e.f6782e
            if (r9 != r7) goto L67
            return r7
        L67:
            eٍَٞ r9 = (defpackage.C10171e) r9
            eّؑ۠ r7 = r9.ad
            if (r7 != 0) goto L75
            eَٖۛ r5 = new eَٖۛ
            eؒٗ r6 = r9.vip
            r5.<init>(r6)
            return r5
        L75:
            eؘؒٗ r9 = new eؘؒٗ
            eٕٓۦ r0 = new eٕٓۦ
            eؗٞٚ r1 = new eؗٞٚ
            r1.<init>(r5)
            java.util.ArrayList r5 = defpackage.AbstractC13480e.m3572catch(r1, r6)
            java.util.Set r5 = defpackage.AbstractC13480e.m3582e(r5)
            eٓؔٝ r6 = new eٓؔٝ
            r1 = 1
            r6.<init>(r1, r4)
            r0.<init>(r7, r5, r8, r6)
            r9.<init>(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15682e.license(java.lang.String, java.util.List, e٘ۖٔ, eۡۦ, eُؑ۠):java.lang.Object");
    }

    public final Unit metrica(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C18144e c18144e = (C18144e) it.next();
            c18144e.metrica.vip();
            this.billing.remove(c18144e);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0052, code lost:
    
        if (metrica(r6.billing) == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f A[LOOP:1: B:27:0x0059->B:29:0x005f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object purchase(defpackage.C17389e r7, defpackage.AbstractC10731e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C5902e
            if (r0 == 0) goto L13
            r0 = r8
            eؘۛؐ r0 = (defpackage.C5902e) r0
            int r1 = r0.f12450e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12450e = r1
            goto L18
        L13:
            eؘۛؐ r0 = new eؘۛؐ
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f12453e
            int r1 = r0.f12450e
            r2 = 2
            r3 = 1
            java.util.LinkedHashSet r4 = r6.purchase
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            java.util.Iterator r7 = r0.f12449e
            eۣٗۤ r1 = r0.f12451e
            defpackage.AbstractC2003e.purchase(r8)
            goto L6f
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            eۣٗۤ r7 = r0.f12451e
            defpackage.AbstractC2003e.purchase(r8)
            goto L55
        L3e:
            defpackage.AbstractC2003e.purchase(r8)
            java.lang.String r8 = "CXCP"
            java.lang.String r1 = "PruningCamera2DeviceManager#processRequestCloseAll()"
            android.util.Log.i(r8, r1)
            r0.f12451e = r7
            r0.f12450e = r3
            java.util.ArrayList r8 = r6.billing
            kotlin.Unit r8 = r6.metrica(r8)
            if (r8 != r5) goto L55
            goto L87
        L55:
            java.util.Iterator r8 = r4.iterator()
        L59:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r8.next()
            eٕٓۦ r1 = (defpackage.C15458e) r1
            r1.metrica()
            goto L59
        L69:
            java.util.Iterator r8 = r4.iterator()
            r1 = r7
            r7 = r8
        L6f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L88
            java.lang.Object r8 = r7.next()
            eٕٓۦ r8 = (defpackage.C15458e) r8
            r0.f12451e = r1
            r0.f12449e = r7
            r0.f12450e = r2
            java.lang.Object r8 = r8.vip(r0)
            if (r8 != r5) goto L6f
        L87:
            return r5
        L88:
            r4.clear()
            eٌٝؐ r7 = r1.ad
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r7.m2175import(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15682e.purchase(eۣٗۤ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0069, code lost:
    
        r1 = r15.ad();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006d, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0070, code lost:
    
        r15.metrica();
        r11.f6593e = r7;
        r11.f6590e = r13;
        r11.f6596e = r14;
        r11.f6595e = r15;
        r11.f6591e = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0081, code lost:
    
        if (r15.vip(r11) != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0084, code lost:
    
        r1 = r13;
        r13 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0084 -> B:34:0x0086). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startapp(java.lang.String r13, defpackage.C6504e r14, defpackage.AbstractC10731e r15) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15682e.startapp(java.lang.String, eؙٛٞ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00de -> B:10:0x00e1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vip(java.util.Set r9, defpackage.AbstractC10731e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.C16160e
            if (r0 == 0) goto L13
            r0 = r10
            eّٖٞ r0 = (defpackage.C16160e) r0
            int r1 = r0.f31737e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31737e = r1
            goto L18
        L13:
            eّٖٞ r0 = new eّٖٞ
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f31740e
            int r1 = r0.f31737e
            java.util.ArrayList r2 = r8.billing
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2c
            e٘ۦۖ r9 = r0.f31736e
            java.util.Iterator r1 = r0.f31738e
            defpackage.AbstractC2003e.purchase(r10)
            goto Le1
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.AbstractC2003e.purchase(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r1 = r2.iterator()
        L40:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L62
            java.lang.Object r4 = r1.next()
            r5 = r4
            e٘ۦۖ r5 = (defpackage.C18144e) r5
            eؙٛٞ r5 = r5.ad
            eٍؑۙ r5 = r5.ad
            java.lang.String r5 = r5.ad
            eؗٞٚ r6 = new eؗٞٚ
            r6.<init>(r5)
            boolean r5 = r9.contains(r6)
            if (r5 == 0) goto L40
            r10.add(r4)
            goto L40
        L62:
            java.util.Iterator r9 = r10.iterator()
            r1 = r9
        L67:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto Le5
            java.lang.Object r9 = r1.next()
            e٘ۦۖ r9 = (defpackage.C18144e) r9
            eؙٛٞ r10 = r9.ad
            eٍؑۙ r4 = r10.ad
            java.lang.String r5 = r4.ad
            eؗٞٚ r6 = new eؗٞٚ
            r6.<init>(r5)
            java.util.List r5 = java.util.Collections.singletonList(r6)
            java.util.List r10 = r10.vip
            java.util.ArrayList r10 = defpackage.AbstractC13480e.m3584final(r5, r10)
            boolean r5 = r10.isEmpty()
            if (r5 == 0) goto L8f
            goto Lce
        L8f:
            java.util.Iterator r10 = r10.iterator()
        L93:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto Lce
            java.lang.Object r5 = r10.next()
            eؗٞٚ r5 = (defpackage.C5060e) r5
            java.lang.String r5 = r5.ad
            java.util.LinkedHashSet r6 = r8.purchase
            if (r6 == 0) goto Lab
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto Lc6
        Lab:
            java.util.Iterator r6 = r6.iterator()
        Laf:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lc6
            java.lang.Object r7 = r6.next()
            eٕٓۦ r7 = (defpackage.C15458e) r7
            eّؑ۠ r7 = r7.ad
            java.lang.String r7 = r7.ad
            boolean r7 = defpackage.AbstractC7890e.billing(r7, r5)
            if (r7 == 0) goto Laf
            goto L93
        Lc6:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Check failed."
            r9.<init>(r10)
            throw r9
        Lce:
            eٕٓۦ r10 = r9.vip
            eٍؚْ r5 = r9.metrica
            r0.f31738e = r1
            r0.f31736e = r9
            r0.f31737e = r3
            kotlin.Unit r10 = r10.license(r4, r5)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r10 != r4) goto Le1
            return r4
        Le1:
            r2.remove(r9)
            goto L67
        Le5:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15682e.vip(java.util.Set, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0266, code lost:
    
        if (vip(r10, r0) != r1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0279, code lost:
    
        if (r11.license(r10, r0) == r1) goto L107;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0139 A[LOOP:3: B:85:0x0133->B:87:0x0139, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yandex(defpackage.C6504e r10, defpackage.AbstractC10731e r11) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15682e.yandex(eؙٛٞ, eُؑ۠):java.lang.Object");
    }
}
