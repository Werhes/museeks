package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4624e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC4619e f9954e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C13189e f9955e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7185e f9956e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f9957e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C13189e f9958e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4624e(C13189e c13189e, Function2 function2, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f9955e = c13189e;
        this.f9956e = (AbstractC7185e) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C4624e(this.f9955e, this.f9956e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4624e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x003f, code lost:
    
        if (r10.appmetrica(r9) == r5) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v10, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14, types: [eؚؗؔ] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v6, types: [eؚؗؔ] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f9957e
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r0 == 0) goto L2e
            if (r0 == r3) goto L25
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L14
            defpackage.AbstractC2003e.purchase(r10)
            return r10
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            eؚؗؔ r0 = r9.f9954e
            defpackage.AbstractC2003e.purchase(r10)     // Catch: java.lang.Throwable -> L22
            goto L6a
        L22:
            r10 = move-exception
            goto L8b
        L25:
            eُْؒ r0 = r9.f9958e
            eؚؗؔ r3 = r9.f9954e
            defpackage.AbstractC2003e.purchase(r10)
            r10 = r3
            goto L42
        L2e:
            defpackage.AbstractC2003e.purchase(r10)
            eُْؒ r0 = r9.f9955e
            eٍٖ٘ r10 = r0.appmetrica
            r9.f9954e = r10
            r9.f9958e = r0
            r9.f9957e = r3
            java.lang.Object r3 = r10.appmetrica(r9)
            if (r3 != r5) goto L42
            goto L89
        L42:
            android.view.textclassifier.TextClassifier r3 = r0.purchase     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L52
            boolean r6 = r3.isDestroyed()     // Catch: java.lang.Throwable -> L4d
            if (r6 == 0) goto L6f
            goto L52
        L4d:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
            goto L8b
        L52:
            eّۤ r3 = new eّۤ     // Catch: java.lang.Throwable -> L4d
            r6 = 3
            r3.<init>(r0, r4, r6)     // Catch: java.lang.Throwable -> L4d
            r9.f9954e = r10     // Catch: java.lang.Throwable -> L4d
            r9.f9958e = r4     // Catch: java.lang.Throwable -> L4d
            r9.f9957e = r2     // Catch: java.lang.Throwable -> L4d
            r6 = 300(0x12c, double:1.48E-321)
            java.lang.Object r0 = defpackage.AbstractC8306e.mopub(r6, r3, r9)     // Catch: java.lang.Throwable -> L4d
            if (r0 != r5) goto L67
            goto L89
        L67:
            r8 = r0
            r0 = r10
            r10 = r8
        L6a:
            android.view.textclassifier.TextClassifier r3 = defpackage.C15945e.license(r10)     // Catch: java.lang.Throwable -> L22
            r10 = r0
        L6f:
            eٍٖ٘ r10 = (defpackage.C17651e) r10
            r10.billing(r4)
            eًٝۢ r10 = new eًٝۢ
            eؚٖؓ r0 = r9.f9956e
            r10.<init>(r3, r0, r4)
            r9.f9954e = r4
            r9.f9958e = r4
            r9.f9957e = r1
            r0 = 200(0xc8, double:9.9E-322)
            java.lang.Object r10 = defpackage.AbstractC8306e.mopub(r0, r10, r9)
            if (r10 != r5) goto L8a
        L89:
            return r5
        L8a:
            return r10
        L8b:
            eٍٖ٘ r0 = (defpackage.C17651e) r0
            r0.billing(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4624e.loadAd(java.lang.Object):java.lang.Object");
    }
}
