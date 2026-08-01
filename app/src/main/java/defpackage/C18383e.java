package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۜۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18383e extends AbstractC6484e {
    public static final Parcelable.Creator<C18383e> CREATOR = new C10765e(0);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f36047e;

    public C18383e(String str) {
        this.f36047e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18383e) {
            return AbstractC5942e.metrica(this.f36047e, ((C18383e) obj).f36047e);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36047e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 2, this.f36047e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
