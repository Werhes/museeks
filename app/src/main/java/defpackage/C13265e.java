package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13265e {
    public final Context ad;
    public Messenger billing;
    public final Bundle metrica;
    public C11883e purchase;
    public final MediaBrowser vip;
    public C13765e yandex;
    public final HandlerC17805e license = new HandlerC17805e(this);
    public final C2271e appmetrica = new C17519e(0);

    /* JADX WARN: Type inference failed for: r0v1, types: [eٕ٘ؔ, eؓۨۖ] */
    public C13265e(Context context, ComponentName componentName, C12894e c12894e, Bundle bundle) {
        this.ad = context;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        this.metrica = bundle2;
        bundle2.putInt("extra_client_version", 1);
        bundle2.putInt("extra_calling_pid", Process.myPid());
        c12894e.f25750e = this;
        C16691e c16691e = (C16691e) c12894e.f25751e;
        c16691e.getClass();
        this.vip = new MediaBrowser(context, componentName, c16691e, bundle2);
    }
}
