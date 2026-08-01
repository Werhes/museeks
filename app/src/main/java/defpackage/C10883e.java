package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10883e extends AbstractC16858e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C9340e[] f21557e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f21558e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10883e(C9340e[] c9340eArr, int i) {
        super(2);
        this.f21558e = i;
        this.f21557e = c9340eArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21558e) {
            case 0:
                return Float.valueOf(AbstractC17595e.ad((AbstractC3698e) obj, true, this.f21557e, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(AbstractC17595e.ad((AbstractC3698e) obj, false, this.f21557e, ((Number) obj2).floatValue()));
        }
    }
}
