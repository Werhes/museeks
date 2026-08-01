package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۣۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10690e extends View.BaseSavedState {
    public static final Parcelable.Creator<C10690e> CREATOR = new C1304e(14);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f21056e;

    public C10690e(Parcel parcel) {
        super(parcel);
        this.f21056e = parcel.readByte() != 0;
    }

    public C10690e(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.f21056e = z;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f21056e ? (byte) 1 : (byte) 0);
    }
}
