package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۗٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5840e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f12297e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ Object f12298e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f12299e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f12300e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ long f12301e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f12302e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5840e(long j, C13330e c13330e, InterfaceC7865e interfaceC7865e, C8823e c8823e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f12297e = 1;
        this.f12301e = j;
        this.f12299e = c13330e;
        this.f12300e = interfaceC7865e;
        this.f12298e = c8823e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5840e(C0110e c0110e, InterfaceC6512e interfaceC6512e, long j, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f12297e = 3;
        this.f12300e = c0110e;
        this.f12298e = interfaceC6512e;
        this.f12301e = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5840e(C7142e c7142e, C7142e c7142e2, C7135e c7135e, long j, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f12297e = 2;
        this.f12299e = c7142e;
        this.f12300e = c7142e2;
        this.f12298e = c7135e;
        this.f12301e = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5840e(C8050e c8050e, long j, InterfaceC16180e interfaceC16180e, C15091e c15091e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f12297e = 6;
        this.f12299e = c8050e;
        this.f12301e = j;
        this.f12300e = interfaceC16180e;
        this.f12298e = c15091e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5840e(Object obj, long j, Object obj2, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f12297e = i;
        this.f12300e = obj;
        this.f12301e = j;
        this.f12298e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5840e(Object obj, Object obj2, long j, Object obj3, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f12297e = i;
        this.f12299e = obj;
        this.f12300e = obj2;
        this.f12301e = j;
        this.f12298e = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        if (defpackage.AbstractC2803e.loadAd(r9) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (defpackage.AbstractC16481e.vip((r7 - r5) / 1000000, r9) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object subscription(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f12298e
            eؚْۘ r0 = (defpackage.C7135e) r0
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            int r2 = r9.f12302e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L20
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L14
            defpackage.AbstractC2003e.purchase(r10)
            goto L67
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            defpackage.AbstractC2003e.purchase(r10)
            goto L3c
        L20:
            defpackage.AbstractC2003e.purchase(r10)
            java.lang.Object r10 = r9.f12299e
            eؚٓٞ r10 = (defpackage.C7142e) r10
            long r5 = r10.f14622e
            java.lang.Object r10 = r9.f12300e
            eؚٓٞ r10 = (defpackage.C7142e) r10
            long r7 = r10.f14622e
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 < 0) goto L59
            r9.f12302e = r4
            java.lang.Object r10 = defpackage.AbstractC2803e.loadAd(r9)
            if (r10 != r1) goto L3c
            goto L66
        L3c:
            long r1 = r9.f12301e
            eؘؗٔ r10 = r0.f14609e
            java.lang.Object r10 = r10.f10364e
            eۣۡ r10 = (defpackage.C18464e) r10
            eُٓٞ r3 = new eُٓٞ
            r4 = 3
            r3.<init>(r1, r4)
            r10.m4497e(r3)
            java.lang.Object r10 = r0.f14611e
            monitor-enter(r10)
            r0.f14614e = r1     // Catch: java.lang.Throwable -> L56
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L56
            monitor-exit(r10)
            goto L76
        L56:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L59:
            long r7 = r7 - r5
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 / r4
            r9.f12302e = r3
            java.lang.Object r10 = defpackage.AbstractC16481e.vip(r7, r9)
            if (r10 != r1) goto L67
        L66:
            return r1
        L67:
            eْٜۡ r10 = r0.f14610e
            java.lang.Object r10 = r10.invoke()
            java.lang.Number r10 = (java.lang.Number) r10
            long r1 = r10.longValue()
            defpackage.C7135e.ad(r0, r1)
        L76:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5840e.subscription(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f12297e) {
            case 0:
                return new C5840e((InterfaceC10500e) this.f12300e, this.f12301e, (C15274e) this.f12298e, interfaceC5083e, 0);
            case 1:
                return new C5840e(this.f12301e, (C13330e) this.f12299e, (InterfaceC7865e) this.f12300e, (C8823e) this.f12298e, interfaceC5083e);
            case 2:
                return new C5840e((C7142e) this.f12299e, (C7142e) this.f12300e, (C7135e) this.f12298e, this.f12301e, interfaceC5083e);
            case 3:
                return new C5840e((C0110e) this.f12300e, (InterfaceC6512e) this.f12298e, this.f12301e, interfaceC5083e);
            case 4:
                return new C5840e((C14609e) this.f12299e, (PlaybackService) this.f12300e, this.f12301e, (InterfaceC1686e) this.f12298e, interfaceC5083e, 4);
            case 5:
                C5840e c5840e = new C5840e((C11950e) this.f12300e, this.f12301e, (C15096e) this.f12298e, interfaceC5083e, 5);
                c5840e.f12299e = obj;
                return c5840e;
            case 6:
                return new C5840e((C8050e) this.f12299e, this.f12301e, (InterfaceC16180e) this.f12300e, (C15091e) this.f12298e, interfaceC5083e);
            case 7:
                return new C5840e((InterfaceC3314e) this.f12300e, this.f12301e, (C15274e) this.f12298e, interfaceC5083e, 7);
            case 8:
                return new C5840e((InterfaceC3358e) this.f12299e, (CharSequence) this.f12300e, this.f12301e, (C7765e) this.f12298e, interfaceC5083e, 8);
            default:
                return new C5840e((C7765e) this.f12300e, this.f12301e, (C15274e) this.f12298e, interfaceC5083e, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12297e) {
            case 0:
                return ((C5840e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C5840e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C5840e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C5840e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C5840e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C5840e) advert((InterfaceC5083e) obj2, (C3593e) obj)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C5840e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 7:
                return ((C5840e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 8:
                return ((C5840e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C5840e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011e  */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5840e.loadAd(java.lang.Object):java.lang.Object");
    }
}
