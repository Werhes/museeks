package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؕؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13024e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f25946e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C12688e f25947e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13024e(C12688e c12688e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f25947e = c12688e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C13024e(this.f25947e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C13024e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        if (r5.length() > 0) goto L21;
     */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f25946e
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L16
            if (r0 != r1) goto Le
            defpackage.AbstractC2003e.purchase(r5)     // Catch: java.lang.Exception -> Lc
            goto L37
        Lc:
            r5 = move-exception
            goto L42
        Le:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L16:
            defpackage.AbstractC2003e.purchase(r5)
            eؗؓؖ r5 = new eؗؓؖ     // Catch: java.lang.Exception -> Lc
            eؘؒؐ r0 = defpackage.C0353e.startapp     // Catch: java.lang.Exception -> Lc
            eؑٗٓ r0 = defpackage.AbstractC15792e.billing()     // Catch: java.lang.Exception -> Lc
            eْۢؑ r0 = r0.billing     // Catch: java.lang.Exception -> Lc
            java.lang.String r0 = r0.pro()     // Catch: java.lang.Exception -> Lc
            r3 = 26
            r5.<init>(r0, r3)     // Catch: java.lang.Exception -> Lc
            r4.f25946e = r1     // Catch: java.lang.Exception -> Lc
            java.lang.Object r5 = defpackage.AbstractC18406e.yandex(r5, r4)     // Catch: java.lang.Exception -> Lc
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L37
            return r0
        L37:
            ua.itaysonlab.vkapi2.methods.auth.RefreshToken$RTToken r5 = (ua.itaysonlab.vkapi2.methods.auth.RefreshToken$RTToken) r5     // Catch: java.lang.Exception -> Lc
            java.lang.String r5 = r5.ad     // Catch: java.lang.Exception -> Lc
            int r0 = r5.length()     // Catch: java.lang.Exception -> Lc
            if (r0 <= 0) goto L45
            goto L46
        L42:
            r5.printStackTrace()
        L45:
            r5 = r2
        L46:
            r0 = 0
            eّۗۧ r1 = r4.f25947e
            if (r5 == 0) goto L7a
            ua.itaysonlab.vkx.VKXApplication r3 = ua.itaysonlab.vkx.VKXApplication.f36528e
            if (r3 == 0) goto L50
            r2 = r3
        L50:
            java.lang.String r3 = "user"
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r0)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = "user_token"
            r2.putString(r3, r5)
            r2.commit()
            android.app.Activity r5 = r1.pro()
            r1 = 2131888193(0x7f120841, float:1.9411014E38)
            android.content.res.Resources r2 = r5.getResources()
            java.lang.String r1 = r2.getString(r1)
            eٌؒۧ r2 = new eٌؒۧ
            r2.<init>(r0, r5, r1)
            defpackage.AbstractC15615e.ad(r2)
            goto L91
        L7a:
            android.app.Activity r5 = r1.pro()
            r1 = 2131888192(0x7f120840, float:1.9411012E38)
            android.content.res.Resources r2 = r5.getResources()
            java.lang.String r1 = r2.getString(r1)
            eٌؒۧ r2 = new eٌؒۧ
            r2.<init>(r0, r5, r1)
            defpackage.AbstractC15615e.ad(r2)
        L91:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13024e.loadAd(java.lang.Object):java.lang.Object");
    }
}
