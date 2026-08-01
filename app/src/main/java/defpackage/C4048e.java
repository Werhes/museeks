package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِِؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4048e implements Parcelable {
    public static final C7682e CREATOR = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f8995e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f8996e;

    public C4048e(C8633e c8633e, InterfaceC3477e interfaceC3477e) {
        this.f8996e = c8633e;
        this.f8995e = interfaceC3477e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, eؕٛؓ] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray((byte[]) this.f8995e.getValue());
    }
}
