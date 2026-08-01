package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6267e extends AbstractC10347e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C0576e f13081e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final boolean f13082e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C15867e f13083e;

    public C6267e(boolean z) {
        super(0);
        this.f13082e = z;
        this.f13081e = AbstractC14533e.startapp(C10327e.f20377e);
        this.f13083e = new C15867e(0L);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(2:18|19))(1:22))(3:28|29|(2:31|21))|23|(3:25|(2:27|21)|19)|13|14))|34|6|7|(0)(0)|23|(0)|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c2, code lost:
    
        if (r10.appmetrica(r0) != r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
    
        r10.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[Catch: Exception -> 0x00c5, TryCatch #0 {Exception -> 0x00c5, blocks: (B:12:0x0029, B:18:0x0036, B:19:0x00b8, B:22:0x003b, B:23:0x006f, B:25:0x0087, B:29:0x0042), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: strictfp, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2060strictfp(defpackage.C6267e r10, defpackage.AbstractC10731e r11) {
        /*
            boolean r0 = r11 instanceof defpackage.C0744e
            if (r0 == 0) goto L13
            r0 = r11
            eؑۨۛ r0 = (defpackage.C0744e) r0
            int r1 = r0.f3045e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3045e = r1
            goto L18
        L13:
            eؑۨۛ r0 = new eؑۨۛ
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f3044e
            int r1 = r0.f3045e
            r2 = 3
            r3 = 2
            r4 = 1
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L3b
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            defpackage.AbstractC2003e.purchase(r11)     // Catch: java.lang.Exception -> Lc5
            goto Lc9
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            defpackage.AbstractC2003e.purchase(r11)     // Catch: java.lang.Exception -> Lc5
            goto Lb8
        L3b:
            defpackage.AbstractC2003e.purchase(r11)     // Catch: java.lang.Exception -> Lc5
            goto L6f
        L3f:
            defpackage.AbstractC2003e.purchase(r11)
            e٘۠ؒ r11 = defpackage.AbstractC1831e.ad()     // Catch: java.lang.Exception -> Lc5
            eۣۡ r11 = r11.adcel     // Catch: java.lang.Exception -> Lc5
            java.lang.Object r11 = r11.f36192e     // Catch: java.lang.Exception -> Lc5
            eٕۣۣ r11 = (defpackage.C15816e) r11     // Catch: java.lang.Exception -> Lc5
            java.lang.Object r11 = r11.f31190e     // Catch: java.lang.Exception -> Lc5
            eّْ۟ r11 = (defpackage.C12454e) r11     // Catch: java.lang.Exception -> Lc5
            eّۦٜ r1 = new eّۦٜ     // Catch: java.lang.Exception -> Lc5
            java.lang.String r6 = "/InboxService/GetMessages"
            eَؑؑ r7 = defpackage.C15625e.f30813e     // Catch: java.lang.Exception -> Lc5
            eٜؕؒ r8 = defpackage.C8334e.f17060e     // Catch: java.lang.Exception -> Lc5
            r9 = 18
            r1.<init>(r9, r6, r7, r8)     // Catch: java.lang.Exception -> Lc5
            eؘٟۚ r11 = r11.metrica(r1)     // Catch: java.lang.Exception -> Lc5
            eٍٕٞ r1 = new eٍٕٞ     // Catch: java.lang.Exception -> Lc5
            r1.<init>()     // Catch: java.lang.Exception -> Lc5
            r0.f3045e = r4     // Catch: java.lang.Exception -> Lc5
            java.lang.Object r11 = r11.firebase(r1, r0)     // Catch: java.lang.Exception -> Lc5
            if (r11 != r5) goto L6f
            goto Lc4
        L6f:
            eًۥؚ r11 = (defpackage.C8334e) r11     // Catch: java.lang.Exception -> Lc5
            long r6 = r11.f17062e     // Catch: java.lang.Exception -> Lc5
            eٕۧۖ r1 = r10.f13083e     // Catch: java.lang.Exception -> Lc5
            r1.startapp(r6)     // Catch: java.lang.Exception -> Lc5
            java.util.List r11 = r11.f17061e     // Catch: java.lang.Exception -> Lc5
            eًۥۢ r11 = defpackage.AbstractC8228e.metrica(r11)     // Catch: java.lang.Exception -> Lc5
            eؑۜٝ r1 = r10.f13081e     // Catch: java.lang.Exception -> Lc5
            r1.setValue(r11)     // Catch: java.lang.Exception -> Lc5
            boolean r10 = r10.f13082e     // Catch: java.lang.Exception -> Lc5
            if (r10 == 0) goto Lc9
            e٘۠ؒ r10 = defpackage.AbstractC1831e.ad()     // Catch: java.lang.Exception -> Lc5
            eۣۡ r10 = r10.adcel     // Catch: java.lang.Exception -> Lc5
            java.lang.Object r10 = r10.f36192e     // Catch: java.lang.Exception -> Lc5
            eٕۣۣ r10 = (defpackage.C15816e) r10     // Catch: java.lang.Exception -> Lc5
            java.lang.Object r10 = r10.f31190e     // Catch: java.lang.Exception -> Lc5
            eّْ۟ r10 = (defpackage.C12454e) r10     // Catch: java.lang.Exception -> Lc5
            eّۦٜ r11 = new eّۦٜ     // Catch: java.lang.Exception -> Lc5
            java.lang.String r1 = "/InboxService/SetReadDate"
            eٌ٘ٚ r4 = defpackage.C3315e.f7483e     // Catch: java.lang.Exception -> Lc5
            eٓۢؒ r6 = defpackage.C12212e.f24523e     // Catch: java.lang.Exception -> Lc5
            r7 = 18
            r11.<init>(r7, r1, r4, r6)     // Catch: java.lang.Exception -> Lc5
            eؘٟۚ r10 = r10.metrica(r11)     // Catch: java.lang.Exception -> Lc5
            eّؕؒ r11 = new eّؕؒ     // Catch: java.lang.Exception -> Lc5
            eًؑۤ r1 = defpackage.C0193e.f1409e     // Catch: java.lang.Exception -> Lc5
            r6 = 0
            r11.<init>(r6, r1)     // Catch: java.lang.Exception -> Lc5
            r0.f3045e = r3     // Catch: java.lang.Exception -> Lc5
            java.lang.Object r10 = r10.firebase(r11, r0)     // Catch: java.lang.Exception -> Lc5
            if (r10 != r5) goto Lb8
            goto Lc4
        Lb8:
            e٘۠ؒ r10 = defpackage.AbstractC1831e.ad()     // Catch: java.lang.Exception -> Lc5
            r0.f3045e = r2     // Catch: java.lang.Exception -> Lc5
            java.lang.Object r10 = r10.appmetrica(r0)     // Catch: java.lang.Exception -> Lc5
            if (r10 != r5) goto Lc9
        Lc4:
            return r5
        Lc5:
            r10 = move-exception
            r10.printStackTrace()
        Lc9:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6267e.m2060strictfp(eًؙٓ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        c13770e.m3671package(-908054806);
        int i2 = i | (c13770e.purchase(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            boolean z = (i2 & 14) == 4;
            Object m3681throw = c13770e.m3681throw();
            if (z || m3681throw == C2987e.ad) {
                m3681throw = new C7236e(this, (InterfaceC5083e) null, 20);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC17680e.license(c13770e, unit, (Function2) m3681throw);
            AbstractC13348e.ad(null, AbstractC16653e.license(708275110, new C1525e(this, 0, (byte) 0), c13770e), null, null, null, 0, 0L, 0L, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).license(c13770e), AbstractC16653e.license(-694984965, new C17871e(19, this), c13770e), c13770e, 805306416, 253);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1525e(this, i);
        }
    }
}
