package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٓٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13850e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Throwable f27430e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C17637e f27431e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ boolean f27432e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C7576e f27433e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f27434e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13850e(C7576e c7576e, C17637e c17637e, boolean z, InterfaceC5083e interfaceC5083e) {
        super(1, interfaceC5083e);
        this.f27433e = c7576e;
        this.f27431e = c17637e;
        this.f27432e = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C13850e) mopub((InterfaceC5083e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r6 != r4) goto L22;
     */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f27434e
            eٌَ٘ r1 = r5.f27431e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r0 == 0) goto L23
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L14
            java.lang.Throwable r0 = r5.f27430e
            defpackage.AbstractC2003e.purchase(r6)
            goto L45
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            defpackage.AbstractC2003e.purchase(r6)     // Catch: java.lang.Throwable -> L20
            goto L31
        L20:
            r6 = move-exception
            r0 = r6
            goto L34
        L23:
            defpackage.AbstractC2003e.purchase(r6)
            eؚٖۤ r6 = r5.f27433e     // Catch: java.lang.Throwable -> L20
            r5.f27434e = r3     // Catch: java.lang.Throwable -> L20
            java.lang.Object r6 = defpackage.C7576e.appmetrica(r6, r3, r1, r5)     // Catch: java.lang.Throwable -> L20
            if (r6 != r4) goto L31
            goto L44
        L31:
            eَۡۚ r6 = (defpackage.AbstractC10595e) r6     // Catch: java.lang.Throwable -> L20
            goto L51
        L34:
            boolean r6 = r5.f27432e
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5.f27430e = r0
            r5.f27434e = r2
            java.lang.Object r6 = r1.invoke(r6, r5)
            if (r6 != r4) goto L45
        L44:
            return r4
        L45:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            eؑۦِ r1 = new eؑۦِ
            r1.<init>(r0, r6)
            r6 = r1
        L51:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            eؙۖؕ r1 = new eؙۖؕ
            r1.<init>(r6, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13850e.loadAd(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        return new C13850e(this.f27433e, this.f27431e, this.f27432e, interfaceC5083e);
    }
}
