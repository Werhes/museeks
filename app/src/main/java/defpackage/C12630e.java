package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٞٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12630e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f25343e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ AppActivity f25344e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f25345e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12630e(AppActivity appActivity, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f25343e = i;
        this.f25344e = appActivity;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f25343e) {
            case 0:
                C12630e c12630e = new C12630e(this.f25344e, interfaceC5083e, 0);
                c12630e.f25345e = obj;
                return c12630e;
            case 1:
                C12630e c12630e2 = new C12630e(this.f25344e, interfaceC5083e, 1);
                c12630e2.f25345e = obj;
                return c12630e2;
            default:
                C12630e c12630e3 = new C12630e(this.f25344e, interfaceC5083e, 2);
                c12630e3.f25345e = obj;
                return c12630e3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25343e) {
            case 0:
                return ((C12630e) advert((InterfaceC5083e) obj2, (C6337e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C12630e) advert((InterfaceC5083e) obj2, (C16908e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C12630e) advert((InterfaceC5083e) obj2, (C3342e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f25343e
            r1 = 0
            ua.itaysonlab.vkx.activity.AppActivity r2 = r7.f25344e
            switch(r0) {
                case 0: goto L38;
                case 1: goto L20;
                default: goto L8;
            }
        L8:
            java.lang.Object r0 = r7.f25345e
            eْؕۜ r0 = (defpackage.C3342e) r0
            defpackage.AbstractC2003e.purchase(r8)
            boolean r8 = r0.ad
            if (r8 == 0) goto L17
            r8 = 2131886931(0x7f120353, float:1.9408455E38)
            goto L1a
        L17:
            r8 = 2131886932(0x7f120354, float:1.9408457E38)
        L1a:
            r2.m4678interface(r8, r1)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L20:
            java.lang.Object r0 = r7.f25345e
            eٍٗۧ r0 = (defpackage.C16908e) r0
            defpackage.AbstractC2003e.purchase(r8)
            boolean r8 = r0.ad
            if (r8 == 0) goto L35
            eؙٕؔ r8 = new eؙٕؔ
            eِٗۘ r0 = r0.vip
            r8.<init>(r0)
            r8.signatures(r2)
        L35:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L38:
            java.lang.Object r0 = r7.f25345e
            eؙِؐ r0 = (defpackage.C6337e) r0
            defpackage.AbstractC2003e.purchase(r8)
            ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist r8 = r0.ad
            int r3 = r8.isPro
            long r4 = r8.applovin
            eۣۡ r8 = defpackage.C18353e.vip
            eّؖٚ r8 = r8.m4502e()
            if (r8 == 0) goto L85
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r4 = 95
            r6.append(r4)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r1] = r3
            java.lang.Class<ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist> r3 = ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist.class
            eؙّؔ r6 = defpackage.AbstractC3820e.ad
            eؚ٘ٚ r3 = r6.vip(r3)
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r5 = "uid == $0"
            eٓٛۘ r8 = r8.m1506e(r3, r5, r4)
            eَۚٗ r8 = defpackage.AbstractC18366e.metrica(r8)
            ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist r8 = (ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist) r8
            if (r8 == 0) goto L85
            boolean r8 = r8.m4706this()
            goto L86
        L85:
            r8 = r1
        L86:
            if (r8 == 0) goto L9d
            eّؑؐ r8 = r2.vip()
            eٛۨ r8 = defpackage.AbstractC4608e.metrica(r8)
            eؕۙۜ r3 = defpackage.ExecutorC3603e.f8134e
            eٔٞۢ r4 = new eٔٞۢ
            r5 = 0
            r6 = 7
            r4.<init>(r0, r2, r5, r6)
            r0 = 2
            defpackage.AbstractC5336e.purchase(r8, r3, r1, r4, r0)
        L9d:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12630e.loadAd(java.lang.Object):java.lang.Object");
    }
}
