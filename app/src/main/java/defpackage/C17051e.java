package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17051e extends AbstractC16858e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f33391e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f33392e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12864e f33393e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f33394e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17051e(InterfaceC12864e interfaceC12864e, Function2 function2, int i, int i2) {
        super(2);
        this.f33393e = interfaceC12864e;
        this.f33392e = function2;
        this.f33394e = i;
        this.f33391e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int advert = AbstractC5190e.advert(this.f33394e | 1);
        int i = this.f33391e;
        AbstractC9464e.metrica(this.f33393e, this.f33392e, (C13770e) obj, advert, i);
        return Unit.INSTANCE;
    }
}
