package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؓۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12221e extends AbstractC6484e {
    public static final Parcelable.Creator<C12221e> CREATOR = new C1318e(24);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Bundle f24539e;

    public C12221e(Bundle bundle) {
        this.f24539e = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.adcel(parcel, 1, this.f24539e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
