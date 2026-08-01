package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۥؘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15838e implements InterfaceC4323e {
    public final C6491e ad;
    public final C6758e metrica;
    public final C6491e vip;

    public C15838e(Context context, C6758e c6758e) {
        this.metrica = c6758e;
        C12664e c12664e = C12664e.appmetrica;
        C6553e.vip(context);
        C13192e metrica = C6553e.ad().metrica(c12664e);
        if (C12664e.license.contains(new C12007e("json"))) {
            this.ad = new C6491e(new C1980e(metrica, 2));
        }
        this.vip = new C6491e(new C1980e(metrica, 3));
    }

    @Override // defpackage.InterfaceC4323e
    public final void ad(C7306e c7306e) {
        int i = this.metrica.vip;
        EnumC6651e enumC6651e = EnumC6651e.f13721e;
        EnumC6651e enumC6651e2 = EnumC6651e.f13723e;
        if (i != 0) {
            ((C11547e) this.vip.get()).ad(c7306e.f14928e != 0 ? new C7101e(null, c7306e.vip(i), enumC6651e2, null) : new C7101e(null, c7306e.vip(i), enumC6651e, null), new C11180e(24));
            return;
        }
        C6491e c6491e = this.ad;
        if (c6491e != null) {
            ((C11547e) c6491e.get()).ad(c7306e.f14928e != 0 ? new C7101e(null, c7306e.vip(i), enumC6651e2, null) : new C7101e(null, c7306e.vip(i), enumC6651e, null), new C11180e(24));
        }
    }
}
