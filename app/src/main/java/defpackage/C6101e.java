package defpackage;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؐٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6101e extends AbstractC4003e implements InterfaceC2898e {
    public final /* synthetic */ int appmetrica;
    public final Object purchase;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6101e(java.lang.reflect.Constructor r4, java.lang.Object r5, int r6) {
        /*
            r3 = this;
            r3.appmetrica = r6
            switch(r6) {
                case 1: goto L25;
                default: goto L5;
            }
        L5:
            java.lang.Class r6 = r4.getDeclaringClass()
            java.lang.reflect.Type[] r0 = r4.getGenericParameterTypes()
            int r1 = r0.length
            r2 = 2
            if (r1 > r2) goto L15
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            goto L1c
        L15:
            int r1 = r0.length
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object[] r0 = defpackage.AbstractC1660e.pro(r2, r1, r0)
        L1c:
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            r1 = 0
            r3.<init>(r4, r6, r1, r0)
            r3.purchase = r5
            return
        L25:
            java.lang.Class r6 = r4.getDeclaringClass()
            r0 = 0
            java.lang.reflect.Type[] r1 = r4.getGenericParameterTypes()
            r3.<init>(r4, r6, r0, r1)
            r3.purchase = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6101e.<init>(java.lang.reflect.Constructor, java.lang.Object, int):void");
    }

    @Override // defpackage.InterfaceC9739e
    public final Object license(Object[] objArr) {
        switch (this.appmetrica) {
            case 0:
                appmetrica(objArr);
                Constructor constructor = (Constructor) this.ad;
                C6325e c6325e = new C6325e(3);
                c6325e.premium(this.purchase);
                c6325e.subs(objArr);
                c6325e.premium(null);
                ArrayList arrayList = (ArrayList) c6325e.f13170e;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                appmetrica(objArr);
                Constructor constructor2 = (Constructor) this.ad;
                C6325e c6325e2 = new C6325e(2);
                c6325e2.premium(this.purchase);
                c6325e2.subs(objArr);
                ArrayList arrayList2 = (ArrayList) c6325e2.f13170e;
                return constructor2.newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
