package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17638e implements Parcelable {
    public static final Parcelable.Creator<C17638e> CREATOR = new C1928e(24);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public MediaSession.QueueItem f34566e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f34567e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C17571e f34568e;

    public C17638e(MediaSession.QueueItem queueItem, C17571e c17571e, long j) {
        if (j == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.f34568e = c17571e;
        this.f34567e = j;
        this.f34566e = queueItem;
    }

    public C17638e(Parcel parcel) {
        this.f34568e = C17571e.CREATOR.createFromParcel(parcel);
        this.f34567e = parcel.readLong();
    }

    public static ArrayList ad(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) it.next();
            arrayList.add(new C17638e(queueItem, C17571e.ad(queueItem.getDescription()), queueItem.getQueueId()));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem { Description=");
        sb.append(this.f34568e);
        sb.append(", Id=");
        return AbstractC5087e.m1750native(this.f34567e, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f34568e.writeToParcel(parcel, i);
        parcel.writeLong(this.f34567e);
    }
}
