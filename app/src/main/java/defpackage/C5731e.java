package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٚۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5731e extends AbstractC6484e {
    public static final Parcelable.Creator<C5731e> CREATOR = new C18517e(14);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f12133e;

    public C5731e(byte[] bArr) {
        this.f12133e = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.mopub(parcel, 2, this.f12133e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
