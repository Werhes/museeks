package defpackage;

import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؘٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10274e extends ContentObserver {
    public final /* synthetic */ C11334e ad;
    public final /* synthetic */ InterfaceC3314e vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10274e(C11334e c11334e, InterfaceC3314e interfaceC3314e, Handler handler) {
        super(handler);
        this.ad = c11334e;
        this.vip = interfaceC3314e;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        C11334e c11334e = this.ad;
        c11334e.getClass();
        boolean z2 = true;
        try {
            if (Settings.System.getInt(c11334e.ad, "show_password") <= 0) {
                z2 = false;
            }
        } catch (Exception e) {
            Log.w("BasicSecureTextField", "Failed to fetch show password setting, using value: true", e);
        }
        this.vip.setValue(Boolean.valueOf(z2));
    }
}
