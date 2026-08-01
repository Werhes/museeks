package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۥؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1447e implements InterfaceC1160e {
    public final C10985e ad;

    public C1447e(C10985e c10985e) {
        this.ad = c10985e;
    }

    @Override // defpackage.InterfaceC1160e
    public final void ad(final float f) {
        ((C1607e) this.ad.f21740e).post(new Runnable() { // from class: eؕۡٞ
            /* JADX WARN: Type inference failed for: r4v2, types: [eٖؑۡ, eُۙۨ] */
            @Override // java.lang.Runnable
            public final void run() {
                C10985e c10985e = C1447e.this.ad;
                ((C1607e) c10985e.f21740e).setIndeterminate(false);
                Object obj = c10985e.f21740e;
                ((C1607e) obj).setMax(100);
                ((C1607e) obj).ad(AbstractC3062e.license((int) (f * 100.0f), new C11241e(0, 100, 1)), true);
            }
        });
    }

    @Override // defpackage.InterfaceC1160e
    public final Object vip(int i, int i2, C17912e c17912e) {
        C15420e c15420e = AbstractC6731e.ad;
        Object advert = AbstractC5336e.advert(AbstractC1497e.ad, new C11143e(this, i2, i, (InterfaceC5083e) null), c17912e);
        return advert == EnumC2821e.f6782e ? advert : Unit.INSTANCE;
    }
}
