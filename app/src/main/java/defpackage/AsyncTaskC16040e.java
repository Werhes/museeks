package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖۦ */
/* loaded from: classes3.dex */
public final class AsyncTaskC16040e extends AsyncTask {
    public static final C18482e metrica = new C18482e("FetchBitmapTask", null);
    public final InterfaceC17175e ad;
    public final C11328e vip;

    public AsyncTaskC16040e(Context context, int i, int i2, C11328e c11328e) {
        InterfaceC17175e interfaceC17175e;
        this.vip = c11328e;
        Context applicationContext = context.getApplicationContext();
        BinderC1109e binderC1109e = new BinderC1109e(this);
        C18482e c18482e = AbstractC5672e.ad;
        try {
            C13624e vip = AbstractC5672e.vip(applicationContext.getApplicationContext());
            BinderC3838e binderC3838e = new BinderC3838e(applicationContext.getApplicationContext());
            Parcel m4154e = vip.m4154e(vip.m4156e(), 8);
            int readInt = m4154e.readInt();
            m4154e.recycle();
            interfaceC17175e = readInt >= 233700000 ? vip.m3628e(binderC3838e, new BinderC3838e(this), binderC1109e, i, i2) : vip.m3627e(new BinderC3838e(this), binderC1109e, i, i2);
        } catch (RemoteException e) {
            e = e;
            AbstractC5672e.ad.ad(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", C13624e.class.getSimpleName());
            interfaceC17175e = null;
            this.ad = interfaceC17175e;
        } catch (C13373e e2) {
            e = e2;
            AbstractC5672e.ad.ad(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", C13624e.class.getSimpleName());
            interfaceC17175e = null;
            this.ad = interfaceC17175e;
        }
        this.ad = interfaceC17175e;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        InterfaceC17175e interfaceC17175e;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (interfaceC17175e = this.ad) != null) {
            try {
                C6366e c6366e = (C6366e) interfaceC17175e;
                Parcel m4156e = c6366e.m4156e();
                AbstractC3336e.vip(m4156e, uri);
                Parcel m4154e = c6366e.m4154e(m4156e, 1);
                Bitmap bitmap = (Bitmap) AbstractC3336e.ad(m4154e, Bitmap.CREATOR);
                m4154e.recycle();
                return bitmap;
            } catch (RemoteException e) {
                metrica.ad(e, "Unable to call %s on %s.", "doFetch", InterfaceC17175e.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C11328e c11328e = this.vip;
        if (c11328e != null) {
            InterfaceC1106e interfaceC1106e = (InterfaceC1106e) c11328e.f22770e;
            if (interfaceC1106e != null) {
                interfaceC1106e.ad(bitmap);
            }
            c11328e.f22773e = null;
        }
    }
}
