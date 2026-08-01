package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۗۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18320e extends AbstractC6484e {
    public static final Parcelable.Creator<C18320e> CREATOR = new C1318e(2);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Intent f35976e;

    public C18320e(Intent intent) {
        this.f35976e = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.subscription(parcel, 1, this.f35976e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
