package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۛ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8221e {
    public final Object ad;
    public final Object appmetrica;
    public Object billing;
    public final Object license;
    public Object metrica;
    public final Object purchase;
    public Object vip;
    public Object yandex;

    public C8221e() {
        this.ad = new int[16];
        this.vip = new int[16];
        this.metrica = new int[16];
        this.license = new int[16];
        this.appmetrica = new int[16];
        this.purchase = new int[16];
        this.billing = new int[16];
        this.yandex = new int[16];
    }

    public C8221e(C0909e c0909e, Function2 function2, Function2 function22, C6599e c6599e, Function3 function3, Function1 function1) {
        this.ad = c0909e;
        this.vip = function2;
        this.metrica = function22;
        this.license = c6599e;
        this.appmetrica = function3;
        this.purchase = function1;
        this.billing = new C5609e(function2.invoke((InterfaceC6937e) c0909e.f3322e, c0909e.m419class()));
        Function0 function0 = (Function0) function1.invoke((InterfaceC6937e) c0909e.f3322e);
        this.yandex = function0;
        c6599e.invoke((InterfaceC6937e) c0909e.f3322e, null, Boolean.valueOf(function0 != null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x013b  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, eٍۣؐ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8221e(defpackage.C1343e r34, defpackage.C6594e r35, defpackage.C10524e r36) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8221e.<init>(eؒۜۖ, eؙۗۗ, eَۛؓ):void");
    }

    public C8221e(InterfaceC18435e interfaceC18435e) {
        C1615e metrica = AbstractC9180e.metrica(C3467e.ad);
        this.ad = metrica;
        C1615e metrica2 = AbstractC9180e.metrica(null);
        this.vip = metrica2;
        this.metrica = AbstractC9180e.metrica(null);
        C1615e metrica3 = AbstractC9180e.metrica(null);
        this.license = metrica3;
        this.appmetrica = new C14688e(metrica);
        this.purchase = new C14688e(metrica2);
        this.billing = new C14688e(metrica3);
        C14649e c14649e = new C14649e(metrica2, this, 3);
        Boolean bool = Boolean.FALSE;
        C9831e ad = AbstractC14073e.ad(c14649e);
        C1615e metrica4 = AbstractC9180e.metrica(bool);
        InterfaceC8850e interfaceC8850e = (InterfaceC8850e) ad.appmetrica;
        InterfaceC1108e interfaceC1108e = (InterfaceC1108e) ad.license;
        C8455e c8455e = C10666e.ad;
        AbstractC5336e.appmetrica(c8455e.equals(c8455e) ? 1 : 4, interfaceC8850e, interfaceC18435e, new C1247e(c8455e, interfaceC1108e, metrica4, bool, (InterfaceC5083e) null));
        this.yandex = new C14688e(metrica4);
    }

    public C8221e(C18540e c18540e, InterfaceC12541e interfaceC12541e, C14328e c14328e, C5122e c5122e, C13399e c13399e, C0034e c0034e, C17280e c17280e) {
        this.ad = c18540e;
        this.vip = interfaceC12541e;
        this.metrica = c14328e;
        this.license = c5122e;
        this.appmetrica = c13399e;
        this.purchase = c0034e;
        this.billing = c17280e;
        this.yandex = new C8823e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
    
        if (r14 == r8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        if (yandex(new defpackage.C18301e(false, r13, null), r0) == r8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        if (yandex(new defpackage.C0593e(r13, r2, 10), r0) == r8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0058, code lost:
    
        if (r14 == r8) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object ad(defpackage.AbstractC10731e r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.C16379e
            if (r0 == 0) goto L13
            r0 = r14
            eٖٝۥ r0 = (defpackage.C16379e) r0
            int r1 = r0.f32183e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32183e = r1
            goto L18
        L13:
            eٖٝۥ r0 = new eٖٝۥ
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.f32182e
            int r1 = r0.f32183e
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            eٟؔۙ r8 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L4d
            if (r1 == r7) goto L49
            if (r1 == r6) goto L45
            if (r1 == r5) goto L41
            if (r1 == r4) goto L3d
            if (r1 != r3) goto L35
            defpackage.AbstractC2003e.purchase(r14)
            goto La0
        L35:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L3d:
            defpackage.AbstractC2003e.purchase(r14)
            goto L95
        L41:
            defpackage.AbstractC2003e.purchase(r14)
            goto L86
        L45:
            defpackage.AbstractC2003e.purchase(r14)
            return r14
        L49:
            defpackage.AbstractC2003e.purchase(r14)
            goto L5b
        L4d:
            defpackage.AbstractC2003e.purchase(r14)
            java.util.ArrayList r14 = defpackage.AbstractC1876e.ad
            r0.f32183e = r7
            java.lang.Object r14 = r13.mopub(r0)
            if (r14 != r8) goto L5b
            goto L9f
        L5b:
            eۤۤ r14 = (defpackage.C18479e) r14
            long r9 = r14.ad
            r11 = 0
            int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r14 != 0) goto L76
            r0.f32183e = r6
            eٜٗۗ r14 = new eٜٗۗ
            r1 = 12
            r14.<init>(r13, r2, r1)
            java.lang.Object r14 = r13.yandex(r14, r0)
            if (r14 != r8) goto L75
            goto L9f
        L75:
            return r14
        L76:
            r0.f32183e = r5
            eؑ۟ۦ r14 = new eؑ۟ۦ
            r1 = 10
            r14.<init>(r13, r2, r1)
            java.lang.Object r14 = r13.yandex(r14, r0)
            if (r14 != r8) goto L86
            goto L9f
        L86:
            r0.f32183e = r4
            eۖۗ r14 = new eۖۗ
            r1 = 0
            r14.<init>(r1, r13, r2)
            java.lang.Object r14 = r13.yandex(r14, r0)
            if (r14 != r8) goto L95
            goto L9f
        L95:
            java.util.ArrayList r14 = defpackage.AbstractC1876e.ad
            r0.f32183e = r3
            java.lang.Object r14 = r13.mopub(r0)
            if (r14 != r8) goto La0
        L9f:
            return r8
        La0:
            eۤۤ r14 = (defpackage.C18479e) r14
            java.lang.String r14 = r14.vip
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8221e.ad(eُؑ۠):java.lang.Object");
    }

    public void adcel(InterfaceC0804e interfaceC0804e) {
        C1615e c1615e = (C1615e) this.ad;
        c1615e.getClass();
        c1615e.smaato(null, interfaceC0804e);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object advert(java.lang.String r24, int r25, long r26, defpackage.C4893e r28, defpackage.C9173e r29, defpackage.AbstractC10731e r30) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8221e.advert(java.lang.String, int, long, eؗٔۗ, eٍٍؑ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0200, code lost:
    
        if (r4 != r11) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0130 A[LOOP:0: B:27:0x012a->B:29:0x0130, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object appmetrica(java.lang.String r18, boolean r19, java.lang.String r20, java.util.HashMap r21, java.lang.String r22, defpackage.AbstractC10731e r23) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8221e.appmetrica(java.lang.String, boolean, java.lang.String, java.util.HashMap, java.lang.String, eُؑ۠):java.lang.Object");
    }

    public ArrayList billing() {
        C13614e appmetrica = AbstractC7291e.appmetrica((C6594e) this.purchase);
        List<C18479e> list = appmetrica != null ? appmetrica.vip : null;
        if (list == null) {
            list = C13664e.f27089e;
        }
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        for (C18479e c18479e : list) {
            arrayList.add(new C11048e(c18479e.ad, c18479e.billing, c18479e.adcel));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0097, code lost:
    
        if (r15 == r11) goto L137;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0023. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023a A[Catch: Exception -> 0x00ab, TryCatch #2 {Exception -> 0x00ab, blocks: (B:18:0x021e, B:25:0x01e5, B:27:0x01e9, B:31:0x0230, B:36:0x0165, B:38:0x0169, B:45:0x0125, B:47:0x0129, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:60:0x00f3, B:65:0x0102, B:68:0x010c, B:70:0x0112, B:77:0x0146, B:79:0x014c, B:81:0x0152, B:85:0x0180, B:87:0x0184, B:89:0x018a, B:91:0x0193, B:92:0x01a3, B:94:0x01a7, B:95:0x01b7, B:97:0x01bb, B:98:0x01c0, B:104:0x0205, B:106:0x0209, B:110:0x023a, B:112:0x0240, B:114:0x0244, B:115:0x024b, B:116:0x00fa, B:118:0x00fd, B:123:0x009b, B:125:0x00a1, B:127:0x00af, B:129:0x00bb, B:132:0x00c0, B:134:0x00d2), top: B:122:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00fd A[Catch: Exception -> 0x00ab, TryCatch #2 {Exception -> 0x00ab, blocks: (B:18:0x021e, B:25:0x01e5, B:27:0x01e9, B:31:0x0230, B:36:0x0165, B:38:0x0169, B:45:0x0125, B:47:0x0129, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:60:0x00f3, B:65:0x0102, B:68:0x010c, B:70:0x0112, B:77:0x0146, B:79:0x014c, B:81:0x0152, B:85:0x0180, B:87:0x0184, B:89:0x018a, B:91:0x0193, B:92:0x01a3, B:94:0x01a7, B:95:0x01b7, B:97:0x01bb, B:98:0x01c0, B:104:0x0205, B:106:0x0209, B:110:0x023a, B:112:0x0240, B:114:0x0244, B:115:0x024b, B:116:0x00fa, B:118:0x00fd, B:123:0x009b, B:125:0x00a1, B:127:0x00af, B:129:0x00bb, B:132:0x00c0, B:134:0x00d2), top: B:122:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: Exception -> 0x0032, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0032, blocks: (B:13:0x002e, B:16:0x003b, B:23:0x004a, B:34:0x0059, B:43:0x0067, B:52:0x0071, B:120:0x007a), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x022e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x022f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01e9 A[Catch: Exception -> 0x00ab, TryCatch #2 {Exception -> 0x00ab, blocks: (B:18:0x021e, B:25:0x01e5, B:27:0x01e9, B:31:0x0230, B:36:0x0165, B:38:0x0169, B:45:0x0125, B:47:0x0129, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:60:0x00f3, B:65:0x0102, B:68:0x010c, B:70:0x0112, B:77:0x0146, B:79:0x014c, B:81:0x0152, B:85:0x0180, B:87:0x0184, B:89:0x018a, B:91:0x0193, B:92:0x01a3, B:94:0x01a7, B:95:0x01b7, B:97:0x01bb, B:98:0x01c0, B:104:0x0205, B:106:0x0209, B:110:0x023a, B:112:0x0240, B:114:0x0244, B:115:0x024b, B:116:0x00fa, B:118:0x00fd, B:123:0x009b, B:125:0x00a1, B:127:0x00af, B:129:0x00bb, B:132:0x00c0, B:134:0x00d2), top: B:122:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0169 A[Catch: Exception -> 0x00ab, TryCatch #2 {Exception -> 0x00ab, blocks: (B:18:0x021e, B:25:0x01e5, B:27:0x01e9, B:31:0x0230, B:36:0x0165, B:38:0x0169, B:45:0x0125, B:47:0x0129, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:60:0x00f3, B:65:0x0102, B:68:0x010c, B:70:0x0112, B:77:0x0146, B:79:0x014c, B:81:0x0152, B:85:0x0180, B:87:0x0184, B:89:0x018a, B:91:0x0193, B:92:0x01a3, B:94:0x01a7, B:95:0x01b7, B:97:0x01bb, B:98:0x01c0, B:104:0x0205, B:106:0x0209, B:110:0x023a, B:112:0x0240, B:114:0x0244, B:115:0x024b, B:116:0x00fa, B:118:0x00fd, B:123:0x009b, B:125:0x00a1, B:127:0x00af, B:129:0x00bb, B:132:0x00c0, B:134:0x00d2), top: B:122:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129 A[Catch: Exception -> 0x00ab, TryCatch #2 {Exception -> 0x00ab, blocks: (B:18:0x021e, B:25:0x01e5, B:27:0x01e9, B:31:0x0230, B:36:0x0165, B:38:0x0169, B:45:0x0125, B:47:0x0129, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:60:0x00f3, B:65:0x0102, B:68:0x010c, B:70:0x0112, B:77:0x0146, B:79:0x014c, B:81:0x0152, B:85:0x0180, B:87:0x0184, B:89:0x018a, B:91:0x0193, B:92:0x01a3, B:94:0x01a7, B:95:0x01b7, B:97:0x01bb, B:98:0x01c0, B:104:0x0205, B:106:0x0209, B:110:0x023a, B:112:0x0240, B:114:0x0244, B:115:0x024b, B:116:0x00fa, B:118:0x00fd, B:123:0x009b, B:125:0x00a1, B:127:0x00af, B:129:0x00bb, B:132:0x00c0, B:134:0x00d2), top: B:122:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7 A[Catch: Exception -> 0x00ab, TryCatch #2 {Exception -> 0x00ab, blocks: (B:18:0x021e, B:25:0x01e5, B:27:0x01e9, B:31:0x0230, B:36:0x0165, B:38:0x0169, B:45:0x0125, B:47:0x0129, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:60:0x00f3, B:65:0x0102, B:68:0x010c, B:70:0x0112, B:77:0x0146, B:79:0x014c, B:81:0x0152, B:85:0x0180, B:87:0x0184, B:89:0x018a, B:91:0x0193, B:92:0x01a3, B:94:0x01a7, B:95:0x01b7, B:97:0x01bb, B:98:0x01c0, B:104:0x0205, B:106:0x0209, B:110:0x023a, B:112:0x0240, B:114:0x0244, B:115:0x024b, B:116:0x00fa, B:118:0x00fd, B:123:0x009b, B:125:0x00a1, B:127:0x00af, B:129:0x00bb, B:132:0x00c0, B:134:0x00d2), top: B:122:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0102 A[Catch: Exception -> 0x00ab, TryCatch #2 {Exception -> 0x00ab, blocks: (B:18:0x021e, B:25:0x01e5, B:27:0x01e9, B:31:0x0230, B:36:0x0165, B:38:0x0169, B:45:0x0125, B:47:0x0129, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:60:0x00f3, B:65:0x0102, B:68:0x010c, B:70:0x0112, B:77:0x0146, B:79:0x014c, B:81:0x0152, B:85:0x0180, B:87:0x0184, B:89:0x018a, B:91:0x0193, B:92:0x01a3, B:94:0x01a7, B:95:0x01b7, B:97:0x01bb, B:98:0x01c0, B:104:0x0205, B:106:0x0209, B:110:0x023a, B:112:0x0240, B:114:0x0244, B:115:0x024b, B:116:0x00fa, B:118:0x00fd, B:123:0x009b, B:125:0x00a1, B:127:0x00af, B:129:0x00bb, B:132:0x00c0, B:134:0x00d2), top: B:122:0x009b }] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4, types: [eؘُٛ, eؔۙؕ] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eؘُٛ, eؔۙؕ] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object license(defpackage.C5577e r14, defpackage.InterfaceC5083e r15) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8221e.license(eؘُٛ, eًؗۖ):java.lang.Object");
    }

    public void metrica(long j) {
        C6594e c6594e = (C6594e) this.purchase;
        C13614e appmetrica = AbstractC7291e.appmetrica(c6594e);
        if (appmetrica != null) {
            long j2 = appmetrica.ad;
            if (j2 == j) {
                j2 = 0;
            }
            List list = appmetrica.vip;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C18479e) obj).ad != j) {
                    arrayList.add(obj);
                }
            }
            AbstractC7291e.startapp(c6594e, new C13614e(j2, arrayList));
        }
        if (j == ((C18479e) this.billing).ad) {
            C18479e.Companion.getClass();
            this.billing = C18479e.advert;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mopub(defpackage.AbstractC10731e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C1986e
            if (r0 == 0) goto L13
            r0 = r5
            eؓٞۘ r0 = (defpackage.C1986e) r0
            int r1 = r0.f5197e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5197e = r1
            goto L18
        L13:
            eؓٞۘ r0 = new eؓٞۘ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f5195e
            int r1 = r0.f5197e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eٍٖ٘ r0 = r0.f5196e
            defpackage.AbstractC2003e.purchase(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.AbstractC2003e.purchase(r5)
            java.lang.Object r5 = r4.license
            eٍٖ٘ r5 = (defpackage.C17651e) r5
            r0.f5196e = r5
            r0.f5197e = r2
            java.lang.Object r0 = r5.appmetrica(r0)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r0 != r1) goto L43
            return r1
        L43:
            r0 = r5
        L44:
            r5 = 0
            java.lang.Object r1 = r4.billing     // Catch: java.lang.Throwable -> L4d
            eۤۤ r1 = (defpackage.C18479e) r1     // Catch: java.lang.Throwable -> L4d
            r0.billing(r5)
            return r1
        L4d:
            r1 = move-exception
            r0.billing(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8221e.mopub(eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        if (r7 == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object purchase(defpackage.AbstractC10731e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C6848e
            if (r0 == 0) goto L13
            r0 = r7
            eٍؚؑ r0 = (defpackage.C6848e) r0
            int r1 = r0.f14099e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14099e = r1
            goto L18
        L13:
            eٍؚؑ r0 = new eٍؚؑ
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f14098e
            int r1 = r0.f14099e
            r2 = 0
            r3 = 2
            r4 = 1
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L37
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2b
            defpackage.AbstractC2003e.purchase(r7)
            return r7
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            defpackage.AbstractC2003e.purchase(r7)
            goto L4a
        L37:
            defpackage.AbstractC2003e.purchase(r7)
            r0.f14099e = r4
            eؑ۟ۦ r7 = new eؑ۟ۦ
            r1 = 10
            r7.<init>(r6, r2, r1)
            java.lang.Object r7 = r6.yandex(r7, r0)
            if (r7 != r5) goto L4a
            goto L62
        L4a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L55
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L55:
            r0.f14099e = r3
            eۖۗ r7 = new eۖۗ
            r7.<init>(r4, r6, r2)
            java.lang.Object r7 = r6.yandex(r7, r0)
            if (r7 != r5) goto L63
        L62:
            return r5
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8221e.purchase(eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object smaato(defpackage.AbstractC10731e r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.C5210e
            if (r2 == 0) goto L17
            r2 = r1
            eؗۡٛ r2 = (defpackage.C5210e) r2
            int r3 = r2.f11113e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f11113e = r3
            goto L1c
        L17:
            eؗۡٛ r2 = new eؗۡٛ
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f11112e
            int r3 = r2.f11113e
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            defpackage.AbstractC2003e.purchase(r1)
            goto L5e
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L31:
            defpackage.AbstractC2003e.purchase(r1)
            java.lang.Object r1 = r0.billing
            eۤۤ r1 = (defpackage.C18479e) r1
            long r5 = r1.ad
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto La7
            eؚْۤ r1 = defpackage.AbstractC15962e.ad
            eؘؘۢ r1 = r1.purchase()
            java.lang.Object r3 = r0.billing
            eۤۤ r3 = (defpackage.C18479e) r3
            eؘؘۢ r3 = r3.purchase
            int r1 = r1.compareTo(r3)
            if (r1 < 0) goto La4
            r2.f11113e = r4
            r1 = 0
            java.lang.Object r1 = defpackage.AbstractC15297e.vip(r0, r1, r2)
            eٟؔۙ r2 = defpackage.EnumC2821e.f6782e
            if (r1 != r2) goto L5e
            return r2
        L5e:
            eٍؒۢ r1 = (defpackage.AbstractC9200e) r1
            java.lang.Object r1 = defpackage.AbstractC3425e.adcel(r1)
            e٘ؖۘ r1 = (defpackage.C17561e) r1
            if (r1 != 0) goto L6b
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L6b:
            java.lang.Object r2 = r0.billing
            r3 = r2
            eۤۤ r3 = (defpackage.C18479e) r3
            java.lang.String r11 = r1.ad()
            java.lang.String r14 = r1.license
            eؚْۤ r2 = defpackage.AbstractC15962e.ad
            eؘؘۢ r2 = r2.purchase()
            eٍ٘ؖ r4 = defpackage.C14157e.f27993e
            r4 = 30
            eٖؒٗ r5 = defpackage.EnumC15934e.MINUTES
            long r4 = defpackage.AbstractC0326e.Signature(r4, r5)
            eؘؘۢ r10 = r2.vip(r4)
            java.lang.String r12 = r1.vip
            java.lang.String r13 = r1.metrica
            r15 = 0
            r16 = 1055(0x41f, float:1.478E-42)
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            eۤۤ r1 = defpackage.C18479e.ad(r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r2 = r0.purchase
            eؙۗۗ r2 = (defpackage.C6594e) r2
            defpackage.AbstractC11906e.mopub(r2, r1)
            r0.billing = r1
        La4:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        La7:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8221e.smaato(eُؑ۠):java.lang.Object");
    }

    public void startapp(InterfaceC6937e interfaceC6937e, InterfaceC6937e interfaceC6937e2) {
        this.yandex = (Function0) ((Function1) this.purchase).invoke(interfaceC6937e);
        ((C5609e) this.billing).subscription(((Function2) this.vip).invoke(interfaceC6937e, ((C0909e) this.ad).m419class()));
        ((C6599e) this.license).invoke(interfaceC6937e, interfaceC6937e2, Boolean.valueOf(((Function0) this.yandex) != null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01e5, code lost:
    
        if (r1 == r14) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0160, code lost:
    
        if (r1 != r14) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object vip(int r20, java.lang.String r21, java.lang.String r22, defpackage.AbstractC10731e r23) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8221e.vip(int, java.lang.String, java.lang.String, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r9 != r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r0.appmetrica(r1) == r6) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object yandex(kotlin.jvm.functions.Function1 r8, defpackage.AbstractC10731e r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.appmetrica
            eٍٖ٘ r0 = (defpackage.C17651e) r0
            boolean r1 = r9 instanceof defpackage.C16266e
            if (r1 == 0) goto L17
            r1 = r9
            eِٖٗ r1 = (defpackage.C16266e) r1
            int r2 = r1.f31948e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f31948e = r2
            goto L1c
        L17:
            eِٖٗ r1 = new eِٖٗ
            r1.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r1.f31946e
            int r2 = r1.f31948e
            r3 = 2
            r4 = 1
            r5 = 0
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            defpackage.AbstractC2003e.purchase(r9)     // Catch: java.lang.Throwable -> L2f
            goto L5d
        L2f:
            r8 = move-exception
            goto L61
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            eؚٖؓ r8 = r1.f31947e
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            defpackage.AbstractC2003e.purchase(r9)
            goto L52
        L41:
            defpackage.AbstractC2003e.purchase(r9)
            r9 = r8
            eؚٖؓ r9 = (defpackage.AbstractC7185e) r9
            r1.f31947e = r9
            r1.f31948e = r4
            java.lang.Object r9 = r0.appmetrica(r1)
            if (r9 != r6) goto L52
            goto L5c
        L52:
            r1.f31947e = r5     // Catch: java.lang.Throwable -> L2f
            r1.f31948e = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r9 = r8.invoke(r1)     // Catch: java.lang.Throwable -> L2f
            if (r9 != r6) goto L5d
        L5c:
            return r6
        L5d:
            r0.billing(r5)
            return r9
        L61:
            r0.billing(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8221e.yandex(kotlin.jvm.functions.Function1, eُؑ۠):java.lang.Object");
    }
}
