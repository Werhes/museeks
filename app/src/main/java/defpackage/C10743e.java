package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؒ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10743e {
    public final C5389e ad;
    public final C3922e appmetrica;
    public final EnumC7792e billing;
    public final float license;
    public final InterfaceC3314e metrica;
    public final C5659e purchase;
    public final InterfaceC18435e vip;
    public final AbstractC16858e yandex;
    public final C17651e startapp = AbstractC12751e.ad();
    public final C0576e adcel = AbstractC14533e.startapp(null);
    public final C6656e mopub = AbstractC14533e.purchase(new C7962e(this, 0));
    public final C0576e advert = AbstractC14533e.startapp(new C2152e(0));
    public final C0576e smaato = AbstractC14533e.startapp(new C11490e(0));
    public final C0576e amazon = AbstractC14533e.startapp(null);
    public final C0576e loadAd = AbstractC14533e.startapp(null);
    public long Signature = 0;
    public final HashSet admob = new HashSet();
    public final C0576e subscription = AbstractC14533e.startapp(null);
    public final C7558e remoteconfig = new C7558e(new C2152e(0), AbstractC9546e.purchase, null, 12);
    public final C10250e pro = AbstractC14533e.smaato(new C7962e(this, 1));

    /* JADX WARN: Multi-variable type inference failed */
    public C10743e(C5389e c5389e, InterfaceC18435e interfaceC18435e, InterfaceC3314e interfaceC3314e, float f, C3922e c3922e, C5659e c5659e, EnumC7792e enumC7792e, Function2 function2) {
        this.ad = c5389e;
        this.vip = interfaceC18435e;
        this.metrica = interfaceC3314e;
        this.license = f;
        this.appmetrica = c3922e;
        this.purchase = c5659e;
        this.billing = enumC7792e;
        this.yandex = (AbstractC16858e) function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x02d7, code lost:
    
        if (r10.ad() > r1.ad()) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0310, code lost:
    
        r13.billing(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0315, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02ec, code lost:
    
        r0 = defpackage.AbstractC5336e.purchase(r22.vip, null, 0, new defpackage.C12565e(r22, r1, r10, r11, 0), 3);
        r13.billing(null);
        r2.f8372e = null;
        r2.f8370e = null;
        r2.f8371e = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x030a, code lost:
    
        if (r0.mo696protected(r2) != r6) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02ea, code lost:
    
        if (r10.ad() < r1.ad()) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x00a6, code lost:
    
        if (r1.ad() == ((defpackage.C4993e) r3.f11540e).appmetrica.vip.purchase()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r1.ad() == r8.ad()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        r13.billing(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.C10743e r21, defpackage.EnumC10320e r22, defpackage.AbstractC10731e r23) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10743e.ad(eُؒ٘, eَٗۧ, eُؑ۠):java.lang.Object");
    }

    public static C2164e metrica(C10743e c10743e, C0763e c0763e, ArrayList arrayList, EnumC10320e enumC10320e, C17097e c17097e, int i) {
        if ((i & 4) != 0) {
            enumC10320e = EnumC10320e.f20365e;
        }
        InterfaceC17282e interfaceC17282e = c17097e;
        if ((i & 8) != 0) {
            interfaceC17282e = C8082e.f16416e;
        }
        c10743e.getClass();
        C7314e c7314e = new C7314e(9, c10743e, c0763e, interfaceC17282e);
        int ordinal = enumC10320e.ordinal();
        Object obj = null;
        if (ordinal == 0) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                Object previous = listIterator.previous();
                if (((Boolean) c7314e.invoke(previous)).booleanValue()) {
                    obj = previous;
                    break;
                }
            }
            return (C2164e) obj;
        }
        if (ordinal != 1) {
            throw new C14803e(10);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Boolean) c7314e.invoke(next)).booleanValue()) {
                obj = next;
                break;
            }
        }
        return (C2164e) obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(1:(1:(1:(6:13|14|15|16|17|18)(2:21|22))(6:23|24|25|26|(1:28)(1:32)|29))(5:33|34|35|36|(2:38|31)(4:39|26|(0)(0)|29)))(3:40|41|42))(2:66|(2:68|69)(3:70|(1:72)|31))|43|44|45|(3:47|48|49)(7:50|(3:55|36|(0)(0))|56|(1:58)|59|(4:61|35|36|(0)(0))|31)))|7|(0)(0)|43|44|45|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01c0, code lost:
    
        if (defpackage.AbstractC8306e.startapp(1000, r1, r2) != r9) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0160 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:14:0x0039, B:15:0x01c3, B:24:0x0053, B:26:0x0156, B:28:0x0160, B:29:0x01a4, B:32:0x019b, B:34:0x0064, B:36:0x0128), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019b A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:14:0x0039, B:15:0x01c3, B:24:0x0053, B:26:0x0156, B:28:0x0160, B:29:0x01a4, B:32:0x019b, B:34:0x0064, B:36:0x0128), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8 A[Catch: all -> 0x00c0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:44:0x00a4, B:47:0x00b8, B:50:0x00c4, B:52:0x00d2, B:56:0x00e4, B:58:0x0107, B:59:0x0119), top: B:43:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4 A[Catch: all -> 0x00c0, TRY_ENTER, TryCatch #0 {all -> 0x00c0, blocks: (B:44:0x00a4, B:47:0x00b8, B:50:0x00c4, B:52:0x00d2, B:56:0x00e4, B:58:0x0107, B:59:0x0119), top: B:43:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r0v16, types: [eؚؗؔ] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v17, types: [eؚؗؔ] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object vip(defpackage.C10743e r15, defpackage.C2164e r16, defpackage.C2164e r17, defpackage.AbstractC10731e r18) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10743e.vip(eُؒ٘, eؓۢؔ, eؓۢؔ, eُؑ۠):java.lang.Object");
    }

    public final long appmetrica() {
        long vip;
        C2164e license = license();
        if (license == null) {
            return 0L;
        }
        int ad = license.ad();
        C0576e c0576e = this.amazon;
        Integer num = (Integer) c0576e.getValue();
        C0576e c0576e2 = this.loadAd;
        if (num == null || ad != num.intValue() || ((Integer) c0576e.getValue()) == null) {
            c0576e.setValue(null);
            c0576e2.setValue(null);
            vip = license.vip();
        } else {
            C11490e c11490e = (C11490e) c0576e2.getValue();
            vip = c11490e != null ? c11490e.ad : license.vip();
        }
        long j = ((C2152e) this.advert.getValue()).ad;
        long j2 = ((C11490e) this.smaato.getValue()).ad;
        long yandex = yandex(C2152e.yandex(AbstractC12246e.ad((int) (j2 >> 32), (int) (j2 & 4294967295L)), AbstractC12246e.ad((int) (vip >> 32), (int) (vip & 4294967295L))));
        startapp(yandex);
        return C2152e.startapp(j, yandex);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object billing(java.lang.Object r11, long r12, defpackage.AbstractC10731e r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.C2369e
            if (r0 == 0) goto L13
            r0 = r14
            eؔؕۙ r0 = (defpackage.C2369e) r0
            int r1 = r0.f5928e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5928e = r1
            goto L18
        L13:
            eؔؕۙ r0 = new eؔؕۙ
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f5929e
            int r1 = r0.f5928e
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            long r12 = r0.f5932e
            eؓۢؔ r11 = r0.f5933e
            java.lang.Object r1 = r0.f5927e
            eُؒ٘ r0 = r0.f5930e
            defpackage.AbstractC2003e.purchase(r14)
            r9 = r1
            r1 = r11
            r11 = r9
            goto Lae
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            defpackage.AbstractC2003e.purchase(r14)
            eؘؓٞ r14 = r10.ad
            eٕۣۣ r1 = r14.tapsense()
            java.util.ArrayList r1 = r1.m4023throw()
            java.util.Iterator r1 = r1.iterator()
        L4a:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L63
            java.lang.Object r3 = r1.next()
            r5 = r3
            eؓۢؔ r5 = (defpackage.C2164e) r5
            eًؕۜ r5 = r5.ad
            java.lang.Object r5 = r5.mopub
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L4a
            goto L64
        L63:
            r3 = r4
        L64:
            r1 = r3
            eؓۢؔ r1 = (defpackage.C2164e) r1
            if (r1 == 0) goto Lc3
            long r5 = r1.vip()
            eَٗۧ r3 = r10.purchase()
            int r3 = r3.ordinal()
            if (r3 == 0) goto L86
            if (r3 != r2) goto L7e
            r3 = 32
            long r5 = r5 >> r3
        L7c:
            int r3 = (int) r5
            goto L8d
        L7e:
            eٔٚؖ r11 = new eٔٚؖ
            r12 = 10
            r11.<init>(r12)
            throw r11
        L86:
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            goto L7c
        L8d:
            if (r3 >= 0) goto Lad
            float r3 = (float) r3
            r5 = 7
            r6 = 0
            eْٟ۟ r4 = defpackage.AbstractC12696e.purchase(r6, r6, r4, r5)
            r0.f5930e = r10
            r0.f5927e = r11
            r0.f5933e = r1
            r0.f5932e = r12
            r0.f5928e = r2
            java.lang.Object r14 = r14.f11540e
            eؗٚٝ r14 = (defpackage.C4993e) r14
            java.lang.Object r14 = defpackage.AbstractC16653e.ad(r14, r3, r4, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r14 != r0) goto Lad
            return r0
        Lad:
            r0 = r10
        Lae:
            eؑۜٝ r14 = r0.adcel
            r14.setValue(r11)
            long r1 = r1.vip()
            eؑۜٝ r11 = r0.smaato
            eٌِؔ r14 = new eٌِؔ
            r14.<init>(r1)
            r11.setValue(r14)
            r0.Signature = r12
        Lc3:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10743e.billing(java.lang.Object, long, eُؑ۠):java.lang.Object");
    }

    public final C2164e license() {
        Object value = this.adcel.getValue();
        Object obj = null;
        if (value == null) {
            return null;
        }
        Iterator it = this.ad.tapsense().m4023throw().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C2164e) next).ad.mopub.equals(value)) {
                obj = next;
                break;
            }
        }
        return (C2164e) obj;
    }

    public final EnumC17426e purchase() {
        return this.ad.tapsense().m4021native();
    }

    public final long startapp(long j) {
        int ordinal = this.billing.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return j;
        }
        throw new C14803e(10);
    }

    public final long yandex(long j) {
        ((C13648e) this.ad.tapsense().f31190e).getClass();
        int ordinal = purchase().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new C14803e(10);
            }
            int ordinal2 = this.billing.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    throw new C14803e(10);
                }
                int ordinal3 = EnumC17426e.f34145e.ordinal();
                if (ordinal3 == 0) {
                    return AbstractC12246e.ad(C2152e.appmetrica(j), -C2152e.purchase(j));
                }
                if (ordinal3 == 1) {
                    return AbstractC12246e.ad(-C2152e.appmetrica(j), C2152e.purchase(j));
                }
                throw new C14803e(10);
            }
        }
        return j;
    }
}
