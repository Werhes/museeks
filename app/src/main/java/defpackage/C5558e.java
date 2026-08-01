package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘَٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5558e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f11900e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ boolean f11901e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ boolean f11902e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C8823e f11903e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C12528e f11904e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5558e(InterfaceC5083e interfaceC5083e, C12528e c12528e, C8823e c8823e, boolean z, boolean z2) {
        super(2, interfaceC5083e);
        this.f11904e = c12528e;
        this.f11903e = c8823e;
        this.f11901e = z;
        this.f11902e = z2;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C5558e(interfaceC5083e, this.f11904e, this.f11903e, this.f11901e, this.f11902e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C5558e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /* JADX WARN: Type inference failed for: r8v1, types: [eؙؓٚ, eؙٙؓ] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r7.f11901e
            eٌٝؐ r1 = r7.f11903e
            eّٗٙ r2 = r7.f11904e
            eٟؔۙ r3 = defpackage.EnumC2821e.f6782e
            int r4 = r7.f11900e
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L1c
            if (r4 != r6) goto L14
            defpackage.AbstractC2003e.purchase(r8)
            goto L2c
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            defpackage.AbstractC2003e.purchase(r8)
            eؙٙؓ r8 = r2.startapp
            if (r8 == 0) goto L33
            r7.f11900e = r6
            java.lang.Object r8 = r8.m722e(r7)
            if (r8 != r3) goto L2c
            return r3
        L2c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            goto L34
        L33:
            r8 = r5
        L34:
            r3 = -1
            if (r8 == 0) goto L47
            eؒۛ٘ r8 = r2.purchase
            r2.metrica(r8, r3)
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Low Light Boost is disabled when expected frame rate range exceeds 30."
            r8.<init>(r0)
            r1.m2503e(r8)
            goto La3
        L47:
            r2.appmetrica = r0
            if (r0 != 0) goto L50
            eؒۛ٘ r8 = r2.purchase
            r2.metrica(r8, r3)
        L50:
            eًُۖ r8 = r2.metrica
            if (r8 == 0) goto L9c
            if (r0 == 0) goto L5b
            eؒۛ٘ r8 = r2.purchase
            r2.metrica(r8, r5)
        L5b:
            boolean r8 = r7.f11902e
            r3 = 0
            if (r8 == 0) goto L6c
            eٌٝؐ r8 = r2.yandex
            if (r8 == 0) goto L69
            java.lang.String r4 = "There is a new enableLowLightBoost being set"
            defpackage.AbstractC17861e.isPro(r4, r8)
        L69:
            r2.yandex = r3
            goto L73
        L6c:
            eٌٝؐ r8 = r2.yandex
            if (r8 == 0) goto L73
            defpackage.AbstractC16398e.metrica(r1, r8)
        L73:
            r2.yandex = r1
            eِٔؕ r8 = r2.ad
            if (r0 == 0) goto L7f
            java.lang.Integer r3 = new java.lang.Integer
            r0 = 6
            r3.<init>(r0)
        L7f:
            java.lang.Object r0 = r8.license
            monitor-enter(r0)
            r8.mopub = r3     // Catch: java.lang.Throwable -> L99
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L99
            monitor-exit(r0)
            eٌٝؐ r8 = r8.purchase()
            defpackage.AbstractC16398e.metrica(r8, r1)
            eًٜ٘ r8 = new eًٜ٘
            r0 = 14
            r8.<init>(r1, r2, r0)
            r1.mo692else(r8)
            goto La3
        L99:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L9c:
            java.lang.String r8 = "Camera is not active."
            defpackage.AbstractC17861e.isPro(r8, r1)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        La3:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5558e.loadAd(java.lang.Object):java.lang.Object");
    }
}
