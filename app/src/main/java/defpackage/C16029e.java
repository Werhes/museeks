package defpackage;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.widget.RemoteViewsCompatService;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16029e implements RemoteViewsService.RemoteViewsFactory {
    public static final C0381e appmetrica = new C0381e(new long[0], new RemoteViews[0]);
    public final RemoteViewsCompatService ad;
    public C0381e license = appmetrica;
    public final int metrica;
    public final int vip;

    public C16029e(RemoteViewsCompatService remoteViewsCompatService, int i, int i2) {
        this.ad = remoteViewsCompatService;
        this.vip = i;
        this.metrica = i2;
    }

    public final void ad() {
        Long l;
        RemoteViewsCompatService remoteViewsCompatService = this.ad;
        SharedPreferences sharedPreferences = remoteViewsCompatService.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
        StringBuilder sb = new StringBuilder();
        int i = this.vip;
        sb.append(i);
        sb.append(':');
        sb.append(this.metrica);
        C0381e c0381e = null;
        String string = sharedPreferences.getString(sb.toString(), null);
        if (string == null) {
            Log.w("RemoteViewsCompatServic", "No collection items were stored for widget " + i);
        } else {
            byte[] decode = Base64.decode(string, 0);
            Parcel obtain = Parcel.obtain();
            try {
                obtain.unmarshall(decode, 0, decode.length);
                obtain.setDataPosition(0);
                byte[] bArr = new byte[obtain.readInt()];
                obtain.readByteArray(bArr);
                String readString = obtain.readString();
                long readLong = obtain.readLong();
                obtain.recycle();
                if (AbstractC7890e.billing(Build.VERSION.INCREMENTAL, readString)) {
                    try {
                        l = Long.valueOf(Build.VERSION.SDK_INT >= 28 ? AbstractC17305e.remoteconfig(remoteViewsCompatService.getPackageManager().getPackageInfo(remoteViewsCompatService.getPackageName(), 0)) : r0.versionCode);
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.e("RemoteViewsCompatServic", "Couldn't retrieve version code for " + remoteViewsCompatService.getPackageManager(), e);
                        l = null;
                    }
                    if (l == null) {
                        Log.w("RemoteViewsCompatServic", "Couldn't get version code, not using stored collection items for widget " + i);
                    } else if (l.longValue() != readLong) {
                        Log.w("RemoteViewsCompatServic", "App version code has changed, not using stored collection items for widget " + i);
                    } else {
                        try {
                            obtain = Parcel.obtain();
                            try {
                                obtain.unmarshall(bArr, 0, bArr.length);
                                obtain.setDataPosition(0);
                                C0381e c0381e2 = new C0381e(obtain);
                                obtain.recycle();
                                c0381e = c0381e2;
                            } finally {
                            }
                        } catch (Throwable th) {
                            Log.e("RemoteViewsCompatServic", "Unable to deserialize stored collection items for widget " + i, th);
                        }
                    }
                } else {
                    Log.w("RemoteViewsCompatServic", "Android version code has changed, not using stored collection items for widget " + i);
                }
            } finally {
            }
        }
        if (c0381e == null) {
            c0381e = appmetrica;
        }
        this.license = c0381e;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return ((long[]) this.license.license).length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return ((long[]) this.license.license)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return ((RemoteViews[]) this.license.appmetrica)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.ad.getPackageName(), R.layout.invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return this.license.vip;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return this.license.metrica;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        ad();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        ad();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
