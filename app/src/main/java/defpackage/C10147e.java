package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayDeque;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10147e implements Parcelable {
    public static final Parcelable.Creator<C10147e> CREATOR = new C1928e(0);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Bundle f20087e;

    public C10147e(Bundle bundle) {
        this.f20087e = bundle;
    }

    public C10147e(Object obj) {
        ArrayMap arrayMap = AbstractC1080e.ad;
        String startapp = AbstractC1080e.startapp(obj.getClass());
        if (Log.isLoggable("CarApp.Bun", 3)) {
            Log.d("CarApp.Bun", "Bundling ".concat(startapp));
        }
        this.f20087e = AbstractC1080e.loadAd(obj, startapp, new C16347e(null, BuildConfig.FLAVOR, new ArrayDeque()));
    }

    public final Object ad() {
        ArrayMap arrayMap = AbstractC1080e.ad;
        boolean isLoggable = Log.isLoggable("CarApp.Bun", 3);
        Bundle bundle = this.f20087e;
        if (isLoggable) {
            String str = (String) AbstractC1080e.vip.get(Integer.valueOf(bundle.getInt("tag_class_type")));
            if (str == null) {
                str = "unknown";
            }
            Log.d("CarApp.Bun", "Unbundling ".concat(str));
        }
        return AbstractC1080e.purchase(bundle, new C16347e(null, BuildConfig.FLAVOR, new ArrayDeque()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f20087e);
    }
}
