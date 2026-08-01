package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.adcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؒۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1337e extends AbstractC11007e {
    public static final Parcelable.Creator<C1337e> CREATOR = new C5995e(3);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Parcelable f4128e;

    public C1337e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4128e = parcel.readParcelable(classLoader == null ? adcel.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.AbstractC11007e, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f4128e, 0);
    }
}
