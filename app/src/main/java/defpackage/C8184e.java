package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8184e extends AbstractC1412e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C8372e f16668e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C4956e f16669e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final C2953e f16670e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8184e(defpackage.C4956e r11, defpackage.C8372e r12, int r13) {
        /*
            r10 = this;
            java.lang.Object r0 = r11.f10517e
            eٟٓ r0 = (defpackage.C18277e) r0
            java.lang.Object r0 = r0.ad
            r2 = r0
            eًؙۡ r2 = (defpackage.C6272e) r2
            java.lang.Object r0 = r11.f10512e
            r3 = r0
            eِٕٖ r3 = (defpackage.InterfaceC15498e) r3
            eُ٘ۖ r4 = defpackage.C4590e.f9885e
            java.lang.Object r0 = r11.f10513e
            eِٚ r0 = (defpackage.InterfaceC11824e) r0
            int r1 = r12.f17125e
            eؑۘٛ r5 = defpackage.AbstractC17487e.metrica(r0, r1)
            eۣٖؑ r0 = r12.f17135e
            int r0 = r0.ordinal()
            r1 = 2
            if (r0 == 0) goto L32
            r6 = 1
            if (r0 == r6) goto L31
            if (r0 != r1) goto L29
            goto L33
        L29:
            eٔٚؖ r11 = new eٔٚؖ
            r12 = 10
            r11.<init>(r12)
            throw r11
        L31:
            r1 = 3
        L32:
            r6 = r1
        L33:
            boolean r7 = r12.f17136e
            eٍؗۘ r9 = defpackage.C5107e.f10959e
            r1 = r10
            r8 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1.f16669e = r11
            r1.f16668e = r12
            eْۣؔ r11 = new eْۣؔ
            eؘؕٗ r12 = new eؘؕٗ
            r13 = 18
            r12.<init>(r13, r10)
            r11.<init>(r2, r12)
            r1.f16670e = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8184e.<init>(eؗ٘ٔ, eًۨ, int):void");
    }

    @Override // defpackage.AbstractC17288e
    /* renamed from: eٖٕٚ */
    public final List mo609e() {
        C4956e c4956e = this.f16669e;
        List signatures = AbstractC17110e.signatures(this.f16668e, (C17221e) c4956e.f10515e);
        if (signatures.isEmpty()) {
            return Collections.singletonList(AbstractC2876e.appmetrica(this).loadAd());
        }
        C5306e c5306e = (C5306e) c4956e.f10514e;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(signatures, 10));
        Iterator it = signatures.iterator();
        while (it.hasNext()) {
            arrayList.add(c5306e.firebase((C13212e) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.Cpackage, defpackage.InterfaceC15633e
    public final InterfaceC2460e getAnnotations() {
        return this.f16670e;
    }
}
