package defpackage;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘّؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12295e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C1622e f24666e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ C12025e f24667e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8376e f24668e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f24669e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ List f24670e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public /* synthetic */ InterfaceC13033e f24671e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Iterator f24672e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Charset f24673e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12295e(InterfaceC8376e interfaceC8376e, List list, C12025e c12025e, InterfaceC5083e interfaceC5083e) {
        super(3, interfaceC5083e);
        this.f24668e = interfaceC8376e;
        this.f24670e = list;
        this.f24667e = c12025e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list = this.f24670e;
        C12025e c12025e = this.f24667e;
        C12295e c12295e = new C12295e(this.f24668e, list, c12025e, (InterfaceC5083e) obj3);
        c12295e.f24671e = (InterfaceC13033e) obj2;
        return c12295e.loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x006d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0067 -> B:5:0x006a). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r10) {
        /*
            r9 = this;
            eًَۨ r1 = r9.f24668e
            eْٕؕ r2 = r9.f24671e
            int r0 = r9.f24669e
            r8 = 1
            if (r0 == 0) goto L1f
            if (r0 != r8) goto L17
            java.util.Iterator r0 = r9.f24672e
            java.nio.charset.Charset r1 = r9.f24673e
            eٜؓؗ r3 = r9.f24666e
            defpackage.AbstractC2003e.purchase(r10)
            r6 = r3
            r3 = r1
            goto L6a
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            defpackage.AbstractC2003e.purchase(r10)
            eْۧؕ r10 = r1.license()     // Catch: defpackage.C18445e -> L84
            eٜؓؗ r10 = defpackage.AbstractC7535e.purchase(r10)     // Catch: defpackage.C18445e -> L84
            eٜؓؗ r10 = r10.m656e()     // Catch: defpackage.C18445e -> L84
            eْۧؕ r0 = r1.license()
            eٜؓؗ r0 = defpackage.AbstractC7535e.purchase(r0)
            java.nio.charset.Charset r0 = defpackage.AbstractC9757e.ad(r0)
            if (r0 != 0) goto L3e
            java.nio.charset.Charset r0 = defpackage.AbstractC5508e.ad
        L3e:
            java.util.List r1 = r9.f24670e
            java.util.Iterator r1 = r1.iterator()
            r6 = r10
            r3 = r0
            r0 = r1
        L47:
            boolean r10 = r0.hasNext()
            eِ۟ۥ r5 = r9.f24667e
            if (r10 == 0) goto L6e
            java.lang.Object r10 = r0.next()
            r4 = r10
            eٍؔؖ r4 = (defpackage.C2375e) r4
            r9.f24671e = r2
            r9.f24666e = r6
            r9.f24673e = r3
            r9.f24672e = r0
            r9.f24669e = r8
            r7 = r9
            java.lang.Object r10 = defpackage.AbstractC4508e.ad(r2, r3, r4, r5, r6, r7)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r10 != r1) goto L6a
            return r1
        L6a:
            if (r10 != 0) goto L6d
            goto L47
        L6d:
            return r10
        L6e:
            eٕؗٞ r10 = defpackage.AbstractC17926e.ad
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No suitable content converter found for request type "
            r0.<init>(r1)
            eؚ٘ٚ r1 = r5.ad
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.amazon(r0)
            return r2
        L84:
            r0 = move-exception
            r10 = r0
            eٍؕؑ r0 = new eٍؕؑ
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Illegal Content-Type header format: "
            r2.<init>(r3)
            eْۧؕ r1 = r1.license()
            eً٘ۤ r1 = r1.ad()
            java.lang.String r3 = "Content-Type"
            java.lang.String r1 = r1.mo459e(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12295e.loadAd(java.lang.Object):java.lang.Object");
    }
}
