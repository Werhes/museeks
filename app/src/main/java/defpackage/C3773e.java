package defpackage;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؕۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3773e implements Parcelable {
    public static final Parcelable.Creator<C3773e> CREATOR = new C10765e(1);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Messenger f8375e;

    public C3773e(IBinder iBinder) {
        this.f8375e = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            try {
                Messenger messenger = this.f8375e;
                messenger.getClass();
                IBinder binder = messenger.getBinder();
                Messenger messenger2 = ((C3773e) obj).f8375e;
                messenger2.getClass();
                return binder.equals(messenger2.getBinder());
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Messenger messenger = this.f8375e;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f8375e;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
