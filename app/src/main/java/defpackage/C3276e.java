package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3276e extends AbstractC6484e implements Iterable {
    public static final Parcelable.Creator<C3276e> CREATOR = new C10765e(7);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Bundle f7428e;

    public C3276e(Bundle bundle) {
        this.f7428e = bundle;
    }

    public final Bundle adcel() {
        return new Bundle(this.f7428e);
    }

    public final Object billing(String str) {
        return this.f7428e.get(str);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C17658e(this);
    }

    public final String startapp() {
        return this.f7428e.getString("currency");
    }

    public final String toString() {
        return this.f7428e.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.adcel(parcel, 2, adcel());
        AbstractC16852e.ads(parcel, applovin);
    }

    public final Double yandex() {
        return Double.valueOf(this.f7428e.getDouble("value"));
    }
}
