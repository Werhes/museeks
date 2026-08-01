package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5428e extends AbstractC15049e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f11623e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Iterator f11624e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ Object f11625e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int[] f11626e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C14195e f11627e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f11628e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f11629e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5428e(C14195e c14195e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f11627e = c14195e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C5428e c5428e = new C5428e(this.f11627e, interfaceC5083e);
        c5428e.f11625e = obj;
        return c5428e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C5428e) advert((InterfaceC5083e) obj2, (C4300e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0033 -> B:6:0x003c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0044 -> B:5:0x005d). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f11625e
            eۣؖۖ r0 = (defpackage.C4300e) r0
            int r1 = r9.f11628e
            eٜٓۘ r2 = r9.f11627e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 != r4) goto L1b
            int r1 = r9.f11629e
            int r5 = r9.f11623e
            int[] r6 = r9.f11626e
            java.util.Iterator r7 = r9.f11624e
            defpackage.AbstractC2003e.purchase(r10)
            r10 = r7
            goto L5d
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            defpackage.AbstractC2003e.purchase(r10)
            java.util.ArrayList r10 = r2.ad
            java.util.Iterator r10 = r10.iterator()
            r1 = r3
        L2d:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L64
            java.lang.Object r5 = r10.next()
            int[] r5 = (int[]) r5
            r6 = r5
            r5 = r1
            r1 = r3
        L3c:
            int r7 = r6.length
            if (r1 >= r7) goto L62
            int r7 = r2.ad(r5)
            r8 = -1
            if (r7 == r8) goto L5d
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r5)
            r9.f11625e = r0
            r9.f11624e = r10
            r9.f11626e = r6
            r9.f11623e = r5
            r9.f11629e = r1
            r9.f11628e = r4
            r0.metrica(r9, r2)
            eٟؔۙ r10 = defpackage.EnumC2821e.f6782e
            return r10
        L5d:
            int r1 = r1 + 6
            int r5 = r5 + 6
            goto L3c
        L62:
            r1 = r5
            goto L2d
        L64:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5428e.loadAd(java.lang.Object):java.lang.Object");
    }
}
