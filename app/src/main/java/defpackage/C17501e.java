package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘ؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17501e implements InterfaceC14956e {
    public final C6272e ad;
    public final C8286e license;
    public C18277e metrica;
    public final C16113e vip;

    public C17501e(C6272e c6272e, C7850e c7850e, C16113e c16113e) {
        this.ad = c6272e;
        this.vip = c16113e;
        this.license = c6272e.metrica(new C17877e(2, this));
    }

    @Override // defpackage.InterfaceC14956e
    public final List ad(C12816e c12816e) {
        return AbstractC6874e.adcel(this.license.invoke(c12816e));
    }

    @Override // defpackage.InterfaceC14956e
    public final Collection crashlytics(C12816e c12816e, Function1 function1) {
        return C3295e.f7451e;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C4718e license(defpackage.C12816e r4) {
        /*
            r3 = this;
            eؑۘٛ r0 = defpackage.AbstractC4972e.adcel
            eْۢٙ r1 = r4.ad
            boolean r0 = r1.yandex(r0)
            r1 = 0
            if (r0 != 0) goto Ld
        Lb:
            r0 = r1
            goto L36
        Ld:
            eٗؗ۟ r0 = defpackage.C16810e.smaato
            r0.getClass()
            java.lang.String r0 = defpackage.C16810e.ad(r4)
            java.lang.Class<eُٓٗ> r2 = defpackage.C10990e.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            if (r2 != 0) goto L23
            java.io.InputStream r0 = java.lang.ClassLoader.getSystemResourceAsStream(r0)
            goto L36
        L23:
            java.net.URL r0 = r2.getResource(r0)
            if (r0 != 0) goto L2a
            goto Lb
        L2a:
            java.net.URLConnection r0 = r0.openConnection()
            r2 = 0
            r0.setUseCaches(r2)
            java.io.InputStream r0 = r0.getInputStream()
        L36:
            if (r0 == 0) goto L41
            eًؙۡ r1 = r3.ad
            eَٖۘ r2 = r3.vip
            eؚؚؗ r4 = defpackage.AbstractC5706e.vip(r4, r1, r2, r0)
            return r4
        L41:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17501e.license(eّۡۜ):eؚؚؗ");
    }

    @Override // defpackage.InterfaceC14956e
    public final void metrica(C12816e c12816e, ArrayList arrayList) {
        AbstractC9386e.vip(arrayList, this.license.invoke(c12816e));
    }

    @Override // defpackage.InterfaceC14956e
    public final boolean vip(C12816e c12816e) {
        C8286e c8286e = this.license;
        Object obj = ((ConcurrentHashMap) c8286e.f16957e).get(c12816e);
        return ((obj == null || obj == EnumC8150e.f16545e) ? license(c12816e) : (InterfaceC9646e) c8286e.invoke(c12816e)) == null;
    }
}
