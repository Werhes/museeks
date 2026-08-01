package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؕۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13765e implements Parcelable {
    public static final Parcelable.Creator<C13765e> CREATOR = new C1928e(26);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public InterfaceC16274e f27275e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final MediaSession.Token f27276e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f27278e = new Object();

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public InterfaceC11282e f27277e = null;

    public C13765e(MediaSession.Token token, InterfaceC16274e interfaceC16274e) {
        this.f27276e = token;
        this.f27275e = interfaceC16274e;
    }

    public final InterfaceC16274e ad() {
        InterfaceC16274e interfaceC16274e;
        synchronized (this.f27278e) {
            interfaceC16274e = this.f27275e;
        }
        return interfaceC16274e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13765e) {
            return this.f27276e.equals(((C13765e) obj).f27276e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27276e.hashCode();
    }

    public final void metrica(InterfaceC11282e interfaceC11282e) {
        synchronized (this.f27278e) {
            this.f27277e = interfaceC11282e;
        }
    }

    public final void vip(InterfaceC16274e interfaceC16274e) {
        synchronized (this.f27278e) {
            this.f27275e = interfaceC16274e;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f27276e, i);
    }
}
