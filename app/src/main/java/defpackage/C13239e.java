package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13239e extends AbstractC16412e implements InterfaceC2898e {
    public final boolean billing;
    public final Object yandex;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C13239e(java.lang.reflect.Method r5, boolean r6, java.lang.Object r7) {
        /*
            r4 = this;
            java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r1 > r3) goto Lc
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
            goto L11
        Lc:
            int r1 = r0.length
            java.lang.Object[] r0 = defpackage.AbstractC1660e.pro(r3, r1, r0)
        L11:
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            r4.<init>(r5, r2, r0)
            r4.billing = r6
            r4.yandex = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13239e.<init>(java.lang.reflect.Method, boolean, java.lang.Object):void");
    }

    @Override // defpackage.AbstractC16412e, defpackage.InterfaceC9739e
    public final Object license(Object[] objArr) {
        appmetrica(objArr);
        C6325e c6325e = new C6325e(2);
        c6325e.premium(this.yandex);
        c6325e.subs(objArr);
        ArrayList arrayList = (ArrayList) c6325e.f13170e;
        return billing(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
