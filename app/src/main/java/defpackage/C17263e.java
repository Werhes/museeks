package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۛۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C17263e implements InterfaceC17847e, InterfaceC12765e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object f33877e;

    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        C4627e c4627e = new C4627e((C8988e) obj2);
        String str = ((C6140e) this.f33877e).f12912e;
        C11125e c11125e = (C11125e) ((C7971e) obj).loadAd();
        BinderC11050e binderC11050e = new BinderC11050e(c4627e);
        Parcel m4156e = c11125e.m4156e();
        int i = AbstractC0923e.ad;
        m4156e.writeInt(1);
        int applovin = AbstractC16852e.applovin(m4156e, 20293);
        AbstractC16852e.smaato(m4156e, 1, binderC11050e);
        AbstractC16852e.remoteconfig(m4156e, 2, str);
        AbstractC16852e.isPro(m4156e, 3, 4);
        m4156e.writeInt(0);
        AbstractC16852e.ads(m4156e, applovin);
        c11125e.m4153e(m4156e, 2007);
    }

    @Override // defpackage.InterfaceC12765e
    /* renamed from: final */
    public void mo213final(C0560e c0560e) {
        C16720e c16720e = (C16720e) this.f33877e;
        if (c0560e.license) {
            c16720e.cancel(false);
            return;
        }
        if (c0560e.advert()) {
            c16720e.smaato(c0560e.adcel());
            return;
        }
        Exception startapp = c0560e.startapp();
        if (startapp == null) {
            throw new IllegalStateException();
        }
        c16720e.amazon(startapp);
    }
}
