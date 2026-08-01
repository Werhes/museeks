package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17936e implements InterfaceC12635e, InterfaceC10269e, InterfaceC4752e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC16046e f35174e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f35175e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Function0 f35176e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f35177e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC8448e f35178e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public volatile List f35179e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[LOOP:0: B:12:0x004b->B:14:0x0051, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C17936e(defpackage.InterfaceC8448e r9, defpackage.InterfaceC16046e r10) {
        /*
            r8 = this;
            eٕٗۖ r0 = new eٕٗۖ
            r1 = 1
            r0.<init>(r1, r10)
            r1 = 0
            eْۙۜ r5 = defpackage.AbstractC2426e.vip(r1, r0)
            eؑۘٛ r0 = r10.getName()
            java.lang.String r6 = r0.vip()
            int r0 = r10.mo2738e()
            int r0 = defpackage.AbstractC8703e.m2467class(r0)
            r1 = 1
            if (r0 == 0) goto L24
            r2 = 2
            if (r0 == r1) goto L2e
            if (r0 != r2) goto L26
            r1 = 3
        L24:
            r7 = r1
            goto L2f
        L26:
            eٔٚؖ r9 = new eٔٚؖ
            r10 = 10
            r9.<init>(r10)
            throw r9
        L2e:
            r7 = r2
        L2f:
            r10.mo2739e()
            r2 = r8
            r4 = r9
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.List r9 = r3.getUpperBounds()
            java.util.ArrayList r10 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.AbstractC0746e.subscription(r9, r0)
            r10.<init>(r0)
            java.util.Iterator r9 = r9.iterator()
        L4b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r0 = r9.next()
            eٜؒؒ r0 = (defpackage.AbstractC1186e) r0
            eِۜۦ r1 = new eِۜۦ
            r1.<init>(r0)
            r10.add(r1)
            goto L4b
        L60:
            r2.f35179e = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17936e.<init>(eٌؓٞ, eؙٖٔ):void");
    }

    public C17936e(InterfaceC8448e interfaceC8448e, String str, int i) {
        this(null, interfaceC8448e, null, str, i);
    }

    public C17936e(InterfaceC16046e interfaceC16046e, InterfaceC8448e interfaceC8448e, C13475e c13475e, String str, int i) {
        this.f35178e = interfaceC8448e;
        this.f35176e = c13475e;
        this.f35175e = str;
        this.f35177e = i;
        this.f35174e = interfaceC16046e;
    }

    @Override // defpackage.InterfaceC12635e
    public final int adcel() {
        return this.f35177e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17936e)) {
            return false;
        }
        InterfaceC8448e interfaceC8448e = this.f35178e;
        if (interfaceC8448e == null) {
            interfaceC8448e = (InterfaceC8448e) this.f35176e.invoke();
        }
        C17936e c17936e = (C17936e) obj;
        InterfaceC8448e interfaceC8448e2 = c17936e.f35178e;
        if (interfaceC8448e2 == null) {
            interfaceC8448e2 = (InterfaceC8448e) c17936e.f35176e.invoke();
        }
        return AbstractC7890e.billing(interfaceC8448e, interfaceC8448e2) && AbstractC7890e.billing(this.f35175e, c17936e.f35175e);
    }

    @Override // defpackage.InterfaceC12635e
    public final String getName() {
        return this.f35175e;
    }

    @Override // defpackage.InterfaceC12635e
    public final List getUpperBounds() {
        List list = this.f35179e;
        if (list != null) {
            return list;
        }
        return null;
    }

    public final int hashCode() {
        InterfaceC8448e interfaceC8448e = this.f35178e;
        if (interfaceC8448e == null) {
            interfaceC8448e = (InterfaceC8448e) this.f35176e.invoke();
        }
        return this.f35175e.hashCode() + (interfaceC8448e.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int m2467class = AbstractC8703e.m2467class(this.f35177e);
        if (m2467class == 0) {
            Unit unit = Unit.INSTANCE;
        } else if (m2467class == 1) {
            sb.append("in ");
        } else {
            if (m2467class != 2) {
                throw new C14803e(10);
            }
            sb.append("out ");
        }
        sb.append(this.f35175e);
        return sb.toString();
    }
}
