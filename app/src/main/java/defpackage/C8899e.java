package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8899e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C14093e f17861e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f17862e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8899e(C14093e c14093e, int i) {
        super(1);
        this.f17862e = i;
        this.f17861e = c14093e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17862e) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f17861e.amazon.mopub(AbstractC3062e.ad(doubleValue, r10.appmetrica, r10.purchase)));
            default:
                return Double.valueOf(AbstractC3062e.ad(this.f17861e.mopub.mopub(((Number) obj).doubleValue()), r10.appmetrica, r10.purchase));
        }
    }
}
