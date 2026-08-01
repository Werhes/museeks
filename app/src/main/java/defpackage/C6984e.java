package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6984e extends AbstractC15049e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long[] f14303e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final /* synthetic */ C4799e f14304e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public /* synthetic */ Object f14305e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C5143e f14306e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public long f14307e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final /* synthetic */ C5143e f14308e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f14309e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f14310e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C4799e f14311e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f14312e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f14313e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f14314e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6984e(C4799e c4799e, C5143e c5143e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f14304e = c4799e;
        this.f14308e = c5143e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C6984e c6984e = new C6984e(this.f14304e, this.f14308e, interfaceC5083e);
        c6984e.f14305e = obj;
        return c6984e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6984e) advert((InterfaceC5083e) obj2, (C4300e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:14:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:6:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006e -> B:5:0x0095). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.f14310e
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 != r4) goto L25
            int r1 = r0.f14312e
            int r5 = r0.f14309e
            long r6 = r0.f14307e
            int r8 = r0.f14313e
            int r9 = r0.f14314e
            long[] r10 = r0.f14303e
            eُِؗ r11 = r0.f14311e
            eؗۚۖ r12 = r0.f14306e
            java.lang.Object r13 = r0.f14305e
            eۣؖۖ r13 = (defpackage.C4300e) r13
            defpackage.AbstractC2003e.purchase(r21)
            goto L95
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2d:
            defpackage.AbstractC2003e.purchase(r21)
            java.lang.Object r1 = r0.f14305e
            eۣؖۖ r1 = (defpackage.C4300e) r1
            eُِؗ r5 = r0.f14304e
            eّٜٝ r6 = r5.f10227e
            long[] r6 = r6.ad
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La5
            eؗۚۖ r8 = r0.f14308e
            r9 = r2
        L42:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto La0
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L65:
            if (r1 >= r5) goto L98
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L95
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.f11023e = r2
            eّٜٝ r3 = r11.f10227e
            java.lang.Object[] r3 = r3.vip
            r2 = r3[r2]
            r0.f14305e = r13
            r0.f14306e = r12
            r0.f14311e = r11
            r0.f14303e = r10
            r0.f14314e = r9
            r0.f14313e = r8
            r0.f14307e = r6
            r0.f14309e = r5
            r0.f14312e = r1
            r0.f14310e = r4
            r13.metrica(r0, r2)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            return r1
        L95:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L65
        L98:
            if (r5 != r3) goto La5
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        La0:
            if (r9 == r7) goto La5
            int r9 = r9 + 1
            goto L42
        La5:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6984e.loadAd(java.lang.Object):java.lang.Object");
    }
}
