package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8622e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f17442e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f17443e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f17444e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f17445e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17446e = 0;

    public /* synthetic */ C8622e(Function0 function0, boolean z, boolean z2, int i) {
        this.f17445e = function0;
        this.f17444e = z;
        this.f17443e = z2;
        this.f17442e = i;
    }

    public /* synthetic */ C8622e(Cpublic cpublic, int i, boolean z, boolean z2, int i2) {
        this.f17445e = cpublic;
        this.f17442e = i;
        this.f17444e = z;
        this.f17443e = z2;
    }

    public /* synthetic */ C8622e(boolean z, boolean z2, Function0 function0, int i) {
        this.f17444e = z;
        this.f17443e = z2;
        this.f17445e = function0;
        this.f17442e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17446e) {
            case 0:
                Function0 function0 = (Function0) this.f17445e;
                ((Integer) obj2).intValue();
                AbstractC1129e.vip(AbstractC5190e.advert(this.f17442e | 1), (C13770e) obj, function0, this.f17444e, this.f17443e);
                return Unit.INSTANCE;
            case 1:
                Function0 function02 = (Function0) this.f17445e;
                ((Integer) obj2).intValue();
                AbstractC1129e.license(AbstractC5190e.advert(this.f17442e | 1), (C13770e) obj, function02, this.f17444e, this.f17443e);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int advert = AbstractC5190e.advert(433);
                ((Cpublic) this.f17445e).m4633strictfp(this.f17442e, advert, (C13770e) obj, this.f17444e, this.f17443e);
                return Unit.INSTANCE;
        }
    }
}
