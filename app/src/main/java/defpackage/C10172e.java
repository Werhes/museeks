package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10172e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f20128e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C3566e f20129e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f20130e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20131e;

    public /* synthetic */ C10172e(C3566e c3566e, Function0 function0, Function0 function02, int i, int i2) {
        this.f20131e = i2;
        this.f20129e = c3566e;
        this.f20128e = function0;
        this.f20130e = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f20131e;
        C13770e c13770e = (C13770e) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                this.f20129e.premium(this.f20128e, this.f20130e, c13770e, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 1:
                this.f20129e.subs(this.f20128e, this.f20130e, c13770e, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                this.f20129e.firebase(this.f20128e, this.f20130e, c13770e, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
