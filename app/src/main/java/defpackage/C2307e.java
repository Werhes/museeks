package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؑ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2307e extends AbstractC11007e {
    public static final Parcelable.Creator<C2307e> CREATOR = new C6220e(4);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f5825e;

    public C2307e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5825e = parcel.readInt();
    }

    public C2307e(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f5825e = sideSheetBehavior.yandex;
    }

    @Override // defpackage.AbstractC11007e, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f5825e);
    }
}
