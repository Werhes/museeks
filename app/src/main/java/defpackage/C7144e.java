package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٓۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7144e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f14624e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f14625e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14626e;

    public /* synthetic */ C7144e(Object obj, boolean z, int i) {
        this.f14626e = i;
        this.f14624e = obj;
        this.f14625e = z;
    }

    public /* synthetic */ C7144e(boolean z, Object obj, int i) {
        this.f14626e = i;
        this.f14625e = z;
        this.f14624e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f14626e
            r1 = 0
            r2 = 0
            java.lang.Object r3 = r7.f14624e
            boolean r4 = r7.f14625e
            switch(r0) {
                case 0: goto L75;
                case 1: goto L5d;
                case 2: goto L40;
                case 3: goto L32;
                default: goto Lb;
            }
        Lb:
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            eٕۘؐ r8 = (defpackage.InterfaceC15671e) r8
            eؒۚۨ r0 = new eؒۚۨ
            r1 = 9
            r0.<init>(r1, r3)
            defpackage.AbstractC14594e.metrica(r8, r0)
            eَۦۤ r0 = new eَۦۤ
            r1 = 23
            r0.<init>(r1)
            eٖۣ r1 = defpackage.AbstractC10789e.metrica
            eَۡٙ r3 = new eَۡٙ
            r3.<init>(r2, r0)
            r8.appmetrica(r1, r3)
            if (r4 != 0) goto L2f
            defpackage.AbstractC14594e.ad(r8)
        L2f:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L32:
            eَٜؒ r3 = (defpackage.C10381e) r3
            eؑؓۗ r8 = (defpackage.C0057e) r8
            r3.m2811e(r4)
            eَۣ۠ r0 = new eَۣ۠
            r1 = 1
            r0.<init>(r8, r3, r1)
            return r0
        L40:
            eؚّۨ r3 = (defpackage.C12339e) r3
            eٕۘؐ r8 = (defpackage.InterfaceC15671e) r8
            if (r4 != 0) goto L49
            defpackage.AbstractC14594e.ad(r8)
        L49:
            eؓ۠۟ r0 = new eؓ۠۟
            r0.<init>(r3, r1)
            eٌَۧ[] r1 = defpackage.AbstractC14594e.ad
            eٖۣ r1 = defpackage.AbstractC10789e.startapp
            eَۡٙ r3 = new eَۡٙ
            r3.<init>(r2, r0)
            r8.appmetrica(r1, r3)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L5d:
            eؘُۛ r3 = (defpackage.C5906e) r3
            eؑؓۗ r8 = (defpackage.C0057e) r8
            java.lang.Object r0 = r3.f22047e
            eُٛۗ r0 = (defpackage.C11109e) r0
            r0.appmetrica(r4)
            java.lang.Object r0 = r3.f22046e
            eؘّٚ r0 = (defpackage.C5601e) r0
            r0.purchase(r4)
            eَۣ۠ r0 = new eَۣ۠
            r0.<init>(r8, r3, r1)
            return r0
        L75:
            ua.itaysonlab.vkxreborn.cache.realm.CachedTrack r3 = (ua.itaysonlab.vkxreborn.cache.realm.CachedTrack) r3
            eؗۘٞ r8 = (defpackage.C5114e) r8
            boolean r0 = defpackage.C7290e.startapp(r3)
            if (r0 != 0) goto L80
            goto La2
        L80:
            eْۧ۠ r0 = r3.f36684e
            if (r0 == 0) goto La4
            eٌٕۥ r5 = r0.f27072e
            eْٗۚ r6 = r8.yandex()
            boolean r5 = defpackage.AbstractC7890e.billing(r5, r6)
            if (r5 == 0) goto L91
            goto La5
        L91:
            eْٗۚ r8 = r8.yandex()
            eؚ٘ٚ r3 = r0.f27073e
            eْۧ۠ r8 = r0.license(r8, r3)
            if (r8 == 0) goto La2
            eَۚٗ r8 = defpackage.AbstractC15792e.admob(r8)
            goto La8
        La2:
            r8 = r2
            goto La8
        La4:
            r3 = r2
        La5:
            if (r3 == 0) goto Lb5
            r8 = r3
        La8:
            ua.itaysonlab.vkxreborn.cache.realm.CachedTrack r8 = (ua.itaysonlab.vkxreborn.cache.realm.CachedTrack) r8
            if (r8 == 0) goto Lb4
            r8.m4731package(r1)
            r8.m4733protected(r4)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        Lb4:
            return r2
        Lb5:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unmanaged objects must be part of the Realm, before they can be queried this way. Use `MutableRealm.copyToRealm()` to turn it into a managed object."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7144e.invoke(java.lang.Object):java.lang.Object");
    }
}
