package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13658e extends AbstractC11424e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f27077e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC8850e f27078e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final List f27079e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f27080e;

    public C13658e(Object obj, List list, Object obj2, InterfaceC8850e interfaceC8850e) {
        super(obj);
        this.f27079e = list;
        this.f27078e = interfaceC8850e;
        this.f27080e = obj2;
    }

    @Override // defpackage.AbstractC11424e
    public final Object ad(Object obj, AbstractC10731e abstractC10731e) {
        this.f27077e = 0;
        this.f27080e = obj;
        return appmetrica(abstractC10731e);
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f27078e;
    }

    @Override // defpackage.AbstractC11424e
    public final Object appmetrica(InterfaceC5083e interfaceC5083e) {
        int i = this.f27077e;
        if (i < 0) {
            return this.f27080e;
        }
        if (i < this.f27079e.size()) {
            return yandex(interfaceC5083e);
        }
        this.f27077e = -1;
        return this.f27080e;
    }

    @Override // defpackage.AbstractC11424e
    public final void billing(Object obj) {
        this.f27080e = obj;
    }

    @Override // defpackage.AbstractC11424e
    public final Object metrica() {
        return this.f27080e;
    }

    @Override // defpackage.AbstractC11424e
    public final Object purchase(InterfaceC5083e interfaceC5083e, Object obj) {
        this.f27080e = obj;
        return appmetrica(interfaceC5083e);
    }

    @Override // defpackage.AbstractC11424e
    public final void vip() {
        this.f27077e = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yandex(defpackage.InterfaceC5083e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C4098e
            if (r0 == 0) goto L13
            r0 = r6
            eؖٓٝ r0 = (defpackage.C4098e) r0
            int r1 = r0.f9054e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9054e = r1
            goto L18
        L13:
            eؖٓٝ r0 = new eؖٓٝ
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f9053e
            int r1 = r0.f9054e
            r2 = 1
            if (r1 == 0) goto L2a
            if (r1 != r2) goto L22
            goto L2a
        L22:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2a:
            defpackage.AbstractC2003e.purchase(r6)
        L2d:
            int r6 = r5.f27077e
            r1 = -1
            if (r6 != r1) goto L33
            goto L3d
        L33:
            java.util.List r3 = r5.f27079e
            int r4 = r3.size()
            if (r6 < r4) goto L40
            r5.f27077e = r1
        L3d:
            java.lang.Object r6 = r5.f27080e
            return r6
        L40:
            java.lang.Object r1 = r3.get(r6)
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            int r6 = r6 + 1
            r5.f27077e = r6
            java.lang.Object r6 = r5.f27080e
            r0.f9054e = r2
            java.lang.Object r6 = r1.invoke(r5, r6, r0)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r6 != r1) goto L2d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13658e.yandex(eًؗۖ):java.lang.Object");
    }
}
