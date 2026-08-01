package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؑٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9987e extends AbstractC11007e {
    public static final Parcelable.Creator<C9987e> CREATOR = new C5995e(1);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f19713e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f19714e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f19715e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f19716e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f19717e;

    public C9987e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f19714e = parcel.readInt();
        this.f19715e = parcel.readInt();
        this.f19713e = parcel.readInt() == 1;
        this.f19717e = parcel.readInt() == 1;
        this.f19716e = parcel.readInt() == 1;
    }

    public C9987e(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f19714e = bottomSheetBehavior.f798throw;
        this.f19715e = bottomSheetBehavior.appmetrica;
        this.f19713e = bottomSheetBehavior.vip;
        this.f19717e = bottomSheetBehavior.f797this;
        this.f19716e = bottomSheetBehavior.f790native;
    }

    @Override // defpackage.AbstractC11007e, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f19714e);
        parcel.writeInt(this.f19715e);
        parcel.writeInt(this.f19713e ? 1 : 0);
        parcel.writeInt(this.f19717e ? 1 : 0);
        parcel.writeInt(this.f19716e ? 1 : 0);
    }
}
