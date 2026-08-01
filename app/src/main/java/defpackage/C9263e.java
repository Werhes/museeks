package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؗٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9263e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f18477e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ AppActivity f18478e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9263e(AppActivity appActivity, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f18478e = appActivity;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C9263e(this.f18478e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C9263e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r6.ad(r0, r5) == r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
    
        if (r6 == r4) goto L26;
     */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f18477e
            r1 = 0
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 != r2) goto L11
            defpackage.AbstractC2003e.purchase(r6)
            goto L71
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            defpackage.AbstractC2003e.purchase(r6)
            goto L3b
        L1d:
            defpackage.AbstractC2003e.purchase(r6)
            eُۡٔ r6 = ua.itaysonlab.vkx.VKXApplication.f36535e
            if (r6 == 0) goto L25
            goto L26
        L25:
            r6 = r1
        L26:
            java.lang.Object r6 = r6.f22771e
            eٖٜۘ r6 = (defpackage.C16452e) r6
            java.lang.Object r6 = r6.f32285e
            eًٙۡ r6 = (defpackage.InterfaceC8018e) r6
            eؒٗۡ r6 = r6.ad()
            r5.f18477e = r3
            java.lang.Object r6 = defpackage.AbstractC7535e.startapp(r6, r5)
            if (r6 != r4) goto L3b
            goto L70
        L3b:
            eؕٛٔ r6 = (defpackage.C3487e) r6
            boolean r6 = r6.f7757e
            if (r6 != 0) goto L44
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L44:
            eُۡٔ r6 = ua.itaysonlab.vkx.VKXApplication.f36535e
            if (r6 == 0) goto L49
            r1 = r6
        L49:
            java.lang.Object r6 = r1.f22771e
            eٖٜۘ r6 = (defpackage.C16452e) r6
            java.lang.Object r6 = r6.f32285e
            eًٙۡ r6 = (defpackage.InterfaceC8018e) r6
            eؒٗۡ r6 = r6.ad()
            eؘٞٔ r0 = new eؘٞٔ
            r1 = 9
            r0.<init>(r6, r1)
            eؒٗۡ r6 = defpackage.AbstractC7535e.yandex(r0)
            eؘۗۢ r0 = new eؘۗۢ
            ua.itaysonlab.vkx.activity.AppActivity r1 = r5.f18478e
            r3 = 2
            r0.<init>(r3, r1)
            r5.f18477e = r2
            java.lang.Object r6 = r6.ad(r0, r5)
            if (r6 != r4) goto L71
        L70:
            return r4
        L71:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9263e.loadAd(java.lang.Object):java.lang.Object");
    }
}
