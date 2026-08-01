package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؒ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1197e extends View.BaseSavedState {
    public static final Parcelable.Creator<C1197e> CREATOR = new C1928e(3);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f3822e;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f3822e ? (byte) 1 : (byte) 0);
    }
}
