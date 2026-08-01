package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ۟ؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11292e extends AbstractC15049e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f22684e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f22685e = 0;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f22686e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f22687e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f22688e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11292e(long j, C7142e c7142e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f22686e = j;
        this.f22687e = c7142e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11292e(C2401e c2401e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f22687e = c2401e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f22685e) {
            case 0:
                C11292e c11292e = new C11292e(this.f22686e, (C7142e) this.f22687e, interfaceC5083e);
                c11292e.f22688e = obj;
                return c11292e;
            default:
                C11292e c11292e2 = new C11292e((C2401e) this.f22687e, interfaceC5083e);
                c11292e2.f22688e = obj;
                return c11292e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C14718e c14718e = (C14718e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f22685e) {
            case 0:
                return ((C11292e) advert(interfaceC5083e, c14718e)).loadAd(Unit.INSTANCE);
            default:
                return ((C11292e) advert(interfaceC5083e, c14718e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (r8 == r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:
    
        if (r5 >= r2) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0044 -> B:7:0x0047). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f22685e
            switch(r0) {
                case 0: goto L51;
                default: goto L5;
            }
        L5:
            int r0 = r7.f22684e
            r1 = 1
            if (r0 == 0) goto L1e
            if (r0 != r1) goto L16
            long r2 = r7.f22686e
            java.lang.Object r0 = r7.f22688e
            eِٔٔ r0 = (defpackage.C14718e) r0
            defpackage.AbstractC2003e.purchase(r8)
            goto L47
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            defpackage.AbstractC2003e.purchase(r8)
            java.lang.Object r8 = r7.f22688e
            eِٔٔ r8 = (defpackage.C14718e) r8
            java.lang.Object r0 = r7.f22687e
            eؘؔٞ r0 = (defpackage.C2401e) r0
            long r2 = r0.vip
            eُِۢ r0 = r8.appmetrica()
            r0.getClass()
            r4 = 40
            long r4 = r4 + r2
            r0 = r8
            r2 = r4
        L37:
            r7.f22688e = r0
            r7.f22686e = r2
            r7.f22684e = r1
            r8 = 3
            java.lang.Object r8 = defpackage.AbstractC9939e.vip(r0, r7, r8)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r8 != r4) goto L47
            goto L50
        L47:
            r4 = r8
            eؘؔٞ r4 = (defpackage.C2401e) r4
            long r5 = r4.vip
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 < 0) goto L37
        L50:
            return r4
        L51:
            java.lang.Object r0 = r7.f22687e
            eؚٓٞ r0 = (defpackage.C7142e) r0
            int r1 = r7.f22684e
            r2 = 1
            if (r1 == 0) goto L6c
            if (r1 != r2) goto L64
            java.lang.Object r1 = r7.f22688e
            eِٔٔ r1 = (defpackage.C14718e) r1
            defpackage.AbstractC2003e.purchase(r8)
            goto L8a
        L64:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L6c:
            defpackage.AbstractC2003e.purchase(r8)
            java.lang.Object r8 = r7.f22688e
            r1 = r8
            eِٔٔ r1 = (defpackage.C14718e) r1
            long r3 = r7.f22686e
            eُ٘ۦ r8 = new eُ٘ۦ
            r5 = 29
            r8.<init>(r5, r0)
            r7.f22688e = r1
            r7.f22684e = r2
            java.lang.Object r8 = defpackage.AbstractC11454e.license(r1, r3, r8, r7)
            eٟؔۙ r2 = defpackage.EnumC2821e.f6782e
            if (r8 != r2) goto L8a
            goto Lbc
        L8a:
            eؘؔٞ r8 = (defpackage.C2401e) r8
            if (r8 == 0) goto La2
            long r2 = r0.f14622e
            r4 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r2 = r2 & r4
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto La2
            eٖؑۧ r2 = defpackage.EnumC0721e.f3016e
            goto Lbc
        La2:
            eًؕ٘ r8 = r1.f29124e
            eؔٓؔ r8 = r8.f7673e
            java.lang.Object r8 = r8.ad
            java.lang.Object r8 = defpackage.AbstractC13480e.m3591interface(r8)
            eؘؔٞ r8 = (defpackage.C2401e) r8
            boolean r0 = defpackage.AbstractC17957e.appmetrica(r8)
            if (r0 == 0) goto Lba
            r8.ad()
            eٖؑۧ r2 = defpackage.EnumC0721e.f3018e
            goto Lbc
        Lba:
            eٖؑۧ r2 = defpackage.EnumC0721e.f3017e
        Lbc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11292e.loadAd(java.lang.Object):java.lang.Object");
    }
}
