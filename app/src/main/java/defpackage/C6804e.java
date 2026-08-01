package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6804e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f14016e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ AppActivity f14017e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6804e(AppActivity appActivity, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f14017e = appActivity;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C6804e(this.f14017e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6804e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r5 == r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        if (r5.vip(r4) == r3) goto L19;
     */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f14016e
            r1 = 2
            r2 = 1
            eٟؔۙ r3 = defpackage.EnumC2821e.f6782e
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            defpackage.AbstractC2003e.purchase(r5)
            goto L3a
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            defpackage.AbstractC2003e.purchase(r5)
            goto L2e
        L1c:
            defpackage.AbstractC2003e.purchase(r5)
            e٘۠ؒ r5 = ua.itaysonlab.vkx.VKXApplication.f36532e
            if (r5 == 0) goto L24
            goto L25
        L24:
            r5 = 0
        L25:
            r4.f14016e = r2
            java.lang.Object r5 = r5.vip(r4)
            if (r5 != r3) goto L2e
            goto L39
        L2e:
            r4.f14016e = r1
            ua.itaysonlab.vkx.activity.AppActivity r5 = r4.f14017e
            r0 = 6
            java.lang.Object r5 = defpackage.C1707e.vip(r5, r4, r0)
            if (r5 != r3) goto L3a
        L39:
            return r3
        L3a:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6804e.loadAd(java.lang.Object):java.lang.Object");
    }
}
