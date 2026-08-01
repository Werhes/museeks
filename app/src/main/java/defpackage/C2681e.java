package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٚؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2681e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f6554e;

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new AbstractC7185e(2, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2681e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (defpackage.AbstractC5336e.advert(r6, r0, r5) == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if (r6 == r3) goto L17;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f6554e
            r1 = 1
            r2 = 2
            eٟؔۙ r3 = defpackage.EnumC2821e.f6782e
            if (r0 == 0) goto L1c
            if (r0 == r1) goto L18
            if (r0 != r2) goto L10
            defpackage.AbstractC2003e.purchase(r6)
            goto L72
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            defpackage.AbstractC2003e.purchase(r6)
            goto L3b
        L1c:
            defpackage.AbstractC2003e.purchase(r6)
            eؗؓؖ r6 = new eؗؓؖ
            eؘؒؐ r0 = defpackage.C0353e.startapp
            eؑٗٓ r0 = defpackage.AbstractC15792e.billing()
            eْۢؑ r0 = r0.billing
            java.lang.String r0 = r0.pro()
            r4 = 26
            r6.<init>(r0, r4)
            r5.f6554e = r1
            java.lang.Object r6 = defpackage.AbstractC18406e.yandex(r6, r5)
            if (r6 != r3) goto L3b
            goto L57
        L3b:
            ua.itaysonlab.vkapi2.methods.auth.RefreshToken$RTToken r6 = (ua.itaysonlab.vkapi2.methods.auth.RefreshToken$RTToken) r6
            java.lang.String r0 = r6.ad
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L58
            eّٕٓ r6 = defpackage.AbstractC6731e.ad
            eْؐؔ r6 = defpackage.AbstractC1497e.ad
            eؘۨۛ r0 = new eؘۨۛ
            r0.<init>(r2, r1)
            r5.f6554e = r2
            java.lang.Object r6 = defpackage.AbstractC5336e.advert(r6, r0, r5)
            if (r6 != r3) goto L72
        L57:
            return r3
        L58:
            ua.itaysonlab.vkx.VKXApplication r0 = ua.itaysonlab.vkx.VKXApplication.f36528e
            if (r0 == 0) goto L5d
            r1 = r0
        L5d:
            java.lang.String r0 = "user"
            r2 = 0
            android.content.SharedPreferences r0 = r1.getSharedPreferences(r0, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "user_token"
            java.lang.String r6 = r6.ad
            r0.putString(r1, r6)
            r0.commit()
        L72:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2681e.loadAd(java.lang.Object):java.lang.Object");
    }
}
