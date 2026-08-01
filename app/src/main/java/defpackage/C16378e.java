package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٝ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16378e extends AbstractC6484e implements InterfaceC18082e {
    public static final Parcelable.Creator<C16378e> CREATOR = new C1304e(25);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f32179e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final List f32180e;

    public C16378e(String str, ArrayList arrayList) {
        this.f32180e = arrayList;
        this.f32179e = str;
    }

    @Override // defpackage.InterfaceC18082e
    public final Status appmetrica() {
        return this.f32179e != null ? Status.f727e : Status.f728e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.signatures(parcel, 1, this.f32180e);
        AbstractC16852e.remoteconfig(parcel, 2, this.f32179e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
