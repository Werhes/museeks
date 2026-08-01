package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٟۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8879e implements InterfaceC17847e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ String[] f17836e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4480e f17837e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17838e;

    public /* synthetic */ C8879e(C4480e c4480e, String[] strArr, int i) {
        this.f17838e = i;
        this.f17837e = c4480e;
        this.f17836e = strArr;
    }

    @Override // defpackage.InterfaceC17847e
    public final void accept(Object obj, Object obj2) {
        C8988e c8988e = (C8988e) obj2;
        C6735e c6735e = (C6735e) obj;
        switch (this.f17838e) {
            case 0:
                BinderC0751e binderC0751e = new BinderC0751e(this.f17837e, c8988e, 1);
                C18172e c18172e = (C18172e) c6735e.loadAd();
                C10988e appmetrica = AbstractC10432e.appmetrica();
                Parcel m4156e = c18172e.m4156e();
                AbstractC3336e.metrica(m4156e, binderC0751e);
                m4156e.writeStringArray(this.f17836e);
                AbstractC3336e.vip(m4156e, appmetrica);
                c18172e.m4151e(m4156e, 6);
                return;
            default:
                BinderC0751e binderC0751e2 = new BinderC0751e(this.f17837e, c8988e, 2);
                C18172e c18172e2 = (C18172e) c6735e.loadAd();
                C10988e appmetrica2 = AbstractC10432e.appmetrica();
                Parcel m4156e2 = c18172e2.m4156e();
                AbstractC3336e.metrica(m4156e2, binderC0751e2);
                m4156e2.writeStringArray(this.f17836e);
                AbstractC3336e.vip(m4156e2, appmetrica2);
                c18172e2.m4151e(m4156e2, 7);
                return;
        }
    }
}
