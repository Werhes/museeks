package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۚ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9733e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f19248e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C17085e f19249e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ C1839e f19250e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f19251e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C13119e f19252e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ Function3 f19253e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ boolean f19254e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C1839e f19255e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19256e = 1;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f19257e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ boolean f19258e;

    public /* synthetic */ C9733e(C11117e c11117e, C17085e c17085e, boolean z, boolean z2, boolean z3, boolean z4, C13119e c13119e, C1839e c1839e, C1839e c1839e2, Function3 function3) {
        this.f19251e = c11117e;
        this.f19249e = c17085e;
        this.f19254e = z;
        this.f19248e = z2;
        this.f19258e = z3;
        this.f19257e = z4;
        this.f19252e = c13119e;
        this.f19255e = c1839e;
        this.f19250e = c1839e2;
        this.f19253e = function3;
    }

    public /* synthetic */ C9733e(InterfaceC16132e interfaceC16132e, C17085e c17085e, boolean z, boolean z2, boolean z3, boolean z4, C13119e c13119e, C1839e c1839e, C1839e c1839e2, Function3 function3, int i) {
        this.f19251e = interfaceC16132e;
        this.f19249e = c17085e;
        this.f19254e = z;
        this.f19248e = z2;
        this.f19258e = z3;
        this.f19257e = z4;
        this.f19252e = c13119e;
        this.f19255e = c1839e;
        this.f19250e = c1839e2;
        this.f19253e = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19256e) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC2754e.vip(this.f19251e, this.f19249e, this.f19254e, this.f19248e, this.f19258e, this.f19257e, this.f19252e, this.f19255e, this.f19250e, this.f19253e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC2754e.vip(this.f19251e, this.f19249e, this.f19254e, this.f19248e, this.f19258e, this.f19257e, this.f19252e, this.f19255e, this.f19250e, this.f19253e, c13770e, 0);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
