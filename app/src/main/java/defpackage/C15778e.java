package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ۠ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15778e extends AbstractC16858e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C4993e f31083e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f31084e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15778e(C4993e c4993e, int i) {
        super(0);
        this.f31084e = i;
        this.f31083e = c4993e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long purchase;
        switch (this.f31084e) {
            case 0:
                C13648e yandex = this.f31083e.yandex();
                int ordinal = yandex.loadAd.ordinal();
                if (ordinal == 0) {
                    purchase = yandex.purchase() & 4294967295L;
                } else {
                    if (ordinal != 1) {
                        throw new C14803e(10);
                    }
                    purchase = yandex.purchase() >> 32;
                }
                return Float.valueOf(((int) purchase) * 0.05f);
            default:
                return this.f31083e.yandex().loadAd;
        }
    }
}
