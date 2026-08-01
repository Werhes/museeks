package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٝۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11137e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f22348e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C16330e f22349e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f22350e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11137e(C16330e c16330e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f22348e = i;
        this.f22349e = c16330e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f22348e) {
            case 0:
                return new C11137e(this.f22349e, interfaceC5083e, 0);
            default:
                return new C11137e(this.f22349e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f22348e) {
            case 0:
                return ((C11137e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C11137e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0035 -> B:7:0x0038). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0070 -> B:22:0x0073). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f22348e
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            eٟؔۙ r2 = defpackage.EnumC2821e.f6782e
            r3 = 1
            eٖٛ٘ r4 = r5.f22349e
            switch(r0) {
                case 0: goto L47;
                default: goto Lc;
            }
        Lc:
            int r0 = r5.f22350e
            if (r0 == 0) goto L1c
            if (r0 != r3) goto L16
            defpackage.AbstractC2003e.purchase(r6)
            goto L38
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r1)
            throw r6
        L1c:
            defpackage.AbstractC2003e.purchase(r6)
        L1f:
            int r6 = defpackage.C10117e.f19989e
            int r6 = r4.purchase()
            if (r6 <= 0) goto L44
            eٍ٘ؖ r6 = defpackage.C14157e.f27993e
            eٖؒٗ r6 = defpackage.EnumC15934e.SECONDS
            long r0 = defpackage.AbstractC0326e.Signature(r3, r6)
            r5.f22350e = r3
            java.lang.Object r6 = defpackage.AbstractC16481e.metrica(r0, r5)
            if (r6 != r2) goto L38
            goto L46
        L38:
            int r6 = defpackage.C10117e.f19989e
            int r6 = r4.purchase()
            int r6 = r6 + (-1)
            r4.startapp(r6)
            goto L1f
        L44:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L46:
            return r2
        L47:
            int r0 = r5.f22350e
            if (r0 == 0) goto L57
            if (r0 != r3) goto L51
            defpackage.AbstractC2003e.purchase(r6)
            goto L73
        L51:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r1)
            throw r6
        L57:
            defpackage.AbstractC2003e.purchase(r6)
        L5a:
            int r6 = defpackage.C0458e.f2512e
            int r6 = r4.purchase()
            if (r6 <= 0) goto L7f
            eٍ٘ؖ r6 = defpackage.C14157e.f27993e
            eٖؒٗ r6 = defpackage.EnumC15934e.SECONDS
            long r0 = defpackage.AbstractC0326e.Signature(r3, r6)
            r5.f22350e = r3
            java.lang.Object r6 = defpackage.AbstractC16481e.metrica(r0, r5)
            if (r6 != r2) goto L73
            goto L81
        L73:
            int r6 = defpackage.C0458e.f2512e
            int r6 = r4.purchase()
            int r6 = r6 + (-1)
            r4.startapp(r6)
            goto L5a
        L7f:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11137e.loadAd(java.lang.Object):java.lang.Object");
    }
}
