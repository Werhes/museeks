package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ٘ٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC17805e extends Handler {
    public final /* synthetic */ int ad = 1;
    public Object metrica;
    public Object vip;

    public HandlerC17805e(C3740e c3740e) {
        this.vip = new WeakReference(c3740e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC17805e(C6584e c6584e, Looper looper) {
        super(looper);
        this.metrica = c6584e;
    }

    public HandlerC17805e(C13265e c13265e) {
        this.vip = new WeakReference(c13265e);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.ad) {
            case 0:
                WeakReference weakReference = (WeakReference) this.metrica;
                if (weakReference == null) {
                    return;
                }
                Messenger messenger = (Messenger) weakReference.get();
                C13265e c13265e = (C13265e) ((WeakReference) this.vip).get();
                if (messenger == null || c13265e == null) {
                    return;
                }
                Bundle data = message.getData();
                if (data != null) {
                    ClassLoader classLoader = C13391e.class.getClassLoader();
                    classLoader.getClass();
                    data.setClassLoader(classLoader);
                }
                try {
                    if (message.what != 3) {
                        AbstractC2803e.smaato("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                        return;
                    }
                    AbstractC9413e.Signature(data.getBundle("data_options"));
                    AbstractC9413e.Signature(data.getBundle("data_notify_children_changed_options"));
                    String string = data.getString("data_media_item_id");
                    AbstractC11866e.vip(data.getParcelableArrayList("data_media_item_list"), C11531e.CREATOR);
                    if (c13265e.billing != messenger) {
                        return;
                    }
                    if (string != null && c13265e.appmetrica.get(string) != null) {
                        throw new ClassCastException();
                    }
                    AbstractC2803e.license("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string);
                    return;
                } catch (BadParcelableException unused) {
                    AbstractC2803e.purchase("MediaBrowserCompat", "Could not unparcel the data.");
                    return;
                }
            case 1:
                WeakReference weakReference2 = (WeakReference) this.vip;
                WeakReference weakReference3 = (WeakReference) this.metrica;
                if (weakReference3 == null || weakReference3.get() == null || weakReference2.get() == null) {
                    return;
                }
                Bundle data2 = message.getData();
                C12894e.subscription(data2);
                C3740e c3740e = (C3740e) weakReference2.get();
                Messenger messenger2 = (Messenger) ((WeakReference) this.metrica).get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        C12894e.subscription(data2.getBundle("data_root_hints"));
                        data2.getString("data_media_item_id");
                        c3740e.getClass();
                        return;
                    }
                    if (i == 2) {
                        c3740e.getClass();
                        return;
                    }
                    if (i != 3) {
                        Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                        return;
                    }
                    C12894e.subscription(data2.getBundle("data_options"));
                    C12894e.subscription(data2.getBundle("data_notify_children_changed_options"));
                    String string2 = data2.getString("data_media_item_id");
                    data2.getParcelableArrayList("data_media_item_list");
                    if (c3740e.billing != messenger2) {
                        return;
                    }
                    if (c3740e.appmetrica.get(string2) != null) {
                        throw new ClassCastException();
                    }
                    if (C1632e.vip) {
                        Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string2);
                        return;
                    }
                    return;
                } catch (BadParcelableException unused2) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    if (message.what == 1) {
                        c3740e.getClass();
                        return;
                    }
                    return;
                }
            default:
                super.handleMessage(message);
                return;
        }
    }
}
