package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٞٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18262e extends AbstractC6484e {
    public static final Parcelable.Creator<C18262e> CREATOR = new C1304e(18);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final PendingIntent f35714e;

    public C18262e(PendingIntent pendingIntent) {
        this.f35714e = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.subscription(parcel, 1, this.f35714e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
