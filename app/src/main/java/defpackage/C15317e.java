package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٕۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15317e extends AbstractC6484e implements InterfaceC18082e {
    public static final Parcelable.Creator<C15317e> CREATOR = new C1304e(19);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Intent f30241e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f30242e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f30243e;

    public C15317e(int i, int i2, Intent intent) {
        this.f30243e = i;
        this.f30242e = i2;
        this.f30241e = intent;
    }

    @Override // defpackage.InterfaceC18082e
    public final Status appmetrica() {
        return this.f30242e == 0 ? Status.f727e : Status.f728e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f30243e);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f30242e);
        AbstractC16852e.subscription(parcel, 3, this.f30241e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
