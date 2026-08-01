package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۢؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9056e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f18122e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ boolean f18123e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4911e f18124e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ AbstractC11424e f18125e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9056e(InterfaceC4911e interfaceC4911e, boolean z, InterfaceC5083e interfaceC5083e) {
        super(3, interfaceC5083e);
        this.f18124e = interfaceC4911e;
        this.f18123e = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C9056e c9056e = new C9056e(this.f18124e, this.f18123e, (InterfaceC5083e) obj3);
        c9056e.f18125e = (AbstractC11424e) obj;
        return c9056e.loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r0.appmetrica(r7) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        if (r1.adcel(r3, r7) == r4) goto L35;
     */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r8) {
        /*
            r7 = this;
            eُۨۨ r0 = r7.f18125e
            int r1 = r7.f18122e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            defpackage.AbstractC2003e.purchase(r8)
            goto La6
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            defpackage.AbstractC2003e.purchase(r8)     // Catch: java.lang.Throwable -> L20
            goto La6
        L20:
            r8 = move-exception
            goto L31
        L22:
            defpackage.AbstractC2003e.purchase(r8)
            r7.f18125e = r0     // Catch: java.lang.Throwable -> L20
            r7.f18122e = r3     // Catch: java.lang.Throwable -> L20
            java.lang.Object r8 = r0.appmetrica(r7)     // Catch: java.lang.Throwable -> L20
            if (r8 != r4) goto La6
            goto La5
        L31:
            java.lang.Object r0 = r0.f22964e
            r1 = r0
            eًَۨ r1 = (defpackage.InterfaceC8376e) r1
            eًۛؗ r3 = defpackage.AbstractC17667e.ad
            eًٌٍ r1 = r1.loadAd()
            boolean r1 = r1.admob()
            if (r1 == 0) goto L45
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L45:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unhandled server error: \""
            r1.<init>(r3)
            java.lang.String r3 = r8.getMessage()
            r1.append(r3)
            r3 = 34
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            eٕؗٞ r3 = r7.f18124e
            r3.license(r1, r8)
            eًَۨ r0 = (defpackage.InterfaceC8376e) r0
            eٍؚۦ r1 = r0.loadAd()
            boolean r3 = r1 instanceof defpackage.C6582e
            r5 = 0
            if (r3 == 0) goto L6f
            eؙۣۖ r1 = (defpackage.C6582e) r1
            goto L70
        L6f:
            r1 = r5
        L70:
            if (r1 != 0) goto L7e
            eؘۙٗ r1 = r0.getAttributes()
            eًۛؗ r3 = defpackage.C6582e.f13569e
            java.lang.Object r1 = r1.metrica(r3)
            eؙۣۖ r1 = (defpackage.C6582e) r1
        L7e:
            java.lang.String r3 = r8.getMessage()
            boolean r6 = r7.f18123e
            if (r6 == 0) goto L8c
            eٖۚٙ r3 = new eٖۚٙ
            r3.<init>(r0, r8)
            goto L9b
        L8c:
            if (r3 == 0) goto L99
            eّؑؖ r8 = new eّؑؖ
            eٜؓؗ r0 = defpackage.AbstractC17135e.vip
            eۣؔؗ r6 = defpackage.C2394e.f6114e
            r8.<init>(r3, r0, r6)
            r3 = r8
            goto L9b
        L99:
            eْؐؕ r3 = defpackage.AbstractC12897e.ad
        L9b:
            r7.f18125e = r5
            r7.f18122e = r2
            java.lang.Object r8 = r1.adcel(r3, r7)
            if (r8 != r4) goto La6
        La5:
            return r4
        La6:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9056e.loadAd(java.lang.Object):java.lang.Object");
    }
}
