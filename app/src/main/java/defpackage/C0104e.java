package defpackage;

import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0104e extends C13506e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C0104e f1259e = new C13506e(CachedTrack.class, "mainArtists", "getMainArtists()Lio/realm/kotlin/types/RealmList;", 0);

    @Override // defpackage.C13506e, defpackage.InterfaceC0716e
    public final Object get(Object obj) {
        return ((CachedTrack) obj).subscription();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    @Override // defpackage.C13506e, defpackage.InterfaceC0662e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void remoteconfig(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            ua.itaysonlab.vkxreborn.cache.realm.CachedTrack r8 = (ua.itaysonlab.vkxreborn.cache.realm.CachedTrack) r8
            eٗٚٛ r9 = (defpackage.InterfaceC17101e) r9
            eْۧ۠ r0 = r8.f36684e
            if (r0 != 0) goto Lb
            r8.f36667e = r9
            return
        Lb:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            eؙّؔ r1 = defpackage.AbstractC3820e.ad
            java.lang.Class<ua.itaysonlab.vkxreborn.cache.realm.CachedArtist> r2 = ua.itaysonlab.vkxreborn.cache.realm.CachedArtist.class
            eؚ٘ٚ r2 = r1.vip(r2)
            eؕؐۛ r3 = defpackage.AbstractC2863e.ad(r2)
            r6 = 2
            if (r3 != 0) goto L30
            java.lang.Class<eؗٝۚ> r3 = defpackage.InterfaceC5045e.class
            eؚ٘ٚ r1 = r1.vip(r3)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L2d
            r3 = r6
            goto L3a
        L2d:
            r1 = 1
        L2e:
            r3 = r1
            goto L3a
        L30:
            int r1 = r3.license()
            if (r1 != r6) goto L38
            r1 = 4
            goto L2e
        L38:
            r1 = 3
            goto L2e
        L3a:
            java.lang.String r1 = "mainArtists"
            eٖٟۚ r1 = r0.metrica(r1)
            r4 = 0
            r5 = 0
            eٍۥّ r0 = defpackage.C12575e.isVip(r0, r1, r2, r3, r4, r5)
            boolean r1 = r9 instanceof defpackage.C9889e
            if (r1 == 0) goto L63
            io.realm.kotlin.internal.interop.LongPointerWrapper r1 = r0.f19501e
            r2 = r9
            eٍۥّ r2 = (defpackage.C9889e) r2
            io.realm.kotlin.internal.interop.LongPointerWrapper r2 = r2.f19501e
            long r3 = r1.getPtr$cinterop_release()
            long r1 = r2.getPtr$cinterop_release()
            int r5 = defpackage.AbstractC6026e.ad
            boolean r1 = io.realm.kotlin.internal.interop.realmcJNI.realm_equals(r3, r1)
            if (r1 != 0) goto L62
            goto L63
        L62:
            return
        L63:
            r0.clear()
            eؘّٙ r1 = r0.f19500e
            int r0 = r0.subs()
            r1.inmobi(r0, r9, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0104e.remoteconfig(java.lang.Object, java.lang.Object):void");
    }
}
