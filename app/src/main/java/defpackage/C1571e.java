package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؔۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1571e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f4479e = 2;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public /* synthetic */ Object f4480e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f4481e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public String f4482e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ long f4483e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f4484e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1571e(long j, int i, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f4483e = j;
        this.f4481e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1571e(long j, int i, String str, C3967e c3967e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f4483e = j;
        this.f4481e = i;
        this.f4482e = str;
        this.f4480e = c3967e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1571e(C8004e c8004e, long j, String str, int i, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f4480e = c8004e;
        this.f4483e = j;
        this.f4482e = str;
        this.f4481e = i;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f4479e) {
            case 0:
                return new C1571e((C8004e) this.f4480e, this.f4483e, this.f4482e, this.f4481e, interfaceC5083e);
            case 1:
                return new C1571e(this.f4483e, this.f4481e, this.f4482e, (C3967e) this.f4480e, interfaceC5083e);
            default:
                C1571e c1571e = new C1571e(this.f4483e, this.f4481e, interfaceC5083e);
                c1571e.f4480e = obj;
                return c1571e;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f4479e) {
            case 0:
                return ((C1571e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C1571e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C1571e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1571e.loadAd(java.lang.Object):java.lang.Object");
    }
}
